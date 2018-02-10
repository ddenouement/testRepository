
public class Tester {
   public static int doProcess(int a,int b) {
	  int r=0;
	  a*=10;
	  b*=0.2;
	   
	   return r+a+b;
   }
	
	public static void main(String[] args) {
		int l =9;
		int k = 122;
	int res=	doProcess(l,k);
		System.out.println(res);
	}
}
