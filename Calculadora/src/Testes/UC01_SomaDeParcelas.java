package Testes;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Servico.Calculadora;

public class UC01_SomaDeParcelas {

	
	static Calculadora calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	calc = new Calculadora ();
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test (expected = RuntimeException.class)
	public void CT01UC01SomaDeParcelas_com_sucesso() {
		assertEquals("resultado =",4,calc.soma("2,x,1"));
//		fail("Not yet implemented");
	}

}
