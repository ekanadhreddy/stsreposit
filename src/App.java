

public class App {
	public static int search(int[]array, int target){
		int s=0;
		int e=array.length-1;
		while(s<=e) {
			int m = (s+e)/2;
			
		
		if(array[m]==target) {
			return m;
			
		}
		else if(array[m]>target){
			e=m-1;
		}
		else{
			s=m+1;
		}
	}
		
			return -1;
	}
	public static void main(String[] args) {
		int[]array= {1,3,5,7,9,14,18,19,23};
		 int target=19;
		 int index=search(array,target);
		 System.out.println(index);
		 

	}

}
