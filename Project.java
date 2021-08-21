package com.cjfc.main;

import java.util.Random;
import java.util.Scanner;

public class Sla {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  Random random = new Random();
  
  
  int tentativas = 5;
  int numeroRandom = random.nextInt(10);
  boolean fim = false;
  
  while (tentativas > 0 || fim == false){
      System.out.println("Digite um numero de 0 a 100.");
      int numeroDoJogador = input.nextInt();
      
      if(numeroDoJogador < numeroRandom){
        
        tentativas --;
        System.out.println("O numero digitado é menor que o numero correto.");
        
      }
      if(numeroDoJogador > numeroRandom){
        
        tentativas --;
        System.out.println("O numero digitado é maior que o numero correto.");
      }
      if(numeroDoJogador == numeroRandom){
        System.out.println("O numero digitado é igual ao numero correto.");
        System.out.println();
        System.out.println("Você acertou.");
        fim = true;
      }
      if(tentativas == 0){
        System.out.println("Suas tentativas acabaram.");
      }
      if(fim == true){
        break;
      }
    
   }
   
  }

}
