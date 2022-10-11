package OneNeuronAssigment1;

public class BreakNumber {

	public static void main(String[] args) {
		int num[]= {12,34,66,85,900};
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==85)
			{
				break;
			}
			System.out.println(num[i]);
		}
		

	}

}
