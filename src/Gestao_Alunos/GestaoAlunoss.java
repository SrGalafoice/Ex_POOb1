import java.util.Date;
import java.util.Scanner;


public class GestaoAlunos extends Aluno{
    static int i = 0;
    static Aluno Aluno[] = new Aluno[50];
    public static void main(String[] args) {
        menu();
    }
public static void criar(){
        Scanner leia = new Scanner(System.in);
        String op = "S";
    while (!op.equals("N") && i < Aluno.length){
            if (Aluno[i] == null){
                Aluno[i] = new Aluno();
                System.out.println("Digite nome do aluno: ");
                Aluno[i].setNome(leia.nextLine());

                System.out.println("Digite RA do aluno: ");
                Aluno[i].setRa(leia.nextLine());

                System.out.println("Digite Id do aluno: ");
                Aluno[i].setid(Long.parseLong(leia.nextLine()));

                System.out.println("Digite dia de nascimento do aluno: ");
                int dia = Integer.parseInt(leia.nextLine());
                System.out.println("Digite mês: ");
                int mes = Integer.parseInt(leia.nextLine());
                System.out.println("Digite ano: ");
                int ano = Integer.parseInt(leia.nextLine());
                Date nascimento = new Date(mes, dia, ano);
                Aluno[i].setNascimento(nascimento);

                System.out.println("Deseja adicionar um novo aluno? S/N");
                op = leia.nextLine().toUpperCase();
                i++;
            } else if (i == 50) System.out.println("A lista está cheia, delete algum dado");
        }
    }



public static void exibir(String RA){
    for (i = 0; i <= Aluno.length-1; i++){
        if (Aluno[i] == null) continue;
         if (Aluno[i].getRa().equals(RA)){
            System.out.println(Aluno[i]);
             return;
         } else if (i == 50){
            System.err.println("RA não encontrado");
        }
    }
}
public static void excluir(String RA){
    Scanner leia = new Scanner(System.in);
    String op = "";
        for (i = 0; i <= Aluno.length-1; i++){
            if (Aluno[i] == null) continue;
             if (Aluno[i].getRa().equals(RA)){
                Aluno[i] = null;
                System.out.println("Aluno excluido");

                System.out.println("Deseja excluir outro dado de aluno? S/N");
                op = leia.nextLine().toUpperCase();
                if (op == "S"){
                    System.out.println("Digite um novo RA para ser excluido");
                    excluir(RA = leia.nextLine());
                } else return;
            } else if (i == 50) {
                System.err.println("RA não encontrado");
            }
        }
}
public static void atualizar(String RA){
        String op;
    Scanner leia = new Scanner(System.in);
        for (i = 0; i <= Aluno.length-1; i++){
            if (Aluno[i] == null) continue;
            if (Aluno[i].getRa().equals(RA)){
                System.out.println("Informe nome completo do Aluno: ");
                Aluno[i].setNome(leia.nextLine());
                System.out.println("Digite dia de nascimento do aluno: ");
                int dia = leia.nextInt();
                System.out.println("Digite mês: ");
                int mes = leia.nextInt();
                System.out.println("Digite ano: ");
                int ano = leia.nextInt();
                Date nascimento = new Date(mes, dia, ano);
                Aluno[i].setNascimento(nascimento);
                } else return;
            } if (i == 50) {
                System.err.println("RA não encontrado");
            }

        }

public static void menu(){
    char letra = 'P';
    Scanner leia = new Scanner(System.in);
    while (letra != 'S'){

        System.out.println("\n Escolha uma opção:(C)riar           (E)xibir             (R)emover               \n" +
                "                (A)tualizar    (S)air");
        String textoMaiusculo = leia.nextLine().toUpperCase();
        letra = textoMaiusculo.charAt(0);
        switch (letra){
            case 'C': criar();
                break;
            case 'E':
                System.out.println("Digite o RA do aluno");
                String RA = leia.nextLine();
                exibir(RA);
                break;
            case 'R':
                System.out.println("Digite o RA do aluno");
                RA = leia.nextLine();
                excluir(RA);
                break;
            case 'A':
                System.out.println("Digite o RA do aluno");
                RA = leia.nextLine();
                atualizar(RA);
                break;
        }
    }

    }
}

