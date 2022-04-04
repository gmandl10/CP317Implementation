package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.Game;
public interface GameRepository extends CrudRepository<Game,Integer>{

}