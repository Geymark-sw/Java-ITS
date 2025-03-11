
public class Abbigliamento extends Prodotto 
{

	public Abbigliamento(String nome, Double prezzo, String categoria) 
	{
		super(nome, prezzo, categoria);
	}

	@Override
	public Double calcolaSconto() 
	{
		// TODO Auto-generated method stub
		if (this.categoria.equals ("Abbigliamento invernale"))
		{
			return this.prezzo * 0.85;
		}
		else
		{
			return this.prezzo;
		}
	}

}
