/*a) Define a class patient (patient_name, patient_age,
patient_oxy_level,patient_HRCT_report). Create an object of patient. Handle
appropriate exception while patient oxygen level less than 95% and HRCT scan report
greater than 10, then throw user defined Exception “Patient is Covid Positive(+) and
Need to Hospitalized” otherwise display its information. */
import java.util.*;
class CovidException extends Exception{
    String msg;
    CovidException(String msg)
    {
       this.msg=msg;
    }
    public String toString()
    {
        return "CovidException="+msg;
    }
}
class Patient {
    String name;
    int age;
float oxyLevel;
    int hrctReport;

   
    public Patient(String name, int age, float oxyLevel, int hrctReport) {
        this.name = name;
        this.age = age;
        this.oxyLevel = oxyLevel;
        this.hrctReport = hrctReport;
    
    }
    void display()
    {
    try {
        if(oxyLevel < 95 && hrctReport > 10) 
        
            throw new CovidException("Patient is Covid Positive(+) and needs hospitalization");
        
        System.out.println("patient name="+name);
        System.out.println("age"+age);
        System.out.println("oxygen"+oxyLevel);
        System.out.println("hrtcreport"+hrctReport);

    }
        catch(CovidException e)
        {
            System.out.println(e);
        }
    
      }
   }
 
 class demo {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("name,age,oxylevel,report");
       String pname=sc.nextLine();
       int age=sc.nextInt();
       float oxyLevel=sc.nextFloat();
       int hrctReport=sc.nextInt();

       Patient p=new Patient(pname, age, oxyLevel, hrctReport);
       p.display();

       
    }
}
