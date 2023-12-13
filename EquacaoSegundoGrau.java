    
    import java.util.Scanner;
    
    class EquacaoSegundoGrau {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            
        System.out.println("================================");
        System.out.println("Bem vindo ao sistema de formula!");
        System.out.println("Abaixo digite os valores de referencia para \"A\"\"B\"\"C\".");

        System.out.println("Digite o valor de \"A\"");
        int ValorDeA = teclado.nextInt();

        System.out.println("Digite o valor de \"B\"");
        int ValorDeB = teclado.nextInt();

        System.out.println("Digite o valor de \"C\"");
        int ValorDeC = teclado.nextInt();

        double delta = (Math.pow(ValorDeB, 2)) - 4 * ValorDeA * ValorDeC;

        System.out.println(delta);

        if (delta < 0) {
            System.out.println("A equação não possui raiz real");
        }
        else if (delta == 0) {
            System.out.println("A equação possui uma raiz real");

        }
        else {
            System.out.println("A equação possui duas raizes");
        }


        }


    }