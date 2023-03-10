/**
 * @(#)AppletHora.java
 *
 * AppletHora Applet application
 *
 * @author 
 * @version 1.00 2020/2/29
 */
 
import java.awt.*;
import java.applet.*;

class IncrementoHora
{
	int Hora;
	int Minutos;
	int Segundos;
	
	public void IncrementoHora(int Hora, int Minutos, int Segundos)
	{
		this.Hora = Hora;
		this.Minutos = Minutos;
		this.Segundos = Segundos;
	}
	
	//Incrementar la hora ejemplo
	//04:59:59
	//05:00:00
	//=============================
			
	public boolean  Calcular()
	{
		Segundos=Segundos+1;
		if(this.Segundos>=60)
		{
			Segundos=0;
			Minutos = Minutos+1;
			
			if(this.Minutos>=60)
			{
				Minutos=0;
				Hora = Hora+1;
			}
			return true;
		}
		return false;
			
	}
	
	public void VerDatos(Graphics g)
	{
		g.drawString("Su hora es: "+this.Hora+": "+this.Minutos+": "+this.Segundos,30,40);

	}		
	
}

public class AppletHora extends Applet {
	
	
	public void init() {
	}

	public void paint(Graphics g) {
		
		IncrementoHora h = new IncrementoHora(12,23,59);
		h.VerDatos(g);					
		g.drawString("Su hora se incremento: ", 30, 90 );		
		
	}
}