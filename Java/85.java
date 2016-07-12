int diff = 2000000;
     int area = 0;
     
     for (int i = 1; i <= 2000; i++){
    	 for (int j = i; j <= 2000; j++){
    		 int temp = Math.abs(i*(i+1)/2*j*(j+1)/2 - 2000000);
    		 if(temp < diff){
    			 diff = temp;
    			 area = i*j;
    		 }
    	 }
     }
     
System.out.println(area);