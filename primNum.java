
public class primNum {
	public static void main(String args[]){
		System.out.println("This is the prime number between 2 and 100:");
		int []array=new int[99];
		for(int i=2;i<=100;i++){   //initial the array
			array[i-2]=i;
		}
		/*for(int ii=2; 2*ii<=100; ii++){
			for (int jj=1; jj<=98;jj++){
				if(array[jj]==2*ii)
					array[jj]=0;
			}
		}**/
		 for(int i=0; i<=98;i++){
				  if (array[i]!=0 & array[i]*array[i]<=100){
			  		  for(int m=i+1;m<=98;m++){
			  				if(array[m]%array[i]==0)
			  					array[m]=0;
			  				}
			  		  }
				  else
				  		break;
			     }
			  	  
		for(int i=0;i<=98;i++){
			if(array[i]!=0)
		System.out.print(" "+array[i]);
		}
	}

}
