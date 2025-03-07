package dio.necronomicatto.dev_week.domain.repository;

import dio.necronomicatto.dev_week.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
    boolean existsByAccountNumber(String accountNumber);
}
