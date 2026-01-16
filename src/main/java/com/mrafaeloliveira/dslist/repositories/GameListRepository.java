package com.mrafaeloliveira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrafaeloliveira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
