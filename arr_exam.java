package structure1;

import java.util.ArrayList;

public class arr_exam {

	public static void print_list(ArrayList list) {
		int size = list.size();
		
		if(size == 0) {
			System.out.println("empty list");
		}
		else {
			for(int i=0; i<size; i++) {
				System.out.print(i+" : "+list.get(i)+"/n");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList<String>();
		print_list(list);

	}

}
