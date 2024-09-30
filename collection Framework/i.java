import java.util.ArrayList;

class Demo {

    public static void main(String[] args) {
        ArrayList al= new ArrayList<>();
        al.add(new Demo());
        al.add("bbb");
        al.add("ccc");
        al.add("ddd");
        System.out.println(al);
        
      // al.set(2,"SSS");
     //  al.get(6);
     al.remove(2);
     System.out.println(al);
     System.out.println(al.indexOf("bbb"));
     System.out.println(al.lastIndexOf("bbb"));

    }
}
