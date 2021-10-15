import java.util.Scanner;

public class Main {
    static void javaz00(){
        // zad1
        System.out.println(31 + 29 + 31);
        // zad2
        int sumx = 0;
        for(int i = 1; i <= 10; i ++) {
            sumx += i;
        }
        System.out.println(sumx);
        // zad3
        int multiplyx = 1;
        for(int i = 1; i <= 10; i ++){
            multiplyx *= i;
        }
        System.out.println(multiplyx);
        // zad4
        float saldo = 1000;
        for(int i = 0; i < 3; i ++){
            saldo += saldo * 0.06;
        }
        System.out.println(saldo);
        // zad5
        String symbol = "\u2202";
        System.out.println("+------+");
        System.out.println("| Java |");
        System.out.println("+------+\n");
        // zad6
        System.out.println("  ////// ");
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("(| " + symbol + " " + symbol + " |)");
        System.out.println("  | ^ |");
        System.out.println(" | `-` |");
        System.out.println(" +-----+");
        // zad10
        System.out.println("Terminator\nRambo\nJames Bond\n");
    }
    static void javaz011(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        int sum = 0;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan1.nextLine();
            int outi = Integer.parseInt(outputi);
            sum += outi;
        }
        System.out.println(sum);
    }
    static void javaz012(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        int multiply = 1;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan1.nextLine();
            int outi = Integer.parseInt(outputi);
            multiply *= outi;
        }
        System.out.println(multiply);
    }
    static void javaz013(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        int sum_abs = 0;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan1.nextLine();
            int outi = Integer.parseInt(outputi);
            outi = Math.abs(outi);
            sum_abs += outi;
        }
        System.out.println(sum_abs);
    }
    static void javaz014(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        int sum_abs_round = 0;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan1.nextLine();
            double outi = Double.parseDouble(outputi);
            outi = Math.abs(outi);
            outi = Math.sqrt(outi);
            sum_abs_round += outi;
        }
        System.out.println(sum_abs_round);
    }
    static void javaz015(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        int multiply_abs = 1;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            outi = Math.abs(outi);
            multiply_abs *= outi;
        }
        System.out.println(multiply_abs);
    }
    static void javaz016(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        int sum_pow = 0;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            outi = Math.pow(outi, 2);
            sum_pow += outi;
        }
        System.out.println(sum_pow);
    }
    static void javaz017(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        int sum = 0;
        int multiply = 1;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            sum += outi;
            multiply *= outi;
        }
        System.out.println("Suma = " + sum);
        System.out.println("Mnozenie = " + multiply);
    }
    static void javaz018(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        int sum = 0;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            if(i % 2 == 0){
                if(i == out){
                    double temp = Math.pow(-1, out + 1) * outi;
                    System.out.println(temp);
                    sum += temp;
                }
                else{
                    sum -= outi;
                }
            }
            else{
                if(i == out){
                    double temp = Math.pow(-1, out + 1) * outi;
                    System.out.println(temp);
                    sum += temp;
                }
                else{
                    sum += outi;
                }
            }
        }
        System.out.println(sum);
    }
    static void javaz019(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        int sum = 0;
        int fact = 1;
        for(int i = 1; i <= out; i ++){
            fact *= i;
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            if(i % 2 != 0){
                if(i == out){
                    double temp2 = Math.pow(-1, out) * outi / fact;
                    sum += temp2;
                }
                else{
                    double temp = outi / fact;
                    sum -= temp;
                }
            }
            else{
                if(i == out){
                    double temp2 = Math.pow(-1, out) * outi / fact;
                    sum += temp2;
                }
                else{
                    double temp = outi / fact;
                    sum += temp;
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        //javaz00();
        //javaz011();
        //javaz012();
        //javaz013();
        //javaz014();
        //javaz015();
        //javaz016();
        //javaz017();
        //javaz018();
        javaz019();
    }

}
