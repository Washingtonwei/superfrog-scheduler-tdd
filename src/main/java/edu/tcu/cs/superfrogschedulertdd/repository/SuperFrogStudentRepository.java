package edu.tcu.cs.superfrogschedulertdd.repository;

import edu.tcu.cs.superfrogschedulertdd.domain.SuperFrogStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperFrogStudentRepository extends JpaRepository<SuperFrogStudent, Integer> {
}
