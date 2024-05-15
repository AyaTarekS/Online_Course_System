/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package OnlineCourse;

/**
 *
 * @author 7ekmaz
 */
import java.util.Arrays;




public class OnlineCourse_Project {

    public static void main(String[] args) {
        Coordinator akram = new Coordinator("akram","akram@gmail.com",10000,2);
        Student aya = new Student("Aya" ,"ayatarek@gmail.com",2100573,0);
        Coordinator azza = new Coordinator("azza","azza@gmail.com",20000,2);
        Coordinator Kareem = new Coordinator("Kareem", "ProXOtaku@gmail.com", 21345, 2);
        aya.ShowCourses();
        aya.SetNumberOfCourses(3);
        Course course_1 = new Course(1);
        Course course_2 = new Course(2);
        Course course_3 = new Course(3);
        
        aya.registerCourse(course_1);
        aya.registerCourse(course_2);
        aya.registerCourse(course_3);
        System.out.println("el7aonnnaaa");
        akram.setSechdule("saturday","15:00", 1);
        akram.setCoursePrice(5000, 1);
        akram.setSechdule("friday","15:00", 2);
        akram.setCoursePrice(200, 2);
         akram.setSechdule("sunday","15:00", 3);
        akram.setCoursePrice(5000, 3);
        
        aya.ShowCourses();
        //function sort
        Course [] selected_courses = { course_3 , course_2  ,course_1};
        Arrays.sort(selected_courses);
        for (int i = 0 ; i<3 ; i++)
        
        {
            System.out.println("///////");
       (selected_courses[i]).info(selected_courses[i].GetCourseCode());
        }
        System.out.println("==============");
        azza.setExam();
        Kareem.setExam();
    }
}
