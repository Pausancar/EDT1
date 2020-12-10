package es.studium.Perro;

public class Perro
{
	
		
			  /* Atributos */
			  private String raza;
			  private String tama�o;
			  private int edad;
			  private String color;
			 
			  /* Constructor por defecto o vac�o*/
			  public Perro () 
			  {
			    raza = "";
			    tama�o = "";
			    edad = 0;
			    color = "";
			  }
			 
			  /* Constructor con par�metros */
			  public Perro (String r, String t, int e, String c) 
			  {
				  raza = r;
				  tama�o = t;
				  edad = e;
				  color = c;
			  }
			  /* M�todos */
			  public String getRaza() {
				  return raza;
			  }
			 
			  public void setRaza(String r) {
				  raza = r;
			  }
			 
			  public String getTama�o() {
				  return tama�o;
			  }
			 
			  public void setTama�o(String t) {
				  tama�o = t;
			  }
			 
			  public int getEdad() {
				  return edad;
			  }
			 
			  public void setEdad(int e) {
				  edad = e;
			  }
			 
			  public String getColor() {
				  return color;
			  }
			 
			  public void setColor(String c) {
				  color = c;
			  }

	}


