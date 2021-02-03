package com.RestServices.RESTAPI;

import com.RestServices.RESTAPI.Model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

     // User findUserByEmail(String email);
    
}
