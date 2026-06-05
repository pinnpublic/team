package com.test.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.java.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
