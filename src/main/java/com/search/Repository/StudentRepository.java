package com.search.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.search.Entity.Lead;

public interface StudentRepository extends JpaRepository<Lead, Long > {

}
