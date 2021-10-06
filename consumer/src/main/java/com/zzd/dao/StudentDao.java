package com.zzd.dao;

import com.zzd.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;


@Component
public interface StudentDao extends PagingAndSortingRepository<Student, Integer>, JpaRepository<Student, Integer> {
}
