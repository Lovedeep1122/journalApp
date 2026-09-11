package com.honey.journalApp.service;

import com.honey.journalApp.entity.journalEntry;
import com.honey.journalApp.repository.journalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class journalEntryService {
@Autowired
    private journalEntryRepository journalEntryRepository;

public void saveEntry(journalEntry journalEntry){
    journalEntryRepository.save(journalEntry);
}
public List<journalEntry> getAll(){
    return journalEntryRepository.findAll();
}
public Optional<journalEntry> findById(Long id){
    return journalEntryRepository.findById(id);
}

public void deleteById(Long id){
    journalEntryRepository.deleteById(id);
}
}
