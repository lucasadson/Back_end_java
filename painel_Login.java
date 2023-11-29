 import java.util.Scanner;

 class painel_Login {
   /**
   * @param args
   */
  public static void main (String[] args) {

    Scanner sc= new Scanner(System.in);

    System.out.println("========================");

    int senha_Conta_pessoa_fisica_1 = 12345;



    System.out.println("Bem vindo a tela inicial!");
     System.out.println("A baixo digite seu nome:");
    String nome_Usuario= sc.nextLine();

    System.out.println("Abaixo digite o tipo de de conta que deseja acessar.");


     System.out.println("1 - Conta pessoa fisica");
     System.out.println("2 - Conta pessoa Juridica");
     int numero_Conta = sc.nextInt();

     if (numero_Conta == 1 ) {

      System.out.println("Digite sua senha de acesso:");

      int senha_inputada = sc.nextInt();

      if(senha_inputada == senha_Conta_pessoa_fisica_1 ) {

      System.out.println("Bem vindo a sua conta " + nome_Usuario + "!");




     }

     else  {

      System.out.println("Acesso negado");

     }






   }
 }
}
