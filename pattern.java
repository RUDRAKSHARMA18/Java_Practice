import java.util.Scanner;
public class pattern {
    public static void main(String agrs[])

    {
        Scanner sc = new Scanner(System.in);



    
System.out.println("Eneter the pattern no: ");
        int patternno = sc.nextInt();
        switch (patternno) {
            case 1:{
                

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("enter an odd number.");
            break;
        }



        for (int i = 1; i <= num; i += 2) {
            int spaces = (num - i) /2 +1;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num-2 ; i >= 1; i -= 2) {
            int spaces = (num - i)/2 + 1 ;
            for (int s = spaces; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       
                break;
    }

        case 2:{

        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();

        for(int i = 1; i <= num2; i++) {
            for(int j = 2; j <= 2*i; j += 2) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        break;
    }

            case 3:{
                System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            int a = 1; 
            for(int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i - 1); k++) {
                System.out.print(a);
                if (k < i) {
                    a+=2;
                } else {
                    a-=2;
                }
            }
            System.out.println();
        }
                break;

            }


            case 4: {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                for(int i = 1; i <= num; i++) {
                    for(int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;
            }


            case 5: {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                for (int i = 1; i <= num; i++) {
                    for (int s = 1; s <= num - i; s++) {
                        System.out.print(" ");
                    }
                    for (int j = 2 * i - 1; j >= 1; j -= 2) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            }

            default:
                System.out.println("Invalid pattern number");
                break;
        }  

        sc.close();
  
    }
}


    
