public class inString {
    public static void main(String[] args) {
        StringBuilder sc= new StringBuilder("elephant");
       // String resuilt="";
        for(int i=0;i<sc.length();i++)
        {
            if(sc.charAt(i)=='e')
            {
                sc.setCharAt(i,'i');
                // resuilt+='i';
            }
            // else{
            //     resuilt+=sc.charAt(i);
            // }
        }
        System.out.println(sc);
    }
    
}
