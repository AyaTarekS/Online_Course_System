package OnlineCourse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */ 
import java.util.*;
class ExamCodeException extends RuntimeException{
public ExamCodeException (){}
}



class Exam extends Course{
    private int examCode;
   TimeSlot ts = new TimeSlot(0,0,0) ;
    
    public Exam(){
        this.examCode=0;
    }
    
    public void setCode(int coorCode){
    this.examCode = coorCode;
    //not super to not give any access for the exam class to edit the course code only for the information method in student class
    }
    //function to throw the exception
    public void examCodeError(int examCode){
    if ((examCode < 1) || (examCode > 9))
        throw new ExamCodeException() ;
    }

    //if the coord set the exam
    public void settingExam() {
        //setting the code of 
        System.out.println("Set exam code");
        Scanner input = new Scanner(System.in);
        //for the code
        int exam_Code = input.nextInt();//to get the code from the coordinator
        //exception handling to have code from 1 to 9  
        boolean continueSet = true;
        //print statement 
        do{
            try {
                examCodeError(exam_Code);
                    setCode(exam_Code);
                    continueSet = false;

                 
            } catch (ExamCodeException e) {
                System.out.println("No Course has this code , please enter another code");
                continueSet = true;
                exam_Code = input.nextInt();//to flash the buffer
                
            }}while(continueSet);
        //putting a print statement in gui for all of that
        System.out.println("Set exam day");
        int day = input.nextInt();
        ts.setDay(day);
        System.out.println("Set exam month");
        int month = input.nextInt();
        ts.setMonth(month);
        System.out.println("Set exam slot");
        int slot = input.nextInt();
        ts.setSlot(slot);
    }
    
   
   
    public int GetExamCode() {
        return this.examCode;
        //to use it in information method in class by poly to bulid a connection with course code
    }

    //to use it in information method in class
    public void print() {
        System.out.println("Code:" + this.examCode);
        System.out.println("TimeSlot:");
        this.ts.print();
    }
    @Override //O is capital
    public void info(int examCode) {
    super.info(examCode);
    print();
    }


    private boolean hasConflictWith(Exam e) {
        if (this.examCode == e.examCode) {
            return false;
        }
        if (this.ts.getDay() != e.ts.getDay()) {
            return false;
        }
        if (this.ts.getMonth() != e.ts.getMonth()) {
            return false;
        }
        if (this.ts.getSlot() != e.ts.getSlot()) {
            return false;
        }

        return true;
    }




    
}
