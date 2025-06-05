/*
JpaRepository extends PagingAndSortingRepository which in turn extends CrudRepository, so it includes all CRUD operations plus:

          Pagination and sorting
          Batch operations
          Flushing changes to database
          More query methods
 */

/*
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional JPA specific methods are available
    List<User> findByLastName(String lastName);

    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);
}

// Usage example
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Page<User> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public List<User> findByLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }

    public void saveAllUsers(List<User> users) {
        userRepository.saveAll(users); // Batch operation
    }

    public void flushChanges() {
        userRepository.flush(); // Force synchronization with database
    }
}

 */