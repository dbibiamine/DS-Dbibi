package org.TP1.dao;

import java.util.List;

import org.TP1.Entites.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface ClientRepository extends MongoRepository <Client,Long> {

	public List<Client> findByDateN(String DateN);
	
	public Page<Client> findByDateN(String DateN,Pageable p);
}
