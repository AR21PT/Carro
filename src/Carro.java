

/**
 * A classe Carro cont�m m�todos para realizar as opera��es  b�sicas.
 * 
 * <ul>
 * <li> Meter combust�vel </li>
 *   <li> Andar </li>
 *    <li> Parar </li>
 * </ul>
 * @author AR21PT
 *
 */

public class Carro {
	
	static private final double consumo=5.5; // litros por 100 klm
	
	private double quantidadeCombustivel;
	private double capacidadeDeposito;
	
	// Construtor por defeito 
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	// Acessores 

	public static double getConsumo() {
		return consumo;
	}

	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	
	// M�todos 
	
	/**
	 * Meter Combust�vel
	 * 
	 * @param quantidade quantidade do combustivel
	 * 
	 *
	 */
	
	public void meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o dep�sito
		// Podia retornar os Litros Metidos 
		quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		
	}
	
	/**
	 * Meter combust�vel
	 * 
	 * @return litrosMeter litros a meter 
	 */
	
	// atestar o dep�sito
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	/**
	 * Distancia em KM
	 * 
	 * @param distancia distancia percorrida
	 * @return true or false 
	 */
	
	
	// distancia em klm
	public boolean andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return true;
		}
		else {
			
			// Aqui ou simplesmente n�o percorre qualquer distancia 
			// ou anda at� parar porque fica sem combust�vel 
			return false;
		}
			
			
	}
	
	
	/**
	 *  simula o ato de conduzir o ve�culo ao longo de uma certa dist�ncia;
	 * 
	 * @return true 
	 */
	
	
	public boolean parar() {
		
		// se estiver a andar p�ra 
		// falta a flag que indica se o carro est� em andamento
		return true;
	}
	
	/**
	 *  indica o n�mero de km que podem ser percorridos com o atual n�vel do dep�sito
	 * 
	 * @return autonomia 
	 */
	
	// kmCombustivel( )    
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
