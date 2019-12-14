package com.one.dto;

import com.one.domain.entity.AgentUser;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AgentUserRepository extends JpaRepository<AgentUser, Integer> {


}
