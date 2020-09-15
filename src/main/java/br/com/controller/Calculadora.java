package br.com.controller;

public class Calculadora {
    
    public float somar(float primeiroNumero, float segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    // COLOCANDO OS TIPOS DIFERENTES PROPOSITAL PARA NO TESTE ACUSAR
    public int dividir(int primeiroNumero, float segundoNumero){
        // E FORÇANDO O RESULTADO INTEIRO
        return (int) (primeiroNumero / segundoNumero);
    }

    public int multiplicar(int primeiroNumero, int segundoNumero){
        return primeiroNumero * segundoNumero;
    }
    
    public float subtracao(int primeiroNumero, int segundoNumero){
        return primeiroNumero - segundoNumero;
    }
}

