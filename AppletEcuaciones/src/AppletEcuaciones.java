/**
 * @(#)AppletEcuaciones.java
 *
 * AppletEcuaciones Applet application
 *
 * @author 
 * @version 1.00 2020/3/1
 */
 
import java.awt.*;
import java.applet.*;

//clase ecuaciones de primer y segundo grado
class Ecuaciones
{
	int A;
	int B;
	int C;
	double num, respuesta;
	double opcion1, opcion2;
	
	public Ecuaciones(int A, int B, int C)
	{
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public double Calcular()
	{
		opcion1= -B+Math.sqrt(Math.pow(this.B,2)+4*A*C)/(2*A); 
		opcion1= -B+Math.sqrt(Math.pow(this.B,2)+4*A*C)/(2*A);	
		return opcion1;	
	}
	
	public void VerDatos(Graphics g)
	{
		g.drawString("A: "+this.A+"B: "+this.B+"C:"+this.C,30,40);
	}
	

}
public class AppletEcuaciones extends Applet {
	
	public boolean Comparar(Ecuaciones x0, Ecuaciones x1)
	{
		if(x0.Calcular()>0)
		{
			return true;
		}
		return false;
	}
	
	public void init() {
	}
	
	

	public void paint(Graphics g) {
		
		Ecuaciones x0 = new Ecuaciones(2,4,5);
		Ecuaciones x1 = new Ecuaciones(1,2,3);
		
		if(Comparar(x0,x1))
		{
			g.drawString("Raiz real",40,0);
		}
		else
		{
			g.drawString("La raiz no existe",40,30);
		}
		
		
	}
}