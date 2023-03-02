public class Exercicio10 {
    public static void main (String args[]){
    
        double x = 69; 
        double f = x; 
        
        while (x > 1){ 
        
          f = f *(x-1); 
          x--; 
          System.out.println(f); 
        }
    }
}

//import java.util.Scanner;

//public class Exercicio10 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int fatorial = 0, resultado = 1, anterior = 1;
//        System.out.println("Digite qual número você quer o fatorial.");
//        fatorial = in.nextInt();
//        for (int i = 1; i <= fatorial; i++){
//            resultado = anterior * i;
//            anterior = resultado;
//            System.out.println(resultado);
//        }
//    }
//}