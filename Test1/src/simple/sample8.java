package simple;

public class sample8
{
        int roll;
        String name;
        static String college=" IIT DELHI";
        sample8(int x, String n)
        {
        	roll=x;
        	name=n;
        	
        }
        public void getresult()
        {
        	System.out.println(roll+ " " +name+ " "  +college );
        	
        }
        
	public static void main(String[] args) 
	{
		sample8 s2=new sample8(1, "shrikant");
		sample8 s3=new sample8(2, "shrikant1");
		sample8 s4=new sample8(3, "shrikant2");
		s2.getresult();
		s3.getresult();
		s4.getresult();
	}

}
