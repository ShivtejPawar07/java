import java.util.*;
class Continent {
    String cname;

    Continent(String cname) {
        this.cname = cname;
    }

    void show() {
        System.out.println("Continent name => " + cname);
    }
}

class Country extends Continent {
    String name;

    Country(String name, String cname) {
        super(cname);
        this.name = name;
    }

    void show() {
        super.show(); // Calling show() of Continent class
        System.out.println("Country name => " + name);
    }
}

class State extends Country {
    String sname;
    String pname;

    State(String sname, String pname, String name, String cname) {
        super(name, cname);
        this.sname = sname;
        this.pname = pname;
    }

    void show() {
        super.show(); // Calling show() of Country class
        System.out.println("State name => " + sname);
        System.out.println("City name => " + pname);
    }
}

class demo {
    public static void main(String[] args) {
        // State s = new State("Maharashtra", "Pune", "India", "Asia");
        // s.show();
        Scanner sc=new Scanner(System.in); 
          System.out.println("enter constient country state place");       
         String cname=sc.nextLine();
         String name=sc.nextLine();
         String sname=sc.nextLine();
         String pname=sc.nextLine();
         State s = new State(cname,name,sname,pname);
         s.show();
        
        
    }
}
