import java.util.Scanner;
class BMI {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.print(" WEIGHT (kg.) = ");
            double weight = sc.nextDouble();
            System.out.print(" HIGHT (cm.) = ");
            double hight = sc.nextDouble();
            double x = hight/100.00;
            double BMI = weight/(x*x);

                System.out.println(" BMI = "+BMI);
    }
}