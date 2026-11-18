public abstract class Animal implements Sonoro {
	private String nome;
	private Porte porte;
	public Animal(String nome, Porte porte) {
		setNome(nome);
		this.porte = porte;
	}
	public String getNome() {
		return nome;
	}
	public Porte getPorte() {
		return porte;
	}
	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("O nome está vazio.");
		}
		this.nome = nome;
	}
	public void exibirDados() {
		System.out.println("-------------Animal-----------");
		System.out.println("Nome: " + getNome());
		System.out.println("Porte: " + getPorte());
	}

	@Override
	public void emitirSom() {
		System.out.println("Animal emitindo som.");
	}
}