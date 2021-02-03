package com.RestServices.RESTAPI.Controller;

import com.RestServices.RESTAPI.Request.UserDetailsRequestModel;
import com.RestServices.RESTAPI.Response.UserRest;
// import com.RestServices.RESTAPI.sharedDTO.UserDto;
import com.RestServices.RESTAPI.SharedDto.UserDto;
import com.RestServices.RESTAPI.UserServices.UserService;

// import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users") // http://localhost:8080/
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping
    public String getUser() {
        return "get user was called";
    }
    

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {

        UserRest returnValue = new UserRest();
        UserDto  userDto = new UserDto();     
        BeanUtils.copyProperties(userDetails, userDto);
       
        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);
        
        return returnValue;
        
    }
    
    @PutMapping
    public String updateUser(){
        return "Update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }

}
