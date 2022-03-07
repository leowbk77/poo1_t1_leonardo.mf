public class Estudante extends Pessoa{
    protected String Nome;
    protected String CPF;
    protected String Matricula;
    protected int CargaHorariaDisciplinas;

    public Estudante(String Nome, String CPF, String Matricula){
        this.Nome = Nome;
        this.CPF = CPF;
        this.Matricula = Matricula;
        CargaHorariaDisciplinas = 0;
    }

    public void informacoesEstudante(){
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Matricula: " + Matricula );
        System.out.println("Carga Horária: " +  CargaHorariaDisciplinas);
    }
    
    public void gerarCertificado(){
        System.out.println();
    };
}
