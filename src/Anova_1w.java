import java.util.Scanner;

public class Anova_1w {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the 1st row:");

        int test[]= new int[10];
        for(int i=0;i<10;i++)
        {
            test[i] = inp.nextInt();
        }
        
        System.out.println(test);
        int r1[] = {12,12,13,13,14};
        for(int r1s : r1){
            System.out.println(r1s);
        }
           
        inp.close();
    }
}
