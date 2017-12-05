package jdbc.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fanzhe on 2017/12/4.
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
//@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}