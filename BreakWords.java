package OneNeuronAssigment1;

public class BreakWords {

	public static void main(String[] args) {
		
		String Words[]={"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for(int i=0;i<Words.length;i++)
		{
			if(Words[i].equals("Selenium"))
			{
				break;
			}
			System.out.println(Words[i]);
		}
		
		

	}

}
