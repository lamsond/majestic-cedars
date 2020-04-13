package org.whrhs.dlamson.csa.piday;

public class Abby {
	public static void main(String[] args)
	{
		boolean pi=false;
		double x =1;
		int count = 0;
		double sum =0;
		while(pi==false)
		{
			if(count%2==0)
			{
				sum=sum+(1/x);
			}
			else
			{
				sum=sum-(1/x);
			}
			count++;
			x+=2;
			System.out.println(sum*4);
			System.out.println(Math.PI);
			System.out.println("");
			if((sum*4)==Math.PI)
			{
				pi=true;
			}
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				
			}
		}
	}

}
