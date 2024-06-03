package com.example;


public class Main {

	public static void main(String[] args) {
		
		
		Empleado[] empleados = {
				Empleado.builder().nombre("Carlos ").primerApellido(" Diaz ").segundoApellido(" Muñoz ").genero(Genero.HOMBRE).departamento(Departamento.COMPRAS).salario(4500).build(),
				Empleado.builder().nombre("Tamara ").primerApellido(" Sanchez").segundoApellido(" Diaz ").genero(Genero.MUJER).departamento(Departamento.INFORMATICA).salario(4200).build(),
				Empleado.builder().nombre("Marly ").primerApellido(" Perez ").segundoApellido(" Arias ").genero(Genero.MUJER).departamento(Departamento.CONTABILIDAD).salario(3800).build(),
				Empleado.builder().nombre("Pablo ").primerApellido(" Collado ").segundoApellido(" Jerez ").genero(Genero.HOMBRE).departamento(Departamento.COMPRAS).salario(4800).build()
				
		};
		
		
		System.out.println("Empleados :");
		for(Empleado e : empleados) 
			System.out.println(e.getNombre()+e.getPrimerApellido()+e.getSegundoApellido()+"  "+e.getGenero()+"  "+e.getDepartamento());
		
		
		
		System.out.println("\nSalario Promedio Total: ");
		
		
		double sumaSalarios = 0.0;
		int totalDePersonas = empleados.length;
		double salarioPromedio = 0.0;
		
		for(Empleado empleado : empleados) {
				sumaSalarios += empleado.getSalario();
		}
		salarioPromedio = sumaSalarios / totalDePersonas;
		
		System.out.println("El salario promedio de todos los empleados es: " + salarioPromedio);
		
		
		
		//creacion de variables por Genero
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
		
		
		for(Empleado empleado : empleados) {
			if(empleado.getGenero().equals(Genero.HOMBRE)) {
				sumatoriaSalariosHombre += empleado.getSalario();
				totalGeneroHombre++;
			}else if(empleado.getGenero().equals(Genero.MUJER)) {
				sumatoriaSalariosMujer += empleado.getSalario();
				totalGeneroMujer++;
			}else {
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
		
		
		
		//creacion de variables por Departamento
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
		
		for(Empleado empleado : empleados) {
			if(empleado.getDepartamento().equals(Departamento.INFORMATICA)) {
				sumatoriaSalariosInformatica += empleado.getSalario();
				totalDepartamentoInformatica++;
			}else if(empleado.getDepartamento().equals(Departamento.COMPRAS)) {
				sumatoriaSalariosCompras += empleado.getSalario();
				totalDepartamentoCompras++;
			}else {
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
	}

}
