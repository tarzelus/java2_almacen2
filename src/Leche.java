public class Leche {

//propiedades
private String tipo;
private String procedencia;
private Double eurosLitro;
private Distribuidor distribuidor;

//métodos getter y setter

public String getTipo()
		{
			return tipo;
		}
		
		public void  setTipo(String tipo1)
		{
			tipo=tipo1;
		}

		public String getProcedencia()
		{
			return procedencia;
		}
		
		public void  setProcedencia(String procedencia1)
		{
			procedencia=procedencia1;
		}

		

		public Double getEurosLitro()
		{
			return eurosLitro;
		}
		
		public void  setEurosLitro(Double eurosLitro1)
		{
			eurosLitro=eurosLitro1;
		}

		public Distribuidor getDistribuidor()
		{
			return distribuidor;
		}
		
		public void  setDistribuidor(Distribuidor distribuidor1)
		{
			distribuidor=distribuidor1;
		}




}