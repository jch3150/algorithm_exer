package structure1;

import java.sql.Array;
import java.util.ArrayList;

public class arr_exam {

	public static void list_add(ArrayList list, String[] str) {
		int size = str.length;
		
		for(int i=0; i<size; i++) {
			list.add(str[i]);
		}
	}
	
	public static void list_remove(ArrayList list, int[] index) {
		int size = index.length;
		
		for(int i=0; i<size; i++) {
			list.remove(index[i]-i);
		}
	}
	
	public static void print_list(ArrayList list) {
		int size = list.size();
		
		if(size == 0) {
			System.out.println("empty list");
		}
		else {
			for(int i=0; i<size; i++) {
				System.out.print(i+" : "+list.get(i)+"  ");
			}
		}
		
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList<String>();
		print_list(list);
		
		String[] str = {"a","b","c","d","e","f"};
		int[] index = {1,3,4};
		
		list_add(list, str);
		print_list(list);
		
		list_remove(list, index);
		print_list(list);

	}

}
