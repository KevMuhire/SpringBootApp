package com.RestServices.RESTAPI.UserServices;

import com.RestServices.RESTAPI.SharedDto.UserDto;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDto createUser(UserDto user);
    
    
}
