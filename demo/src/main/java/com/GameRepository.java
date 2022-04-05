package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.model.Game;
public interface GameRepository extends CrudRepository<Game,Integer>{

}
