package com.example.file_service_SPRING.repository;

import com.example.file_service_SPRING.model.DBFile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {
}