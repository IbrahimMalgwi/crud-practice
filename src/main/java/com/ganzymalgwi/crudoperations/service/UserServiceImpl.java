package com.ganzymalgwi.crudoperations.service;

import com.ganzymalgwi.crudoperations.data.dto.request.RegistrationRequest;
import com.ganzymalgwi.crudoperations.data.entity.User;
import com.ganzymalgwi.crudoperations.data.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User createUser(RegistrationRequest registrationRequest) {
        User user = new User();

        user.setFirstName(registrationRequest.getFirstName());
        user.setLastName(registrationRequest.getLastName());
        user.setEmail(registrationRequest.getEmail());
        user.setPassword(registrationRequest.getPassword());

        return userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
