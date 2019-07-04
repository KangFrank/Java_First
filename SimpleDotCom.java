public class SimpleDotCom{
	public static void main(String[] args){
		SimpleDotCom dot=new SimpleDotCom();

		int [] location={2,3,4};
		dot.setLocationCells(locations);
		String userGuess="2";//random failed guess
		String result = dot.checkyourself(userGuess);
		String testResult="failed";
		if(result.equals("hit")){
			testResult="passed";
		}
		System.out.println()testResult;
	}
}