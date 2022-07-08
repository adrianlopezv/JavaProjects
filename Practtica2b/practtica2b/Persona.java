
package practtica2b;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona 
{
    private Direccion direccion;
private String nombrepila,apellidopaterno,apellidomaterno,An,SS,mes1,email,NC;
private int dia,mes,anio;
Calendar fecha = new GregorianCalendar();
 private int Anio = fecha.get(Calendar.YEAR);
 private int Mes = fecha.get(Calendar.MONTH);
 private int Dia = fecha.get(Calendar.DAY_OF_MONTH);
 private int edad;
//metodo

public void setNombreCompleto()
{
	NC=getNombrepila();
	NC+=apellidopaterno;
	NC+=apellidomaterno;
}

public String getNombreCompleto()
{
	return NC;
}

public void setEmail(String Em)
{
	email=Em;
}

public boolean setDiaCompleto(int di,int me, int an)
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

public void setFechaCompleta()
{
	mes1="";
	mes1+=this.dia;
	mes1+=" ";
			switch (this.mes)
			{
				case 1: mes1+="de Enero";
				break;
				case 2:mes1+="de Febrero";
				break;
				case 3:mes1+="de Marzo";
				break;
				case 4:mes1+="de Abril";
				break;
				case 5: mes1+="de Mayo";
				break;
				case 6: mes1+="de Junio";
				break;
				case 7: mes1+="de Julio";
				break;
				case 8: mes1+="de Agosto";
				break;
				case 9:mes1+="de Septiembre";
				break;
				case 10:mes1+="de Octubre";
				break;
				case 11: mes1+="de Noviembre";
				break;
				case 12:mes1+="de Diciembre";
				break;

			}
		mes1+=" del anio ";
		mes1+=this.anio;
}

public String getFechaCompleta()
{
return mes1;
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
 SS+=   getNombrepila().substring(0,1);
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

    public void setNombrepila(String nombrepila) {
        this.nombrepila = nombrepila;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getNombrepila() {
        return nombrepila;
    }
    
    public void setDireccion(Direccion direccion)
    {
    this.direccion=direccion;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }
}
