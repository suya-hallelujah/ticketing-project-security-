package com.practice.repository;

import com.practice.entity.Project;
import com.practice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {

    Project findByProjectCode(String code);

    List<Project> findAllByAssignedManager(User manager);
}
