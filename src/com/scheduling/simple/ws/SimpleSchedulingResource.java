/*
 * SimpleSchedulingResource.java
 */
package com.scheduling.simple.ws;

import com.scheduling.simple.model.MyClass;
import com.scheduling.simple.model.Student;
import com.scheduling.simple.model.StudentToClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleSchedulingResource {
    
    private Map<Integer, Student> studentsMap;
    private Map<String, MyClass> classMap;
    private Map<Integer, StudentToClass> studentClassMap;

    public SimpleSchedulingResource() {
        studentsMap = new HashMap<Integer, Student>();
        classMap = new HashMap<String, MyClass>();
        studentClassMap= new HashMap<Integer, StudentToClass>();
    }
    
    public Student createStudent(int studentId, String lastName, String firstName) {
        // TODO validate input data
        Student student = new Student(studentId, lastName, firstName);
        studentsMap.put(studentId, student);
        
        return student;
    }
    public MyClass createClass (String code, String title, String description)
    {
        MyClass clase = new MyClass (code, title, description);
        classMap.put(code, clase);
        return clase;
    }
    public StudentToClass AsignarEstudianteAClase(int studentId, String code)
    {
        Student S=retrieveStudent(studentId);
        MyClass C=retrieveClass(code);
        StudentToClass SC = new StudentToClass (S.getStudentId(), S.getLastName(), S.getFirstName(), C.getCode(), C.getTitle(), C.getDescription());
        studentClassMap.put(studentId, SC);
        return SC;
    }
    public StudentToClass retrieveInscripciones(int studentId)
    {
        return studentClassMap.get(studentId);
    }
    
    public MyClass retrieveClass (String code)
    {
        return classMap.get(code);
    }

    public Student retrieveStudent(int studentId) {
        return studentsMap.get(studentId);
    }
    
}
