package Algorithm;

public class jugglingAlgo {
	
	 void rotate(int arr[], int d, int n) {
		 
		 int i, j, k, temp;
		 
		 d = d % n;
		 
		 int g_c_d = gcd(d,n);
		 
		 for(i = 0; i < g_c_d; i++) {
			 
			 temp = arr[i];
//			 System.out.println(temp);
			
			 j = i;
			 
//			 System.out.println(j);
			
			 
			 while(true) {
				 
				 k = j + d;
				 
				 System.out.print(k  + "   ");
				 
				 if(k>=n) 
					 
					 
					 k = k - n;
//				 System.out.println(k + "   " + n + "  ");
				 
				 if(k == i)
					 break;
//				 System.out.print(i +"   ");
//				 
				 
				 arr[j] = arr[k];
				 
//				 System.out.println(k);
				 
				 j = k;
				 
//				 System.out.println(j);
			 }
			 
			 arr[j] = temp;
			 
//			 System.out.println(j);
			 
		 }
	 }
	 
//	 void print(int arr[], int n) {
//		 
//		 for(int i=0; i<n ; i++)
//			 System.out.println(arr[i] + "  ");
//	 }
	
	  int gcd(int m, int n) 
	    { 
	      
			if (n == 0) 
	             return m; 
	        else
	             return gcd (n,  m % n); 
	    }
	  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		jugglingAlgo rotate = new jugglingAlgo();
		
		int arr[] = {1,2,3,4,5,6};
		
		rotate.rotate(arr, 3, 6);
		
//		rotate.print(arr, 6);
		

	}

}
