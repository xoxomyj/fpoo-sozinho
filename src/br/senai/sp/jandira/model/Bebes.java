package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Bebes {

    String nome, genero, idBebe;
    int idade;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarBebes() {
        System.out.println("********* Cadastre o Bebê ***********");
        System.out.println("Insira o nome do bebê: ");
        nome = scanner.nextLine();
        System.out.println("Insira o gênero do bebê: ");
        genero = scanner.nextLine();
        System.out.println("Insira a idade do bebê: ");
        idade = scanner.nextInt();
        System.out.println("Insira o ID de matricúla do bebê: ");
        idBebe = scanner.nextLine();

        if (idade <= 2) {
            System.out.println("O bebê está matriculado há menos de 3 anos na creche.");
        } else {
            System.out.println("O bebê está matriculado há mais de 3 anos na creche");
        }
    }
}
