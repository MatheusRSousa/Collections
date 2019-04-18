package Collections1;



public class MeuArrayList<T> {
	private static final int TAMANHO_INICIAL = 5;
	Object[] array = new Object[TAMANHO_INICIAL];
	private int tamanho;
	
	
	public void add(Object object) throws NullPointerException{
		if (object == null) {
			throw new NullPointerException();
		}
		if(tamanho == array.length) {
			Object[] novoArray = new Object[tamanho+TAMANHO_INICIAL];
			for (int i = 0; i < array.length; i++) {
				novoArray[i] = array[i];
			}
			array=novoArray;
		}
		array[tamanho] = object;
		tamanho++;
		
	}
	
	public void add(int index, Object object) throws IndexOutOfBoundsException{
		if(index >= tamanho || index < 0 || tamanho == 0) {
			throw new IndexOutOfBoundsException("index invalido");
		}
		array[index] = object;
		
	}
	
	public void remove(Object object) {
		boolean achou = false;
		if(object != null && tamanho > 0) {
			int pos = 0;
			Object[] novoArray = new Object[tamanho];
			for (int i = 0; i < array.length; i++) {
				if(array[i] == object) {
					achou = true;
					array[i] = null;
					break;
				}
			}
			if(achou) {
				for (int i = 0; i < array.length; i++) {
					if(array[i]!=null) {
						novoArray[pos] = array[i];
						pos++;
					}
				}
				tamanho--;
				array = novoArray;
			}
		}
		
	}
	
	public void remove(int index) throws IndexOutOfBoundsException{
		if(index >= tamanho || index < 0 || tamanho == 0) {
			throw new IndexOutOfBoundsException("index invalido");
		}
	
		int pos = 0;
		Object[] novoArray = new Object[tamanho];
		array[index] = null;
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=null) {
				novoArray[pos] = array[i];
				pos++;
			}
		}
		tamanho--;
		array = novoArray;
		
	}
	
	public void set(int index, Object object) throws IndexOutOfBoundsException{
		if(index < 0 || index >= tamanho || tamanho == 0) {
			throw new IndexOutOfBoundsException("index invalido");
		}
		array[index] = object;

	}
	
	public Object get(int index) throws IndexOutOfBoundsException{
		if(index < 0 || index >= tamanho || tamanho == 0) {
			throw new IndexOutOfBoundsException("index invalido");
		}
		return array[index];
		
	}
	
	public int size() {
		return tamanho;
	}

}
