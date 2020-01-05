package com.gmoodle.models.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gmoodle.models.entity.Roles;

public interface RoleDao extends CrudRepository<Roles, Long> {
	public Optional<Roles> findByName(String name);
}
