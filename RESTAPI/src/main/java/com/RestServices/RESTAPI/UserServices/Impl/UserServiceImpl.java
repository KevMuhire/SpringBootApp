package com.RestServices.RESTAPI.UserServices.Impl;

import com.RestServices.RESTAPI.UserRepository;
import com.RestServices.RESTAPI.Model.UserEntity;
import com.RestServices.RESTAPI.SharedDto.UserDto;
import com.RestServices.RESTAPI.UserServices.UserService;


// import org.apache.tomcat.jni.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto user){
        
        //We create an instance userEntity of user Entity
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);

        userEntity.setEncryptedPassword("test");
        
        userEntity.setUserId("testUserId");

        UserEntity storedUserDetails= userRepository.save(userEntity);
        UserDto returnValue = new UserDto();
        BeanUtils.copyProperties(storedUserDetails, returnValue);

        return returnValue;
        
    }

    
}
