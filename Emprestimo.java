package exercicio;

import java.time.LocalDate;

public class Emprestimo {
    private Livroo livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;

    public Emprestimo(Livroo livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(7);
    }

    public Livroo getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }
}
