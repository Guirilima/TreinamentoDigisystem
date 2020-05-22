package com.cadastramento.cadastramento.repository;

import org.springframework.data.repository.CrudRepository;


import com.cadastramento.cadastramento.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {


}
