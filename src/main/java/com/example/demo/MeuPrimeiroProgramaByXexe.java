package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MeuPrimeiroProgramaByXexe {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		String palavraDigitada = "";

		System.out.print("Digite a capital do Brasil: ");
		palavraDigitada = sc.next();

		if(!palavraDigitada.equalsIgnoreCase("brasilia") && !palavraDigitada.equalsIgnoreCase("brasília")) {
			System.out.println("Você errou :(");
		}
		else {
			System.out.println("Você acertou \\o/ ");
		}
	}
}