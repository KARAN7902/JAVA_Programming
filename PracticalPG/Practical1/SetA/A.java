package PracticalPG.Practical1.SetA;
public class A {
    int num;
 public A(){
   num=0;
 }
 public A(int num){
   this.num=num;
 }    

public static void main(String[] args) {
    A a1 =new A();
    // Scanner sc =new Scanner(System.in);
    if(args.length>0)
    {
        int n =Integer.parseInt(args[0]);
        // n=sc.nextInt();
        A a2 =new A(n);
       System.out.println(a1.num);
       System.out.println(a2.num);
    }else{
       System.out.println("insuficient args");
    }
}

}
