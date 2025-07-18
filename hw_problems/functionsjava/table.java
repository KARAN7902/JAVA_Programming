package functionsjava;

public class table {
    public static void calTable(int n){
        for(int i =1 ;i<=10;i++)
        {
          System.out.println(n*i);
        }
    }
    public static void main(String[] args) {
        int n =2 ;
        calTable(n);
    }
}
