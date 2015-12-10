package yams;



public class Lance {

	/**
	 * @param args
	 */
	private De [] lancer;
	private int NBlancer;
	private int compteur;
	
	public Lance()
	
	{
		lancer = new De[5];
		int index  = 0;
		for (De face : lancer)
			{
				lancer[index++] = new De();
							
			}
	}
	
	public String toString()
	{
		String res = "";
		for (int index = 0; index < 5; index++)
		{
			res += lancer[index].getValeur();
		}
		return res;
	}

}
