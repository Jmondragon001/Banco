package Principal;

import java.util.Scanner;

import Dominio.Beneficiario;
import Dominio.Clientes;
import Dominio.Tarjetas;
import LogicaApi.ImpBeneficiarios;
import LogicaApi.ImpClientes;
import LogicaApi.ImpTarjetas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long numCliente;
		String nombreC;
		String appC;
		String apmC;
		Long celularC;
		int estatusC;
		Clientes clientes = null;
		Long numCuentaT;
		String tipoTarjeta;
		String vencimientoT;
		Tarjetas tarjetas;

		String nombreB;
		String appB;
		String apmB;
		long celularB;
		String direccionB;
		Beneficiario beneficiario = null;
		int menuPrincipal, menuCliente, subMenuCliente, menuTarj, menuBenef, subMenuBen, indice;

		Scanner lectura = null;
		// instacia de clase
		ImpClientes impClientes = new ImpClientes();
		ImpTarjetas impTarjetas = new ImpTarjetas();
		ImpBeneficiarios impBeneficiarios = new ImpBeneficiarios();
		// declarar menu principal

		do {
			System.out.println(" -- Menu Bancomer -- ");
			System.out.println("1---CRUD CLIENTES");
			System.out.println("2---CRUD TARJETAS");
			System.out.println("3---CRUD BENEFICIARIO");
			System.out.println("4---SALIR ");
			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();

			switch (menuPrincipal) {
			case 1://
				do {
					System.out.println("1- Alta");
					System.out.println("2- Listar");
					System.out.println("3- Buscar");
					System.out.println("4- Editar");
					System.out.println("5- Eliminar");
					System.out.println("6- Regresar");
					lectura = new Scanner(System.in);
					menuCliente = lectura.nextInt();
					switch (menuCliente) {
					case 1:

						System.out.println("\n Ingresa el numero de cliente");
						lectura = new Scanner(System.in);
						numCliente = lectura.nextLong();
						System.out.println("\n Ingresa el nombre de cliente");
						lectura = new Scanner(System.in);
						nombreC = lectura.nextLine();
						System.out.println("\n Ingrese el apellido paterno");
						lectura = new Scanner(System.in);
						appC = lectura.nextLine();
						System.out.println("\n Ingrese el apellido materno");
						lectura = new Scanner(System.in);
						apmC = lectura.nextLine();
						System.out.println("\n Ingrese el numero celular");
						lectura = new Scanner(System.in);
						celularC = lectura.nextLong();
						System.out.println("\n Ingrese el estatus");
						lectura = new Scanner(System.in);
						estatusC = lectura.nextInt();

						clientes = new Clientes(numCliente, nombreC, appC, apmC, celularC, estatusC);
						impClientes.guardar(clientes);

						break;
					case 2:
						impClientes.listar();
						break;
					case 3:
						impClientes.indiceDescripcion();
						// impClientes.editar(indice, impBeneficiarios);
						impTarjetas.indiceDescripcion();
						System.out.println("\n Ingresa el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						// agregar el casteo
						clientes = (Clientes) impClientes.buscar(indice);
						System.out.println("se encontro " + clientes);
						break;
					case 4:
						impClientes.indiceDescripcion();
						System.out.println("\n Ingresa el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						// agregar el casteo
						clientes = (Clientes) impClientes.buscar(indice);
						System.out.println("se encontro " + clientes);
						// editar el tipo de tarjeta
						System.out.println("\n Ingresa el nuevo numero de celular");
						lectura = new Scanner(System.in);
						celularC = lectura.nextLong();
						clientes.setCelular(celularC);
						impClientes.editar(indice, clientes);
						System.out.println("se edito correctamente");
						break;
					case 5:
						impClientes.indiceDescripcion();
						System.out.println("\n Ingresa el indice a eliminar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						impClientes.eliminar(indice);
						System.out.println("se elimino correctamente");
						break;
					case 6:
						break;

					}

				} while (menuCliente < 6);
				break;

			case 2://
				do {
					System.out.println("1- Alta");
					System.out.println("2- Listar");
					System.out.println("3- Buscar");
					System.out.println("4- Editar");
					System.out.println("5- Eliminar");
					System.out.println("6- Regresar");
					lectura = new Scanner(System.in);
					menuTarj = lectura.nextInt();
					switch (menuTarj) {
					case 1:

						System.out.println("\n Ingresa el numero de cuenta");
						lectura = new Scanner(System.in);
						numCuentaT = lectura.nextLong();
						System.out.println("\n Ingresa el tipo de tarjeta");
						lectura = new Scanner(System.in);
						tipoTarjeta = lectura.nextLine();
						System.out.println("\n Ingresa la fecha de vencimiento MM/AA");
						lectura = new Scanner(System.in);
						vencimientoT = lectura.nextLine();
						tarjetas = new Tarjetas(numCuentaT, tipoTarjeta, vencimientoT);

						impTarjetas.guardar(tarjetas);
						break;
					case 2:
						impTarjetas.listar();
						break;
					case 3:
						impTarjetas.indiceDescripcion();
						System.out.println("\n Ingresa el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						// agregar el casteo
						tarjetas = (Tarjetas) impTarjetas.buscar(indice);
						System.out.println("se encontro " + tarjetas);

						break;
					case 4:
						impTarjetas.indiceDescripcion();
						System.out.println("\n Ingresa el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						// agregar el casteo
						tarjetas = (Tarjetas) impTarjetas.buscar(indice);
						System.out.println("se encontro " + tarjetas);
						// editar el tipo de tarjeta
						System.out.println("\n Ingresa el nuevo tipo de tarjeta");
						lectura = new Scanner(System.in);
						tipoTarjeta = lectura.nextLine();
						tarjetas.setTipoTarjeta(tipoTarjeta);
						impTarjetas.editar(indice, tarjetas);
						System.out.println("se edito correctamente");

						break;
					case 5:
						impTarjetas.indiceDescripcion();
						System.out.println("\n Ingresa el indice a eliminar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						impTarjetas.eliminar(indice);
						System.out.println("se elimino correctamente");
						break;
					case 6:
						break;

					}

				} while (menuTarj < 6);
				break;
			case 3://
				do {
					System.out.println("1- Alta");
					System.out.println("2- Listar");
					System.out.println("3- Buscar");
					System.out.println("4- Editar");
					System.out.println("5- Eliminar");
					System.out.println("6- Regresar");
					lectura = new Scanner(System.in);
					menuBenef = lectura.nextInt();
					switch (menuBenef) {
					case 1:
						System.out.println("\n Ingresa el nombre del Beneficiario");
						lectura = new Scanner(System.in);
						nombreB = lectura.nextLine();
						System.out.println("\n Ingresa el apellido paterno");
						lectura = new Scanner(System.in);
						appB = lectura.nextLine();
						System.out.println("\n Ingresa el apellido materno");
						lectura = new Scanner(System.in);
						apmB = lectura.nextLine();
						System.out.println("\n Ingresa el numero celular del beneficiario");
						lectura = new Scanner(System.in);
						celularB = lectura.nextLong();
						System.out.println("\n Ingresa la direccion del beneficiario");
						lectura = new Scanner(System.in);
						direccionB = lectura.nextLine();

						beneficiario = new Beneficiario(nombreB, appB, apmB, celularB, direccionB);
						impBeneficiarios.guardar(beneficiario);

						break;
					case 2:
						impBeneficiarios.listar();
						break;
					case 3:
						impBeneficiarios.indiceDescripcion();
						impTarjetas.indiceDescripcion();
						System.out.println("\n Ingresa el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						// agregar el casteo
						beneficiario = (Beneficiario) impBeneficiarios.buscar(indice);
						System.out.println("se encontro " + beneficiario);

						break;
					case 4:
						impBeneficiarios.indiceDescripcion();
						System.out.println("\n Ingresa el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						// agregar el casteo
						beneficiario = (Beneficiario) impBeneficiarios.buscar(indice);
						System.out.println("se encontro " + beneficiario);
						// editar el tipo de tarjeta
						System.out.println("\n Ingresa ela nueva direccion");
						lectura = new Scanner(System.in);
						direccionB = lectura.nextLine();
						beneficiario.setDirec(direccionB);
						impBeneficiarios.editar(indice, beneficiario);
						System.out.println("se edito correctamente");

						break;
					case 5:
						impBeneficiarios.indiceDescripcion();
						System.out.println("\n Ingresa el indice a eliminar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						impBeneficiarios.eliminar(indice);
						System.out.println("se elimino correctamente");
						break;
					case 6:
						break;

					}

				} while (menuBenef < 6);
				break;
			}
		} while (menuPrincipal < 4);
	}
}