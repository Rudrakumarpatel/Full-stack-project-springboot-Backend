package com.involveininnovation.chat.repositories;

import com.involveininnovation.chat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer>
{

}
