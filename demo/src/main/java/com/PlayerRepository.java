package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.Player;
public interface PlayerRepository extends CrudRepository<Player,Integer>{

}