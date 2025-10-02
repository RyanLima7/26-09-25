package exercicio;

public class Livroo implements Imprestavel{

	private String autor;
	private String titulo;
	private String status;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void emprestar(Usuario u) {
		if (status.equals("DISPONIVEL")) {
			status = "EMPRESTADO";
			System.out.println("Livro emprestado para " + u.getNome());
	    } else {
	        System.out.println("Livro já está emprestado!");
		}
	}

	public void devolver() {
		if (status.equals("EMPRESTADO")) {
			status = "DISPONÍVEL";
			System.out.println("Livro devolvido com sucesso");
		} else {
			System.out.println("Este livro já está disponível.");
		}
//		OBS: quando alguém tentar emprestar um livro que não está disponível  Retorne livro indisponível.
	}
}


