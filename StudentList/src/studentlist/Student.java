/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Ronak
 */
public class Student {
    
    private String studentId;
    private String studentName;
    
    public Student(String studentId,String studentName){
        this.studentId = studentId;
        this.studentName=studentName;                
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
    
}
