package Telas;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

public final class Perguntas extends javax.swing.JFrame {

    String respCorreta, opc;
    int vt, vtCarta, vtAux1, vtAux2, vtAux3, vtAux4, pontosGanhos, contarPerg = 0, nivel = 1, clickOp = 0, numPerg = 1;

    public Perguntas(String nomeCandidato) {
        initComponents();
        int[] vetor = gerarVetor(1, 15);
        vt = vetor[0];
        gerarPerguntas(vt);
        controleSetasPontos(true, false, false, false, false, false, false, false, false, false);
        lbNomeParticipante.setText(nomeCandidato);
        lbNumPergunta.setText(String.valueOf(numPerg));
        botoesErrarDesistirAcertar("Misericórdia", "0 Glória", "1 Glória");
        Perguntas();
    }

    public void Perguntas() {

        pergunta.setWrapStyleWord(true);
        pergunta.setEditable(false);
        pergunta.setLineWrap(true);
    }

    public void botoesErrarDesistirAcertar(String errar, String desistir, String acertar) {

        pnlErrar.setText(errar);
        pnlParar.setText(desistir);
        pnlAcertar.setText(acertar);
    }

    public static int[] gerarVetor(int tamVet, int tamRand) {

        int[] vetor = new int[tamVet];
        Random gerador = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(tamRand);
        }
        return vetor;
    }

    public void perguntasRespostas(String Perg, String Resp1, String Resp2, String Resp3, String Resp4, String ResCorreta) {

        pergunta.setText(Perg);
        resposta1.setText(Resp1);
        resposta2.setText(Resp2);
        resposta3.setText(Resp3);
        resposta4.setText(Resp4);
        respCorreta = ResCorreta;
    }

    public void gerarPerguntas(int vt) {

        if (nivel == 1) {
            switch (vt) {
                case 0:
                    perguntasRespostas("Qual Profeta que foi lançado na cova dos leões?", "Ezequiel", "Noé", "Jonas", "Daniel", "resp4");
                    break;
                case 1:
                    perguntasRespostas("Quem construiu a arca?", "Noé", "Enoque", "Jafé", "José", "resp1");
                    break;
                case 2:
                    perguntasRespostas("Qual alimento Jesus multiplicou?", "Peixe e Pão", "Leite e Mel", "Arroz e Feijão", "Pão e Vinho", "resp1");
                    break;
                case 3:
                    perguntasRespostas("Quem batizou Jesus no Rio Jordão?", "João Evangelista", "José de Arimatéia", "Pedro", "João Batista", "resp4");
                    break;
                case 4:
                    perguntasRespostas("Quem foi o discípulo que traiu Jesus?", "Pedro", "André", "Judas", "Paulo", "resp3");
                    break;
                case 5:
                    perguntasRespostas("Quem derrubou a muralha de Jericó?", "Barnabé", "Josué", "José", "Paulo", "resp2");
                    break;
                case 6:
                    perguntasRespostas("Onde se encontra na Bíblia 'O Senhor é meu pastor, nada me faltará'?", "Salmos 23", "Salmos 90", "Salmos 91", "Gênesis 1", "resp1");
                    break;
                case 7:
                    perguntasRespostas("Qual o nome do gigante que Davi derrubou?", "Sanssão", "Anaque", "Barrabás", "Golias", "resp4");
                    break;
                case 8:
                    perguntasRespostas("Aonde Jesus foi pregado?", "Em uma cruz", "Em uma árvore", "Em uma mesa", "Em um poste", "resp1");
                    break;
                case 9:
                    perguntasRespostas("Como Golias foi derrotado?", "Davi puxou o tapete de Golias.", "Davi acertou golias com uma flecha.", "Golias foi atingido por uma pedra na testa.", "Quando tentou correr atrás de Davi, tropeçou e caiu de cabeça.", "resp3");
                    break;
                case 10:
                    perguntasRespostas("Qual o nome do primeiro casal a existir na terra?", "Abraão e Sara", "Adão e Eva", "José e Maria", "Paulo e Jurema", "resp2");
                    break;
                case 11:
                    perguntasRespostas("Por que Jonas foi engolido por um peixe?", "Por que ele era mau", "Por que o peixe estava com fome", "Por que desobedeceu a Deus", "Porque estava tomando banho de mar perto da baleia", "resp3");
                    break;
                case 12:
                    perguntasRespostas("Aonde Noé colocou os animais?", "Em uma arca", "Em uma casa", "Em uma muralha", "No porão da sua casa", "resp1");
                    break;
                case 13:
                    perguntasRespostas("Em quantos dias Deus criou todas as coisas?", "Criou tudo em um dia ao dizer 'haja luz'", "Em 8 dias", "Em 7 dias", "Em 6 dias e no sétimo descansou", "resp4");
                    break;
                case 14:
                    perguntasRespostas("Qual era o nome da mãe de Jesus?", "Rebeca", "Maria", "Ana", "Rute", "resp2");
                    break;
                case 15:
                    perguntasRespostas("Como se chamava o líder do Egito?", "Faraó", "Rei", "Pastor", "Imperador", "resp1");
                    break;
            }
        } else {
            if (nivel == 2) {
                switch (vt) {
                    case 0:
                        perguntasRespostas("Quantos livros tem a Bíblia?", "65", "66", "67", "68", "resp2");
                        break;
                    case 1:
                        perguntasRespostas("Quem foi o primeiro rei de Israel?", "Saul", "Davi", "Isbosete", "Salomão", "resp1");
                        break;
                    case 2:
                        perguntasRespostas("Qual o maior capitulo da Bíblia?", "Salmos 119", "Números 7", "Lucas 1", "Salmos 118", "resp1");
                        break;
                    case 3:
                        perguntasRespostas("Quem era o filho primogênito de Adão e Eva?", "Sete", "Caim", "Abel", "Jubileu", "resp2");
                        break;
                    case 4:
                        perguntasRespostas("Quem pediu para andar nas águas com Jesus?", "João", "Pedro", "Tiago", "Isaías", "resp2");
                        break;
                    case 5:
                        perguntasRespostas("Quem foi o homem que viveu por mais tempo na terra?", "Sete", "Matusalém", "Lameque", "Adão", "resp2");
                        break;
                    case 6:
                        perguntasRespostas("Quem negou Jesus 3 vezes?", "Judas", "André", "Marcos", "Pedro", "resp4");
                        break;
                    case 7:
                        perguntasRespostas("Como morreu Judas?", "Assassinado", "Suicídio", "Acidente", "Doença", "resp2");
                        break;
                    case 8:
                        perguntasRespostas("Quantos discípulos tinha Jesus?", "10", "11", "12", "13", "resp3");
                        break;
                    case 9:
                        perguntasRespostas("Qual o nome do anjo que apareceu a Maria, mãe de Jesus?", "Miguel", "Rafael", "Uriel", "Gabriel", "resp4");
                        break;
                    case 10:
                        perguntasRespostas("Quais destes nomes não é mencionado na Bíblia?", "Tiago", "Caio", "Felipe", "João", "resp2");
                        break;
                    case 11:
                        perguntasRespostas("Em qual cidade nasceu Jesus?", "Belém", "Samaria", "Jerusalém", "Faixa de Gaza", "resp1");
                        break;
                    case 12:
                        perguntasRespostas("O que aconteceu depois que Pedro negou a Jesus pela terceira vez?", "O véu do templo se rasgou", "O céu ficou em trevas", "O galo cantou", "O gato miou", "resp3");
                        break;
                    case 13:
                        perguntasRespostas("Completando a frase: O ladrão vem apenas para roubar, matar e...?", "confundir", "destruir", "zombar", "roubar", "resp2");
                        break;
                    case 14:
                        perguntasRespostas("Quantos mandamentos tinham as Tábuas da Lei?", "8", "9", "10", "11", "resp3");
                        break;
                    case 15:
                        perguntasRespostas("Quem foi o bandido que foi escolhido para ser liberto em vez de Jesus?", "Judas", "Pilatos", "Jó", "Barrabás", "resp4");
                        break;
                }
            } else {
                if (nivel == 3) {
                    switch (vt) {
                        case 0:
                            perguntasRespostas("Qual o menor livro do Antigo Testamento?", "Mateus", "Lucas", "Amós", "Obadias", "resp4");
                            break;
                        case 1:
                            perguntasRespostas("Quem foi governador do Egito?", "Moisés", "Timóteo", "José", "Ismael", "resp3");
                            break;
                        case 2:
                            perguntasRespostas("Qual era o nome do irmão de Moisés?", "João", "Jacó", "Arão", "Abraão", "resp3");
                            break;
                        case 3:
                            perguntasRespostas("Com quantos pães e peixes Jesus multiplicou para alimentar a multidão?", "5 Pães e 2 Peixes", "7 Pães e 7 Peixes", "8 Pães e 1 Peixe", "9 Pães e 2 Peixe", "resp1");
                            break;
                        case 4:
                            perguntasRespostas("Quem ajudou Jesus a carregar a cruz?", "João", "Timóteo", "Simão Cirineu", "Maria", "resp3");
                            break;
                        case 5:
                            perguntasRespostas("Quem é o Apóstolo do amor?", "Paulo", "Tiago", "João", "Lucas", "resp3");
                            break;
                        case 6:
                            perguntasRespostas("Quem foi o imperador da Babilônia?", "Nabucodonosor", "Faraó", "Jeocaz", "Cleópatra", "resp1");
                            break;
                        case 7:
                            perguntasRespostas("Antes de ser Rei, qual era o trabalho de Davi?", "Carpinteiro", "Pastor de ovelhas", "Domado de leões", "Caçador", "resp2");
                            break;
                        case 8:
                            perguntasRespostas("Qual é o nome da mulher por qual Sansão se apaixonou?", "Rute", "Raquel", "Sara", "Dalila", "resp4");
                            break;
                        case 9:
                            perguntasRespostas("Qual era o ofício de José, pai de Jesus?", "Pastor", "Cobrador de impostos", "Carpinteiro", "Pescador", "resp3");
                            break;
                        case 10:
                            perguntasRespostas("Qual foi o primeiro milagre de Jesus?", "A transformação da água em vinho", "A ressureição de Lázaro", "A multiplicação dos pães e peixes", "Fazer o cego enxergar", "resp1");
                            break;
                        case 11:
                            perguntasRespostas("Qual o nome do lugar onde habitavam Adão e Eva?", "Jardim Suspenso", "Torre de Babel", "Jaboatão dos Guararapes", "Jardim do Éden", "resp4");
                            break;
                        case 12:
                            perguntasRespostas("Qual profeta foi engolido por um grande peixe?", "Pelé", "Malaquias", "Jonas", "Elias", "resp3");
                            break;
                        case 13:
                            perguntasRespostas("Porque Deus tanto amou o mundo que deu o seu Filho Unigênito, para que todo o que nele crer não pereça, mas tenha a vida eterna", "João 1:1", "João 3:16", "João 3:17", "João 10:10", "resp2");
                            break;
                        case 14:
                            perguntasRespostas("Qual mar foi aberto por Moisés?", "Mar Vermelho", "Mar da Galileia", "Mar Mediterrâneo", "Mar Morto", "resp1");
                            break;
                        case 15:
                            perguntasRespostas("Qual mar foi aberto por Moisés?", "Deus é Fiel", "Deus conosco", "Deus contigo", "Filho de Deus", "resp2");
                            break;
                    }
                } else {
                    if (nivel == 4) {
                        switch (vt) {
                            case 0:
                                perguntasRespostas("Quais são os 4 Evangelhos do Novo Testamento?", "Mateus, Lucas, Atos e João", "Mateus, Marcos, João e Tiago", "João,Tiago,Lucas e Marcos", "Mateus, Lucas, Marcos e João", "resp4");
                                break;
                            case 1:
                                perguntasRespostas("O Pentateuco são?", "Os 10 primeiros livros da Bíblia.", "Os 5 primeiros livros do Novo Testamento.", "Os 5 primeiros livros do Velho Testamento", "Os 10 primeiros livros do Novo Testamento", "resp3");
                                break;
                            case 2:
                                perguntasRespostas("Qual foi o Apóstolo que mais livros escreveu no Novo Testamento?", "Pedro", "Paulo", "João", "Daniel", "resp2");
                                break;
                            case 3:
                                perguntasRespostas("Qual foi o primeiro nome de Abraão?", "Abrão", "Abdraão", "Adão", "Israel", "resp1");
                                break;
                            case 4:
                                perguntasRespostas("Quanto tempo durou a chuva do dilúvio?", "3 dias e 3 noites", "7 dias e 7 noites", "30 dias e 30 noites", "40 dias e 40 noites", "resp4");
                                break;
                            case 5:
                                perguntasRespostas("Lázaro foi ressuscitado depois de quantos dias?", "3", "4", "5", "6", "resp2");
                                break;
                            case 6:
                                perguntasRespostas("Qual foi o primeiro nome do Apóstolo Paulo?", "Saulo", "Tiago", "Simão", "Barnabé", "resp1");
                                break;
                            case 7:
                                perguntasRespostas("Quanto tempo o povo hebreu ficou no deserto?", "20 anos", "30 anos", "40 anos", "45 anos", "resp3");
                                break;
                            case 8:
                                perguntasRespostas("Quem escreveu o livro de Apocalipse?", "José", "Paulo", "Moisés", "João", "resp4");
                                break;
                            case 9:
                                perguntasRespostas("Quem derrotou Golias?", "Josué", "Sansão", "Davi", "Calebe", "resp3");
                                break;
                            case 10:
                                perguntasRespostas("Quem foi abandonado pelo seus irmãos e vendido como escravo?", "José", "Arão", "Davi", "Moisés", "resp1");
                                break;
                            case 11:
                                perguntasRespostas("Quem subiu aos céus em uma carruagem de fogo?", "Eliseu", "Arão", "Enoque", "Elias", "resp4");
                                break;
                            case 12:
                                perguntasRespostas("Jesus entrou em Jerusalém montado em que animal?", "Cavalo", "Leão", "Jumento", "Camelo", "resp3");
                                break;
                            case 13:
                                perguntasRespostas("O Espírito Santo desceu em qual dia?", "Dia da Páscoa", "Dia de Pentecostes", "Dia da Independência", "Dia do aniversário de Jaboatão", "resp2");
                                break;
                            case 14:
                                perguntasRespostas("Quem desejou comer a comida dos porcos?", "O endemoniado Gadareno", "Saul", "O filho pródigo", "O filho arrogante", "resp3");
                                break;
                            case 15:
                                perguntasRespostas("Qual discípulo só acreditou vendo?", "Pedro", "Tiago", "André", "Tomé", "resp4");
                                break;
                        }
                    } else {
                        if (nivel == 5) {
                            switch (vt) {
                                case 0:
                                    perguntasRespostas("Quem perseguiu Davi?", "Nabucodonosor", "Faraó", "Nero", "Saul", "resp4");
                                    break;
                                case 1:
                                    perguntasRespostas("O que a mulher de Samaria saiu para fazer?", "Caçar", "Tirar água", "Colher trigo", "Planta arroz", "resp2");
                                    break;
                                case 2:
                                    perguntasRespostas("Quem não foi Apóstolo?", "Pedro", "Isaías", "João", "Judas", "resp2");
                                    break;
                                case 3:
                                    perguntasRespostas("Quem foi arrebatado por Deus e não viu a morte?", "Enoque", "Jó", "João", "Matusalém", "resp1");
                                    break;
                                case 4:
                                    perguntasRespostas("Quem subiu na árvore para ver Jesus passar?", "Tadeu", "Zaqueu", "Zacarias", "Ananias", "resp2");
                                    break;
                                case 5:
                                    perguntasRespostas("Quem escreveu o livro de Lamentações?", "Zacarias", "Elias", "Jeremias", "Lucas", "resp3");
                                    break;
                                case 6:
                                    perguntasRespostas("Complete: Aquele que está em Cristo nova criatura é; as coisas velhas já passaram;...", "eis que já ressuscitou dos mortos.", "eis que tudo se fez novo.", "eis que passaram da morte para a vida.", "eis que tudo se fez abençoado.", "resp2");
                                    break;
                                case 7:
                                    perguntasRespostas("Qual era o nome da montanha onde Moisés recebeu os 10 Mandamentos?", "Monte Horebe", "Monte das Oliveiras", "Monte Sinai", "Monte das Russas", "resp3");
                                    break;
                                case 8:
                                    perguntasRespostas("Quem interrogou Jesus?", "Pilatos", "Nero", "Ciro", "Nabucodonosor", "resp1");
                                    break;
                                case 9:
                                    perguntasRespostas("Jesus curou 10 leprosos. Quantos voltaram para agradecer?", "1", "2", "3", "10", "resp1");
                                    break;
                                case 10:
                                    perguntasRespostas("Quem foi o sábio que conversou com Jesus?", "Gamaliel", "Salomão", "Nicodemos", "José", "resp3");
                                    break;
                                case 11:
                                    perguntasRespostas("Quem liderou o êxodo do povo hebreu no Egito?", "José", "Moisés", "Daví", "Salomão", "resp2");
                                    break;
                                case 12:
                                    perguntasRespostas("Sadraque, Mezaque e Abedenego foram jogados aonde?", "Na fornalha", "No Coliseu", "Na cova dos leões", "No porão de Nabuconodosor", "resp1");
                                    break;
                                case 13:
                                    perguntasRespostas("Quem teve um sonho e deixou seus irmãos com ciúmes?", "Jacó", "Benjamim", "Abraão", "José", "resp4");
                                    break;
                                case 14:
                                    perguntasRespostas("Quem era irmão de Jacó?", "Arão", "Abraão", "Esaú", "Sete", "resp3");
                                    break;
                                case 15:
                                    perguntasRespostas("Quem pulou de alegria no ventre da mãe?", "João Batista", "Isaque", "Jesus", "Salomão", "resp1");
                                    break;
                            }
                        } else {
                            if (nivel == 6) {
                                switch (vt) {
                                    case 0:
                                        perguntasRespostas("Qual foi o Apóstolo que ficou temporariamente cego?", "Tiago", "Judas", "Pedro", "Paulo", "resp4");
                                        break;
                                    case 1:
                                        perguntasRespostas("Quem escreveu o Salmo 23?", "Levi", "Davi", "Saul", "Salomão", "resp2");
                                        break;
                                    case 2:
                                        perguntasRespostas("Quem cantava na prisão com Paulo antes do terremoto?", "Levi", "João", "Silas", "Pedro", "resp3");
                                        break;
                                    case 3:
                                        perguntasRespostas("Qual cidade teve a sua muralha derrubada?", "Belém", "Corinto", "Creta", "Jericó", "resp4");
                                        break;
                                    case 4:
                                        perguntasRespostas("O que Gideão usou contra os midianitas?", "Escudos, espadas e lanças", "Escudos e Trombetas", "Carruagens e arqueiros", "Trombetas, cântaros e lâmpadas", "resp4");
                                        break;
                                    case 5:
                                        perguntasRespostas("O que estava escrito na placa da cruz onde Jesus foi crucificado?", "Jesus Nazareno, O Reis dos Judeus", "Jesus Nazareno, O Reis dos Reis", "Jesus Nazareno, O Reis da Galiléia", "Jesus Nazareno, O Reis de Israel", "resp1");
                                        break;
                                    case 6:
                                        perguntasRespostas("Quem entrou na Terra Prometida?", "Noé", "Moisés", "Maria", "Josué", "resp4");
                                        break;
                                    case 7:
                                        perguntasRespostas("Quem foi colocado num cesto e lançado no rio ainda quando era bebê?", "Jonas", "Jesus", "Moisés", "José", "resp3");
                                        break;
                                    case 8:
                                        perguntasRespostas("Quem se tornou uma coluna de sal depois que olhou para trás?", "Maria Madalena", "Nabucodonosor", "Mulher de Moisés", "Mulher de Ló", "resp4");
                                        break;
                                    case 9:
                                        perguntasRespostas("O Livro de Ageu está em que parte da Bíblia?", "Novo Testamento", "Velho Testamento", "Presente Testamento", "Não existe na Bíblia", "resp2");
                                        break;
                                    case 10:
                                        perguntasRespostas("Eliseu sucedeu a qual profeta?", "Elias", "João Batista", "Zacarias", "Pedro", "resp1");
                                        break;
                                    case 11:
                                        perguntasRespostas("Quem escreveu Cantares?", "Davi", "José", "Moisés", "Salomão", "resp4");
                                        break;
                                    case 12:
                                        perguntasRespostas("Quais são os dois grandes mandamentos destacados por Jesus?", "Amarás o Senhor teu Deus de todo o teu coração / Amarás ao teu próximo como a ti mesmo.", "Não matarás / Amarás o Senhor teu Deus de todo o teu coração.", "Não cobiçarás (seus servos, animais, ou coisa alguma que lhe pertença) / Não matarás.", "Não matarás /Amarás ao teu próximo como a ti mesmo.", "resp1");
                                        break;
                                    case 13:
                                        perguntasRespostas("Qual era a menor tribo de Israel?", "Dã", "Manassés", "Benjamim", "Aser", "resp3");
                                        break;
                                    case 14:
                                        perguntasRespostas("Quantas vezes o comandante Naamã mergulhou no rio Jordão?", "4 vezes", "5 vezes", "6 vezes", "7 vezes", "resp4");
                                        break;
                                    case 15:
                                        perguntasRespostas("Quem escreveu os livros de Provérbios e Eclesiastes?", "Moisés", "Salomão", "Davi", "Saul", "resp2");
                                        break;
                                }
                            } else {
                                if (nivel == 7) {
                                    switch (vt) {
                                        case 0:
                                            perguntasRespostas("O que quer dizer Rabi?", "Rei", "Mestre", "Pai", "Filho", "resp2");
                                            break;
                                        case 1:
                                            perguntasRespostas("Quem foi companheiro de batalhas de Josué?", "José", "Calebe", "Davi", "Moisés", "resp2");
                                            break;
                                        case 2:
                                            perguntasRespostas("A quem Paulo chamou de 'meu companheiro de lutas'?", "Apolo", "Calebe", "Arquipo", "Áfia", "resp3");
                                            break;
                                        case 3:
                                            perguntasRespostas("Quais discípulos perguntaram a Jesus se podiam fazer descer fogo do céu?", "João e José", "Tiago e Pedro", "Pedro e João", "João e Tiago", "resp4");
                                            break;
                                        case 4:
                                            perguntasRespostas("Qual era o nome da serpente de bronze que Moisés tinha feito?", "Neustã", "Leviatã", "Satã", "Aserá", "resp1");
                                            break;
                                        case 5:
                                            perguntasRespostas("Quem falou com Balaão?", "Jacó", "Jesus", "Demônio", "Jumenta", "resp4");
                                            break;
                                        case 6:
                                            perguntasRespostas("Quem foi escolhido pelos discípulos para substituir Judas Iscariotes?", "Barnabé", "Isaac", "Matias", "Paulo", "resp3");
                                            break;
                                        case 7:
                                            perguntasRespostas("Quem cortou a orelha do soldado?", "Judas", "Tiago", "Paulo", "Pedro", "resp4");
                                            break;
                                        case 8:
                                            perguntasRespostas("Qual Apóstolo era irmão de Tiago?", "Tomé", "João", "Paulo", "Pedro", "resp2");
                                            break;
                                        case 9:
                                            perguntasRespostas("Quantas tribos tinha em Israel?", "9", "10", "11", "12", "resp4");
                                            break;
                                        case 10:
                                            perguntasRespostas("O que o anjo disse a Maria Madalena chegando ao sepulcro vazio?", "Ele não está aqui", "Ele sumiu", "Ele desapareceu", "Ele está aqui", "resp1");
                                            break;
                                        case 11:
                                            perguntasRespostas("Para quem Jonas se recusava a pregar?", "Os Amorreus", "Os Ninivitas", "Os Amalequitas", "Os Chiquititas", "resp2");
                                            break;
                                        case 12:
                                            perguntasRespostas("Quem entrou na cidade dançando com a arca da aliança?", "Saul", "Salomão", "Davi", "Simeão", "resp3");
                                            break;
                                        case 13:
                                            perguntasRespostas("Quem lutou com o anjo até ser abençoado?", "Caim", "Jacó", "Abraão", "Simeão", "resp2");
                                            break;
                                        case 14:
                                            perguntasRespostas("Onde Jesus foi crucificado?", "Gólgota", "Monte Sinai", "Monte Horebe", "Monte Góljota", "resp1");
                                            break;
                                        case 15:
                                            perguntasRespostas("O que Deus disse depois que Jesus foi batizado nas águas?", "Jesus é o Rei dos reis", "Não toques no meu ungido", "Este é o meu Filho amado, em quem me comprazo", "Louvado seja o seu Nome", "resp3");
                                            break;
                                    }
                                } else {
                                    if (nivel == 8) {
                                        switch (vt) {
                                            case 0:
                                                perguntasRespostas("Qual o livro da Bíblia que termina com um ponto de interrogação?", "Tiago", "Judas", "Joel", "Jonas", "resp4");
                                                break;
                                            case 1:
                                                perguntasRespostas("Qual desses livros se encontram no Novo Testamento?", "Habacuque", "Filemom", "Sofonias", "Juízes", "resp2");
                                                break;
                                            case 2:
                                                perguntasRespostas("Em quais livros da Bíblia não encontramos a palavra 'Deus'?", "Oséias e Eclesiastes", "Ageu e Amós", "Ester e Cânticos", "Eclesiastes e Cânticos", "resp3");
                                                break;
                                            case 3:
                                                perguntasRespostas("Qual o menor livro da Bíblia?", "Judas", "I João", "II João", "III João", "resp3");
                                                break;
                                            case 4:
                                                perguntasRespostas("Na visão profética de João qual era o número de cavaleiros do Apocalipse?", "7", "6", "5", "4", "resp4");
                                                break;
                                            case 5:
                                                perguntasRespostas("Quem falou com Balaão?", "Jacó", "Jesus", "Demônio", "Jumenta", "resp4");
                                                break;
                                            case 6:
                                                perguntasRespostas("Quem escreveu a Epístola de Judas?", "João Evangelista", "Judas Iscariotes  ", "Judas irmão de Tiago", "Paulo do amor", "resp3");
                                                break;
                                            case 7:
                                                perguntasRespostas("Quem teve seu corpo disputado pelo arcanjo Miguel e o Diabo?", "Jesus", "Tiago", "Judas", "Moisés", "resp4");
                                                break;
                                            case 8:
                                                perguntasRespostas("Qual era o nome da profetiza que estava fazendo a igreja de Tiatira cair em imoralidade sexual e idolatria?", "Dalila", "Jezabel", "Lilith", "Maria Madalena", "resp2");
                                                break;
                                            case 9:
                                                perguntasRespostas("A Morte montada em um cavalo amarelo surgiu na abertura de qual selo em Apocalipse?", "1º selo", "2º selo", "3º selo", "4º selo", "resp4");
                                                break;
                                            case 10:
                                                perguntasRespostas("Quem foi a única mulher citada na Bíblia a ter o status de juíza e líder de Israel?", "Débora", "Jael", "Miriã", "Ester", "resp1");
                                                break;
                                            case 11:
                                                perguntasRespostas("A quem o Apóstolo Paulo chamou de 'médico amado'?", "Jesus", "Lucas", "Demas", "Moisés", "resp2");
                                                break;
                                            case 12:
                                                perguntasRespostas("Quem governou sendo rei e sacerdote ao mesmo tempo?", "Saul", "Manassés", "Melquisedeque", "Joacaz", "resp3");
                                                break;
                                            case 13:
                                                perguntasRespostas("Que animal mordeu a mão do Apóstolo Paulo?", "Escorpião", "Víbora", "Lagarto", "Gato", "resp2");
                                                break;
                                            case 14:
                                                perguntasRespostas("Qual era o nome babilônico de Daniel?", "Aspenaz", "Beltessazar", "Abede-Nego", "Áfia", "resp2");
                                                break;
                                            case 15:
                                                perguntasRespostas("Qual o nome que Jacó deu ao lugar onde sonhou com Deus?", "Be­tuel", "Divindade", "Luz", "Betel", "resp4");
                                                break;
                                        }
                                    } else {
                                        if (nivel == 9) {
                                            switch (vt) {
                                                case 0:
                                                    perguntasRespostas("Quem foram apelidados por Jesus de Boanerges que significa 'Filhos do Trovão'?", "José e Tiago", "Pedro e Tiago", "João e Pedro", "João e Tiago", "resp4");
                                                    break;
                                                case 1:
                                                    perguntasRespostas("Qual o discípulo que acompanhou Jesus até a sua crucificação?", "André", "João", "Tiago", "Pedro", "resp2");
                                                    break;
                                                case 2:
                                                    perguntasRespostas("Qual era o nome da única filha de Lia?", "Zilpa", "Raquel", "Diná", "Rute", "resp3");
                                                    break;
                                                case 3:
                                                    perguntasRespostas("Quantos capítulos tem o Livro de Naum?", "4", "1", "2", "3", "resp4");
                                                    break;
                                                case 4:
                                                    perguntasRespostas("O Velho Testamento reúne mais livros do que o Novo Testamento?", "Não,o Novo Testamento tem cinco livros a mais", "Ambos tem a mesma quantidade", "Não", "Sim", "resp4");
                                                    break;
                                                case 5:
                                                    perguntasRespostas("A estátua do sonho de Nabucodonosor era composta de quais elementos?", "Toda em ouro.", "Ouro, prata, bronze, onix e ferro.", "Ouro, prata, bronze e pedras preciosas.", "Ouro, prata, bronze, ferro e barro.", "resp4");
                                                    break;
                                                case 6:
                                                    perguntasRespostas("Quem era conhecido por ser cobrador de impostos?", "Barnabé", "Zacarias", "Zaqueu", "Zebedeu", "resp3");
                                                    break;
                                                case 7:
                                                    perguntasRespostas("Quanto tempo Jonas ficou preso dentro da barriga de um grande peixe?", "8 dias", "6 dias", "4 dias", "3 dias", "resp4");
                                                    break;
                                                case 8:
                                                    perguntasRespostas("Qual foram os dois nomes indicados para substituir Judas Iscariotes?", "Paulo e José.", "Barsabás e Matias.", "Barsabás e Paulo", "Paulo e Matias.", "resp2");
                                                    break;
                                                case 9:
                                                    perguntasRespostas("Em Tessalônica, Paulo, Silas e Timóteo se refugiaram na casa de qual irmão?", "Samuel", "Apolo", "Barnabé", "Jasom", "resp4");
                                                    break;
                                                case 10:
                                                    perguntasRespostas("Adão viveu ao todo quantos anos?", "930 anos.", "940 anos.", "942 anos.", "943 anos.", "resp1");
                                                    break;
                                                case 11:
                                                    perguntasRespostas("Jesus enviou quantos discípulos para a missão de pregar o Evangelho?", "70 discípulos", "72 discípulos", "73 discípulos", "75 discípulos", "resp2");
                                                    break;
                                                case 12:
                                                    perguntasRespostas("Em qual dia da criação foi feito o sol, a lua e as estrelas?", "1º dia", "2º dia", "3º dia", "4º dia", "resp4");
                                                    break;
                                                case 13:
                                                    perguntasRespostas("Como é conhecido o Livro de Atos dos Apóstolos?", "Um livro profético.", "Um livro histórico.", "Uma epístola.", "Um livro de metáforas.", "resp2");
                                                    break;
                                                case 14:
                                                    perguntasRespostas("Qual era a idade de Calebe quando pediu Hebrom para Josué?", "55 anos", "65 anos", "75 anos", "85 anos", "resp4");
                                                    break;
                                                case 15:
                                                    perguntasRespostas("Por quantas moedas Judas entregou Jesus?", "30 moedas de prata", "30 moedas de ouro", "35 moedas de prata", "35 moedas de ouro", "resp1");
                                                    break;
                                            }
                                        } else {
                                            if (nivel == 10) {
                                                switch (vt) {
                                                    case 0:
                                                        perguntasRespostas("Qual era o nome da mulher de Jó?", "Abigail", "Dâmaris", "Jerusa", "A Bíblia não diz", "resp4");
                                                        break;
                                                    case 1:
                                                        perguntasRespostas("Quem Noé amaldiçoou depois de saber que foi visto em nudez?", "Cam", "Canaã", "Jafé", "Sete", "resp2");
                                                        break;
                                                    case 2:
                                                        perguntasRespostas("Qual das alternativas não é um livro apócrifo?", "Livro de Enoque", "Livro de Levi", "Livro de Ageu", "Livro de Tobias", "resp3");
                                                        break;
                                                    case 3:
                                                        perguntasRespostas("Qual destes livros contém mais de um capítulo?", "Nenhuma desses citados", "Obadias", "Judas", "Joel", "resp4");
                                                        break;
                                                    case 4:
                                                        perguntasRespostas("Qual é o versículo mais extenso da Bíblia?", "Isaías 24:2", "Salmos 119:44", "Salmos 119:43", "Ester 8:9", "resp4");
                                                        break;
                                                    case 5:
                                                        perguntasRespostas("Quantos versículos tem Salmos 119?", "173 versículos.", "174 versículos.", "175 versículos.", "176 versículos.", "resp4");
                                                        break;
                                                    case 6:
                                                        perguntasRespostas("Qual a mulher que acolheu o seu inimigo e depois o matou?", "Raquel", "Maria", "Jael", "Débora", "resp3");
                                                        break;
                                                    case 7:
                                                        perguntasRespostas("Que homem depois de morto, matou mais pessoas do que em vida?", "Judas", "Tiago", "Elias", "Sansão", "resp4");
                                                        break;
                                                    case 8:
                                                        perguntasRespostas("Quem se tornou rei enquanto procurava as jumentas do seu pai?", "Acabe", "Saul", "Davi", "Salomão", "resp2");
                                                        break;
                                                    case 9:
                                                        perguntasRespostas("Quem tinha um cabelo que pesava mais de dois quilos e era necessário cortar todo ano?", "Davi", "Maria Madalena", "Sansão", "Absalão", "resp4");
                                                        break;
                                                    case 10:
                                                        perguntasRespostas("Quem teve a vida prolongada por mais 15 anos depois de orar?", "Ezequias", "Matusalém", "Isaque", "Enoque", "resp1");
                                                        break;
                                                    case 11:
                                                        perguntasRespostas("Quem a multidão de Listra chamou de Zeus e Hermes?", "Jesus e Paulo", "Barnabé e Paulo", "Pedro e João", "Barnabé e João", "resp2");
                                                        break;
                                                    case 12:
                                                        perguntasRespostas("Quais eram os 2 homens que o Apóstolo Paulo entregou a Satanás para serem castigados?", "Silas e Barnabé", "Himeneu e Barnabé", "Himeneu e Alexandre", "Janes e Jambres", "resp3");
                                                        break;
                                                    case 13:
                                                        perguntasRespostas("Qual foi o profeta que surgiu depois de Malaquias?", "Joel", "João Batista", "Abraão", "Zacarias", "resp2");
                                                        break;
                                                    case 14:
                                                        perguntasRespostas("Depois do Dilúvio, Noé viveu por mais quantos anos?", "350 anos", "250 anos", "150 anos", "140 anos", "resp1");
                                                        break;
                                                    case 15:
                                                        perguntasRespostas("Qual é o quinto livro do Novo Testamento?", "Evangelho de Lucas", "Evangelho de Marcos", "Atos dos Apóstolos", "Carta aos Romanos", "resp3");
                                                        break;
                                                }
                                            } else {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")

    public void contadorPontos() {

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRespostas = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        pergunta = new javax.swing.JTextArea();
        pnlPegrunta = new rojerusan.RSMaterialButtonRectangle();
        pnlPegruntaBorda = new rojerusan.RSMaterialButtonRectangle();
        lbNomeParticipante = new javax.swing.JLabel();
        resposta1 = new javax.swing.JRadioButton();
        resposta2 = new javax.swing.JRadioButton();
        resposta3 = new javax.swing.JRadioButton();
        resposta4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbPlacas = new javax.swing.JLabel();
        lbUniversitarios = new javax.swing.JLabel();
        btUniversitario = new javax.swing.JLabel();
        btPlacas = new javax.swing.JLabel();
        btPulo3 = new javax.swing.JLabel();
        lbPular = new javax.swing.JLabel();
        btPulo2 = new javax.swing.JLabel();
        btPulo1 = new javax.swing.JLabel();
        pnlErrar = new rojerusan.RSMaterialButtonRectangle();
        pnlAcertar = new rojerusan.RSMaterialButtonRectangle();
        pnlParar = new rojerusan.RSMaterialButtonRectangle();
        btParar = new javax.swing.JLabel();
        btConfirmar = new javax.swing.JLabel();
        lbCartas = new javax.swing.JLabel();
        btCarta1 = new javax.swing.JLabel();
        btCarta2 = new javax.swing.JLabel();
        btCarta3 = new javax.swing.JLabel();
        btCarta4 = new javax.swing.JLabel();
        lbParticipante1 = new javax.swing.JLabel();
        pnlAjuda = new rojerusan.RSMaterialButtonRectangle();
        pnlAjudaBorda = new rojerusan.RSMaterialButtonRectangle();
        pnlAlternativas = new rojerusan.RSMaterialButtonRectangle();
        pnlResp1 = new rojerusan.RSMaterialButtonRectangle();
        pnlResp2 = new rojerusan.RSMaterialButtonRectangle();
        pnlResp3 = new rojerusan.RSMaterialButtonRectangle();
        pnlResp4 = new rojerusan.RSMaterialButtonRectangle();
        pnlRespostas = new rojerusan.RSMaterialButtonRectangle();
        lbNumPergunta = new javax.swing.JLabel();
        lbPergunta = new javax.swing.JLabel();
        pnlPerguntas = new rojerusan.RSMaterialButtonRectangle();
        pnl1 = new javax.swing.JPanel();
        lb1Gloria = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        lb2Glorias = new javax.swing.JLabel();
        pnl3 = new javax.swing.JPanel();
        lb3Glorias = new javax.swing.JLabel();
        pnl4 = new javax.swing.JPanel();
        lb4Glorias = new javax.swing.JLabel();
        pnl5 = new javax.swing.JPanel();
        lb5Glorias = new javax.swing.JLabel();
        pnl6 = new javax.swing.JPanel();
        lb6Glorias = new javax.swing.JLabel();
        pnl7 = new javax.swing.JPanel();
        lb7Glorias = new javax.swing.JLabel();
        pnl8 = new javax.swing.JPanel();
        lb8Glorias = new javax.swing.JLabel();
        pnl9 = new javax.swing.JPanel();
        lb9Glorias = new javax.swing.JLabel();
        pnl10 = new javax.swing.JPanel();
        lbArrebatado = new javax.swing.JLabel();
        lbMcd1 = new javax.swing.JLabel();
        lbMcd2 = new javax.swing.JLabel();
        lbMcd3 = new javax.swing.JLabel();
        lbMcd4 = new javax.swing.JLabel();
        lbMcd5 = new javax.swing.JLabel();
        lbMcd6 = new javax.swing.JLabel();
        lbMcd7 = new javax.swing.JLabel();
        lbMcd8 = new javax.swing.JLabel();
        lbMcd9 = new javax.swing.JLabel();
        lbMcd10 = new javax.swing.JLabel();
        pnlGlorias = new rojerusan.RSMaterialButtonRectangle();
        lbParticipante2 = new javax.swing.JLabel();
        lbAcertar = new javax.swing.JLabel();
        lbDesistir = new javax.swing.JLabel();
        lbErrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 610));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(111, 2, 7));
        jPanel3.setMinimumSize(new java.awt.Dimension(1100, 610));
        jPanel3.setPreferredSize(new java.awt.Dimension(1100, 610));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pergunta.setColumns(20);
        pergunta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pergunta.setForeground(new java.awt.Color(111, 2, 7));
        pergunta.setRows(5);
        pergunta.setWrapStyleWord(true);
        pergunta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(pergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 680, 100));

        pnlPegrunta.setBackground(new java.awt.Color(255, 255, 255));
        pnlPegrunta.setBorder(null);
        jPanel3.add(pnlPegrunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 720, 140));

        pnlPegruntaBorda.setBackground(new java.awt.Color(111, 2, 7));
        pnlPegruntaBorda.setBorder(null);
        jPanel3.add(pnlPegruntaBorda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 740, 160));

        lbNomeParticipante.setBackground(new java.awt.Color(0, 255, 0));
        lbNomeParticipante.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNomeParticipante.setForeground(new java.awt.Color(255, 255, 0));
        lbNomeParticipante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(lbNomeParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, 30));

        resposta1.setBackground(new java.awt.Color(111, 2, 7));
        grupoRespostas.add(resposta1);
        resposta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resposta1.setForeground(new java.awt.Color(255, 255, 255));
        resposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resposta1ActionPerformed(evt);
            }
        });
        jPanel3.add(resposta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 690, 20));

        resposta2.setBackground(new java.awt.Color(111, 2, 7));
        grupoRespostas.add(resposta2);
        resposta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resposta2.setForeground(new java.awt.Color(255, 255, 255));
        resposta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resposta2ActionPerformed(evt);
            }
        });
        jPanel3.add(resposta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 690, 20));

        resposta3.setBackground(new java.awt.Color(111, 2, 7));
        grupoRespostas.add(resposta3);
        resposta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resposta3.setForeground(new java.awt.Color(255, 255, 255));
        resposta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resposta3ActionPerformed(evt);
            }
        });
        jPanel3.add(resposta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 690, 20));

        resposta4.setBackground(new java.awt.Color(111, 2, 7));
        grupoRespostas.add(resposta4);
        resposta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resposta4.setForeground(new java.awt.Color(255, 255, 255));
        resposta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resposta4ActionPerformed(evt);
            }
        });
        jPanel3.add(resposta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 690, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("1 - ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setText("2 - ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setText("3 - ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setText("4 - ");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        lbPlacas.setBackground(new java.awt.Color(0, 255, 0));
        lbPlacas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPlacas.setForeground(new java.awt.Color(111, 2, 7));
        lbPlacas.setText("PLACAS");
        lbPlacas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(lbPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 70, 20));

        lbUniversitarios.setBackground(new java.awt.Color(0, 255, 0));
        lbUniversitarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbUniversitarios.setForeground(new java.awt.Color(111, 2, 7));
        lbUniversitarios.setText("UNIVERSITÁRIOS");
        lbUniversitarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(lbUniversitarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 140, 20));

        btUniversitario.setBackground(new java.awt.Color(255, 153, 51));
        btUniversitario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Student_Male_50px.png"))); // NOI18N
        btUniversitario.setToolTipText("Universitários");
        btUniversitario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btUniversitario.setOpaque(true);
        btUniversitario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btUniversitarioMouseClicked(evt);
            }
        });
        jPanel3.add(btUniversitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 50, -1));

        btPlacas.setBackground(new java.awt.Color(255, 102, 255));
        btPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Placa.png"))); // NOI18N
        btPlacas.setToolTipText("Placas");
        btPlacas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPlacas.setOpaque(true);
        btPlacas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPlacasMouseClicked(evt);
            }
        });
        jPanel3.add(btPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 50, -1));

        btPulo3.setBackground(new java.awt.Color(255, 204, 204));
        btPulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Kangaroo_50px.png"))); // NOI18N
        btPulo3.setToolTipText("Pulo 3");
        btPulo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPulo3.setOpaque(true);
        btPulo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPulo3MouseClicked(evt);
            }
        });
        jPanel3.add(btPulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 50, -1));

        lbPular.setBackground(new java.awt.Color(0, 255, 0));
        lbPular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPular.setForeground(new java.awt.Color(111, 2, 7));
        lbPular.setText("PULAR");
        lbPular.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(lbPular, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 60, 20));

        btPulo2.setBackground(new java.awt.Color(255, 204, 204));
        btPulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Kangaroo_50px.png"))); // NOI18N
        btPulo2.setToolTipText("Pulo 2");
        btPulo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPulo2.setOpaque(true);
        btPulo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPulo2MouseClicked(evt);
            }
        });
        jPanel3.add(btPulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 50, -1));

        btPulo1.setBackground(new java.awt.Color(255, 204, 204));
        btPulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Kangaroo_50px.png"))); // NOI18N
        btPulo1.setToolTipText("Pulo 1");
        btPulo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPulo1.setOpaque(true);
        btPulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPulo1MouseClicked(evt);
            }
        });
        jPanel3.add(btPulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 50, -1));

        pnlErrar.setBackground(new java.awt.Color(255, 255, 153));
        pnlErrar.setForeground(new java.awt.Color(111, 2, 7));
        pnlErrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlErrar.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jPanel3.add(pnlErrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 100, 50));

        pnlAcertar.setBackground(new java.awt.Color(255, 255, 153));
        pnlAcertar.setForeground(new java.awt.Color(111, 2, 7));
        pnlAcertar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlAcertar.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jPanel3.add(pnlAcertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 100, 50));

        pnlParar.setBackground(new java.awt.Color(255, 255, 153));
        pnlParar.setForeground(new java.awt.Color(111, 2, 7));
        pnlParar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlParar.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jPanel3.add(pnlParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 100, 50));

        btParar.setBackground(new java.awt.Color(111, 2, 7));
        btParar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btParar.setForeground(new java.awt.Color(255, 255, 255));
        btParar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btParar.setText("PARAR");
        btParar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btParar.setOpaque(true);
        btParar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPararMouseClicked(evt);
            }
        });
        jPanel3.add(btParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 130, 70));

        btConfirmar.setBackground(new java.awt.Color(111, 2, 7));
        btConfirmar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btConfirmar.setText("CONFIRMAR");
        btConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConfirmar.setOpaque(true);
        btConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConfirmarMouseClicked(evt);
            }
        });
        jPanel3.add(btConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 130, 70));

        lbCartas.setBackground(new java.awt.Color(0, 255, 0));
        lbCartas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCartas.setForeground(new java.awt.Color(111, 2, 7));
        lbCartas.setText("CARTAS");
        lbCartas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(lbCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 460, 80, 20));

        btCarta1.setBackground(new java.awt.Color(51, 255, 204));
        btCarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carta1.png"))); // NOI18N
        btCarta1.setToolTipText("Carta 1");
        btCarta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCarta1.setOpaque(true);
        btCarta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCarta1MouseClicked(evt);
            }
        });
        jPanel3.add(btCarta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, 50, -1));

        btCarta2.setBackground(new java.awt.Color(51, 255, 204));
        btCarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carta2.png"))); // NOI18N
        btCarta2.setToolTipText("Carta 2");
        btCarta2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCarta2.setOpaque(true);
        btCarta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCarta2MouseClicked(evt);
            }
        });
        jPanel3.add(btCarta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, 50, -1));

        btCarta3.setBackground(new java.awt.Color(51, 255, 204));
        btCarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carta2.png"))); // NOI18N
        btCarta3.setToolTipText("Carta 3");
        btCarta3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCarta3.setOpaque(true);
        btCarta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCarta3MouseClicked(evt);
            }
        });
        jPanel3.add(btCarta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 50, -1));

        btCarta4.setBackground(new java.awt.Color(51, 255, 204));
        btCarta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carta1.png"))); // NOI18N
        btCarta4.setToolTipText("Carta 4");
        btCarta4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCarta4.setOpaque(true);
        btCarta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCarta4MouseClicked(evt);
            }
        });
        jPanel3.add(btCarta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 540, 50, -1));

        lbParticipante1.setBackground(new java.awt.Color(0, 255, 0));
        lbParticipante1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbParticipante1.setForeground(new java.awt.Color(111, 2, 7));
        lbParticipante1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbParticipante1.setText("AJUDA");
        lbParticipante1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(lbParticipante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 140, -1));

        pnlAjuda.setBackground(new java.awt.Color(255, 255, 255));
        pnlAjuda.setBorder(null);
        jPanel3.add(pnlAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 570, 150));

        pnlAjudaBorda.setBackground(new java.awt.Color(111, 2, 7));
        pnlAjudaBorda.setBorder(null);
        jPanel3.add(pnlAjudaBorda, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 590, 170));

        pnlAlternativas.setBackground(new java.awt.Color(255, 255, 255));
        pnlAlternativas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(pnlAlternativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 760, 230));

        pnlResp1.setBackground(new java.awt.Color(111, 2, 7));
        pnlResp1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(pnlResp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 710, 40));

        pnlResp2.setBackground(new java.awt.Color(111, 2, 7));
        pnlResp2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(pnlResp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 710, 40));

        pnlResp3.setBackground(new java.awt.Color(111, 2, 7));
        pnlResp3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(pnlResp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 710, 40));

        pnlResp4.setBackground(new java.awt.Color(111, 2, 7));
        pnlResp4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(pnlResp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 710, 40));

        pnlRespostas.setBackground(new java.awt.Color(255, 255, 255));
        pnlRespostas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(pnlRespostas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 760, 180));

        lbNumPergunta.setBackground(new java.awt.Color(0, 255, 0));
        lbNumPergunta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbNumPergunta.setForeground(new java.awt.Color(111, 2, 7));
        lbNumPergunta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(lbNumPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 60, 30));

        lbPergunta.setBackground(new java.awt.Color(0, 255, 0));
        lbPergunta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbPergunta.setForeground(new java.awt.Color(111, 2, 7));
        lbPergunta.setText("PERGUNTA");
        lbPergunta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(lbPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 150, 30));

        pnlPerguntas.setBackground(new java.awt.Color(255, 255, 255));
        pnlPerguntas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(pnlPerguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 760, 210));

        pnl1.setBackground(new java.awt.Color(111, 2, 7));

        lb1Gloria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb1Gloria.setForeground(new java.awt.Color(255, 255, 255));
        lb1Gloria.setText("1 GLÓRIA");

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lb1Gloria, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1Gloria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(pnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 225, 40));

        pnl2.setBackground(new java.awt.Color(111, 2, 7));

        lb2Glorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb2Glorias.setForeground(new java.awt.Color(255, 255, 255));
        lb2Glorias.setText("2 GLÓRIAS");

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb2Glorias)
                .addGap(60, 60, 60))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb2Glorias)
                .addContainerGap())
        );

        jPanel3.add(pnl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 225, 40));

        pnl3.setBackground(new java.awt.Color(111, 2, 7));

        lb3Glorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb3Glorias.setForeground(new java.awt.Color(255, 255, 255));
        lb3Glorias.setText("3 GLÓRIAS");

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb3Glorias)
                .addGap(58, 58, 58))
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb3Glorias)
                .addContainerGap())
        );

        jPanel3.add(pnl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 225, 40));

        pnl4.setBackground(new java.awt.Color(111, 2, 7));

        lb4Glorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb4Glorias.setForeground(new java.awt.Color(255, 255, 255));
        lb4Glorias.setText("4 GLÓRIAS");

        javax.swing.GroupLayout pnl4Layout = new javax.swing.GroupLayout(pnl4);
        pnl4.setLayout(pnl4Layout);
        pnl4Layout.setHorizontalGroup(
            pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb4Glorias)
                .addGap(59, 59, 59))
        );
        pnl4Layout.setVerticalGroup(
            pnl4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb4Glorias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(pnl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 225, 40));

        pnl5.setBackground(new java.awt.Color(111, 2, 7));

        lb5Glorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb5Glorias.setForeground(new java.awt.Color(255, 255, 255));
        lb5Glorias.setText("5 GLÓRIAS");

        javax.swing.GroupLayout pnl5Layout = new javax.swing.GroupLayout(pnl5);
        pnl5.setLayout(pnl5Layout);
        pnl5Layout.setHorizontalGroup(
            pnl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb5Glorias)
                .addGap(60, 60, 60))
        );
        pnl5Layout.setVerticalGroup(
            pnl5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb5Glorias)
                .addContainerGap())
        );

        jPanel3.add(pnl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 225, 40));

        pnl6.setBackground(new java.awt.Color(111, 2, 7));

        lb6Glorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb6Glorias.setForeground(new java.awt.Color(255, 255, 255));
        lb6Glorias.setText("6 GLÓRIAS");

        javax.swing.GroupLayout pnl6Layout = new javax.swing.GroupLayout(pnl6);
        pnl6.setLayout(pnl6Layout);
        pnl6Layout.setHorizontalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb6Glorias)
                .addGap(62, 62, 62))
        );
        pnl6Layout.setVerticalGroup(
            pnl6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb6Glorias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(pnl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 225, 40));

        pnl7.setBackground(new java.awt.Color(111, 2, 7));

        lb7Glorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb7Glorias.setForeground(new java.awt.Color(255, 255, 255));
        lb7Glorias.setText("7 GLÓRIAS");

        javax.swing.GroupLayout pnl7Layout = new javax.swing.GroupLayout(pnl7);
        pnl7.setLayout(pnl7Layout);
        pnl7Layout.setHorizontalGroup(
            pnl7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb7Glorias)
                .addGap(63, 63, 63))
        );
        pnl7Layout.setVerticalGroup(
            pnl7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb7Glorias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(pnl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 225, 40));

        pnl8.setBackground(new java.awt.Color(111, 2, 7));

        lb8Glorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb8Glorias.setForeground(new java.awt.Color(255, 255, 255));
        lb8Glorias.setText("8 GLÓRIAS");

        javax.swing.GroupLayout pnl8Layout = new javax.swing.GroupLayout(pnl8);
        pnl8.setLayout(pnl8Layout);
        pnl8Layout.setHorizontalGroup(
            pnl8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb8Glorias)
                .addGap(63, 63, 63))
        );
        pnl8Layout.setVerticalGroup(
            pnl8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb8Glorias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(pnl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 225, 40));

        pnl9.setBackground(new java.awt.Color(111, 2, 7));

        lb9Glorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb9Glorias.setForeground(new java.awt.Color(255, 255, 255));
        lb9Glorias.setText("9 GLÓRIAS");

        javax.swing.GroupLayout pnl9Layout = new javax.swing.GroupLayout(pnl9);
        pnl9.setLayout(pnl9Layout);
        pnl9Layout.setHorizontalGroup(
            pnl9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb9Glorias)
                .addGap(62, 62, 62))
        );
        pnl9Layout.setVerticalGroup(
            pnl9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb9Glorias)
                .addContainerGap())
        );

        jPanel3.add(pnl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 225, 40));

        pnl10.setBackground(new java.awt.Color(111, 2, 7));

        lbArrebatado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbArrebatado.setForeground(new java.awt.Color(255, 255, 255));
        lbArrebatado.setText("ARREBATADO");

        javax.swing.GroupLayout pnl10Layout = new javax.swing.GroupLayout(pnl10);
        pnl10.setLayout(pnl10Layout);
        pnl10Layout.setHorizontalGroup(
            pnl10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbArrebatado)
                .addGap(51, 51, 51))
        );
        pnl10Layout.setVerticalGroup(
            pnl10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbArrebatado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(pnl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 225, 40));

        lbMcd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMcd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jPanel3.add(lbMcd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        lbMcd2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMcd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jPanel3.add(lbMcd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        lbMcd3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMcd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jPanel3.add(lbMcd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        lbMcd4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMcd4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jPanel3.add(lbMcd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 20));

        lbMcd5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMcd5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jPanel3.add(lbMcd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        lbMcd6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMcd6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jPanel3.add(lbMcd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 20));

        lbMcd7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMcd7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jPanel3.add(lbMcd7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        lbMcd8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMcd8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jPanel3.add(lbMcd8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, 20));

        lbMcd9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMcd9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jPanel3.add(lbMcd9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, 20));

        lbMcd10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMcd10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jPanel3.add(lbMcd10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, 20));

        pnlGlorias.setBackground(new java.awt.Color(255, 255, 255));
        pnlGlorias.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(pnlGlorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 530));

        lbParticipante2.setBackground(new java.awt.Color(0, 255, 0));
        lbParticipante2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbParticipante2.setForeground(new java.awt.Color(255, 255, 255));
        lbParticipante2.setText("PARTICIPANTE:");
        lbParticipante2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(lbParticipante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 30));

        lbAcertar.setBackground(new java.awt.Color(255, 255, 153));
        lbAcertar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAcertar.setForeground(new java.awt.Color(255, 255, 255));
        lbAcertar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAcertar.setText("ACERTAR");
        lbAcertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbAcertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 80, -1));

        lbDesistir.setBackground(new java.awt.Color(255, 255, 153));
        lbDesistir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDesistir.setForeground(new java.awt.Color(255, 255, 255));
        lbDesistir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDesistir.setText("PARAR");
        lbDesistir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbDesistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 80, -1));

        lbErrar.setBackground(new java.awt.Color(255, 255, 153));
        lbErrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbErrar.setForeground(new java.awt.Color(255, 255, 255));
        lbErrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbErrar.setText("ERRAR");
        lbErrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lbErrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 80, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 650));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCarta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCarta4MouseClicked

        sortearCarta();
    }//GEN-LAST:event_btCarta4MouseClicked

    private void btCarta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCarta3MouseClicked

        sortearCarta();
    }//GEN-LAST:event_btCarta3MouseClicked

    private void btCarta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCarta2MouseClicked

        sortearCarta();
    }//GEN-LAST:event_btCarta2MouseClicked

    private void btCarta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCarta1MouseClicked

        sortearCarta();
    }//GEN-LAST:event_btCarta1MouseClicked

    private void btConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConfirmarMouseClicked

        if (contarPerg < 10) {
            if (clickOp == 0) {
                JOptionPane.showMessageDialog(rootPane, "ESCOLHA UMA DAS ALTERNATIVAS!!");
            } else {
                if (opc == respCorreta) {
                    JOptionPane.showMessageDialog(rootPane, "CERTA RESPOSTA!!");
                    confirmarPonto();
                    grupoRespostas.clearSelection();
                    nivel++;
                    int[] vetor = gerarVetor(1, 15);
                    vt = vetor[0];
                    gerarPerguntas(vt);
                    numPerg = numPerg + 1;
                    lbNumPergunta.setText(String.valueOf(numPerg));
                } else {
                    JOptionPane.showMessageDialog(rootPane, "QUE PENA VOCÊ ERROU!!");
                    respCorreta = "";
                    Principal frmPrincipal = new Principal();
                    frmPrincipal.setVisible(true);
                    dispose();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "PARABÉNS... VOCÊ VAI SER ARREBATADO POR DEUS!!!!");
        }//fim contar nivelPerguntas
    }//GEN-LAST:event_btConfirmarMouseClicked

    public void pular(int ordemPulo) {

        int perguntaPular = JOptionPane.showOptionDialog(null, "Tem certeza que deseja pular essa pergunta?",
                "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (perguntaPular == JOptionPane.YES_OPTION) {
            int[] vetor = gerarVetor(1, 15);
            vt = vetor[0];
            gerarPerguntas(vt);
            switch (ordemPulo) {
                case 1:
                    btPulo1.setEnabled(false);
                    break;
                case 2:
                    btPulo2.setEnabled(false);
                    break;
                case 3:
                    btPulo3.setEnabled(false);
                    break;
            }
        } else {
            return;
        }
    }

    private void btPulo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPulo1MouseClicked

        pular(1);
    }//GEN-LAST:event_btPulo1MouseClicked

    private void btPulo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPulo2MouseClicked

        pular(2);
    }//GEN-LAST:event_btPulo2MouseClicked

    private void btPulo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPulo3MouseClicked

        pular(3);
    }//GEN-LAST:event_btPulo3MouseClicked

    private void btPlacasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPlacasMouseClicked

        int perguntaPular = JOptionPane.showOptionDialog(null, "Tem certeza que deseja usar as placas?",
                "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (perguntaPular == JOptionPane.YES_OPTION) {
            if (respCorreta == "resp1") {
                JOptionPane.showMessageDialog(rootPane, "SEGUNDO A PLATÉIA :\n "
                        + "50% CONCORDAM QUE A ALTENATIVA 1 É ACORRETA \n"
                        + "25% CONCORDAM QUE A ALTENATIVA 2 É ACORRETA \n"
                        + "20% CONCORDAM QUE A ALTENATIVA 3 É ACORRETA \n"
                        + "5% CONCORDAM QUE A ALTENATIVA 4 É ACORRETA");
                btPlacas.setEnabled(false);
            } else {
                if (respCorreta == "resp2") {
                    JOptionPane.showMessageDialog(rootPane, "SEGUNDO A PLATÉIA :\n "
                            + "10% CONCORDAM QUE A ALTENATIVA 1 É ACORRETA \n"
                            + "45% CONCORDAM QUE A ALTENATIVA 2 É ACORRETA \n"
                            + "30% CONCORDAM QUE A ALTENATIVA 3 É ACORRETA \n"
                            + "15% CONCORDAM QUE A ALTENATIVA 4 É ACORRETA");
                    btPlacas.setEnabled(false);

                } else {
                    if (respCorreta == "resp3") {
                        JOptionPane.showMessageDialog(rootPane, "SEGUNDO A PLATÉIA :\n "
                                + "10% CONCORDAM QUE A ALTENATIVA 1 É ACORRETA \n"
                                + "15% CONCORDAM QUE A ALTENATIVA 2 É ACORRETA \n"
                                + "60% CONCORDAM QUE A ALTENATIVA 3 É ACORRETA \n"
                                + "5% CONCORDAM QUE A ALTENATIVA 4 É ACORRETA");
                        btPlacas.setEnabled(false);
                    } else {
                        if (respCorreta == "resp4") {
                            JOptionPane.showMessageDialog(rootPane, "SEGUNDO A PLATÉIA :\n "
                                    + "10% CONCORDAM QUE A ALTENATIVA 1 É ACORRETA \n"
                                    + "20% CONCORDAM QUE A ALTENATIVA 2 É ACORRETA \n"
                                    + "30% CONCORDAM QUE A ALTENATIVA 3 É ACORRETA \n"
                                    + "40% CONCORDAM QUE A ALTENATIVA 4 É ACORRETA");
                            btPlacas.setEnabled(false);
                        }
                    }
                }
            }
        } else {
            return;
        }
    }//GEN-LAST:event_btPlacasMouseClicked

    private void btUniversitarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btUniversitarioMouseClicked
        int perguntaPular = JOptionPane.showOptionDialog(null, "Tem certeza que deseja usar a ajuda dos universitários?",
                "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (perguntaPular == JOptionPane.YES_OPTION) {
            if (respCorreta == "resp1") {
                JOptionPane.showMessageDialog(rootPane, "SEGUNDO OS UNIVERSITÁRIOS A RESPOSTA É A ALTERNATIVA 1");
                btUniversitario.setEnabled(false);
            } else {
                if (respCorreta == "resp2") {
                    JOptionPane.showMessageDialog(rootPane, "SEGUNDO OS UNIVERSITÁRIOS A RESPOSTA É A ALTERNATIVA 2");
                    btUniversitario.setEnabled(false);
                } else {
                    if (respCorreta == "resp3") {
                        JOptionPane.showMessageDialog(rootPane, "SEGUNDO OS UNIVERSITÁRIOS A RESPOSTA É A ALTERNATIVA 3");
                        btUniversitario.setEnabled(false);
                    } else {
                        if (respCorreta == "resp4") {
                            JOptionPane.showMessageDialog(rootPane, "SEGUNDO OS UNIVERSITÁRIOS A RESPOSTA É A ALTERNATIVA 4");
                            btUniversitario.setEnabled(false);
                        }
                    }
                }
            }
        } else {
            return;
        }
    }//GEN-LAST:event_btUniversitarioMouseClicked

    private void resposta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resposta4ActionPerformed

        opc = "resp4";
        clickOp = 1;
    }//GEN-LAST:event_resposta4ActionPerformed

    private void resposta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resposta3ActionPerformed

        opc = "resp3";
        clickOp = 1;
    }//GEN-LAST:event_resposta3ActionPerformed

    private void resposta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resposta2ActionPerformed

        opc = "resp2";
        clickOp = 1;
    }//GEN-LAST:event_resposta2ActionPerformed

    private void resposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resposta1ActionPerformed

        opc = "resp1";
        clickOp = 1;
    }//GEN-LAST:event_resposta1ActionPerformed

    private void btPararMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPararMouseClicked

        int perguntaParar = JOptionPane.showOptionDialog(null, "Tem certeza que deseja deseja parar?",
                "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (perguntaParar == JOptionPane.YES_OPTION) {
            Principal frmPrincipal = new Principal();
            frmPrincipal.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btPararMouseClicked

    public void controleSetasPontos(boolean lb1, boolean lb2, boolean lb3, boolean lb4, boolean lb5, boolean lb6, boolean lb7, boolean lb8, boolean lb9, boolean lb10) {

        lbMcd1.setVisible(lb1);
        lbMcd2.setVisible(lb2);
        lbMcd3.setVisible(lb3);
        lbMcd4.setVisible(lb4);
        lbMcd5.setVisible(lb5);
        lbMcd6.setVisible(lb6);
        lbMcd7.setVisible(lb7);
        lbMcd8.setVisible(lb8);
        lbMcd9.setVisible(lb9);
        lbMcd10.setVisible(lb10);
    }

    public void confirmarPonto() {

        if (nivel == 1) {
            pontosGanhos = pontosGanhos + 1000;
            controleSetasPontos(false, true, false, false, false, false, false, false, false, false);
            pnl1.setBackground(new Color(255, 255, 153));
            lb1Gloria.setForeground(new Color(111, 2, 7));
            botoesErrarDesistirAcertar("1 Glória", "0 Glória", "2 Glórias");
        } else {
            if (nivel == 2) {
                pontosGanhos = pontosGanhos + 2500;
                controleSetasPontos(false, false, true, false, false, false, false, false, false, false);
                pnl2.setBackground(new Color(255, 255, 153));
                lb2Glorias.setForeground(new Color(111, 2, 7));
                botoesErrarDesistirAcertar("2 Glórias", "1 Glória", "3 Glórias");
            } else {
                if (nivel == 3) {
                    pontosGanhos = pontosGanhos + 3000;
                    controleSetasPontos(false, false, false, true, false, false, false, false, false, false);
                    pnl3.setBackground(new Color(255, 255, 153));
                    lb3Glorias.setForeground(new Color(111, 2, 7));
                    botoesErrarDesistirAcertar("3 Glória", "2 Glória", "4 Glórias");
                } else {
                    if (nivel == 4) {
                        pontosGanhos = pontosGanhos + 3500;
                        controleSetasPontos(false, false, false, false, true, false, false, false, false, false);
                        pnl4.setBackground(new Color(255, 255, 153));
                        lb4Glorias.setForeground(new Color(111, 2, 7));
                        botoesErrarDesistirAcertar("4 Glória", "3 Glória", "5 Glórias");
                    } else {
                        if (nivel == 5) {
                            pontosGanhos = pontosGanhos + 15000;
                            controleSetasPontos(false, false, false, false, false, true, false, false, false, false);
                            pnl5.setBackground(new Color(255, 255, 153));
                            lb5Glorias.setForeground(new Color(111, 2, 7));
                            botoesErrarDesistirAcertar("5 Glória", "4 Glória", "6 Glórias");
                        } else {
                            if (nivel == 6) {
                                pontosGanhos = pontosGanhos + 25000;
                                controleSetasPontos(false, false, false, false, false, false, true, false, false, false);
                                pnl6.setBackground(new Color(255, 255, 153));
                                lb6Glorias.setForeground(new Color(111, 2, 7));
                                botoesErrarDesistirAcertar("6 Glória", "5 Glória", "7 Glórias");
                            } else {
                                if (nivel == 7) {
                                    pontosGanhos = pontosGanhos + 50000;//100.000
                                    controleSetasPontos(false, false, false, false, false, false, false, true, false, false);
                                    pnl7.setBackground(new Color(255, 255, 153));
                                    lb7Glorias.setForeground(new Color(111, 2, 7));
                                    botoesErrarDesistirAcertar("7 Glória", "6 Glória", "8 Glórias");
                                } else {
                                    if (nivel == 8) {
                                        pontosGanhos = pontosGanhos + 150000;
                                        controleSetasPontos(false, false, false, false, false, false, false, false, true, false);
                                        pnl8.setBackground(new Color(255, 255, 153));
                                        lb8Glorias.setForeground(new Color(111, 2, 7));
                                        botoesErrarDesistirAcertar("8 Glória", "7 Glória", "9 Glórias");
                                    } else {
                                        if (nivel == 9) {
                                            pontosGanhos = pontosGanhos + 25000;
                                            controleSetasPontos(false, false, false, false, false, false, false, false, false, true);
                                            pnl9.setBackground(new Color(255, 255, 153));
                                            lb9Glorias.setForeground(new Color(111, 2, 7));
                                            botoesErrarDesistirAcertar("0 Glória", "5 Glória", "Arrebatado");
                                        } else {
                                            if (nivel == 10) {
//                                                pontosGanhos = pontosGanhos + 500000;
//                                                pnl10.setBackground(new Color(255, 255, 153));
//                                                lbArrebatado.setForeground(new Color(111, 2, 7));
//                                                botoesErrarDesistirAcertar("0 Glória", "5 Glória", "Arrebatado");
                                                JOptionPane.showMessageDialog(rootPane, "PARABÉNS, VOCÊ SERÁ ARREBATADO!!");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
//Métdos para os botões de ajudas

    public void sortearCarta() {

        int[] vetor = gerarVetor(1, 4);
        vtCarta = vetor[0];
        if (vtCarta == 0) {
            //Não faz nada
        } else {
            if (vtCarta == 1) {
                switch (respCorreta) {
                    case "resp1":
                        resposta2.setText("");
                        break;
                    case "resp2":
                        resposta1.setText("");
                        break;
                    case "resp3":
                        resposta1.setText("");
                        break;
                    case "resp4":
                        resposta1.setText("");
                        break;
                }
            } else {
                if (vtCarta == 2) {
                    switch (respCorreta) {
                        case "resp1":
                            resposta2.setText("");
                            resposta3.setText("");
                            break;
                        case "resp2":
                            resposta1.setText("");
                            resposta3.setText("");
                            break;
                        case "resp3":
                            resposta1.setText("");
                            resposta2.setText("");
                            break;
                        case "resp4":
                            resposta1.setText("");
                            resposta2.setText("");
                            break;
                    }
                } else {
                    if (vtCarta == 3) {
                        switch (respCorreta) {
                            case "resp1":
                                resposta2.setText("");
                                resposta3.setText("");
                                resposta4.setText("");
                                break;
                            case "resp2":
                                resposta1.setText("");
                                resposta3.setText("");
                                resposta4.setText("");
                                break;
                            case "resp3":
                                resposta1.setText("");
                                resposta2.setText("");
                                resposta4.setText("");
                                break;
                            case "resp4":
                                resposta1.setText("");
                                resposta2.setText("");
                                resposta3.setText("");
                                break;
                        }
                    }
                }
            }
        }
        btCarta1.setEnabled(false);
        btCarta2.setEnabled(false);
        btCarta3.setEnabled(false);
        btCarta4.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btCarta1;
    private javax.swing.JLabel btCarta2;
    private javax.swing.JLabel btCarta3;
    private javax.swing.JLabel btCarta4;
    private javax.swing.JLabel btConfirmar;
    private javax.swing.JLabel btParar;
    private javax.swing.JLabel btPlacas;
    private javax.swing.JLabel btPulo1;
    private javax.swing.JLabel btPulo2;
    private javax.swing.JLabel btPulo3;
    private javax.swing.JLabel btUniversitario;
    private javax.swing.ButtonGroup grupoRespostas;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb1Gloria;
    private javax.swing.JLabel lb2Glorias;
    private javax.swing.JLabel lb3Glorias;
    private javax.swing.JLabel lb4Glorias;
    private javax.swing.JLabel lb5Glorias;
    private javax.swing.JLabel lb6Glorias;
    private javax.swing.JLabel lb7Glorias;
    private javax.swing.JLabel lb8Glorias;
    private javax.swing.JLabel lb9Glorias;
    private javax.swing.JLabel lbAcertar;
    private javax.swing.JLabel lbArrebatado;
    private javax.swing.JLabel lbCartas;
    private javax.swing.JLabel lbDesistir;
    private javax.swing.JLabel lbErrar;
    private javax.swing.JLabel lbMcd1;
    private javax.swing.JLabel lbMcd10;
    private javax.swing.JLabel lbMcd2;
    private javax.swing.JLabel lbMcd3;
    private javax.swing.JLabel lbMcd4;
    private javax.swing.JLabel lbMcd5;
    private javax.swing.JLabel lbMcd6;
    private javax.swing.JLabel lbMcd7;
    private javax.swing.JLabel lbMcd8;
    private javax.swing.JLabel lbMcd9;
    private javax.swing.JLabel lbNomeParticipante;
    private javax.swing.JLabel lbNumPergunta;
    private javax.swing.JLabel lbParticipante1;
    private javax.swing.JLabel lbParticipante2;
    private javax.swing.JLabel lbPergunta;
    private javax.swing.JLabel lbPlacas;
    private javax.swing.JLabel lbPular;
    private javax.swing.JLabel lbUniversitarios;
    private javax.swing.JTextArea pergunta;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl10;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JPanel pnl5;
    private javax.swing.JPanel pnl6;
    private javax.swing.JPanel pnl7;
    private javax.swing.JPanel pnl8;
    private javax.swing.JPanel pnl9;
    private rojerusan.RSMaterialButtonRectangle pnlAcertar;
    private rojerusan.RSMaterialButtonRectangle pnlAjuda;
    private rojerusan.RSMaterialButtonRectangle pnlAjudaBorda;
    private rojerusan.RSMaterialButtonRectangle pnlAlternativas;
    private rojerusan.RSMaterialButtonRectangle pnlErrar;
    private rojerusan.RSMaterialButtonRectangle pnlGlorias;
    private rojerusan.RSMaterialButtonRectangle pnlParar;
    private rojerusan.RSMaterialButtonRectangle pnlPegrunta;
    private rojerusan.RSMaterialButtonRectangle pnlPegruntaBorda;
    private rojerusan.RSMaterialButtonRectangle pnlPerguntas;
    private rojerusan.RSMaterialButtonRectangle pnlResp1;
    private rojerusan.RSMaterialButtonRectangle pnlResp2;
    private rojerusan.RSMaterialButtonRectangle pnlResp3;
    private rojerusan.RSMaterialButtonRectangle pnlResp4;
    private rojerusan.RSMaterialButtonRectangle pnlRespostas;
    private javax.swing.JRadioButton resposta1;
    private javax.swing.JRadioButton resposta2;
    private javax.swing.JRadioButton resposta3;
    private javax.swing.JRadioButton resposta4;
    // End of variables declaration//GEN-END:variables

}
