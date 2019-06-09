package agenda;

public class Contacto {
	public String nombre;
	String numero;
	public String email;	

	public Contacto(String nombre,String numero,String email){
		this.nombre=nombre;
		this.numero=numero;
		this.email=email;
	}

	public Contacto(String nombre,String numero){
		this.nombre=nombre;
		this.numero=numero;
		this.email="";
	}
	public Contacto(String nombre){
		this.nombre=nombre;
		this.numero=null;
		this.email=null;
	}

	public Contacto(){		
	}

	public String getNombre(){		
		return this.nombre;
	}

	public String getNumero(){		
		return this.numero;
	}

	public String getEmail(){		
		return this.email;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}	

	public void setNumero(String numero){
		this.numero=numero;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public void DatosContacto(){
		System.out.println("Nombre: "+getNombre());
		System.out.println("Telefono: "+ getNumero());
		System.out.println("Email: "+this.getEmail());
	}	

	public static float suma(float a, float b){		
		return a+b;
	}

}