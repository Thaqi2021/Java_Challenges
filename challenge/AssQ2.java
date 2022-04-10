package challenge;

public class AssQ2 {
	public static void main(String[] args) {
		int x=5,y;
//		System.out.println(++x+""+ (x--) +""+ (x++));
//		System.out.println(--x);
		 y= ++x + x++ + --x;  //6 + 6 +7-1;
		 
		 System.out.println(x + "," + y);
		 
		 //AssQ3
		 int m=7;
		 if(m==7); //due semicolan it prints both
		 System.out.println("NumberSeven");
		 
		 System.out.println("NotSeven");
		 
		 //AssQ4
		 char a = 'A';
		 a++;
		 System.out.println((int)a);
		 
		 //Assq5
		 int p = 2;
		 int q = 0;
		 for ( ; q < 10; ++q) {
			 if (q % p == 0)
				 continue;
			 else if (q == 8) //no need of this statement
				 break;
			 else
				 System.out.print(q + " ");
		 }
		 System.out.println();

		 
		 //AssQ6
		 int var1 = 5;
		 int var2 = 6;
		 	if ((var2 = 1) == var1)
		 		System.out.println(var2+"sorry");
		 	else
		 		System.out.println(++var2);
	}
}
