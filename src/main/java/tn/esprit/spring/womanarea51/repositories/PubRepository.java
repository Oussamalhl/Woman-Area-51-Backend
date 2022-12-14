package tn.esprit.spring.womanarea51.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.womanarea51.entities.Pub;


@Repository
public interface PubRepository extends CrudRepository<Pub, Long> {

	List<Pub> findAllByOrderByIdDesc();

}
