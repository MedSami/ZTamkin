package com.marwa.zitounaTamkin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marwa.zitounaTamkin.entities.Clients;

public interface ClientRepository extends JpaRepository<Clients, Long>{

}
