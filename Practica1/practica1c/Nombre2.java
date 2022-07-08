
package practica1c;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Nombre2 
{
public String Mes1,An,SS,NC;
    public String nombrepila;
    public String apellidopaterno;
    public String apellidomaterno;
    public int dia,mes,anio;
Calendar fecha = new GregorianCalendar();
 public int Anio = fecha.get(Calendar.YEAR);
 public int Mes = fecha.get(Calendar.MONTH);
 public int Dia = fecha.get(Calendar.DAY_OF_MONTH);
 public int edad;

    public String getNombrepila() {
        return nombrepila;
    }

    public void setNombrepila(String nombrepila) {
        this.nombrepila = nombrepila;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }
    
    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

public boolean setDiaC(int di,int me, int an)
{
Boolean g=false;

	if(an>=0)
	{
		if(me>=1 && me<=12)
		{
			switch(me)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: if (di>0&&di<32)
			{
				g=true;
			}
			break;
				case 4:
				case 6:
				case 9:
				case 11: if (di>0&&di<31)
			{
				g= true;
			}
			break;
			case 2:
			if(an%4==0 && an%100!=0 ||an%400==0)
			{
				if (di>0&&di<30)
				{
				g= true;
				}
			}
			else
			{
				if (di>0&&di<29)
				{
				g= true;
				}
			}

		 break;

			}
		}
dia=di;
anio=an;
mes=me;
	}


return g;
}

public String getFechaCompleta()
{
return Mes1;
}

public void setFechaCompleta()
{
	 Mes1=" ";
	Mes1+=this.dia;
	Mes1+=" ";
			switch (this.mes)
			{
				case 1: Mes1+="de Enero";
				break;
				case 2:Mes1+="de Febrero";
				break;
				case 3:Mes1+="de Marzo";
				break;
				case 4:Mes1+="de Abril";
				break;
				case 5: Mes1+="de Mayo";
				break;
				case 6: Mes1+="de Junio";
				break;
				case 7: Mes1+="de Julio";
				break;
				case 8: Mes1+="de Agosto";
				break;
				case 9:Mes1+="de Septiembre";
				break;
				case 10:Mes1+="de Octubre";
				break;
				case 11: Mes1+="de Noviembre";
				break;
				case 12:Mes1+="de Diciembre";
				break;

			}
		Mes1+=" del anio ";
		Mes1+=this.anio;

}

public void setEdad()
{
	edad=Anio-anio;
	if(Mes==mes)
	{
		if(Dia<dia)
		{
			edad=edad-1;
		}
	}
	else
	{
		if(Mes<mes)
		{
			edad=edad-1;
		}
	}

}

public int getEdad()
{
	return edad;
}

public void setRFC()
{

 SS=apellidopaterno.substring(0,2);
 SS+=apellidomaterno.substring(0,1);
 SS+=nombrepila.substring(0,1);
 An=""+anio;
 An=An.substring(2,4);
 SS+=An;
 if(mes<10)
 {
	SS+=""+0; 
 }
 An=""+mes;
 An+=""+dia;
  SS+=An; 

}

public String getRFC()
{
 return SS;
}

public void setNomc()
{
	NC=nombrepila;
	NC+=apellidopaterno;
	NC+=apellidomaterno;
}

public String getNomc()
{
	return NC;
}
}
