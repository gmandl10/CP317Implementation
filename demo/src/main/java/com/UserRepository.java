package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.User;
public interface UserRepository extends CrudRepository<User,Integer>{

}