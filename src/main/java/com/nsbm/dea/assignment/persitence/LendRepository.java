package com.nsbm.dea.assignment.persitence;

import com.nsbm.dea.assignment.model.Lend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LendRepository extends JpaRepository<Lend, Long> {
}
