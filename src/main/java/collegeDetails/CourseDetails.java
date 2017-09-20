package collegeDetails;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author I330152
 */
public class CourseDetails {
    
    private String courseName;
    private ArrayList<Module> courseModules;
    private DateTime startDate, finishDate;
    
    public CourseDetails(String courseName,DateTime startDate, DateTime finishDate ){
        this.courseModules= new ArrayList<Module>();
        this.courseName = courseName;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }
    
    //setter methods
    public void setStartDate(DateTime startDate){
        this.startDate = startDate;
    }
    public void setFinishDate(DateTime finishDate){
        this.finishDate = finishDate;
    }
    public void addCourseModules(Module module){
        this.courseModules.add(module);
    }
    public void setCourseName(String name){
        this.courseName = name;
    }
    
    //getter methods
    public String getCourseName(){
        return this.courseName;
    }
    public String getCourseModules(){
        return this.courseModules.toString();
    }
    public DateTime getStartDate(){
        return this.startDate;
    }
    public DateTime getFinishDate(){
        return this.finishDate;
    }
}
