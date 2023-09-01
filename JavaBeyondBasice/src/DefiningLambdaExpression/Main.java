package DefiningLambdaExpression;

public class Main {

	public static void main(String[] args) {

		StringFormatter sf = (String string1, String string2) -> string1 + " " + string2;
		System.out.println(sf.format("Lambda", "Expression"));
		
		StringFormatter sf1 = (String string1, String string2) -> return System.out.println(string1+ "-"+string2);  
		sf1.format("Lambda", "Expression");
		
		//StringFormatter sf = (String string1, String string2) -> string1 + " " + string2;
		//System.out.println(sf.format("Lambda", "Expression"));
	}

}