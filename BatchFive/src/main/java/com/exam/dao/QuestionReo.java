package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.Question;
@Repository
public interface QuestionReo extends JpaRepository<Question, Integer>{

}
