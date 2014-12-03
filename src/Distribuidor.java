public class Distribuidor {
//propiedades
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto personaContacto;

//metodos getter y setter

	public String getNombre()
			{
				return nombre;
			}
			
			public void  setNombre(String nombre1)
			{
				nombre=nombre1;
			}

	public String getCif()
			{
				return cif;
			}
			
			public void  setCif(String cif1)
			{
				cif=cif1;
			}


	public Direccion getDireccion()
			{
				return direccion;
			}
			
			public void  setDireccion(Direccion direccion1)
			{
				direccion=direccion1;
			}


	public Contacto getPersonaContacto()
			{
				return personaContacto;
			}
			
			public void  setPersonaContacto(Contacto personaContacto1)
			{
				personaContacto=personaContacto1;
			}
}