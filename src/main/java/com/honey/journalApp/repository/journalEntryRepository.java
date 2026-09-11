package com.honey.journalApp.repository;
import java.util.*;
import com.honey.journalApp.entity.journalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface journalEntryRepository extends JpaRepository<journalEntry, Long>{

}
