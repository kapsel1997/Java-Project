package project;

public class Rope
{

	double[] l;
	double l0;
	double r;
	Object m1,m2;
	Rope(Object mm1, Object mm2 )
	{
		l=new double[3];
		m1=mm1;
		m2=mm2;
		l[0]=Math.abs(m1.x-m2.x);
		l[1]=Math.abs(m1.y-m2.y);
		l[2]=Math.abs(m1.z-m2.z);
	
		l0=Math.sqrt(Math.pow(l[0],2)+Math.pow(l[1],2)+Math.pow(l[2],2));
		
		//System.out.println(Math.toRadians(180));
		//System.out.println("l="+l);
	}
	/*void calculateAlpha(Object mm1,Object mm2)
	{
		
		//r=Math.sqrt(Math.pow((mm2.x-mm1.x), 2)+Math.pow((mm2.y-mm1.y),2));
		//System.out.println(r);
		alfa=(Math.atan2((mm2.y-mm1.y),(mm2.x-mm1.x)));
		//System.out.println(alfa*180/Math.PI);
		/*if(Math.abs(mm1.x-mm2.x)==0)
		{
			alfa=-Math.PI/2;
		}
		else if((mm2.y-mm1.y)>=0 && (mm2.x-mm1.x)>=0)
		{
			alfa=(Math.atan((mm2.y-mm1.y)/(mm2.x-mm1.x)));
			System.out.println("alfa1: "+ alfa*180/Math.PI);
		}
		else if((mm2.y-mm1.y)>0 && (mm2.x-mm1.x)<0)
		{
			alfa=(Math.atan((mm2.y-mm1.y)/(mm2.x-mm1.x)))+Math.PI;
			System.out.println("alfa2: "+ alfa*180/Math.PI);
			
		}
		else if((mm2.y-mm1.y)<=0 && (mm2.x-mm1.x)<=0)
		{
			alfa=Math.abs(Math.atan((mm2.y-mm1.y)/(mm2.x-mm1.x)))+Math.PI;
			System.out.println("alfa3: "+ alfa*180/Math.PI);
			
		}
		else if((mm2.y-mm1.y)<0 && (mm2.x-mm1.x)>0)
		{
			alfa=(Math.atan((mm2.y-mm1.y)/(mm2.x-mm1.x)))+2*Math.PI;
			System.out.println("alfa4: "+ alfa*180/Math.PI);
			
			
		}*/

		
	}*/
	
	double calculate
	
	double[3] calculateDelta(Object mm1,Object mm2)//oblicza rozciagniecie sprezyny we wszystkich kierunkach
	{
		
		double[] deltal = new double[3];
		double l = Math.sqrt(Math.pow(l[0],2)+Math.pow(l[1],2)+Math.pow(l[2],2));
		double div = (l-l0)/l;
		deltal[0] = l[0]*div;
		deltal[1] = l[1]*div;
		deltal[2] = l[2]*div;
		return deltal[];
		
	}
	
}
