package com.jonathan.springjournal.repository;

import com.jonathan.springjournal.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {
}
