public class EstudanteGrad extends Estudante{
    protected int CargaHorariaComplementar;
    protected String TituloTCC;
    protected String LocalEstagio;

    
    public EstudanteGrad(String cpf, String matricula, String nome) {
        super(nome, cpf, matricula);
    }

    public int getCargaHorariaDisciplinas() {
        return super.CargaHorariaDisciplinas;
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas){
        if(cargaHorariaDisciplinas <= 3000){
            throw new TimeException("Valor abaixo de 3000", cargaHorariaDisciplinas);
        }

        super.CargaHorariaDisciplinas = cargaHorariaDisciplinas;
    } // <<<---------------------------------------------------------

    public int getCargaHorariaComplementar() {
        return CargaHorariaComplementar;
    }

    public void setCargaHorariaComplementar(int cargaHorariaComplementar) { 
        if(cargaHorariaComplementar <= 3000){
            throw new TimeException("Valor abaixo de 3000", cargaHorariaComplementar);
        }
        CargaHorariaComplementar = cargaHorariaComplementar;
    } // <<<---------------------------------------------------------

    public String getTituloTCC() {
        return TituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        TituloTCC = tituloTCC;
    }

    public String getLocalEstagio() {
        return LocalEstagio;
    }

    public void setLocalEstagio(String localEstagio) {
        LocalEstagio = localEstagio;
    }

    public void informacoesEstudante(){
        System.out.println("Nome: " + super.Nome);
        System.out.println("CPF: " + super.CPF);
        System.out.println("Matricula: " + super.Matricula );
        System.out.println("Carga Horária: " +  super.CargaHorariaDisciplinas);
        System.out.println("Horas complementares: " +  CargaHorariaComplementar);
        System.out.println("Local do estágio: " +  LocalEstagio); //correcao
        System.out.println("Título do TCC: " +  TituloTCC);
    }

    public void gerarCertificado(){
        System.out.println("Certifico que o <nome do aluno> realiza estágio em " +  LocalEstagio);
    };

    
}
