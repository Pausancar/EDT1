package es.studium.Perro;

public class Perro
{
	
		
			  /* Atributos */
			  private String raza;
			  private String tamaño;
			  private int edad;
			  private String color;
			 
			  /* Constructor por defecto o vacío*/
			  public Perro () 
			  {
			    raza = "";
			    tamaño = "";
			    edad = 0;
			    color = "";
			  }
			 
			  /* Constructor con parámetros */
			  public Perro (String r, String t, int e, String c) 
			  {
				  raza = r;
				  tamaño = t;
				  edad = e;
				  color = c;
			  }
			  /* Métodos */
			  public String getRaza() {
				  return raza;
			  }
			 
			  public void setRaza(String r) {
				  raza = r;
			  }
			 
			  public String getTamaño() {
				  return tamaño;
			  }
			 
			  public void setTamaño(String t) {
				  tamaño = t;
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


