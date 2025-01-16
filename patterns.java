public class patterns {

    public static void main(String[] args) {
        // pattern 1
        int n =5;
        System.out.println("pattern 1");
         for(int i = 0; i <n ; i++) {
             for(int j = 0; j <n; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
        System.out.println();


        // pattern 2
        System.out.println("pattern 2");

        for(int i = 0; i <n ; i++) {
            for(int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        // pattern 3
        System.out.println("pattern 3");

        for(int i = 0; i <n ; i++) {
            for(int j = 0; j <=i; j++) {
                System.out.print(j+1 + "");
            }
            System.out.println();
        }
        System.out.println();


        // pattern 4
        System.out.println("pattern 4");

        for(int i = 0; i <n ; i++) {
            for(int j = 0; j <=i; j++) {
                System.out.print(i+1 + "");
            }
            System.out.println();
        }
        System.out.println();


        // pattern 5
        System.out.println("pattern 5");

        for(int i = n; i >0 ; i--) {
            for(int j=i; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        // pattern 6
        System.out.println("pattern 6");

        for(int i = n; i >0 ; i--) {
            for(int j=i;j>0; j--) {
                System.out.print( (i-j)+1+" ");
            }
            System.out.println();
        }
        System.out.println();


        // pattern 7
        System.out.println("pattern 7");

        for(int i = 0; i <n; i++) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            for(int k = 0;k< 2*i+1;k++){
                System.out.print("*");
            }
            for(int j= 0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println();


        // pattern 8
        System.out.println("pattern 8");

        for(int i = n-1; i >=0; i--) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            for(int k = 0;k< 2*i+1;k++){
                System.out.print("*");
            }
            for(int j= 0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println();


        // pattern 9
        System.out.println("pattern 9");

        for(int i = 0; i <n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
        for(int i = n-2; i >=0; i--) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            for(int k = 0;k< 2*i+1;k++){
                System.out.print("*");
            }
            for(int j= 0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println();


        // pattern 10
        System.out.println("pattern 10");

        for(int i = 0; i <n ; i++) {
            for(int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = n-1; i >0 ; i--) {
            for(int j=i; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        // pattern 11
        System.out.println("pattern 11");

       int start = 1;
       for(int i =0;i<n;i++) {
           if(i%2==0)start =1;
           else start=0;
           for(int j =0;j<=i;j++) {
               System.out.print(start);
               start = 1-start;
           }
           System.out.println();
       }
        System.out.println();


        // pattern 12
        System.out.println("pattern 12");
        for(int i = n; i >=0; i--) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print(j+1);
            }
            for(int k = 0;k< 2*i;k++){
                System.out.print(" ");
            }
            for(int j= n-i-1;j>0;j--) {
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.println();


        // pattern 13
        System.out.println("pattern 13");
        int ans=1;
        for(int i = 0; i <n ; i++) {
            for(int j = 0; j <=i; j++) {
                System.out.print(ans+ " ");
                ans+=1;
            }
            System.out.println();
        }
        System.out.println();


        // pattern 14
        System.out.println("pattern 14");
        for(int i = 0; i <n;i++) {
            for(int j = 0; j <=i; j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
        System.out.println();


        // pattern 15
        System.out.println("pattern 15");
        for(int i = n; i >0;i--) {
            for(int j = 0; j <i; j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
        System.out.println();

        
        // pattern 16
        System.out.println("pattern 16");
        for(int i = 0; i <n;i++) {
            for(int j = 0; j <=i; j++){
                System.out.print((char)(65+i));
            }
            System.out.println();
        }
        System.out.println();


        // pattern 17
        System.out.println("pattern 17");
        for(int i = 0; i <n-1; i++) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            for(int k = 0;k<i;k++){
                System.out.print((char)(65+k));
            }
            for(int k =i;k>=0;k--){
                System.out.print((char)(65+k));
            }
            for(int j= 0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println();


        // pattern 18
        System.out.println("pattern 18");

        for(int i = 0; i <n ; i++) {
            for(char ch =(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println();


        // pattern 19
        System.out.println("pattern 19");
        for(int i = n; i >=0; i--) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print("*");
            }
            for(int k = 0;k< 2*i;k++){
                System.out.print(" ");
            }
            for(int j= n-i-1;j>0;j--) {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = 0; i <n; i++) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print("*");
            }
            for(int k = 0;k< 2*i;k++){
                System.out.print(" ");
            }
            for(int j= n-i-1;j>0;j--) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();


        // pattern 20
        System.out.println("pattern 20");
        int a = 0;
        for(int i=0;i< n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<a;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            a+=2;
            System.out.println();
        }
        a = 2*n -2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<a;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            a-=2;
            System.out.println();
        }

    }
}
