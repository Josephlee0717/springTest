package joe.levante.controller;

public class TelController {
	public static void main(String[] args){
		int[] arr = new int[]{7,4,1,9,3,6,5,8};
		int[] index = new int[]{2,4,3,0,2,5,2,6,1,7,4};
		String tel = "";
		
		for( int i : index){
			tel += arr[i];
		}
		System.out.println("联系电话："+tel);
	}
}
