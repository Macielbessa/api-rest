package tarefando.exemplo.apirest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tarefando.exemplo.apirest.Model.UserModel;
import tarefando.exemplo.apirest.Repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;


    @GetMapping(path = "/api/user/{coder}") // consultando o user pelo codigo
        public ResponseEntity consult (@PathVariable("coder") Integer coder){
            return repository.findById(coder)
                    .map(record -> ResponseEntity.ok().body(record))
                    .orElse(ResponseEntity.notFound().build());
        }

        @PostMapping (path = "/api/user/salve")// método post
        // método salvar
    public UserModel salve(@RequestBody UserModel user){
        return repository.save(user);
    }
}
// acabamos de pegar um repositorio, fizemos um findById que é um método que já fez padrão no repositorio
// e chamamos o método map "se por algum caso ele retornou alguma coisa, ele vai trazer o meu "ok"
// e vai montar o corpo da requisição com o meu registro"
// caso ao contrario vai dar um null e fazer um notbuild, por não entrar na requisição desejada
