/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testCollegeDetails;

import collegeDetails.Module;
import collegeDetails.Student;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author I330152
 */
public class TestCollegeDetails {
    
 @Test
 //test to see if the getUserName properly concatonates the name and user id
 public void checkStudentUserName(){
     Student student = new Student("Gary McMahon", 21 , "19/06/1996", 14534653);
     String userName = "Gary McMahon14534653";
     assertEquals(userName, student.getUserName());
 }
}
