int[] A = new int[500500];
     
     int primes = 0;
     int p = 0;
     for (int i = 2; i <= N; i++) {
         if (isPrime[i]) {
             primes++;
             if (p<500500){
                 A[p] = i;
                 p ++;
             }
         }
     }
     
     int second = 0;
     int third = 0;
     int fourth = 0;
     int fifth = 1;
     int first = 0;
     for (int i = 2; i<= 500499; i++){
         if((int)(Math.pow(A[i],8)) > 7376507){
             fourth = i-1;
             break;
         }
     }
     for (int i = 2; i<= 500499; i++){
         if((int)(Math.pow(A[i], 4)) > 7376507){
             third = i-1;
             break;
         }
     }
     for (int i = 2; i<= 500499; i++){
         if((int)(Math.pow(A[i], 2)) > 7376507){
             second = i-1;
             break;
         }
     }
     first = 500500 - 396 - 15 - 4 - 1;
     System.out.println(second);
     System.out.println(third);
     System.out.println(fourth);
     System.out.println(fifth);
     System.out.println(first);
     long result = 1;
     for (int i = 1; i<=first; i++){
         result *= A[i-1];
         result %= 500500507;
     }
     for (int i = 0; i<=second; i++){
         result *= (int) Math.pow(A[i], 2);
         result %= 500500507;
     }
     for (int i = 0; i<=third; i++){
         result *= (int) Math.pow(A[i], 4);
         result %= 500500507;
     }
     for (int i = 0; i<=fourth; i++){
         result *= (int) Math.pow(A[i], 8);
         result %= 500500507;
     }
     result *= (int) Math.pow(2, 16);
     result %= 500500507;
     System.out.println(result);