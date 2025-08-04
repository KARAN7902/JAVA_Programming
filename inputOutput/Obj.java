class Mahesh{
// the functions  which are not static functions are called as non static member variable instance member variable .object member variable
 void fun1(){
  	System.out.println("fun1");
 }

  void fun2(){
 	System.out.println("fun2");
  }	
	
}

class Obj{
	
	public static void main(String args[]){
		// non static functions from outside of the current class where the main functions is present
	   // object is used
	   
	   Mahesh m1= new Mahesh();
	   m1.fun1();
	   m1.fun2();
	   // if
	   Mahesh m2=new Mahesh();
	          m2=new Mahesh();	
			  m2.fun1();		  
			  // here two objcts are created but the v1 is poiniting the
              // new object and the prevoius refrence is broken to the previous object and the previous (un refrenced memory get deleted by garbage colletor in java )
		
		
	}
	
}