package meuapp;

import java.io.IOException;
public class Exemplo {
    public static void main(String[] args) throws IOException{

        System.out.println("Olá Mundo!");

        char ch;

        ch ='X';

        System.out.println("ch contais " + ch);

        ch++; //incrementa ch

        System.out.println("ch is now " + ch);

        ch = 90; // dá a ch o valor Z

        System.out.println("ch is now " + ch);

        // Tipo Primitivos
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBoolean = true;

        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipotipoInt = " + tipoInt);
        System.out.println("Valor do tipotipoLong = " + tipoLong);
        System.out.println("Valor do tipotipoBoolean = " + tipoBoolean);

        // Demonstra sequência de escape em strings.
        System.out.println("\nFirst Line\nSecond Line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF\n");

        //Demonstra valores booleanos.
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // Um valor booleano pode controlar a instrução if

        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is executed.");
         b = true;

        System.out.println(" 10 > 9 is " + (10 > 9));

        // Demonstra o escopo de bloco.

        int m; // conhecida pelo codigo dentro de main()
        m = 10;
        if(m ==10){ // inicia novo escopo
            int n = 20; // conhecida apenas nesse bloco.
            // tanto m quanto n são conhecidas aqui.
            System.out.println("m and n: " + m + " " + n );
            m = n * 2;
        }

        // n = 100; // Erro! n não é conhecida aqui
        // m ainda é conhecida aqui.
        System.out.println("m is " + m);

        // Demonstra o tempo de vida de uma variável.
        for (int i = 0; i < 3; i++){
            int j = -1; // y será inicializada sempre que entrarmos no bloco
            System.out.println("j is now: " + j); // essa linha sempre exibe -1
            j = 100;
            System.out.println("j is now: " +j);
        }

        // Demonstra os operadores relacionais e lógicos.
        int i, j;
        boolean b1, b2;
        i = 100;
        j = 11;
        if(i < j) System.out.println("\n i < j");
        if(i <= j) System.out.println("\n i <= j");
        if(i != j) System.out.println("\n i != j");
        if(i == j) System.out.println("this won´t execute");
        if(i >= j) System.out.println("this won´t execute");

        b1 = true;
        b2 = false;
      //  if(b1 & b2)
    }
}
