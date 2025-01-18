package med.voll.api.domain.medico;

public record DadosListagemMedicos(

        long id,
        String nome,
        String crm,
        String email,
        Especialidade especialidade
) {

    public DadosListagemMedicos(Medico medico) {
        this(   medico.getId(),
                medico.getNome(),
                medico.getCrm(),
                medico.getEmail(),
                medico.getEspecialidade()
                );
    }
}
