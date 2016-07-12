int result = 0;
     for(long i = 1; i <= 1073741824; i++){
    	 if(((i^(2*i))^(3*i)) == 0){
    		 result += 1;
    	 }
     }
     System.out.println(result);