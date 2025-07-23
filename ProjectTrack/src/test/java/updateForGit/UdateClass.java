package updateForGit;

public class UdateClass {

	public static void main(String[] args) {
		
	        int arr[]={1,1,1,0,2,2,2,0,6,6,6,6,1,1,1,1};
	        int count=0;
	        for(int i=0;i<arr.length-2;i++){
	            if(arr[i]==arr[i+1]&&arr[i]==arr[i+2]){
	                count++;
	                System.out.println(arr[i]+","+arr[i+1]+","+arr[i+2]);
	            }
	        }
	        System.out.println("There are "+count+" triplets");
	}

	}


