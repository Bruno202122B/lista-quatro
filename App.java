import java.util.Scanner;

public class AppJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome, resposta;
        int idade;
        boolean cartaoVacina, sintomasRecentes, contatoSintomas, viagemExterior;
        int risco = 0, tentativas = 0;

        
        System.out.print("Informe o seu nome: ");
        nome = input.nextLine();

        System.out.print("Informe a sua idade: ");
        idade = input.nextInt();

        System.out.print("Seu cartão de vacina está em dia? (SIM/NAO): ");
        cartaoVacina = respostaValida(input.next());

        System.out.print("Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe) (SIM/NAO): ");
        sintomasRecentes = respostaValida(input.next());

        System.out.print("Teve contato com pessoas com sintomas gripais nos últimos dias? (SIM/NAO): ");
        contatoSintomas = respostaValida(input.next());

        System.out.print("Está retornando de viagem realizada no exterior? (SIM/NAO): ");
        viagemExterior = respostaValida(input.next());

     
        if (!cartaoVacina) {
            risco += 10;
        }

        if (sintomasRecentes) {
            risco += 30;
        }

        if (contatoSintomas) {
            risco += 30;
        }

        if (viagemExterior) {
            risco += 30;
            System.out.println("Você ficará sob observação por 05 dias.");
        }

  
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cartão Vacinal em Dia: " + (cartaoVacina ? "SIM" : "NAO"));
        System.out.println("Teve Sintomas Recentes: " + (sintomasRecentes ? "SIM" : "NAO"));
        System.out.println("Teve contato com pessoa infectada: " + (contatoSintomas ? "SIM" : "NAO"));
        System.out.println("Retornando de viagem: " + (viagemExterior ? "SIM" : "NAO"));
        System.out.println("Probabilidade de infecção: " + risco + "%");

   
        if (risco <= 30) {
            System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
        } else if (risco <= 60) {
            System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
        } else if (risco >= 90) {
            System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.");
        }

        input.close();
    is}

  )
    public static boolean respostaValida(String resposta) {
        Scanner input = new Scanner(System.in);
        while (!resposta.equalsIgnoreCase("SIM") && !resposta.equalsIgnoreCase("NAO")) {
     
    }
       
    }
    
