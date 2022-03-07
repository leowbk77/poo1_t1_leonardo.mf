public class EstudantePosGrad extends Estudante{
    protected String Nivel; // doutorado ou mestrado
    protected String TemaProjetoPesquisa;

    public EstudantePosGrad(String CPF, String matricula, String nome) {
        super(nome, CPF, matricula);
    }

    public int getCargaHorariaDisciplinas() {
        return super.CargaHorariaDisciplinas;
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) {
        super.CargaHorariaDisciplinas = cargaHorariaDisciplinas;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        Nivel = nivel;
    }

    public String getTemaProjetoPesquisa() {
        return TemaProjetoPesquisa;
    }

    public void setTemaProjetoPesquisa(String temaProjetoPesquisa) {
        TemaProjetoPesquisa = temaProjetoPesquisa;
    }

    public void informacoesEstudante(){
        System.out.println("Nome: " + super.Nome);
        System.out.println("CPF: " + super.CPF);
        System.out.println("Matricula: " + super.Matricula );
        System.out.println("Carga Horária: " +  super.CargaHorariaDisciplinas);
        System.out.println("Nível: " +  Nivel);
        System.out.println("Tema de pesquisa: " +  TemaProjetoPesquisa);
    }

    public void gerarCertificado(){
        System.out.println("Certifico que o " + super.Nome + " participa do projeto " +  TemaProjetoPesquisa);
    };
}

