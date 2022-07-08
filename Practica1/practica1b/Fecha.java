
package practica1b;

public class Fecha {
    public int dia,mes,anio;
public String Mes;

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
return Mes;
}

public String setFechaCompleta()
{
	 Mes=" ";
	Mes+=this.dia;
	Mes+=" ";
			switch (this.mes)
			{
				case 1: Mes+="de Enero";
				break;
				case 2:Mes+="de Febrero";
				break;
				case 3:Mes+="de Marzo";
				break;
				case 4:Mes+="de Abril";
				break;
				case 5: Mes+="de Mayo";
				break;
				case 6: Mes+="de Junio";
				break;
				case 7: Mes+="de Julio";
				break;
				case 8: Mes+="de Agosto";
				break;
				case 9:Mes+="de Septiembre";
				break;
				case 10:Mes+="de Octubre";
				break;
				case 11: Mes+="de Noviembre";
				break;
				case 12:Mes+="de Diciembre";
				break;

			}
		Mes+=" del anio ";
		Mes+=this.anio;
		return Mes;
}
}
