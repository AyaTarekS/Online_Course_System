package OnlineCourse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */
public class Coordinator extends Member {
    int num_courses;  
    Exam exam;
    
   
    
    /*TO ADD COURSE*//////////////////
    public Coordinator(){
  
    }
    
     Coordinator(String name,String email,int id,int n)//questioning about the n 
    {
        super (name,email,id);
        
    }
     //no override the method , we cannot add another inhertence from class only one class and it's member
    public void setCoursePrice(float price , int code){
    Course CoorCourse = new Course (code);
    CoorCourse.SetCoursePrice(price,code);
    }
    public void setSechdule(String day ,String hour ,int code ){
        Schedule schedule = new Schedule() ;
        schedule.SetSchedule(day, hour, code);
    }
    public void setExam(){
        Exam exam= new Exam();
        exam.settingExam();
    }
    }
     
     
     
     
     
     
     
     
     
    
     

