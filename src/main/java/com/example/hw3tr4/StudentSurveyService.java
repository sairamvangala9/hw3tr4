/*
 * Authors:
 * -- Sayi Rosshhun Gadde
 * -- Sai Ram Vangala
 */

package com.example.hw3tr4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing student surveys.
 * This class provides business logic for CRUD operations on student surveys
 * and interacts with the StudentSurveyRepository for data access.
 */
@Service // Marks this class as a Spring service
public class StudentSurveyService {

    @Autowired
    private StudentSurveyRepository repository; // Injects the StudentSurveyRepository

    /**
     * Saves a new survey or updates an existing one in the database.
     * @param survey Survey object to be saved
     * @return The saved survey object
     */
    public StudentSurvey saveSurvey(StudentSurvey survey) {
        return repository.save(survey); // Saves the survey to the database
    }

    /**
     * Retrieves all surveys from the database.
     * @return A list of all surveys
     */
    public List<StudentSurvey> getAllSurveys() {
        return repository.findAll(); // Fetches all surveys
    }

    /**
     * Retrieves a survey by its ID.
     * @param id The ID of the survey to retrieve
     * @return The survey object if found, or null if not
     */
    public StudentSurvey getSurveyById(Long id) {
        return repository.findById(id).orElse(null); // Fetches a survey by ID, returns null if not found
    }

    /**
     * Updates an existing survey in the database.
     * @param survey Survey object with updated information
     * @return The updated survey object
     */
    public StudentSurvey updateSurvey(StudentSurvey survey) {
        return repository.save(survey); // Updates and saves the survey
    }

    /**
     * Deletes a survey by its ID from the database.
     * @param id The ID of the survey to delete
     */
    public void deleteSurvey(Long id) {
        repository.deleteById(id); // Deletes the survey with the specified ID
    }
}
