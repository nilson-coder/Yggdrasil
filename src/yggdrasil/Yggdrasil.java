/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.Scanner;

public class Yggdrasil {
    static Scanner cap = new Scanner(System.in);
        static void inicio(){
        System.out.println("--Sobre o jogo--");
        System.out.println("a história se passa em um mundo de humanos onde um dia descobriram um portal para um mundo mágico, e logo os seres humanos começaram criar uma certa amizade com os seres mágicos daquele portal e com o tempo o mundo humano estava repleto de seres mágico, mas nada é perfeito, logo venho uma criatura maligna querendo conquistar o mundo humano. \n" +
                            "Com o mau quase dominando o mundo, surgiu uma equipe disposta a derrotá-lo de uma vez por toda, mas para isso eles precisavam ter mais conhecimento em batalha. \n" +
                            "Assim a equipe abre uma jornada entre os mundos atrás de conhecimento e equipamentos lendários, para enfrentar o mau.");
    }
    
    static String nomePersonagem(){
        String nome_personagem;
        System.out.println("\n--crie o nome do personagem--");
        System.out.println("Nome: ");
        nome_personagem = cap.next();
        
        return nome_personagem;
    }
    
    
    static void historia(){
        String nome_personagem = nomePersonagem();
        int desafio1;
        int pontos = 0;
        
        
        System.out.println("--começando o jogo--");
        System.out.println(" A história começa na vila de Noria uma aldeia onde estava o " + nome_personagem + " ganhando a vida dele, mas cada vez ficava mais difícil de ser manter com o trabalho por causa que tinha poucas pessoas visitando a vila.\n" +
"assim resolve viaja para outro lugares mas venho o primeiro desafio apenas com uma simples arma aparece um monstro e agora!!!\n");
        System.out.println("01 - desafio");
        System.out.println("Quem criou a administração?");
        System.out.println("1 - Henri fayol.\n" +
                            "2 - Frederick W. Taylor.\n" +
                            "3 - Abraham Maslow\n");
        desafio1 = cap.nextInt();
        switch(desafio1){
            case 1:
                System.out.println("--Certa resposta--\n o " + nome_personagem + " conseguiu ferir o monstro, e escapou, e chegou na outra vila de manhã, e acabou conhecendo uns exploradores.");
                pontos++;
                break;
            case 2:
                System.out.println("--resposta erada--\n o " + nome_personagem + " foi ferido e acabou desmaiando em um lugar e foi achado por exploradores.");
                break;
            case 3:
                System.out.println("--resposta erada--\n o " + nome_personagem + " foi ferido e acabou desmaiando em um lugar e foi achado por exploradores.");
                break;
        }
        
        System.out.println("Ficou na vila um tempo e acabou conhecendo bem os exploradores resolveu sair em umas aventura com eles de teste e o “humano” foi muito bem. resolveram ir em uma cidade grande. Eles pegaram uma missão e foram enfrenta o monstro que estava atrapalhado a colheita da cidade primeira missão do " + nome_personagem + ".\n");
        System.out.println("02 - desafio");
        System.out.println("Quais os 3 tipos de planejamentos?");
        System.out.println("1 - Henri fayol.\n" +
                            "2 - Estratégico, tático e operacional.\n" +
                            "3 - Abraham Maslow\n");
        desafio1 = cap.nextInt();
        switch(desafio1){
            case 1:
                System.out.println("--resposta erada--\n o " + nome_personagem + " acabou ferido  e o grupo precisou ajuda ele enfrentando o monstro.");
                break;
            case 2:
                System.out.println("--Certa resposta--\n o " + nome_personagem + " foi muito bem na sua primeira missão ajudando o grupo foi elogiado.");
                pontos++;
                break;
            case 3:
                System.out.println("--resposta erada--\n o " + nome_personagem + " acabou ferido  e o grupo precisou ajuda ele enfrentando o monstro.");
                break;
        }
        
        System.out.println("pontos " + pontos );
        
    }
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int inicio;
        
        do {
            System.out.println( "        1 – Instruções\n" +
                                "        2 – Jogar\n" +
                                "        3 – Créditos\n" +
                                "        4 – Sair");
            inicio = scanner.nextInt();
        
                switch(inicio){
                    case 1:
                        System.out.println("o jogador vai seguir uma história que cada etapa tem um desafio "
                                            + "quando acerta acontece uma ação e quando erra outra ação e no final soma todo "
                                            + "e saber se vc ganhou ou não\n");
                        break;
                    case 2:
                        inicio();
                        historia();
                        break;
                    case 3:
                        System.out.println("Criadores\n"
                                + "Nilson Ledres\n"
                                + "Marcus Domingos\n"
                                + "Pedro Carvalho\n");
                        break;
                    case 4:
                        System.out.println("Saiu");
                        break;
                    default:
                        System.out.println("nada acontecer");
                        break;
                }
                
        }while (inicio != 4);
    }
   
}
