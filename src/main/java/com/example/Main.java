package com.example;

public class Main {

	public static void main(String[] args) {

		// rama_2

		Empleado[] empleados = {
				Empleado.builder().nombre("Carlos ").primerApellido(" Diaz ").segundoApellido(" Muñoz ")
						.genero(Genero.HOMBRE).departamento(Departamento.COMPRAS).salario(4500).build(),
				Empleado.builder().nombre("Tamara ").primerApellido(" Sanchez").segundoApellido(" Diaz ")
						.genero(Genero.MUJER).departamento(Departamento.INFORMATICA).salario(4200).build(),
				Empleado.builder().nombre("Marly ").primerApellido(" Perez ").segundoApellido(" Arias ")
						.genero(Genero.MUJER).departamento(Departamento.CONTABILIDAD).salario(3800).build(),
				Empleado.builder().nombre("Pablo ").primerApellido(" Collado ").segundoApellido(" Jerez ")
						.genero(Genero.HOMBRE).departamento(Departamento.COMPRAS).salario(4800).build()

		};

		System.out.println("Empleados :");
		for (Empleado e : empleados)
			System.out.println(e.getNombre() + e.getPrimerApellido() + e.getSegundoApellido() + "  " + e.getGenero()
					+ "  " + e.getDepartamento());

		System.out.println("\nSalario Promedio Total: ");

		double sumaSalarios = 0.0;
		int totalDePersonas = empleados.length;
		double salarioPromedio = 0.0;

		for (Empleado empleado : empleados) {
			sumaSalarios += empleado.getSalario();
		}
		salarioPromedio = sumaSalarios / totalDePersonas;

		System.out.println("El salario promedio de todos los empleados es: " + salarioPromedio);

		// creacion de variables por Genero
		System.out.println("\nSalario Promedio Por Genero: ");
		double sumatoriaSalariosHombre = 0.0;
		double sumatoriaSalariosMujer = 0.0;
		double sumatoriaSalariosOtro = 0.0;

		int totalGeneroHombre = 0;
		int totalGeneroMujer = 0;
		int totalGeneroOtro = 0;

		double salarioPromedioHombres = 0.0;
		double salarioPromedioMujeres = 0.0;
		double salarioPromedioOtros = 0.0;

		for (Empleado empleado : empleados) {
			if (empleado.getGenero().equals(Genero.HOMBRE)) {
				sumatoriaSalariosHombre += empleado.getSalario();
				totalGeneroHombre++;
			} else if (empleado.getGenero().equals(Genero.MUJER)) {
				sumatoriaSalariosMujer += empleado.getSalario();
				totalGeneroMujer++;
			} else {
				sumatoriaSalariosOtro += empleado.getSalario();
				totalGeneroOtro++;
			}
		}

		salarioPromedioHombres = sumatoriaSalariosHombre / totalGeneroHombre;
		salarioPromedioMujeres = sumatoriaSalariosMujer / totalGeneroMujer;
		salarioPromedioOtros = sumatoriaSalariosOtro / totalGeneroOtro;

		System.out.println("Salario promedio de los Hombres: " + salarioPromedioHombres);
		System.out.println("Salario promedio de las Mujeres: " + salarioPromedioMujeres);
		System.out.println("Salario promedio de Otros Generos: " + salarioPromedioOtros);

		
		
		// creacion de variables por Departamento
		System.out.println("\nSalario Promedio Por Departamento: ");
		double sumatoriaSalariosInformatica = 0.0;
		double sumatoriaSalariosCompras = 0.0;
		double sumatoriaSalariosContabilidad = 0.0;

		int totalDepartamentoInformatica = 0;
		int totalDepartamentoCompras = 0;
		int totalDepartamentoContabilidad = 0;

		double salarioPromedioInformatica = 0.0;
		double salarioPromedioCompras = 0.0;
		double salarioPromedioContabilidad = 0.0;

		for (Empleado empleado : empleados) {
			if (empleado.getDepartamento().equals(Departamento.INFORMATICA)) {
				sumatoriaSalariosInformatica += empleado.getSalario();
				totalDepartamentoInformatica++;
			} else if (empleado.getDepartamento().equals(Departamento.COMPRAS)) {
				sumatoriaSalariosCompras += empleado.getSalario();
				totalDepartamentoCompras++;
			} else {
				sumatoriaSalariosContabilidad += empleado.getSalario();
				totalDepartamentoContabilidad++;
			}
		}

		salarioPromedioInformatica = sumatoriaSalariosInformatica / totalDepartamentoInformatica;
		salarioPromedioCompras = sumatoriaSalariosCompras / totalDepartamentoCompras;
		salarioPromedioContabilidad = sumatoriaSalariosContabilidad / totalDepartamentoContabilidad;

		System.out.println("Salario promedio del Dpto de Informatica es: " + salarioPromedioInformatica);
		System.out.println("Salario promedio del Dpto de Compras: " + salarioPromedioCompras);
		System.out.println("Salario promedio del Dpt de Contabilidad: " + salarioPromedioContabilidad);

		
		
		// rama_4
		//Array que permita almacenar tanto objetos empleados como objetos estudiantes
		System.out.println("\nArray de Empleados y Estudiantes: ");
		
		
		Object[] objetos = {
				
			Empleado.builder().nombre("Carlos ").primerApellido(" Diaz ").segundoApellido(" Muñoz ")
					.genero(Genero.HOMBRE).departamento(Departamento.COMPRAS).salario(4500).build(),
			Empleado.builder().nombre("Tamara ").primerApellido(" Sanchez").segundoApellido(" Diaz ")
					.genero(Genero.MUJER).departamento(Departamento.INFORMATICA).salario(4200).build(),
			Empleado.builder().nombre("Marly ").primerApellido(" Perez ").segundoApellido(" Arias ")
					.genero(Genero.MUJER).departamento(Departamento.CONTABILIDAD).salario(3800).build(),
			Empleado.builder().nombre("Pablo ").primerApellido(" Collado ").segundoApellido(" Jerez ")
					.genero(Genero.HOMBRE).departamento(Departamento.COMPRAS).salario(4800).build(),
				
			Estudiante.builder().nombre("Cristina").primerApellido(" Caceres ").segundoApellido(" Perez ")
					.genero(Genero.MUJER).facultad(Facultad.IDIOMAS).totalAsignaturasMatriculadas(4).build(),
			Estudiante.builder().nombre("Camilo").primerApellido(" Maldonado ").segundoApellido(" Gil ")
					.genero(Genero.HOMBRE).facultad(Facultad.INGENIERIA).totalAsignaturasMatriculadas(6).build(),
			Estudiante.builder().nombre("Martin").primerApellido(" Castro ").segundoApellido(" Gomez ")
					.genero(Genero.HOMBRE).facultad(Facultad.MEDICINA).totalAsignaturasMatriculadas(6).build(),
			Estudiante.builder().nombre("Luisa").primerApellido(" Pinto ").segundoApellido(" Diaz ")
					.genero(Genero.MUJER).facultad(Facultad.INGENIERIA).totalAsignaturasMatriculadas(3).build(),
		};
		
		
		
		
		for(Object o : objetos) {
    		if(o instanceof Empleado empleado) {
    			System.out.println("Empleados:"+empleado.getNombre());} 
    		else if (o  instanceof Estudiante estudiante) {
    			System.out.println("Estudiantes:" + estudiante.getNombre());
    		}
    	}
		
		
		
		
		// rama_5
				//Array que permita almacenar tanto objetos empleados como objetos estudiantes
		System.out.println("\n\n rama_5 Array Estudiantes Mujeres con asignaturas >= al promedio de facultades: \n");
		
		Estudiante[] students = {
		Estudiante.builder().nombre("Lina").primerApellido(" Caceres ").segundoApellido(" Perez ")
			.genero(Genero.MUJER).facultad(Facultad.IDIOMAS).totalAsignaturasMatriculadas(4).build(),
		Estudiante.builder().nombre("Pedro").primerApellido(" Torres ").segundoApellido(" Gil ")
			.genero(Genero.HOMBRE).facultad(Facultad.INGENIERIA).totalAsignaturasMatriculadas(6).build(),
		Estudiante.builder().nombre("Melina").primerApellido(" Castro ").segundoApellido(" Gomez ")
			.genero(Genero.MUJER).facultad(Facultad.MEDICINA).totalAsignaturasMatriculadas(6).build(),
		Estudiante.builder().nombre("Fernanda").primerApellido(" Pinto ").segundoApellido(" Diaz ")
			.genero(Genero.MUJER).facultad(Facultad.INGENIERIA).totalAsignaturasMatriculadas(3).build(),
		Estudiante.builder().nombre("Lina").primerApellido(" Vargas ").segundoApellido(" Sanchez")
			.genero(Genero.MUJER).facultad(Facultad.IDIOMAS).totalAsignaturasMatriculadas(8).build(),
		Estudiante.builder().nombre("Pedro").primerApellido(" Maldonado ").segundoApellido(" Tamayo ")
			.genero(Genero.HOMBRE).facultad(Facultad.INGENIERIA).totalAsignaturasMatriculadas(9).build(),
		Estudiante.builder().nombre("Sergio").primerApellido(" Iglesias ").segundoApellido(" Camavinga ")
			.genero(Genero.HOMBRE).facultad(Facultad.MEDICINA).totalAsignaturasMatriculadas(3).build(),
		Estudiante.builder().nombre("Patricia").primerApellido(" Pinto ").segundoApellido(" Quiroz ")
			.genero(Genero.MUJER).facultad(Facultad.INGENIERIA).totalAsignaturasMatriculadas(3).build(),
};
		
		
		
		
		for (Estudiante mujeres : students) {
			if (mujeres.getGenero().equals(Genero.MUJER)) {
				System.out.println("Estudiantes Mujeres :" + mujeres.getNombre() + " " + Genero.MUJER + " " );
			} else  {
				;
			} 
	
			
			
			//Creacion de variables por Facultad
		
			double sumaAsignaturasIngenieria = 0.0;
			double sumaAsignaturasMedicina = 0.0;
			double sumaAsignaturasIdiomas = 0.0;

			int totalIngenieria = 0;
			int totalMedicina = 0;
			int totalIdiomas = 0;

			double AsignaturasPromedioIngenieria = 0.0;
			double AsignaturasPromedioMedicina = 0.0;
			double AsignaturasPromedioIdiomas = 0.0;
			
			
		
			for (Estudiante estu : students) {
				if (estu.getGenero().equals(Genero.MUJER)) {
					sumaAsignaturasIngenieria = estu.getTotalAsignaturasMatriculadas();
					totalIngenieria++;
				} else if (estu.getGenero().equals(Genero.MUJER)) {
					sumaAsignaturasMedicina += estu.getTotalAsignaturasMatriculadas();
					totalMedicina++;
				} else  {
					sumaAsignaturasIdiomas += estu.getTotalAsignaturasMatriculadas();
					totalIdiomas++;
				}
			}
			
		
			AsignaturasPromedioIngenieria = sumaAsignaturasIngenieria / totalIngenieria;
			AsignaturasPromedioMedicina = sumaAsignaturasMedicina / totalMedicina;
			AsignaturasPromedioIdiomas = sumaAsignaturasIdiomas / totalIdiomas;
		
			
			
			System.out.println("Asignaturas promedio de Ingenieria: " + AsignaturasPromedioIngenieria);
			System.out.println("Asignaturas promedio de Medicina: "  + AsignaturasPromedioMedicina);
			System.out.println("Asignaturas promedio de Idiomas: " + AsignaturasPromedioIdiomas);
		
				
		
		}
	}
}
