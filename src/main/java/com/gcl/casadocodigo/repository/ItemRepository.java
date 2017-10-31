package com.gcl.casadocodigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcl.casadocodigo.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
