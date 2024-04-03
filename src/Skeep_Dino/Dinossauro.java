public class Dinossauro {
    static int energia = 100;
    static int velocidade = 100;
    static int temperatura = 30; // 30 graus
    static int humor = 50; // 50 = neutro; >50 = feliz; <50 triste. Pensei nisso só pra ter alguma mêcanica também
    static String status = "Vivo";
    public static char pular(){
        energia -= 10;
        if (energia <= 0){
            System.out.println("Seu dinossauro tentou pular e acabou falecendo tentando...");
            status = "Morto";
        } else {
            velocidade -= 10;
            humor += 10;
            System.out.println("Seu dinossauro pulou e se sentiu igual um filhote de dinossauro :D");
        }
        return 0;
    }
    public static void comer(){
        energia += 10;
        if (energia >= 101 ){
            System.out.println("Seu dinossauro recebeu um excesso de energia e explodiu :(");
            status = "Morto";
        } else{
    velocidade -= 10;
    humor += 10;
            System.out.println("Comer é bom demais!");
    }
    }
    public static void correr(){
        energia -= 10;
        if (energia == 10){
            System.out.println("Seu dinossauro está com pouca energia depois dessa corrida, descanse um pouco!");
        } else if (energia <= 0) {
            System.out.println("Seu dinossauro correu tanto que infelizmente bateu as botas...");
            status = "Morto";
        }
        else {
            velocidade -= 10;
            humor += 10;
            System.out.println("Seu dinossauro adorou a corrida, boa!");
        }

    }

    public static void cantar(){
        energia -= 10;
        if (energia == 10) System.out.println("Seu dinossauro está com pouca energia depois dessa cantoria, descanse um pouco!");
         else if (energia <= 0) {
             System.out.println("Seu dinossauro cantou tanto que infelizmente bateu as botas...");
                status = "Morto";
            }
           else {
               humor += 10;
            System.out.println("Seu dinossauro mandou bem no karaoke!");
        }

    }
    public static void tomarSol(){
        if (temperatura >= 75){
            System.out.println("Seu dinossauro morreu de calor :(");
            status = "Morto";
        } else{
        velocidade += 10;
        temperatura += 5;
        humor += 10;
        System.out.println("Seu dinossauro tomou sol, e isso deixou ele feliz e tranquilo :D");
    }

    }
    public static void ficarNaSombra(){
        energia += 10;
        humor -= 10;
        temperatura -= 5;
        if (humor == 10){
            System.out.println("Seu dinossauro está triste, vá brincar um pouco com ele :(");
        } else if (humor <= 0) {
            System.out.println("Seu dinossauro ficou tão triste que nem do lugar ele quis sair...");
            status = "Morto";
        }
        else {
            if (temperatura == 15) System.out.println("Seu dinossauro está com muito frio, aqueça-o imediatamente!!");
             else if (temperatura <= 0) {
                 System.out.println("Seu dinossauro literalmente congelou de frio no fundo da caverna...");
                status = "Morto";
            }
                else System.out.println("Seu dinossauro adorou o clima fresco dessa caverna!");
        }

    }
    public static boolean verificaMorte(String status){
        if (status == "Morto"){
            return true;
        } else return false;
    }

}

