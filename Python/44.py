int M = 100000000;

   public static boolean is_pen(long x){
	   long y = (long) (Math.sqrt(((double) x) * 24 + 1));
	   return (y % 6 == 5) & (y*y == 1 + 24*x);
   }
     long[] isPen = new long[M+1];
     for (int i = 1; i<=M; i++){
    	 isPen[i] = i*(3*i-1)/2;
     }
     long r = 10000*(3*10000-1);
     System.out.println(r);
     for (long i = 1; i <= 10000; i++) {
    	 long s = i*(3*i-1)/2;
    	 for (long j = 1; j <= i; j++){
    		 if(true){
    			 long t = j*(3*j-1)/2;
	    		 if(is_pen(s+t)){
	    			 if(is_pen(s+2*t)){
	    				 System.out.println(s);
	    				 System.out.println(t);
	    			 }
	    		 }
    		 }    			 
    	 }
     }
     System.out.println(1);