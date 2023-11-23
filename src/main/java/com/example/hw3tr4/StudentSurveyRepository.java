/*
 * Authors:
 * -- Sayi Rosshhun Gadde
 * -- Sai Ram Vangala
 * */
package com.example.hw3tr4;

//import com.example.hwsr.StudentSurvey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSurveyRepository extends JpaRepository<StudentSurvey, Long> {
    // This interface will automatically provide basic CRUD operations
}
