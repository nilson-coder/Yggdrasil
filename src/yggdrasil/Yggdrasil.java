/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Yggdrasil {

    static Scanner leitor = new Scanner(System.in);

    static void inicio() {
        System.out.println("--Sobre o jogo--");
        System.out.println(" ");
        System.out.println("A história se passa em um mundo de humanos onde um dia descobriram um portal para um mundo mágico, e logo os seres humanos começaram criar uma certa \n"
                + "amizade com os seres mágicos daquele portal e com o tempo o mundo humano estava repleto de seres mágico, mas nada é perfeito, logo venho uma criatura maligna \n"
                + "querendo conquistar o mundo humano. \n"
                + "Com o mau quase dominando o mundo, surgiu uma equipe disposta a derrotá-lo de uma vez por toda, mas para isso eles precisavam ter mais conhecimento em batalha. \n"
                + "Assim a equipe abre uma jornada entre os mundos atrás de conhecimento e equipamentos lendários, para enfrentar o mau.");
    }

    static String nomePersonagem() {
        String nome_personagem;
        System.out.println("\n-- Crie o nome do personagem --");
        System.out.print("Nome: ");
        nome_personagem = leitor.next();

        return nome_personagem;
    }

    static void historia() {
        String nome_personagem = nomePersonagem();
        char desafio = ' ';
        int pontos = 0;
        char [] alternativas = {'a', 'b', 'c', 'd', 'e' };
        String[] perguntas = new String[5];

        System.out.println("--começando o jogo--");

        System.out.println(" A história começa na vila de Noria uma aldeia onde estava o " + nome_personagem + " ganhando a vida dele, mas cada vez ficava mais difícil de ser manter com o\n"
                + "trabalho por causa que tinha poucas pessoas visitando a vila.\n"
                + "assim resolve viaja para outro lugares mas venho o primeiro desafio apenas com uma simples arma aparece um monstro e agora!!!\n");
        
        System.out.println("Digite uma tecla para seguir o jogo. ");
        
        leitor.next();

        // PERGUNTA 1
        System.out.println("01 - DESAFIO");

        System.out.println("Quem criou a administração?");
        
        System.out.println(" ");

        perguntas[0] = "Henri Fayol";
        perguntas[1] = "Frederick W. Taylor";
        perguntas[2] = "Abraham Maslow";
        perguntas[3] = "Henry Ford";
        perguntas[4] = "Samuel Colt";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        int indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas[i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
        
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
            
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "Henri Fayol")) {
           System.out.println("-- PARABÉNS --\n  " + nome_personagem + " conseguiu ferir o monstro, e escapou, e chegou na outra vila de manhã, e acabou conhecendo uns exploradores.");
            
            pontos++;
        }
        else {
            System.out.println("-- ERROU --\n  " + nome_personagem + " foi ferido e acabou desmaiando em um lugar e foi achado por exploradores.");
        }
        
        
        System.out.println(" ");
        // PERGUNTA 2
        System.out.println("Ficou na vila um tempo e acabou conhecendo bem os exploradores resolveu sair em uma aventura com eles de teste e  " + nome_personagem
                + " foi muito bem. resolveram ir em uma cidade grande. Eles pegaram uma missão e foram enfrentar o monstro que estava atrapalhando a colheita da cidade primeira missão de  " + nome_personagem + ".\n");
        
        System.out.println("02 - DESAFIO");
        
        System.out.println("Quais os 3 tipos de planejamentos, estratégicos?");
        System.out.println(" ");
        perguntas[0] = "Tático, Operacional e Rodoviario";
        perguntas[1] = "Estratégico, Tático e Operacional";
        perguntas[2] = "Estratégico, Tatico e Militar";
        perguntas[3] = "Estratégico, Operacional e Municipal";
        perguntas[4] = "Presidencial, Militar e Rodoviario";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas [i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
        
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "Estratégico, Tático e Operacional")) {
          System.out.println("--  PARABÉN --\n  " + nome_personagem + " foi muito bem nesta missão ajudando o grupo e foi elogiado.");            
            pontos++;
        }
        else {
              System.out.println("-- ERROU --\n  " + nome_personagem + " acabou ferido  e o grupo precisou ajuda-lo enfrentando o monstro.");
        }
        
        //PERGUNTA3
      
        System.out.println(" ");
     

        System.out.println(nome_personagem + " achava aquele novo mundo uma bosta porque a 10 anos atrás os humanos viviam em paz. ele resolveu"
                + " trazer aquele mundo de volta não importa como mas vai volta a paz na terra de novo. Com a experiência que  " + nome_personagem + " adquiriu resolveu mudar o mundo.\n");

      

        System.out.println("o grupo vendo a determinação de " + nome_personagem + " resolvem segui ele e buscar os itens lendários,\n"
                + "eles conhecem pessoas de outra dimensão e descobrem o primeiro lugar. ");
        System.out.println(" ");
        System.out.println("03 - DESAFIO");
        System.out.println("Quais são as duas principais teorias de tomada de decisão?");
        
        System.out.println(" ");
        
        perguntas[0] = "Direita e Esquera";
        perguntas[1] = "Frente e trás";
        perguntas[2] = "Ação e Reação";
        perguntas[3] = "Racionais e Não Racionais";
        perguntas[4] = "Lula e Bolsonaro";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas [i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
        
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "Racionais e Não Racionais")) {
          System.out.println("-- PARABÉNS--\n  " + nome_personagem + " e o grupo chegou em outra dimensão em um lugar seguro pronto para seguir o desafio.");         
            pontos++;
        }
        else {
                System.out.println("-- ERROU --\n o " + nome_personagem + "  e o grupo chegaram em um lugar muito perigoso e ficaram um dia para sair daquele lugar e prosseguir o desafio.");
        }
        
        // PERGUNTA 4
       
        System.out.println(" ");
       

        System.out.println("chegando a dimensão o primeiro desafio era subir uma montanha já que era um lugar íngreme. ");
        
        System.out.println("");

        System.out.println("04 - DESAFIO");

        System.out.println("O que e tomada de decisão?");
        
        System.out.println(" ");
        
                      perguntas[0] = "Usar uma caneta preta ou azul.";
        perguntas[1] = "Ultrapassar o sinal vermelho.";
        perguntas[2] = "Escolher toddy em vez de nescau.";
        perguntas[3] = "É um processo cognitivo que resulta na seleção de uma opção entre várias alternativas.";
        perguntas[4] = "Compra um xiaomi no lugar de um iphone.";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas [i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "É um processo cognitivo que resulta na seleção de uma opção entre várias alternativas")) {
            System.out.println("-- PARABÉNS --\n  " + nome_personagem + "e  o grupo chegou no topo para fala com o herói lendário da dimensão Arcadia.");
            pontos++;
        }
        else {
                System.out.println("-- ERROU --\n  " + nome_personagem + " e o grupo tiveram muitas dificuldade para subir a montanha.");
        }
        
        //PERGUNTA5

       

        System.out.println(" ");

       

        System.out.println("finalmente chegaram no primeiro herói lendário, ele parecia ser uma pessoa muito gente boa então foi tranquilo dialoga com ele.\n"
                + "entendendo a dificuldade que a dimensão humana estava passando.\n"
                + "ele falou ser acerta o meu desafio vocês podem ir. ");
        
        System.out.println(" ");

        System.out.println("05 - DESAFIO");

        System.out.println("O Como deve ser baseada, a relação entre líder e liderado?");
        
        System.out.println(" ");
                
                      perguntas[0] = "O lider manda de forma grosseira o liderado executar uma tarefal.";
        perguntas[1] = "Com palavrões e insultos.";
        perguntas[2] = "Ameaças do te pego la fora.";
        perguntas[3] = "Confianças e Respeito Mútuos.";
        perguntas[4] = "Bares com rodas de cerveja e samba.";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas [i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
        
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "Confianças e Respeito Mútuos.")) {
            System.out.println("-- PARABÉNS --\n  " + nome_personagem + " recebeu a armadura lendária (Blood Angel).");
            pontos++;
        }
        else {
            System.out.println("-- ERROU --\n  " + nome_personagem + "  vai ter que ficar mais um tempo na dimensão de arcade para melhorar suas.\n"
                        + " habilidade e conseguir a armadura lendário(Blood Angel).");
        }
//PERGUNTA6

        System.out.println(" ");

        System.out.println("finalmente voltando para dimensão deles com armadura(Blood Angel), ele resolvem ir direto para a outra dimensão. ");
        
        System.out.println(" ");

        System.out.println("uns dias procurando a pessoa da segunda dimensão, finalmente achou. para entrar em segurança outro desafio.");
        
        System.out.println(" ");

        System.out.println("dessa vez o grupo descobre que o escudo lendário estava sem dono, mas estava em um abismo tão fundo que ainda tinha monstro escondido lá.\n"
                + "descendo o abismo e tudo muito escuro sorte que eles tinham um item que emitir iluminação");
        
        System.out.println(" ");

        System.out.println("06 - DESAFIO");

        System.out.println("Quais são os 3 modelos de liderança?");
        
        System.out.println(" ");
        
           perguntas[0] = "Autocrática,  Liberal(laissez-faire) e Analista.";
        perguntas[1] = " Autocrática, Democrática e Autoritária.";
        perguntas[2] = "Liberal(laissez-faire), Democrática e Disciplinar.";
        perguntas[3] = "Autocrática, Liberal(laissez-faire) e Democrática.";
        perguntas[4] = " Analista, Autoritária e Disciplinar.";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas [i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
        
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "Autocrática, Liberal(laissez-faire) e Democrática.")) {
            System.out.println("-- PARABÉNS --\n  " + nome_personagem + " e o grupo passa dos monstro sem dificuldade e descobrem um lugar emitindo uma iluminação acha um.\n"
                        + "metal no chão brilhante quando .\n"
                        + " " + nome_personagem + " pega o metal era o escudo lendário, era o escudo mais bonito que já o vi..");;
            pontos++;
        }
        else {
            System.out.println("-- ERROU --\n o " + nome_personagem + " o item que estava iluminando acaba no meio do caminho e fica tudo escuro eles demora 1 dia todo no./n "
                        + " abismo, procurando o escudo mas quando acha parece a luz do dia!!. ");
        }
            
//PERGUNTA7
System.out.println(" ");

        System.out.println(" quando " + nome_personagem + "  tira o escudo do chão descobre que tinha um Golem de pedra no local do escudo. ");
        
        System.out.println(" ");

        System.out.println(" O Golem levanta com uma fúria vai com tudo no " + nome_personagem + " e grita. DESAFIO !!! ");
        
        System.out.println(" ");

        System.out.println("07 - DESAFIO");

        System.out.println("Quem foi o autor dos princípios da administração científica?");
        
        System.out.println(" ");
        
                perguntas[0] = "Adolf Dassler.";
        perguntas[1] = "Thomas Muller.";
        perguntas[2] = "Adolf Hitler.";
        perguntas[3] = "Frederick winslow taylor.";
        perguntas[4] = "Karl Benz.";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas [i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
        
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "Frederick winslow taylor.")) {
            System.out.println("-- PARABÉNS --\n  " + nome_personagem + "  levanta o escudo em direção ao Golem BOOOMM!!. O Golem virou pó.");
            pontos++;
        }
        else {
              System.out.println("-- ERROU --\n  " + nome_personagem + " acaba paralisado com o Golem e toma um golpe que acaba desmaiando mas como estava com a armadura (Blood Angel).\n"
                        + " não sofre muito dano. logo o grupo foge com " + nome_personagem + ". ");
        }
        
        //PERGUNTAS8
           
        System.out.println(" ");
        

        System.out.println("O grupo decide voltar o mais rápido possível para o mundo deles.");
        
        System.out.println(" ");

        System.out.println(" Logo eles com uma defesa quase imune a tudo, o grupo decide ter alguma pista sobre o mau no mundo deles, eles foram para os piores\n"
                +  " lugares teve algumas pistas, mas no caminho eles descobrem a última dimensão da espada lendária chamada Dark Repulser.\n"
                + "mesmo inseguro das história dessa dimensão dark e o único jeito de enfrentar o mau (boss kundun)  do mundo deles era com os 3 itens lendários.\n"
                + "mas dessa vez vai apena o" + nome_personagem + " porque os grupo está muito cansado dos últimos desafios e eles nao tem nem um item lendário da dimensão dark.");
        
        System.out.println(" ");


        System.out.println("08 - DESAFIO");

        System.out.println("Segundo max weber qual são as 3 característica principais da burocracia?");
        
               perguntas[0] = "Formalidade, Impessoalidade, Demonstratividade .";
        perguntas[1] = "Fomalidade, Profissionalismo e Liberalismo.";
        perguntas[2] = "Impessoalidade, Profissionalismo e Sabedoria..";
        perguntas[3] = "Formalidade, Impessoalidade e Profissionalismo.";
        perguntas[4] = "Demonstratividade, Liberalismo e Sabedoria.";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas [i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
        
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "Formalidade, Impessoalidade e Profissionalismo.")) {
            System.out.println("-- PARABÉNS --\n  " + nome_personagem + "  aparece em uma floresta toda escura resolve esperar o dia clarear para explorar mas passa.\n"
                    +   "muito tempo e nada, ele resolve anda naquela floresta sem saber.\n"
                        + " para onde ir ");
            pontos++;
        }
        else {
             System.out.println("-- ERROU --\n  " + nome_personagem + " aparece em um buraco cheio de monstro e passa muito tempo lá finalmente saiu para ver./n"
                        + " uma floresta toda escura já com pouca energia e decide esperar o dia nasce mas passa muito tempo e nada acontece ele resolve anda cada vez mais. ");
        }

          //PERGUNTA9
          
          System.out.println(" ");

        System.out.println("Depois de muito andar descobre um castelo era a única construção que ele descobriu naquele lugar decidiu explorar.\n"
                + "logo de cara já tinha uma espada no meio do castelo, mas parecia um lugar de luta quando ele chegou perto avistou um monstro que tinha asas. O monstro conhecido como Lord Dark "
                + "apareceu ele era muito rápido logo pegou a espada e foi para cima " + nome_personagem + ". desafio luta.");
        
        System.out.println(" ");

        

        System.out.println("09 - DESAFIO");

        System.out.println("O que é necessário para uma melhor administração de processos?");
        
        System.out.println(" ");
        
        perguntas[0] = "É necessário cuidar do fluxograma.";
        perguntas[1] = "E necessário cuidar dos papeis de funcionarios.";
        perguntas[2] = "Executar um otimo desenvolvumento de pcp.";
        perguntas[3] = "Será necessário redesenhar determinados fluxos de trabalho a fim de atingir melhores resultados.";
        perguntas[4] = "Demonstra conhecimento em R.H.";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas [i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
        
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "Será necessário redesenhar determinados fluxos de trabalho a fim de atingir melhores resultados.")) {
            System.out.println("-- PARABÉNS --\n  " + nome_personagem + " esquiva do monstro(LordDark), mas LordDark revida" +  nome_personagem + " pega a espada e.\n"
                    + " defende e mais uma esquiva" );
            pontos++;
        }
        else {
            System.out.println("-- ERROU --\n  " + nome_personagem + " pega a espada e se defende, mas o monstro(LordDark) revida com um forte chute./n"
                    + " no " + nome_personagem + " foi um impacto tão forte que foi jogando na parede. ");
        }

  //PERGUNTA10
  
        System.out.println(" ");

        System.out.println(nome_personagem + "  Viu que só a defesa dele e a velocidade nao vai adiantar mas mesmo assim ele luta com toda suas força, ele já na beira da derrota sem energia aparece.\n"
                + " o grupo dele no meio do castelo ele logo acredita que é possível vence. desafio luta em grupo.");

        System.out.println(" ");
        
        System.out.println("10 - DESAFIO ");

        System.out.println("Uma gestão de pessoas deve se preocupar com o crescimento dos colaboradores de sua organização. O que deve se fazer para o crescimento dos colaboradores?");
        
        System.out.println(" ");
        
        perguntas[0] = "Coloca los para trabalhar mais de 12 horas por dia.";
        perguntas[1] = "Da folga extra para os colaboradores.";
        perguntas[2] = "Paga uber para se locomover até o trabalho.";
        perguntas[3] = "Constantes treinamentos para sua equipe.";
        perguntas[4] = "Disponibilizar Happy Hour.";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas [i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
        
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "Constantes treinamentos para sua equipe.")) {
            System.out.println("-- PRABÉNS --\n  " + nome_personagem + "  2 do grupo usa uma habilidade para enfraquecer o LordDark logo em seguida os outro 2 vão para cima dele.\n"
                    + " e atacar com tudo ele acaba deixando a espada cai em seguida o" +nome_personagem + "  pega a espada e BOOM o LordDark foi cortado no meio, é aquele mundo que não via luz a anos.\n"
                    + " brilhou o sol a primeira vez. ");
            pontos++;
        }
        else {
            System.out.println("-- ERROU --\n  o grupo atacar o LordDark todos de uma só vez e o Lord acaba se defendendo.\n" 
              + "e levando dois do grupo, com muita raiva o" + nome_personagem + " levanta todo sangrando mesmo sem energia ativa a magia da armadura(Blood Angel) e aquele mundo.\n"
                    + " que era só escuridão viu a primeira luz foi tão brilhante que o lordDark virou pó.");

        }
        
        System.out.println(" ");

 if(pontos == 5){
    System.out.println(" foi numa jornada contra o boss kundun o último monstro do mundo que estava na dimensão deles, mas todo mundo se recupero até chegar lá\n" +
"e o boss final e do " + nome_personagem + " por isso ele estava com tudo possível para isso.");
    
     System.out.println(" ");
    
     System.out.println("DESAFIO 11");
     
     System.out.println("Quantos princípios Henri Faiol, criou para que a administrção seja eficas?");
     
     System.out.println(" ");
    
      perguntas[0] = "14.";
        perguntas[1] = "17.";
        perguntas[2] = "19.";
        perguntas[3] = "10.";
        perguntas[4] = "0.";

        Collections.shuffle(Arrays.asList(perguntas));
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println(alternativas[i] + " - " + perguntas[i]);
        }
        
        desafio = leitor.next().charAt(0);
        
        indexAlternativaEscolhida = -1;
        
        for ( int i = 0; i < alternativas.length; i++){
            if ( alternativas [i] == desafio ){
                indexAlternativaEscolhida = i;
                break;
            }
        }
         
        System.out.println(" ");
        
        if(indexAlternativaEscolhida == -1) {
            System.out.println("Alternativa invalida.");
        } 
        else if(perguntas[indexAlternativaEscolhida].equals( "14")) {
          System.out.println("-- PARABENS -- " + nome_personagem + " E assim a paz voltou a reinar. ");            
            pontos++;
        }
        else {
              System.out.println("-- Errou --\n o " + nome_personagem + " Mais uma era de trevas reinará .");
        }
    
}else if(pontos >= 6){
     System.out.println( nome_personagem + " Vitorioso");
}else{
     System.out.println("Game Over");
}
        System.out.println(" ");

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int inicio;

        do {
            System.out.println("        1 – Instruções\n"
                    + "        2 – Jogar\n"
                    + "        3 – Créditos\n"
                    + "        4 – Sair");
            inicio = leitor.nextInt();

            switch (inicio) {
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

        } while (inicio != 4);
    }

}