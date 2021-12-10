package tarefando.exemplo.apirest.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tarefando.exemplo.apirest.Model.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
