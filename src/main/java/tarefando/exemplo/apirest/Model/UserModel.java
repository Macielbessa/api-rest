package tarefando.exemplo.apirest.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /// entidade de bancos de dados // uma tabela
@Table(name = "Users")
public class UserModel {
    @Id

        private Integer coder;
        @Column(nullable = false, length = 50)
        private String nome;
        @Column(nullable = false, length = 10)
        private String login;
        @Column(nullable = false, length = 10)
        private String password;

    public Integer getCoder() {
        return coder;
    }

    public void setCoder(Integer coder) {
        this.coder = coder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
