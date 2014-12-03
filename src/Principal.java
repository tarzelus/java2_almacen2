import java.util.*;
import java.io.*;

public class Principal {

public static void main (String args[]) throws IOException{		
		Scanner sc = new Scanner(System.in);

		
		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		try{
			String ruta = "/home/zubiri/Proyectosjava/java2_almacen/src/distribuidores.txt";
 			File archivo2 = new File(ruta);
			FileReader leer2 = new FileReader (archivo2);
			BufferedReader bf2 = new BufferedReader(leer2);
			String salida2 = bf2.readLine();

	        
	        
	        String [] cortarString = null;
	        String [] cortarString1 = null;	
	        String [] cortarString2 = null;	
	        String [] cortarString3 = null;	

	       
	        while(salida2!=null){
	        	//separa el string de la  linea usara el ; como referencia de la separacion
	        	cortarString = salida2.split("#");
	        
	        	
	       		Distribuidor distribuidor = new Distribuidor();
	       		cortarString1 = cortarString[0].split(",");
	       		distribuidor.setNombre (cortarString1[0]);
	       		distribuidor.setCif (cortarString1[1]);

	       		Direccion direccion = new Direccion();
	       		cortarString2 = cortarString[1].split(",");
	       		direccion.setCiudad  (cortarString2[0]);
	       		direccion.setCalle  (cortarString2[1]);
	       		direccion.setPiso  (cortarString2[2]);
	       		direccion.setPortal  (Integer.parseInt(cortarString2[3]));
	       		direccion.setCodPostal  (Integer.parseInt(cortarString2[4]));
	       		distribuidor.setDireccion(direccion);

	       		Contacto contacto = new Contacto();
	       		cortarString3 = cortarString[2].split(",");
	       		contacto.setNombre (cortarString3[0]);
	       		contacto.setApellido (cortarString3[1]);
	       		contacto.setDni (cortarString3[2]);
	       		contacto.setEmail (cortarString3[3]);
	       		contacto.setTelefono (Integer.parseInt(cortarString3[4]));
	       		distribuidor.setPersonaContacto(contacto);
	       		
	       	
	       		
	       		
	       		distribuidores.add(distribuidor);
	       		

	       		
	       		
	       		salida2 = bf2.readLine();
	        }

	        //-----------------Introducccion de datos de las manzanas------------------

	        ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
	        
	        ArrayList<String> distribuman = new ArrayList<String>();
	        ArrayList<String> distribuleche = new ArrayList<String>();
	        ArrayList<String> distribulechu = new ArrayList<String>();
			for (int m=0 ; m<2 ; m++){
				Manzana manzana = new Manzana();
				System.out.println("Introduce el tipo de manzana: ");
				manzana.setTipoManzana(sc.next());
				System.out.println("Introduce la procedencia de la manzana: ");
				manzana.setProcedencia(sc.next());
				System.out.println("Introduce el color de la manzana: ");
				manzana.setColor(sc.next());
				System.out.println("Introduce la cantidad de kilos de la manzana: ");
				manzana.setEurosKilo(sc.nextDouble());
				System.out.println("Introduce el nombre del distribuidor de la manzana: ");
				String di = sc.next();
				distribuman.add(di);

				manzanas.add(manzana);
			
			}

			//-----------------Introducccion de datos de la leche------------------

			ArrayList<Leche> leches = new ArrayList<Leche>();
				System.out.println("**************leche************** ");
			for (int l=0 ; l<2 ; l++){
				Leche leche = new Leche();
				System.out.println("Introduce el tipo de leche: ");
				leche.setTipo(sc.next());
				System.out.println("Introduce la procedencia de la leche: ");
				leche.setProcedencia(sc.next());
				System.out.println("Introduce la cantidad de litros de leche: ");
				leche.setEurosLitro(sc.nextDouble());
				System.out.println("Introduce el nombre del distribuidor de la leche: ");
				String di = sc.next();
				distribuleche.add(di);
				leches.add(leche);
			
			}

			//-----------------Introducccion de datos de las lechugas ------------------

				ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
				System.out.println("**************lechugas************** ");
			for (int g=0 ; g<=0 ; g++){
				Lechuga lechuga = new Lechuga();
				System.out.println("Introduce el tipo de lechuga: ");
				lechuga.setTipoLechuga(sc.next());
				System.out.println("Introduce la procedencia de la lechuga: ");
				lechuga.setProcedencia(sc.next());
				System.out.println("Introduce el color de la lechuga: ");
				lechuga.setColor(sc.next());
				System.out.println("Introduce las unidades de lechuga: ");
				lechuga.setEurosUnidad(sc.nextDouble());
				System.out.println("Introduce el nombre del distribuidor de la lechuga: ");
				String di = sc.next();
				distribulechu.add(di);

				lechugas.add(lechuga);
			
			}

			//---------impresion de las manzanas con sus respectivos distribuidores-------------
			System.out.println(" \n\n**************manzanas**************" );
			for (int m=0 ; m < manzanas.size(); m++){

				System.out.println(" \n\nTipo de manzana: "+manzanas.get(m).getTipoManzana() );
	            System.out.println(" \nProcedencia: "+manzanas.get(m).getProcedencia());
	            System.out.println(" \nColor : "+manzanas.get(m).getColor() );
	            System.out.println(" \nEuros Kilo: "+manzanas.get(m).getEurosKilo());

	           
		        for(int d=0; d<distribuidores.size(); d++)
	        	{
	        		if (distribuman.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
	            	System.out.println("  -------Distribuidor de la manzana-----------");
	            	
	            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
	            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
	            		//---
	            		System.out.println(" \n 	Direccion:" );
	            		System.out.println(" \n     	Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
	            		System.out.println(" \n     	Calle: "+ distribuidores.get(d).getDireccion().getCalle());
	            		System.out.println(" \n    		Piso: "+ distribuidores.get(d).getDireccion().getPiso());
	            		System.out.println(" \n     	Portal: "+ distribuidores.get(d).getDireccion().getPortal());
	            		System.out.println(" \n     	Codigo Postal: "+ distribuidores.get(d).getDireccion().getCodPostal());
	            		//---
	            		System.out.println(" \n 	Contacto: " );
	            		System.out.println(" \n    		Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
	            		System.out.println(" \n     	Apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
	            		System.out.println(" \n    		DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
	            		System.out.println(" \n     	Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
	            		System.out.println(" \n     	Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
	            		}
	        	}
	        }

	        	//---------impresion de la leche con sus respectivos distribuidores-------------
	        System.out.println(" \n\n**************Leche**************" );
			for (int m=0 ; m < leches.size(); m++){

				System.out.println(" \n\nTipo de leche: "+leches.get(m).getTipo() );
	            System.out.println(" \nProcedencia: "+leches.get(m).getProcedencia());
	            System.out.println(" \nEuros Litro: "+leches.get(m).getEurosLitro());

	           
		        for(int d=0; d<distribuidores.size(); d++)
	        	{
	        		if (distribuleche.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
	            	System.out.println("  -------Distribuidor de la leche-----------");
	            	
	            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
	            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
	            		//---
	            		System.out.println(" \n 	Direccion:" );
	            		System.out.println(" \n     	Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
	            		System.out.println(" \n     	Calle: "+ distribuidores.get(d).getDireccion().getCalle());
	            		System.out.println(" \n     	Piso: "+ distribuidores.get(d).getDireccion().getPiso());
	            		System.out.println(" \n     	Portal: "+ distribuidores.get(d).getDireccion().getPortal());
	            		System.out.println(" \n     	Codigo Postal: "+ distribuidores.get(d).getDireccion().getCodPostal());
	            		//---
	            		System.out.println(" \n 	Contacto: " );
	            		System.out.println(" \n    		Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
	            		System.out.println(" \n     	Apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
	            		System.out.println(" \n     	DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
	            		System.out.println(" \n     	Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
	            		System.out.println(" \n     	Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
	            		}
	        	}	
		    }

			//---------impresion de las lechugas con sus respectivos distribuidores-------------
		    System.out.println(" \n\n**************lechugas**************" );
			for (int lechu=0 ; lechu < lechugas.size(); lechu++){

				System.out.println(" \n\nTipo de lechuga: "+lechugas.get(lechu).getTipoLechuga() );
	            System.out.println(" \nProcedencia: "+lechugas.get(lechu).getProcedencia());
	            System.out.println(" \nColor : "+lechugas.get(lechu).getColor() );
	            System.out.println(" \nEuros Unidad: "+lechugas.get(lechu).getEurosUniad());

	           
		        for(int d=0; d<distribuidores.size(); d++)
	        	{
	        		if (distribulechu.get(lechu).equalsIgnoreCase(distribuidores.get(d).getNombre())){
	            	System.out.println("  -------Distribuidor de la lechuga-----------");
	            	
	            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
	            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
	            		//---
	            		System.out.println(" \n 	Direccion:" );
	            		System.out.println(" \n    		Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
	            		System.out.println(" \n     	Calle: "+ distribuidores.get(d).getDireccion().getCalle());
	            		System.out.println(" \n     	Piso: "+ distribuidores.get(d).getDireccion().getPiso());
	            		System.out.println(" \n     	Portal: "+ distribuidores.get(d).getDireccion().getPortal());
	            		System.out.println(" \n     	Codigo Postal: "+ distribuidores.get(d).getDireccion().getCodPostal());
	            		//---
	            		System.out.println(" \n 	Contacto: " );
	            		System.out.println(" \n     	Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
	            		System.out.println(" \n     	Apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
	            		System.out.println(" \n     	DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
	            		System.out.println(" \n     	Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
	            		System.out.println(" \n     	Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
	            		}
	        	}
	        }
	    }catch(Exception ioe){
	    	System.out.println("Error: "+ioe);
	    }

}
}