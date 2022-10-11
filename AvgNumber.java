package OneNeuronAssigment1;

public class AvgNumber {

	public static void main(String[] args) {
		double sum[]= {10,90.78,111,8989,7876};
		  
		  double add=0;
		  
		  for(int i=0;i<sum.length;i++)
		  
		  {
		  
		  add=add+sum[i]; 
		  
		  }
		  add=add/sum.length;
		  System.out.println("Sum of adding values:" +add);

	}

}
