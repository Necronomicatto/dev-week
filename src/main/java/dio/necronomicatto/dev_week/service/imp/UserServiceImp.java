package dio.necronomicatto.dev_week.service.imp;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.necronomicatto.dev_week.domain.model.User;
import dio.necronomicatto.dev_week.domain.repository.UserRepository;
import dio.necronomicatto.dev_week.service.UserService;

@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This User ID already exists");
        }

        return userRepository.save(userToCreate);
    }

}
