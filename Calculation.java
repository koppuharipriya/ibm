class Sum{
	
	public void addition(){
		int a = 5;
		int b = 7;
		int result = a + b;
		System.out.println("sum of the two numbers : " + result);
	}
	public void substration(){
		int a = 7;
		int b = 5;
		int result = a - b;
		System.out.println("substration of the two numbers: " + result);
	}
	public void multiple(){
		int a = 6;
		int b = 7;
		int c = 8;
		int result = a * b * c;
		System.out.println("multiple of  the three numbers: " + result);
		
	}
}
class Div{
	public void division(){
		int a = 7;
		int b = 9;
		int result = a % b;
		System.out.println("division of the two numbers: " + result);
	}
}
class Printable{
	public void print(){
		System.out.println("I am haripriya: ");
	}
}

class Calculation{
	public static void main(String[] agrs){
		Sum sum = new Sum();
		sum.addition();
		sum.substration();
		sum.multiple();
		Div div = new Div();
		div.division();
		
		Printable printable = new Printable();
		printable.print();
    }
}