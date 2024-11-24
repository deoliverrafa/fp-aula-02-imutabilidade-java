package exercicios;

import io.github.manoelcampos.examcorrection.RecordTest;

import java.util.Map;

/**
 * @author Manoel Campos
 */
class PessoaRecordTest extends RecordTest {
    PessoaRecordTest() {
        super(Map.of("nome", "String", "cidade", "CidadeRecord"));
    }
}