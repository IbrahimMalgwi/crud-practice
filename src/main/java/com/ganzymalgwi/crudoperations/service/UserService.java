package com.ganzymalgwi.crudoperations.service;

import com.ganzymalgwi.crudoperations.data.dto.request.RegistrationRequest;
import com.ganzymalgwi.crudoperations.data.entity.User;
import com.ganzymalgwi.crudoperations.data.repository.UserRepository;

public interface UserService {

    User createUser(RegistrationRequest registrationRequest);

    User findByEmail(String email);

    User findById(Long id);




}
