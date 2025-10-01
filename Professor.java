package exercicio;

public class Professor extends Usuario {

    public Professor(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 5;
    }
}
