class Count{
  	static int count1;
	 public static  int CountR(){
	   count1=0;
		return count1++;
	}
	
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			System.out.println(CountR());
		}	
	}
	
}
