package OnlineCourse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */
public class Course extends Schedule implements Comparable<Course> {
    private int code;
    private float price;
    static float [] course_price = new float [9] ;/*SOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOS*/
    private Exam exam;

    //level 0
    static int num_students_Logic_design=0;       
    static int num_students_programming=0;
    static int num_students_math=0;
    //level 1
    static int num_students_computer_organization=0;
    static int num_students_embedded_systems=0;
    static int num_students_advanced_programming=0;
   //level 2
    static int num_students_computer_architecture=0;
    static int num_students_realtime_embeddedsystems=0;
    static int num_students_data_structure=0;
            
    /*
    level 0
    1--->LogicDesign
    2--->programming 
    3--->math
    level 1
    4--->computer organization
    5--->embedded systems 
    6--->Advanced programming
    level 2
    7--->computer architecture
    8--->realtime embedded systems 
    9--->data sturcture
    */
    //if we're having time to make levels for the courses 
    
    
    Course(){}
    
    
    Course(int code)
    {
        this.code=code;
        switch(code)
        {
            case 1:
                num_students_Logic_design++;
                break;
            case 2:
                num_students_programming++;
                break;
            case 3:
                num_students_math++;
                break;
            case 4:
                num_students_computer_organization++;
                break;
            case 5:
                num_students_embedded_systems++;
                break;
            case 6:
                num_students_advanced_programming++;
                break;
            case 7:
                num_students_computer_architecture++;
                break;
            case 8:
                num_students_realtime_embeddedsystems++;
                break;
            case 9:
                num_students_data_structure++;
                break;
        }
    }
    public void SetCoursePrice(float price, int code) {
        course_price[code - 1] = price;
    }

    public float GetCoursePrice(int code) {
        return course_price[code - 1];
    }

    public int GetCourseCode() {
        return this.code;
    }
    
    
    public void info(int code) {
        switch (code) {
            case 1:
                System.out.println("Course Name: logic design " + " Course Code: 1" + " Course Price: "+ GetCoursePrice(code) );
                GetSchedule(code);
                
                break;
            case 2:
                System.out.println("Course Name: programming " + "Course Code: 2" + " Course Price: " +GetCoursePrice(code) );
                GetSchedule(code);
                
                break;
            case 3:
                System.out.println("Course Name: math " + "Course Code: 3 " + " Course Price: "+GetCoursePrice(code));
                GetSchedule(code);
                
                break;
            case 4:
                System.out.println("Course Name: computer_organization " + " Course Code: 4 " + " Course Price: " +GetCoursePrice(code));
                GetSchedule(code);
                
                break;
            case 5:
                System.out.println("Course Name: embedded_systems " + " Course Code: 5 " + " Course Price: "+GetCoursePrice(code) );
                GetSchedule(code);
                
                break;
            case 6:
                System.out.println("Course Name:advanced_programming " + " Course Code: 6 " + " Course Price: "+GetCoursePrice(code) );
                GetSchedule(code);
                
                break;
            case 7:
                System.out.println("Course Name: computer_architecture " + " Course Code: 6 " + " Course Price: "+GetCoursePrice(code) );
                GetSchedule(code);
                
                break;
            case 8:
                System.out.println("Course Name: realtime_embeddedsystems " + " Course Code: 6 " + " Course Price: "+GetCoursePrice(code) );
                GetSchedule(code);
                
                break;
            case 9:
                System.out.println("Course Name: data_structure " + " Course Code: 6 " + " Course Price: " + GetCoursePrice(code));
                GetSchedule(code);
                
                break;

        }
    }

    
    @Override
   
    public int compareTo(Course c) {
        if (code > c.code) {
            return 1;
        } else if (code < c.code) {
            return -1;
        } else {
            return 0;
        }
    } //levels in sort

}
