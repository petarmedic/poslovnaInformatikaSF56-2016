package com.poslovna.Poslovna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poslovna.Poslovna.domain.Preduzece;

@Repository
public interface PreduzeceRepository extends JpaRepository<Preduzece, Long> {

}
