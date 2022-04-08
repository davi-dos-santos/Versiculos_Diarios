package com.verciculos.versiculosdiarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView verciculos;
    private Button gerar_verciculos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verciculos = findViewById(R.id.verciculos);
        gerar_verciculos = findViewById(R.id.gerar_verciculos);

        getSupportActionBar().hide();

        gerar_verciculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] vercicosDiarios = {
                        "'A saber: Se, com a tua boca, confessares ao Senhor Jesus e, em teu coração, creres que Deus o ressuscitou dos mortos, serás salvo. \nRomanos 10:9'",
                        "'Antes, santificai a Cristo, como Senhor, em vosso coração; e estai sempre preparados para responder com mansidão e temor a qualquer que vos pedir a razão da esperança que há em vós. \n1 Pedro 3:15'",
                        "'Àquele que não conheceu pecado, o fez pecado por nós; para que, nele, fôssemos feitos justiça de Deus. \n2 Coríntios 5:21'",
                        "'Assim que, se alguém está em Cristo, nova criatura é: as coisas velhas já passaram; eis que tudo se fez novo. \n2 Coríntios 5:17'",
                        "'Assim resplandeça a vossa luz diante dos homens, para que vejam as vossas boas obras e glorifiquem o vosso Pai, que está nos céus. \nMateus 5:16'",
                        "'Bem-aventurado o varão que sofre a tentação; porque, quando for provado, receberá a coroa da vida, a qual o Senhor tem prometido aos que o amam. \nTiago 1:12'",
                        "'Cheguemos, pois, com confiança ao trono da graça, para que possamos alcançar misericórdia e achar graça, a fim de sermos ajudados em tempo oportuno. \nHebreus 4:16'",
                        "'Como o orvalho do Hermom, que desce sobre os montes de Sião; porque ali o Senhor ordena a bênção e a vida para sempre. \nSalmos 133:3'",
                        "'Confessai as vossas culpas uns aos outros e orai uns pelos outros, para que sareis; a oração feita por um justo pode muito em seus efeitos. \nTiago 5:16'",
                        "'Confia no Senhor de todo o teu coração e não te estribes no teu próprio entendimento. \nProvérbios 3:5'",
                        "'Conhecemos o amor nisto: que ele deu a sua vida por nós, e nós devemos dar a vida pelos irmãos. \n1 João 3:16'",
                        "'Contra essas coisas não há lei. \nGálatas 5:23'",
                        "'De sorte que a fé é pelo ouvir, e o ouvir pela palavra de Deus. \nRomanos 10:17'",
                        "'Deixo-vos a paz, a minha paz vos dou; não vo-la dou como o mundo a dá. Não se turbe o vosso coração, nem se atemorize. \nJoão 14:27'",
                        "'Deleita-te também no Senhor, e ele te concederá o que deseja o teu coração. \nSalmos 37:4'",
                        "'Disse-lhe Jesus: Eu sou a ressurreição e a vida; quem crê em mim, ainda que esteja morto, viverá. \nJoão 11:25'",
                        "'Disse-lhe Jesus: Eu sou o caminho, e a verdade, e a vida. Ninguém vem ao Pai senão por mim. \nJoão 14:6'",
                        "'E a paz de Deus, que excede todo o entendimento, guardará os vossos corações e os vossos sentimentos em Cristo Jesus. \nFilipenses 4:7'",
                        "'É como o óleo precioso sobre a cabeça, que desce sobre a barba, a barba de Arão, e que desce à orla das suas vestes. \nSalmos 133:2'",
                        "'E criou Deus o homem à sua imagem; à imagem de Deus o criou; macho e fêmea os criou. \nGênesis 1:27'",
                        "'E disse Deus: Façamos o homem à nossa imagem, conforme a nossa semelhança; e domine sobre os peixes do mar, e sobre as aves dos céus, e sobre o gado, e sobre toda a terra, e sobre todo réptil que se move sobre a terra. \nGênesis 1:26'",
                        "'E disse o Senhor, em visão, a Paulo: Não temas, mas fala e não te cales. \nAtos 18:9'",
                        "'E disse-lhes Pedro: Arrependei-vos, e cada um de vós seja batizado em nome de Jesus Cristo para perdão dos pecados, e recebereis o dom do Espírito Santo. \nAtos 2:38'",
                        "'E disse-me: A minha graça te basta, porque o meu poder se aperfeiçoa na fraqueza.\nDe boa vontade, pois, me gloriarei nas minhas fraquezas, para que em mim habite o poder de Cristo. \n2 Coríntios 12:9'",
                        "'E em nenhum outro há salvação, porque também debaixo do céu nenhum outro nome há, dado entre os homens, pelo qual devamos ser salvos. \nAtos 4:12'",
                        "'E ficou ali um ano e seis meses, ensinando entre eles a palavra de Deus. \nAtos 18:11'",
                        "'E Jesus disse-lhe: Amarás o Senhor, teu Deus, de todo o teu coração, e de toda a tua alma, e de todo o teu pensamento. \nMateus 22:37'",
                        "'E não vos conformeis com este mundo, mas transformai-vos pela renovação do vosso entendimento, para que experimenteis qual seja a boa, agradável e perfeita vontade de Deus. \nRomanos 12:2'",
                        "'E sabemos que todas as coisas contribuem juntamente para o bem daqueles que amam a Deus, daqueles que são chamados por seu decreto. \nRomanos 8:28'",
                        "'E, chegando-se Jesus, falou-lhes, dizendo: É-me dado todo o poder no céu e na terra. \nMateus 28:18'",
                        "'E, tudo quanto fizerdes, fazei-o de todo o coração, como ao Senhor e não aos homens. \nColossenses 3:23'",
                        "'Ele te declarou, ó homem, o que é bom; e que é o que o Senhor pede de ti, senão que pratiques a justiça, e ames a beneficência, e andes humildemente com o teu Deus? Miquéias 6:8'",
                        "'Ensinando-as a guardar todas as coisas que eu vos tenho mandado; e eis que eu estou convosco todos os dias, até à consumação dos séculos. \nAmém! Mateus 28:20'",
                        "'Já estou crucificado com Cristo; e vivo, não mais eu, mas Cristo vive em mim; e a vida que agora vivo na carne vivo-a na fé do Filho de Deus, o qual me amou e se entregou a si mesmo por mim. \nGálatas 2:20'",
                        "'Lançando sobre ele toda a vossa ansiedade, porque ele tem cuidado de vós. \n1 Pedro 5:7'",
                        "'Levando ele mesmo em seu corpo os nossos pecados sobre o madeiro, para que, mortos para os pecados, pudéssemos viver para a justiça; e pelas suas feridas fostes sarados. \n1 Pedro 2:24'",
                        "'Mas a todos quantos o receberam deu-lhes o poder de serem feitos filhos de Deus: aos que creem no seu nome. \nJoão 1:12'",
                        "'Mas buscai primeiro o Reino de Deus, e a sua justiça, e todas essas coisas vos serão acrescentadas. \nMateus 6:33'",
                        "'Mas Deus prova o seu amor para conosco em que Cristo morreu por nós, sendo nós ainda pecadores. \nRomanos 5:8'",
                        "'Mas ele foi ferido pelas nossas transgressões e moído pelas nossas iniquidades; o castigo que nos traz a paz estava sobre ele, e, pelas suas pisaduras, fomos sarados. \nIsaías 53:5'",
                        "'Mas o fruto do Espírito é: amor, gozo, paz, longanimidade, benignidade, bondade, fé, mansidão, temperança. \nGálatas 5:22'",
                        "'Mas os que esperam no Senhor renovarão as suas forças e subirão com asas como águias; correrão e não se cansarão; caminharão e não se fatigarão. \nIsaías 40:31'",
                        "'Mas recebereis a virtude do Espírito Santo, que há de vir sobre vós; e ser-me-eis testemunhas tanto em Jerusalém como em toda a Judeia e Samaria e até aos confins da terra. \nAtos 1:8'",
                        "'Meus irmãos, tende grande gozo quando cairdes em várias tentações Tiago 1:2'",
                        "'Na verdade, na verdade vos digo que quem ouve a minha palavra e crê naquele que me enviou tem a vida eterna e não entrará em condenação, mas passou da morte para a vida. \nJoão 5:24'",
                        "'Não deixando a nossa congregação, como é costume de alguns; antes, admoestando-nos uns aos outros; e tanto mais quanto vedes que se vai aproximando aquele Dia. \nHebreus 10:25'",
                        "'Não estejais inquietos por coisa alguma; antes, as vossas petições sejam em tudo conhecidas diante de Deus, pela oração e súplicas, com ação de graças. \nFilipenses 4:6'",
                        "'Não se aparte da tua boca o livro desta Lei; antes, medita nele dia e noite, para que tenhas cuidado de fazer conforme tudo quanto nele está escrito; porque, então, farás prosperar o teu caminho e, então, prudentemente te conduzirás. \nJosué 1:8'",
                        "'Não temas, porque eu sou contigo; não te assombres, porque eu sou o teu Deus; eu te esforço, e te ajudo, e te sustento com a destra da minha justiça. \nIsaías 41:10'",
                        "'Não to mandei eu? Esforça-te e tem bom ânimo; não pasmes, nem te espantes, porque o Senhor, teu Deus, é contigo, por onde quer que andares. \nJosué 1:9'",
                        "'Não veio sobre vós tentação, senão humana; mas fiel é Deus, que vos não deixará tentar acima do que podeis; antes, com a tentação dará também o escape, para que a possais suportar. \n1 Coríntios 10:13'",
                        "'Não vem das obras, para que ninguém se glorie. \nEfésios 2:9'",

                };

                Random random = new Random();
                int numeros = random.nextInt(vercicosDiarios.length);

                verciculos.setText((vercicosDiarios[numeros]));

            }
        });


    }
}