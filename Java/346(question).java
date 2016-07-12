     List<Long> A = new ArrayList<>();
     A.add((long)1);
     long result = 1;
     
     long bound = (long)Math.pow(10,12);
     for(long i = 2; i <=39 ; i++){
    	 long base = 2;
    	 while(true){
    		 long n = 1;
    		 for(long j = 1; j <= i; j++){
    			 n += (long)Math.pow(base,j);
    		 }
    		 if(n < bound){
    			 base ++;
    			 if(A.contains(n) == false){
    				 A.add(n);
    				 result += n;
    			 }
    		 }
    		 else{
    			 break;
    		 }
    	 }
     }
     System.out.println(result);