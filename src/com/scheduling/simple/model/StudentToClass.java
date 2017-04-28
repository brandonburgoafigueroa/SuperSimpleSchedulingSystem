/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scheduling.simple.model;

/**
 *
 * @author Brandon
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentToClass")
public class StudentToClass {

    @XmlElement(name = "studentId")
    private int studentId;
    @XmlElement(name = "lastName")
    private String lastName;
    @XmlElement(name = "firstName")
    private String firstName;
     @XmlElement(name = "code")
    private String code;
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "description")
    private String description;
    
     public StudentToClass(int studentId, String lastName, String firstName, String code, String title, String description)
     
     {
        this.studentId=studentId;
        this.lastName=lastName;
        this.firstName=firstName;
        this.code=code;
        this.title=title;
        this.description=description;
     }
     public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }
       public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
     
}
