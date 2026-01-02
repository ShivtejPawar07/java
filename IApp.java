import java.util.*;

class IApp {
    public static void main(String[] x) {

        ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("Add element");
		for(int val:al){
			System.out.print(val+" ");
		}
		System.out.println("\nRemove element");
		al.remove(2);
		for(int val:al){
			System.out.print(val+" ");
		}
        Collection<Integer> c=new ArrayList<>();
		c.add(50);
		c.add(60);
		c.add(70);
		c.add(80);
		System.out.println("\nadd all element\n");
		al.addAll(c);
		
		for(int val:al){
			System.out.print(val+" ");
		}
		if(al.contains(10)){
			System.out.println("\nELelmnt found");
		}
		else{
			System.out.println("\nnot ELelmnt found");
		}
		
		if(al.contains(c)){
			System.out.println("\nELelmnt found");
		}
		else{
			System.out.println("\nnot ELelmnt found");
		}
		/*System.out.println("\nremove all element\n");
		al.removeAll(al);
		for(int val:al){
			System.out.print(val+" ");
		}*/
		al.clear();
    }
}
