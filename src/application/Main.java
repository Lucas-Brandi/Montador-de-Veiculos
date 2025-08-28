package application;

import Entities.components.*;
import Entities.models.*;
import enums.*;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(" MONTADOR DE VEÍCULOS ");
            int opcao = 0;
            while (true) {
                try {
                    System.out.println("1 - Criar Carro");
                    System.out.println("2 - Criar Moto");
                    System.out.print("Escolha uma opção: ");
                    opcao = sc.nextInt();
                    sc.nextLine();
                    if (opcao == 1 || opcao == 2) break;
                    else System.out.println("Opção inválida, tente novamente.\n");
                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números 1 ou 2.");
                    sc.nextLine();
                }
            }

            // Entradas de marca e modelo
            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            // Selecionar combustível
            Combustivel combustivel = null;
            while (combustivel == null) {
                try {
                    System.out.println("Combustíveis disponíveis:");
                    for (Combustivel c : Combustivel.values()) {
                        System.out.println("- " + c);
                    }
                    System.out.print("Digite o combustível: ");
                    combustivel = Combustivel.valueOf(sc.next().toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Combustível inválido, tente novamente.\n");
                }
            }

            // Selecionar cor
            Cor cor = null;
            while (cor == null) {
                try {
                    System.out.println("Cores disponíveis:");
                    for (Cor c : Cor.values()) {
                        System.out.println("- " + c);
                    }
                    System.out.print("Digite a cor: ");
                    cor = Cor.valueOf(sc.next().toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Cor inválida, tente novamente.\n");
                }
            }

            // Motor
            double potencia = 0;
            while (true) {
                try {
                    System.out.print("Potência do motor : ");
                    potencia = sc.nextDouble();
                    if (potencia > 0) break;
                    else System.out.println("A potência deve ser maior que zero.");
                } catch (InputMismatchException e) {
                    System.out.println("Digite um número válido para a potência.");
                    sc.nextLine();
                }
            }
            Motor motor = new Motor("Motor Padrão", potencia);

            sc.nextLine();
            System.out.print("Tipo de freio : ");
            String tipoFreio = sc.nextLine();
            Freio freio = new Freio(tipoFreio);

            System.out.print("Tipo de pneu : ");
            String tipoPneu = sc.nextLine();
            Pneu pneu = new Pneu(tipoPneu);

            System.out.print("Tipo de suspensão : ");
            String tipoSuspensao = sc.nextLine();
            Suspensao suspensao = new Suspensao(tipoSuspensao);

            // Criando veículo
            if (opcao == 1) {
                int portas = 0;
                while (true) {
                    try {
                        System.out.print("Número de portas: ");
                        portas = sc.nextInt();
                        if (portas > 1) break;
                        else System.out.println(" O carro deve ter pelo menos 2 portas.");
                    } catch (InputMismatchException e) {
                        System.out.println(" Digite um número válido.");
                        sc.nextLine();
                    }
                }
                Carro carro = new Carro(marca, modelo, freio, motor, pneu, suspensao, combustivel, cor, portas);

                System.out.println("\n CARRO CRIADO COM SUCESSO ");
                carro.fichaTecnica();
                carro.acelerar();

            } else if (opcao == 2) {
                boolean temBau = false;
                while (true) {
                    try {
                        System.out.print("A moto tem baú? ( responda com true ou false): ");
                        temBau = sc.nextBoolean();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Digite apenas true ou false.");
                        sc.nextLine();
                    }
                }
                Moto moto = new Moto(marca, modelo, freio, motor, pneu, suspensao, combustivel, cor, temBau);

                System.out.println("\n MOTO CRIADA COM SUCESSO ");
                moto.fichaTecnica();
                moto.acelerar();
            }

        } finally {
            System.out.println("\n Obrigado por usar o Montador de Veículos!");
            sc.close();
        }
    }
}
