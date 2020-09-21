package structure1;

import java.util.ArrayList;

public class arr_exam {

	public static void list_add(ArrayList list, String str) {
		list.add(str);
	}
	
	public static void print_list(ArrayList list) {
		int size = list.size();
		
		if(size == 0) {
			System.out.println("empty list");
		}
		else {
			for(int i=0; i<size; i++) {
				System.out.print(i+" : "+list.get(i)+", ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList<String>();
		print_list(list);
		
		list_add(list,"abc");
		list_add(list,"def");
		print_list(list);

	}

}
