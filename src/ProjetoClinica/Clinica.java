package ProjetoClinica;

public class Clinica {
    public static void main (String args[]){
        Paciente paciente = new paciente();
        paciente.nome = "fulano";
        paciente.endereco = "umarizal";
        paciente.numeroCartao = 1234;

        Medico medico = new medico();
        medico.nome = "Pedro";
        medico.endereco = "Umarizal";
        medico.crm = 12345;
        medico.especialidade = "Cardiologista";

        AtendimentoMedico atendimento = new AtendimentoMedico();
        atendimento.dataConsulta = "12/21/2019";
        atendimento.paciente = paciente;
        atendimento.medico= medico;

    }
}
