import java.util.*;
public class MyCal {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		showMenu();
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		
		if(menu == 1){
			addNumbers(getFirstNumbers(),getSecondNumbers());
		}
		if(menu == 2){
			subNumbers(getFirstNumbers(),getSecondNumbers());
		}
		if(menu == 3){
			multNumbers(getFirstNumbers(),getSecondNumbers());
		}
		if(menu == 4){
			divNumbers(getFirstNumbers(),getSecondNumbers());
		}
		if(menu == 5){
			System.out.println("exit");
		}
	}
		
	public static void showMenu(){
	
		System.out.println("<Menu>");
		System.out.println("1. Add two integers");
		System.out.println("2. Subtract an integer from an integer");
		System.out.println("3. Multiply two integers");
		System.out.println("4. Divide an integer into an integer");
		System.out.println("5. exit");
	}
	public static void getNumbers(int x, int y){
		getFirstNumbers();
		getSecondNumbers();
	}
	public static int getFirstNumbers(){
		int x;
		System.out.println("enter first integer");
		Scanner first = new Scanner(System.in);
		x = first.nextInt();
		return x;
	}
	public static int getSecondNumbers(){
		int y;
		System.out.println("enter second integer");
		Scanner second = new Scanner(System.in);
		y = second.nextInt();	
		return y;
	}
	public static void addNumbers(int x, int y){
		System.out.println(x+"+"+y+" = "+(x+y));
	}
	public static void subNumbers(int x, int y){
		System.out.println(x+"-"+y+" = "+(x-y));
	}
	public static void multNumbers(int x, int y){
		System.out.println(x+"*"+y+" = "+(x*y));
	}
	public static void divNumbers(int x, int y){
		System.out.println(x+"/"+y+" = "+(x/y));
	}
	
}

