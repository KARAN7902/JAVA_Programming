
class Area{
	
	 static void fun1(){
		 System.out.println("hello world");
	 }
	 
	 static void fun2(){
		 System.out.println("hello coder");
	 }
	
}







class Example{
	
	
	static void fun(){
		System.out.println("a");
	}
	
	static void fun2(){
		System.out.println("b");
	}
	
	public static void main(String args[]){
		// here we cannot call the non static function from the static function
		// if don't make the abouve two function static then the compiler throws errors
		System.out.println("c");
		fun();
		fun2();
		// directly with the function name we cannot access the function outside the current class or in where the main class is present 
		// here we have to specify the class name with method name sing ( . ) operator
		// i.e Area.fun1();
		  Area.fun1();	
		  Area.fun2();
		  }
	
}