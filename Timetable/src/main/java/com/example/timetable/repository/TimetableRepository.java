package com.example.timetable.repository;

import com.example.timetable.model.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimetableRepository extends JpaRepository<Timetable, Long> {
}
