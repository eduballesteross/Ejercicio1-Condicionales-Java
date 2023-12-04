package edu.EjercicioCondicionales1.Servicios;

public class OperativaImplementacion implements OperativaInterfaz {

	@Override
	public void Aprobacion(int nota, int edad, char sexo) {
		
		if (nota>=5 && edad>=18 && sexo=='m' ||nota>=5 && edad>=18 && sexo=='M') {
			System.out.println("POSIBLE");
		}else if (nota>=5 && edad>=18 && sexo=='f' ||nota>=5 && edad>=18 && sexo=='F') {
			System.out.println("ACEPTADO");
		}else {
				System.out.println("NO ACEPTADO");
		}
			
	}

	
	
}
