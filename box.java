public class box{
	Integer i;
	int j;
	public static void main(String[] args){
		box b=new box();
		b.go();
	}
	public void go(){
		j=i;
		System.out.println(j);
		System.out.println(i);
	}
}