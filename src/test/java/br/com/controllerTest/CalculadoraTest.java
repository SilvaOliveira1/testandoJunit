package br.com.controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.controller.Calculadora;

public class CalculadoraTest {

	
	Calculadora calculadora = new Calculadora();
	
	//***Realizando testes na função de subtração, para verificar se está retornando
	//o valor correto e aceitando os parâmetros certos.
	
	@Test
	@DisplayName("Teste de subtração de inteiros")
	void testarSubtrairInteiro() {
		assertEquals(2, calculadora.subtracao(10, 8));
	}
	
	@Test
	@DisplayName("Teste de subtração de caracteres")
	void testarSubtrairCaracteres() {
		assertEquals("AB", calculadora.subtracao('A', 'B'));
	}
	
	@Test
	@DisplayName("Teste de subtração de floats")
	void testarSubtrairFloat() {
		assertEquals(2.6, calculadora.subtracao(5.1F, 2.5F));
	}
}
