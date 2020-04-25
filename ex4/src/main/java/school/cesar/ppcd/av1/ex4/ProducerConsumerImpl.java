package school.cesar.ppcd.av1.ex4;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerImpl implements ProducerConsumer {

	List<SomeRequest> na_fila = new LinkedList();
	// Admitam que o tamanho do Buffer é de 2 elementos. Sintam-se a vontade para escolher a estrutura de dados a ser utilizada no buffer.
	int BUFFER_SIZE = 2;
	int tamanho;

	public synchronized void produce(SomeRequest request) {
		// TODO Auto-generated method stub
		try {
			wait();
		} 
		catch (Exception e){
			//TODO: handle exception
			e.printStackTrace();
		}
		this.na_fila.add(request);

		tamanho = this.na_fila.size();
		int tamanhoAtual = tamanho;

		if (tamanhoAtual == 1){
			notifyAll();
		}
	}

	public SomeRequest consume() {
		// TODO Auto-generated method stub

		
		return null;
	}

}
