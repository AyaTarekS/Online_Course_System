package OnlineCourse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */
public class Student extends Member {
    Schedule schedule ;
    int num_courses;
    int reg_courses = 0;
    Course [] selected_courses ;
    int [] Check ={0,0,0,0,0,0,0,0,0};
    //having nine courses
    
    public Student(){}
    Student(String name,String email,int id,int n)
    {
        super (name,email,id);
        this.num_courses = n;
        this.selected_courses = new Course[3];
        /*Each Studeny has only 3 Courses*/
    }
    public void SetNumberOfCourses(int n){this.num_courses = n;}  
    
    /*This Function Show the allowed Courses For the Student To Select Between THEM*/
    public void ShowCourses()
    {
        System.out.println("These are the available Courses for register:");
        for(int i=0;i<9;i++)
        {
            //if i register the course the check[i] will equal one so the course will not show
                 if(Check[i]==0 & i==0){System.out.println("Course name: Logic Design"+" Code:1 ");}
            else if(Check[i]==0 & i==1){System.out.println("Course name: Programming"+" Code:2 ");}
            else if(Check[i]==0 & i==2){System.out.println("Course name: Math"+" Code:3" );}
            else if(Check[i]==0 & i==3){System.out.println("Course name: Computer Organization"+" Code:4 ");}
            else if(Check[i]==0 & i==4){System.out.println("Course name: Embedded Systems"+" Code:5 ");}
            else if(Check[i]==0 & i==5){System.out.println("Course name: Advanced Programming"+" Code:6 ");}
            else if(Check[i]==0 & i==6){System.out.println("Course name: ComputerArchitecture"+" Code:7 ");}
            else if(Check[i]==0 & i==7){System.out.println("Course name: Real_time Embedded Systems"+" Code:8 ");}
            else if(Check[i]==0 & i==8){System.out.println("Course name: Data Structure"+" Code:9 ");}
        }
        
        System.out.println("");
        
        
        if(num_courses==0)
        {System.out.println("Please register at least one Course....");}
        else
        {
            for(int i=0;i<num_courses;i++)
            {
                System.out.println("--->");
                (selected_courses[i]).info(selected_courses[i].GetCourseCode());
            }
        }
    }
    
    
    
    
    public void registerCourse(Course selected_course)
    {
        if(num_courses>3)
        {
            System.out.println("Student Shouldn't Register into more than 3 Courses");
        }
        else{
             if(reg_courses<num_courses)
            {
            this.selected_courses[reg_courses]= selected_course; //selected_course is array not element
            reg_courses++;
            Check[(selected_course.GetCourseCode())-1]=1;
            }
        }
    }
  
    
    
    
    
}
