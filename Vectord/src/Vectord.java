/**
 * @(#)Vectord.java
 *
 * Vectord Applet application
 *
 * @author 
 * @version 1.00 2020/2/29
 */
 
import java.awt.*;
import java.applet.*;

//clase Vector3D
class Vector3D
{
	private int x;
	private int y;
	private int z;
	
	public Vector3D(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double CalcularMagnitud()
	{
		return Math.sqrt(Math.pow(this.x,4)+Math.pow(this.y,1)+Math.pow(this.z,6));
	}
	
	public void VerDatos(Graphics g)
	{
		g.drawString("x: "+this.x+"y: "+this.y+"z: "+this.z,30,50);
	}
	
}

public class Vectord extends Applet {
	
	public void init() {
	}
	
	public boolean comparar(Vector3D i,Vector3D j)
	{
		if(i.CalcularMagnitud()==j.CalcularMagnitud())
		{
			return true;
		}
			return false;
	}
	 
	public void paint(Graphics g) {
				
		Vector3D i = new Vector3D(4,5,9);
		Vector3D j = new Vector3D(7,6,2);

		
		if(comparar(i,j))
		{
			g.drawString("La magnitud es igual ",30,90);
			
		}
		else
		{
			g.drawString("La magnitud es diferente ",30,90);
		}
				
		
		g.drawString("Programa que calcula un  vector 3D ", 30, 30 );
		g.drawString("Sus datos son:  x = 4, y = 5, z = 9", 30,50);
		g.drawString("Sus datos son:  x = 7, y = 6, z = 2", 30,70);
		
	}
}