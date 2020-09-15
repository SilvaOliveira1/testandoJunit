package br.com.controller;

public class Main {
    public static void main(String[] args) {
        Calculadora realizarCalculo = new Calculadora();
        System.out.println(realizarCalculo.somar(3, 4));
        System.out.println(realizarCalculo.dividir(3, 4));
        System.out.println(realizarCalculo.subtracao(3, 4));
        System.out.println(realizarCalculo.multiplicar(3, 4));
    }
}
