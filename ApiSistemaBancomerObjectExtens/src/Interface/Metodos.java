package Interface;

public interface Metodos {
	public void guardar(Object obj);
	public void listar();
	public Object buscar(int indice);
	public void editar(int indice, Object obj);
	public void eliminar(int indice);

}
