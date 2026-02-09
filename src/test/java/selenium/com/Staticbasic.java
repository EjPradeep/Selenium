package selenium.com;

public class Staticbasic {

	int A = 0;
	static int B = 0;

	void Count() {
     A ++;
     ++B;
     --A;
     System.out.println("Int A= "+A+", Static B= "+B);
	}

	public static void main(String[] args) {

		Staticbasic S=new Staticbasic();
          S.Count();
          S.Count();   S.Count();
      	Staticbasic S1=new Staticbasic();
        S1.Count();
        S1.Count();   S1.Count();
         
          
		
	}

}
