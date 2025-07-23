package Recursion;
public class TowerHanoi {
    public static void TowerHanoiF(int n ,String Src,String Helper,String Desti){

        if(n==1){
            System.out.println("transfer disk "+n+" from "+ Src +" to "+Desti);
            return;
        }
        TowerHanoiF(n-1, Src,Desti, Helper);
        // here helper act as Destination and Destination act as Helper
        System.out.println("transfer disk "+n+" from "+ Src +" to "+Desti);
        TowerHanoiF(n-1, Helper, Src, Desti);
        // here the source act as helper and helper is act as source 
    }
    public static void main(String[] args) {
        int n =3;
        TowerHanoiF(n,"S", "H", "D");
    }
    
}
