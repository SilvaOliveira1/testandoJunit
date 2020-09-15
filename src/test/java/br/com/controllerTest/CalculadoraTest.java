package br.com.controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.controller.Calculadora;

public class CalculadoraTest {

	
	Calculadora calculadora = new Calculadora();
	
	//***Realizando testes na função de somar, para verificar se está retornando
	//o valor correto e aceitando os parâmetros certos.
	
	@Test
	@DisplayName("Teste de soma de inteiros")
	void testarSomaInteiro() {
		assertEquals(10, calculadora.somar(5, 5));
	}
	
	@Test
	@DisplayName("Teste de soma de caracteres")
	void testarSomaCaracteres() {
		assertEquals("AB", calculadora.somar('A', 'B'));
	}
	
	@Test
	@DisplayName("Teste de soma de floats")
	void testarSomaFloat() {
		assertEquals(5, calculadora.somar(2.5F, 2.5F));
	}
}
