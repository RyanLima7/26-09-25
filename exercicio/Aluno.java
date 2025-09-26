package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private List<Livro> livrosEmprestados = new ArrayList<>();

    @Override
    public void getLimiteEmprestimos() {
        return;
    }

    public boolean podeEmprestar() {
        return livrosEmprestados.size() < getLimiteEmprestimos();
    }

    public void emprestarLivro(Livro livro) {
        if (podeEmprestar()) {
            livrosEmprestados.add(livro);
            livro.emprestar();
        } else {
            System.out.println("Limite de empréstimos atingido.");
        }
    }
}
