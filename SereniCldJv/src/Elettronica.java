
public class Elettronica extends Prodotto
{

	public Elettronica(String nome, Double prezzo, String categoria) 
	{
		super(nome, prezzo, categoria);
	}
	
	@Override
	public Double calcolaSconto() 
	{
		// TODO Auto-generated method stub
		if (this.prezzo > 500.00)
		{
			return this.prezzo * 0.90;
		}
		else
		{
			return this.prezzo;
		}
	}



}
