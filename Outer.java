class Outer 
{
	private int x;
	Inner inner=new Inner();
	//inner.go();
	
	public void Do( ) 
	{
		inner.go();
		System.out.println("Hello World!");
	}
	
	class Inner
	{
		 void go(){
			x=42;
		}
	}
}
