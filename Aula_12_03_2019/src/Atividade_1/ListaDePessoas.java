/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_1;

import java.util.Scanner;

/**
 *
 * @author antonio.ncgjunior
 */
public class ListaDePessoas {

    public static void main(String[] args) {
        int opcao = 6;
        String lista[] = new String[50];
        Scanner input = new Scanner(System.in);
            while (opcao >= 6 || opcao <= 0) {
                System.out.println("Bem Vindo "
                        + "\n Selecione uma opção: "
                        + "\n 1 - Adicionar Nome"
                        + "\n 2 - Visualizar Lista"
                        + "\n 3 - Verificar se o nome está na lista"
                        + "\n 4 -  Deletar nome da lista"
                        + "\n 5 - Encerrar aplicação");
                opcao = input.nextInt();
            
            switch (opcao) {

                case 1:
                    //funçao de adicionar nome a lista
                    System.out.println("Digite o nome que deseja adicionar: ");
                    String Nome = input.next();
                    lista = AdicionarNome(lista, Nome);
                    break;

                case 2:
                    //função de percorrer o vetor e retornar somente os elementos
                    System.out.println("A lista está preenchida com os seguintes nomes: ");
                    MostrarLista(lista);
                    break;
                case 3:
                    //função de verificar se o nome se encontra na lista e retornar sua posição.
                    break;
                case 4:
                    // deletar nome da lista.
                    break;
            }
            opcao = 6;
       } 
        
    }

    public static String[] AdicionarNome(String Vetor[], String nome) {
        for (int i = 0; i < Vetor.length; i++) {
            if (Vetor[i] == null) {
                Vetor[i] = nome;
                break;
            }
        }
        return Vetor;
    }

    public static void MostrarLista(String Lista[]) {
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i] != null) {
                System.out.println(Lista[i]);
            }
        }
    }
}
