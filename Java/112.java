   public static boolean notBouncy(int n){
       int curr = n%10;
       int origin = n;
       while(n > 0){       
           n /= 10;
           int next = n%10;
           if(next > curr){
               break;
           }
           if(n < 10){
               return true;
           }
           curr = next;
       }
       n = origin;
       curr = n%10;
       while(n > 0){
           n /= 10;
           int next = n%10;
           if(next < curr){
               break;
           }
           if(n < 10){
               return true;
           }
           curr = next;
       }
       return false;
   }

     int other = 0;
     for(int i = 1; i <= 999999; i++){
    	 if(notBouncy(i)){
    		 other ++;
    	 }
     }
     int bouncy = 999999 - other;
     int present = 999999;
     while(bouncy != 99*other){
    	 present ++;
    	 if(notBouncy(present)){
    		 other ++;
    	 }
    	 else{
    		 bouncy ++;
    	 }
     }
     
     System.out.println(present);