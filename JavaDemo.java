/*
//Multiplication table
public class JavaDemo{
	public static void main(String [] args){
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++){  //need y<x to avoid repeat
				System.out.println(y+"*"+x+"="+(x*y)+"\t");
			}
			System.out.println();
		}
	}
	public static static Sting get(double money){
		int line =9;
		for(int x=0;x<=line;x++){
			for(int y=0;y<line-x;y++){  
				System.out.println(" ");
			}
			for(int y=0;y<=x;y++){  
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
*/
public class JavaDemo{
	public static void main(String args[]){
		int result1=sum(10,20);
		double result2=sum(10.0,20.0);
		int result3=sum(1,2,3);
		System.out.println(result1);
		System.out.println(result2);
	    System.out.println(result3);
	}
	public static int sum(int x,int y){
        return x+y;
	}
	public static double sum(double x,double y){
		return x+y;
	}
	public static int sum(int x,int y,int z){
		return x+y+z;
	}
	
}
