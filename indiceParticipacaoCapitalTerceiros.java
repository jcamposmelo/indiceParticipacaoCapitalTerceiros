public class ParticipacaoCapitalTerceiros {
	public static void main(String[] args) {
		double passivoCirculante = 1500000;
		double exigivelLongoPrazo = 130000;
		double patrimonioLiquido = 2500000;
		
		double participacaoCapitalTerceiros;
		
		participacaoCapitalTerceiros = (passivoCirculante + exigivelLongoPrazo) / patrimonioLiquido;
		
		System.out.println("O índice calculado em Participação do Capital de Terceiros é? " + 
		participacaoCapitalTerceiros);
	}

}