package exercicios;

import io.github.manoelcampos.examcorrection.RecordTest;

import java.util.Map;

/**
 * @author Manoel Campos
 */
class PessoaRecordShallowTest extends RecordTest {
    PessoaRecordShallowTest() {
        super(Map.of("nome", "String", "cidade", "Cidade"));
    }
}