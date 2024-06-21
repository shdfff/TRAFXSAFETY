package simple;

public class singlearray {

	public static void main(String[] args) 
	{
		int b[]= {1,2,3,4,5};
		String s[]= {"selenium", "sel"};
		Object a[]= {"auto", 1,2,3,4,5,6,6.5};
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(s.length);
		System.out.println(a[2]);
		System.out.println(b[4]);
		System.out.println(s[1]);
		a[5]="autos";
		System.out.println(a[5]);

	}

}
