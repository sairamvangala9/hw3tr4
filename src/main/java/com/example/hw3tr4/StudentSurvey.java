/*
 * Authors:
 * -- Sayi Rosshhun Gadde
 * -- Sai Ram Vangala
 * */
package com.example.hw3tr4;

import jakarta.persistence.*;

import java.util.Date;

/**
 * Entity class representing a student survey.
 * This class maps to a database table via JPA annotations and is used to store survey data submitted by students.
 */
@Entity
public class StudentSurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Personal information fields
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String telephone;
    private String email;

    // Date of the survey
    @Temporal(TemporalType.DATE)
    private Date dateOfSurvey;

    // Student's feedback about the campus
    private String campusLikes;

    // Source of the student's interest in the university
    private String interestSource;

    // Student's likelihood of recommending the university
    private String recommendationLikelihood;


    /**
     * Default constructor for JPA.
     */
    public StudentSurvey() {
    }

    /**
     * Parameterized constructor to create a StudentSurvey instance with all details.
     *
     * @param firstName                First name of the student
     * @param lastName                 Last name of the student
     * @param streetAddress            Street address of the student
     * @param city                     City of residence
     * @param state                    State of residence
     * @param zip                      Zip code
     * @param telephone                Telephone number
     * @param email                    Email address
     * @param dateOfSurvey             Date when the survey was filled out
     * @param campusLikes              Aspects of the campus that the student liked
     * @param interestSource           How the student became interested in the university
     * @param recommendationLikelihood Likelihood of recommending the university
     */
    public StudentSurvey(String firstName, String lastName, String streetAddress,
                         String city, String state, String zip, String telephone,
                         String email, Date dateOfSurvey, String campusLikes,
                         String interestSource, String recommendationLikelihood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.telephone = telephone;
        this.email = email;
        this.dateOfSurvey = dateOfSurvey;
        this.campusLikes = campusLikes;
        this.interestSource = interestSource;
        this.recommendationLikelihood = recommendationLikelihood;
    }

    // Getters and Setters
    // ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // First Name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Last Name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Street Address
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    // City
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // State
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Zip
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // Telephone
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Date of Survey
    public Date getDateOfSurvey() {
        return dateOfSurvey;
    }

    public void setDateOfSurvey(Date dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    // Campus Likes
    public String getCampusLikes() {
        return campusLikes;
    }

    public void setCampusLikes(String campusLikes) {
        this.campusLikes = campusLikes;
    }

    // Interest Source
    public String getInterestSource() {
        return interestSource;
    }

    public void setInterestSource(String interestSource) {
        this.interestSource = interestSource;
    }

    // Recommendation Likelihood
    public String getRecommendationLikelihood() {
        return recommendationLikelihood;
    }

    public void setRecommendationLikelihood(String recommendationLikelihood) {
        this.recommendationLikelihood = recommendationLikelihood;
    }
}
