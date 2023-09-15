import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int ok = 0;
        int sub = 0;

        while (ok == 0){
            System.out.println("Igrese numero: ");
            int num1 = input.nextInt();
            System.out.println("Ingrese operador (= para finalizar): ");
            String operador = input.next();
            System.out.println("Igrese numero: ");
            int num2 = input.nextInt();

            switch (operador) {
                case "*":
                    sub = calc.multiplicacion(num1, num2);
                    break;
                case "/":
                    sub = calc.division(num1, num2);
                    break;
                case "+":
                    sub = calc.suma(num1, num2);
                    break;
                case "-":
                    sub = calc.resta(num1, num2);
                    break;
                case "=":
                    System.out.print("\033[H\033[2J");
                    System.out.println("El resultado es = "+ sub);
                    ok = 3;
                    break;
            }
            ok = 1;

            while (ok == 1){
                num1 = sub;
                System.out.print("\033[H\033[2J");
                System.out.println("Parcial = "+ sub);

                System.out.println("Ingrese operador (= para finalizar): ");
                operador = input.next();
                if (operador.equals("=")){
                    System.out.print("\033[H\033[2J");
                    System.out.println("El resultado es = "+ sub);
                    ok = 3;
                }

                System.out.println("\nIgrese numero: ");
                num2 = input.nextInt();


                switch (operador) {
                    case "*":
                        sub = calc.multiplicacion(num1, num2);
                        break;
                    case "/":
                        sub = calc.division(num1, num2);
                        break;
                    case "+":
                        sub = calc.suma(num1, num2);
                        break;
                    case "-":
                        sub = calc.resta(num1, num2);
                        break;
                }
            }

        }
        
        input.close();
    }
}