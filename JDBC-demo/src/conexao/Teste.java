package conexao;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		DisciplinaDAO dao = new DisciplinaDAO();
		List<Disciplina> lista = dao.todos();
for(Disciplina disciplina : lista) {
//	tentei mudar o atributo, mas a mensagem no console é sempre a mesma.
	System.out.println("Nome da Disciplna: " + disciplina.getNome());
}
	}

}
