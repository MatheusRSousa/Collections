package Collections1;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;

class MeuArrayListTest {


	@Test
	void testAdd() {
		MeuArrayList<Object> array = new MeuArrayList<Object>();
		array.add("Matheus");
		assertEquals(1, array.size());
		array.add("cafe");
		array.add("bala");
		array.add("hamurabi");
		assertEquals("bala", array.get(2));
		try {
			array.add(-1, "galinha");
			assertTrue("não disparou a exception", false);
		} catch (IndexOutOfBoundsException e) {
			assertTrue("disparou a exception", true);
		}
		array.add(2,"novo");
		assertEquals("novo", array.get(2));
	}
	
	@Test
	void testeRemove() {
		MeuArrayList<Object> array = new MeuArrayList<Object>();
		try {
			array.remove(0);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
		array.add("Matheus");
		array.remove(0);
		assertEquals(0, array.size());
		array.add("Matheus1");
		array.add("cana");
		array.add("maconha");
		array.remove("cana");
		assertEquals("maconha", array.get(1));
		try {
			array.remove(-1);
			assertTrue("Não disparou a exception", false);
		} catch (IndexOutOfBoundsException e) {
			assertTrue("Disparou a exception",true);
		}
		try {
			array.remove(2);
			assertTrue("não disparou a exception",false);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
		
		
	}
	
	@Test 
	void testeGet() {
		MeuArrayList<Object> array = new MeuArrayList<Object>();
		try {
			array.add(null);
			assertTrue(false);
		} catch (NullPointerException e) {
			assertTrue(true);
		}
		try {
			array.get(0);
			assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
		array.add("Matheus1");
		array.add("Matheus2");
		assertEquals("Matheus2", array.get(1));
		try {
			array.get(-1);
			assertTrue("não disparou a exception", false);
		} catch (IndexOutOfBoundsException e) {
			assertTrue("disparou a exception",true);
		}
		
		try {
			array.get(2);
			assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void testSet() {
		MeuArrayList<Object> array = new MeuArrayList<Object>();
		try {
			array.set(0, "feijão");
			assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(e.getMessage(),true);
		}
		array.add("paçoca");
		array.add("cuscuz");
		array.add("bolo");
		array.set(2, "pao");
		assertEquals("pao", array.get(2));
		try {
			array.set(3, "bolacha");
			assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(e.getMessage(),true);
		}
		
		try {
			array.set(-1, "carne");
			assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			assertTrue(e.getMessage(), true);
		}
	}
	
	@Test 
	void testSize() {
		MeuArrayList<Object> array = new MeuArrayList<Object>();
		assertEquals(0, array.size());
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		assertEquals(5, array.size());
		array.remove(3);
		assertEquals(4, array.size());
	}

}
