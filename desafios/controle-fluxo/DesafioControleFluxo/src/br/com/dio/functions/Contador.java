package br.com.dio.functions;

import br.com.dio.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
	private void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println("Erro: " + exception.getMessage());
		}
		
	}
}