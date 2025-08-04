class Myclass{
	String str ="karan";
	int age =20;
	
 public void print(String name){
		System.out.println(this.str=name);
		System.out.println(age);
	}
   public static void main(String args[]){
	   
	   Myclass m1 = new Myclass();
	   m1.print("");
	   m1.print("karan");
   }	

}