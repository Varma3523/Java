//Both CrudRepository and JpaRepository are interfaces provided by Spring Data JPA for database operations, but they have some key differences.


/* CrudRepository

CrudRepository provides basic CRUD operations:

         Create (save)
         Read (findById, findAll)
         Update (save)
         Delete (deleteById, delete)

*/
/*
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    // Basic CRUD operations are inherited
}

// Usage example
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}

 */
