package com.rest.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.crud.entities.name;


@Repository
public interface NameDao extends JpaRepository<name, Long>{

}
