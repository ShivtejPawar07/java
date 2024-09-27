 import java.util.Date;
 import java.text.SimpleDateFormat;
 class demo {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
        String s=sdf.format(d);
        System.out.println(s);

        sdf=new SimpleDateFormat("mm-dd-yyyy");
        s=sdf.format(d);
        System.out.println(s);

        sdf=new SimpleDateFormat("dd-mm-yyyy");
        s=sdf.format(d);
        System.out.println(s);

        sdf=new SimpleDateFormat("E mmmm dd yyyy");
        s=sdf.format(d);
        System.out.println(s);

        sdf=new SimpleDateFormat("E  mmmm dd hh:mm:ss a z yyyy");
        s=sdf.format(d);
        System.out.println(s);

        sdf=new SimpleDateFormat("dd/mm/yy hh:mm:ss a z");
        s=sdf.format(d);
        System.out.println(s);

        sdf=new SimpleDateFormat("HH:MM:SS");
        s=sdf.format(d);
        System.out.println(s);

        sdf=new SimpleDateFormat("W");
        s=sdf.format(d);
        System.out.println(s);

        sdf=new SimpleDateFormat("w");
        s=sdf.format(d);
        System.out.println(s);

        sdf=new SimpleDateFormat("D");
        s=sdf.format(d);
        System.out.println(s);


    }
    
}
