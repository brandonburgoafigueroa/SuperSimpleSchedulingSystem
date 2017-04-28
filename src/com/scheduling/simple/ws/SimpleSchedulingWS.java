/*
 * SimpleSchedulingWS.java
 */
package com.scheduling.simple.ws;

import com.scheduling.simple.model.MyClass;
import com.scheduling.simple.model.Student;
import com.scheduling.simple.model.StudentToClass;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class SimpleSchedulingWS {
    
    private final SimpleSchedulingResource resource = new SimpleSchedulingResource();
  
    /**
     * Creates a new student.
     * @param studentId Integer
     * @param lastName String
     * @param firstName String
     * @return 
     */
    public Student createStudent(@WebParam(name = "studentId") int studentId, 
            @WebParam(name = "lastName") String lastName, 
            @WebParam(name = "firstName") String firstName) {
        return resource.createStudent(studentId, lastName, firstName);
    }
    public MyClass createClass(@WebParam(name = "code") String code, 
            @WebParam(name = "title") String title,
            @WebParam(name = "description") String description){
        return resource.createClass(code, title, description);
    }
    public StudentToClass AsignarEstudianteAunaClase(@WebParam(name = "studentId") int studentId,
            @WebParam(name = "code") String code)
    {
        return resource.AsignarEstudianteAClase(studentId,code);
    }
    
    /**
     * Return a student based on its studentId.
     * @param studentId Integer
     * @return 
     */
    public Student retrieveStudent(@WebParam(name = "studentId") int studentId) {
        return resource.retrieveStudent(studentId);
    }
    public MyClass retrieveClass(@WebParam(name = "code") String code){
        return resource.retrieveClass(code);
    }
    public StudentToClass retrieveInscripciones(@WebParam(name = "studentId") int studentId)
    {
        return resource.retrieveInscripciones(studentId);
    }
   
            
            
    // add more methods to createClass, registerStudentToClass
}
