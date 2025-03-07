package dio.necronomicatto.dev_week.service;

import dio.necronomicatto.dev_week.domain.model.User;

public interface UserService {

    User findById(Long id);
    
    User create(User userToCreate);
}
