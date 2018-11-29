package org.TP1.controllers;

import java.util.List;


import org.TP1.Entites.Client;
import org.TP1.dao.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogueController {
@Autowired
private ClientRepository clientRepository;

@RequestMapping("/save")
public Client saveClient(Client c) {
	 clientRepository.save(c);
	return c;
}
@RequestMapping("/all")
public List<Client> getProduits(){
	return clientRepository.findAll();
}
@RequestMapping("/clients")
public Page<Client> getClients(int page){
	return clientRepository.findAll(new PageRequest(page, 5));
}

@RequestMapping("/delete")
public boolean delete(Long ref) {
	clientRepository.deleteById(ref);
	return true;
}
@RequestMapping("/update")
public Client update(Client p) {
    clientRepository.save(p);
	return p;
}


}
