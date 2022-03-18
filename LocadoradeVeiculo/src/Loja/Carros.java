package Loja;

public class Carros {
	
	
	private float preco;
	
	public Carros(
			String plac,
			double poten,
			String modelo,
			String cor,
	        String marca,
	        boolean cambio_automatico,
	        int ano)
	{
	}
	
	public float get_preco() {
		return preco;
	}
	
	public void set_preco( float novopreco) {
		preco=novopreco;
	}
	
	public void andar() {
		System.out.println("Andando");
	}
	
	public boolean freio() {
		System.out.println("Freando");
		return true;
		
	}
	public void correr (int velocidade) {
		System.out.println("Estou correndo "+velocidade+"Km");
	}
	public static void main(String[] args) {
		
		Carros C1 = new Carros("FDP0589",2.0,"Face","Cinza","Cherry",false,2011);
		Carros C2 = new Carros ("PAOH456",5.9,"Brasilia","Branco","Chevrolet",true,2022);
		
		C1.andar();
		
		C2.correr(300);
		C2.freio();

}
}