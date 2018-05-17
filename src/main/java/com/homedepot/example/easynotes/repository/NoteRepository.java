package com.homedepot.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homedepot.example.easynotes.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>{
}
