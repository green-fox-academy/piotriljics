package com.greenfoxacademy.thereddit.Repository;

import com.greenfoxacademy.thereddit.Model.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssigneeRepository extends JpaRepository <Assignee, Long> {
}
