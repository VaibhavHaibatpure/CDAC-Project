package com.demo.dao;

import com.demo.beans.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentDao extends JpaRepository<Parent, Long> {
    // You can define additional query methods here if needed
}
