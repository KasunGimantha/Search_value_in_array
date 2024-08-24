public class SearchArray{
	public static int search(int A[],int key){
		for(int i=0;i<A.length;i++){
			if(A[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int A[]={10,5,20,7,1};
		int key = 20;
		int result = search(A,key);
		if (result == -1){
			System.out.println("Element not exist");
		}
		else{
			System.out.println("Element is found @"+result);
		}
	}
}












