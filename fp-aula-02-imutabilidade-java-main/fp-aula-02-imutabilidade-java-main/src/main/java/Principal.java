import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        CidadeRecord cidadeImutavel = new CidadeRecord("São Paulo");
        Cidade cidadeMutavel = new Cidade("Rio de Janeiro");
        cidadeMutavel.setNome("Niterói");

        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("João", cidadeMutavel);
        System.out.println("Antes: " + pessoaShallow.cidade().getNome());
        cidadeMutavel.setNome("Curitiba");
        System.out.println("Depois: " + pessoaShallow.cidade().getNome());

        PessoaRecord pessoaDeep = new PessoaRecord("Maria", cidadeImutavel);
        System.out.println(pessoaDeep.cidade().nome());
    }
}
