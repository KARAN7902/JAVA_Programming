class obj1{
 
   int x;
   int y;
   
   void print(){
    System.out.println(x);
    System.out.println(y); 
   }

}


class obj{
  public static void main(String[] args) {
  obj1 o1 =new obj1();
  o1.x=5;
  System.out.println(o1.x);    
  System.out.println(o1.y); 
  // here the inialsation of y in not defined or not specified so in java b default 
  //it stores at the empty locaton '0' not any  grabage  value   

  }
}