import java.util.Scanner;

public class testeDinossauro extends Dinossauro{
        public static void main(String[] args) {
            Dinossauro Skeep = new Dinossauro();
            Scanner scan = new Scanner(System.in);
            char letra;
            do {
                System.out.println("Energia = "+Skeep.energia );
                System.out.println("Temperatura = "+Skeep.temperatura );
                System.out.println("Velocidade = "+Skeep.velocidade );
                System.out.println("Humor = "+Skeep.humor+"\n");
                System.out.println("Escolha uma opção:\n(P) - Pular           (C) - Correr               (M) - Comer\n" +
                        "(A) - Cantar        (S) - Tomar sol          (O) - Ficar na Sombra\n Para sair digite 0 ");
                if (Skeep.verificaMorte(Skeep.status) == false){
                    String textoMaiusculo = scan.nextLine().toUpperCase();
                    letra = textoMaiusculo.charAt(0);
                } else letra = '0';
                switch (letra){
                    case 'P'-> Skeep.pular();
                    case 'C'-> Skeep.correr();
                    case 'M'-> Skeep.comer();
                    case 'A'-> Skeep.cantar();
                    case 'S'-> Skeep.tomarSol();
                    case 'O'-> Skeep.ficarNaSombra();
                }
            } while(letra != '0');
        }
}
