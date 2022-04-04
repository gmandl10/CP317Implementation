package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.League;
public interface LeagueRepository extends CrudRepository<League,Integer>{

}