
public class Tester {
   public static int doProcess(int a,int b,boolean k) {
	  int r=0;
	  a*=10;
	  b*=0.2;
	   int newInt = 999;
if(k) newInt = 1;
	   return (r+a+b)/newInt;
   }
	
	public static void main(String[] args) {
		int l =9;
		int k = 122;
	int res=	doProcess(l,k);
		System.out.println(res);
	}
}
