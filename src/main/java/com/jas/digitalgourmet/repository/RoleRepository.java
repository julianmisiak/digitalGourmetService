package com.jas.digitalgourmet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.jas.digitalgourmet.model.Role;
import com.jas.digitalgourmet.model.User;
import com.jas.digitalgourmet.repository.persistentobject.PersistentObjectExtendedRepository;

public interface RoleRepository extends PersistentObjectExtendedRepository<Role, Long>{

	@Query("SELECT r FROM Role r WHERE ?1 = false or  r.isActive = ?1 order by r.name")
	List<Role> findAllRoles(Boolean isActive);
}
