import sy.SYMarks; //userdefined package
import ty.TYMarks; //userdefined package
import java.io.*;//predefined package

class student {
  int rollno;
  String studname;
  SYMarks sym;
  TYMarks tym;

  student(int r, String name, SYMarks s, TYMarks t) {
    rollno = r;
    studname = name;
    sym = s;
    tym = t;
  }

  public String toString() {
    return rollno + "\t" + studname + "\t" + sym + "\t" + tym;
  }

  void calculategrade() {
    int total = sym.comptot + tym.theory + tym.practical; // computer total (sy -2 theory 1 practical,ty -6 subject ty
                                                          // practical -3)
    // System.out.print(total);
    double per = total / 12;
    if (per >= 70)
      System.out.println("\tA");
    else if (per >= 60)
      System.out.println("\tB");
    else if (per >= 50)
      System.out.println("\tC");
    else if (per >= 40)
      System.out.println("\tPassClass");
    else
      System.out.println("\tFail");

  }

  public static void main(String arg[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("How many student details");
    int n = Integer.parseInt(br.readLine());
    // create array of object
    student[] stud = new student[n];

    // read student details
    for (int i = 0; i < n; i++) {
      System.out.println("enter " + (i + 1) + " student details");
      System.out.println("enter rollnumber=>");
      int rn = Integer.parseInt(br.readLine());
      System.out.println("enter student name=>");
      String name = br.readLine();
      System.out.println("enter sy marks(computertotal,mathtotal,electronics total)=>");
      int ct = Integer.parseInt(br.readLine());
      int mt = Integer.parseInt(br.readLine());
      int et = Integer.parseInt(br.readLine());
      SYMarks sym = new SYMarks(ct, mt, et);
      System.out.println("enter ty marks(theory,practical)=>");
      int th = Integer.parseInt(br.readLine());
      int pr = Integer.parseInt(br.readLine());
      TYMarks tym = new TYMarks(th, pr);

      stud[i] = new student(rn, name, sym, tym); // student object
    } // for end
      // display student details
    System.out.println("******STUDENT DETAILS******");
    System.out.println("ROLLNO\tNAME\tCOMPTOT\tMATHTOT\tELECTOT\tTHEORY\tPRACTICAL\tGRADE");
    for (int i = 0; i < n; i++) {
      System.out.print(stud[i]); // invoke toString() method
      stud[i].calculategrade();
    }
  } // main
}// class end
