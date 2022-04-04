package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.Team;
public interface TeamRepository extends CrudRepository<Team,Integer>{

}