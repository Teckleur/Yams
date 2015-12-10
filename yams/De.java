package yams;

import java.util.Random;


public class De {

	/**
	 * @param args
	 */
	
			private int valeur;
			Random rand = new Random();
			int Alea = 1+rand.nextInt(6);
			
			public De()
			{
				this.valeur = Alea;
				
			}
			
			public int getValeur()
			{
				return valeur;
			}
		}


