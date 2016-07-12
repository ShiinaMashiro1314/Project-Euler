   public static int gcd(int x, int y){
	   if(y == 0)
		   return x;
	   if(x < y)
		   return gcd(y,x);
	   else
		   return gcd(x%y,y);
   }
   
int result = 3;
     
     for(int i = 9; i<=12000; i++){
    	 for(int j = i/3+1; j<= (i+1)/2-1; j++){
    		 if(gcd(i,j) == 1){
    			 result += 1;
    		 }
    	 }
     }
     
     System.out.println(result);