/*
 * Authors:
 * -- Sayi Rosshhun Gadde
 * -- Sai Ram Vangala
 */

package com.example.hw3tr4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for handling student survey-related HTTP requests.
 * This class provides RESTful endpoints for CRUD operations on student surveys.
 */
@RestController // Marks this class as a REST controller
@RequestMapping("/api/surveys1") // Maps HTTP requests to /api/surveys path
public class StudentSurveyController {

    @Autowired
    private StudentSurveyService service; // Injects the StudentSurveyService

    /**
     * Creates a new survey.
     * @param survey Survey object from the request body
     * @return The saved survey object
     */
    @PostMapping("/") // Maps POST requests to create a new survey
    public StudentSurvey createSurvey(@RequestBody StudentSurvey survey) {
        return service.saveSurvey(survey);
    }

    /**
     * Retrieves all surveys.
     * @return List of all surveys
     */
    @GetMapping("/") // Maps GET requests to retrieve all surveys
    public List<StudentSurvey> getAllSurveys() {
        return service.getAllSurveys();
    }

    /**
     * Retrieves a single survey by its ID.
     * @param id The ID of the survey
     * @return The survey with the specified ID
     */
    @GetMapping("/{id}") // Maps GET requests to retrieve a survey by its ID
    public StudentSurvey getSurveyById(@PathVariable Long id) {
        return service.getSurveyById(id);
    }

    /**
     * Updates an existing survey.
     * @param survey Updated survey object from the request body
     * @return The updated survey object
     */
    @PutMapping("/") // Maps PUT requests to update an existing survey
    public StudentSurvey updateSurvey(@RequestBody StudentSurvey survey) {
        return service.updateSurvey(survey);
    }

    /**
     * Deletes a survey by its ID.
     * @param id The ID of the survey to delete
     * @return Confirmation message
     */
    @DeleteMapping("/{id}") // Maps DELETE requests to remove a survey by its ID
    public String deleteSurvey(@PathVariable Long id) {
        service.deleteSurvey(id);
        return "Survey removed !! " + id;
    }
}
