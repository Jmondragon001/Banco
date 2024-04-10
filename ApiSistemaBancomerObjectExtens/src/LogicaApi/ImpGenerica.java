package LogicaApi;

import java.util.ArrayList;
import java.util.List;

import Dominio.Beneficiario;
import Dominio.Clientes;
import Dominio.Tarjetas;
import Interface.Metodos;

public class ImpGenerica implements Metodos {
	List<Object>lista =new ArrayList<Object>();

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		lista.add(obj);
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}

	@Override
	public Object buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Object obj) {
		// TODO Auto-generated method stub
		lista.set(indice, obj);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	// metodo personalizado
	public void indiceDescripcion() {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getClass().equals(Clientes.class)) {
				Clientes cliente;
				// agregar casteo
				cliente = (Clientes) lista.get(i);
				System.out.println("[" + i + "]" + cliente.getNombre());
			} else if (lista.get(i).getClass().equals(Tarjetas.class)) {
				Tarjetas tarjeta;
				// agregar casteo
				tarjeta = (Tarjetas) lista.get(i);
				System.out.println("[" + i + "]" + tarjeta.getNumCuenta());
			} else if (lista.get(i).getClass().equals(Beneficiario.class)) {
				Beneficiario beneficiario;
				// agregar casteo
				beneficiario = (Beneficiario) lista.get(i);
				System.out.println("[" + i + "]" + beneficiario.getNombre());
			}
		}
	}
}
