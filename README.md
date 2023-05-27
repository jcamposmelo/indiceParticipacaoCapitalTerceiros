# indiceParticipacaoCapitalTerceiros
Participação de capital de terceiros demonstra quanto do capital de terceiros é utilizado para manutenção e continuidade da empresa, ou seja, é o grau de endividamento, dependência de fontes externas a empresa. O ideal é esse índice ser inferior a 0,6, porque capital de terceiros normalmente incide juros ou encargos.

```
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
