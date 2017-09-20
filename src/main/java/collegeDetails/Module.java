package collegeDetails;
import java.util.ArrayList;

/**
 *
 * @author I330152
 */
public class Module {
    
    private String moduleName,moduleID;
    private ArrayList<Student> list_of_Students;
    public Module(String moduleName, String moduleID){
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        //create new list for each module created
        this.list_of_Students = new ArrayList<Student>();
    }
    
    //setter methods
    public void addStudent(Student student){
       list_of_Students.add(student);
    }
    public void setModuleName(String moduleName){
        this.moduleName=moduleName;
    }
    public void setModeuleID(String moduleID){
        this.moduleID=moduleID;
    }
    
    //getter methods 
    public String getStudentList(){
        return this.list_of_Students.toString();
    }
    
    public String getModuleName(){
        return this.moduleName;
    }
    public String getModuleID(){
        return this.moduleID;
    }
    @Override
   public String toString() {
        return ("ModuleName:"+this.getModuleName()+", Module No: "+ this.getModuleID()+"\n");
                  
   }
}
