public class Funcionario {
    private int funcional;
    private String nome;
    private String telefone;
    private Dependentes dependentes;
    private Supervisor supervisor;
    private Admissao admissao;
    private Agencia agencia;

    public Funcionario(int funcional, String nome, String telefone, Dependentes dependentes, Supervisor supervisor, Admissao admissao, Agencia agencia){
        this.funcional = funcional;
        this.nome = nome;
        this.telefone = telefone;
        this.dependentes = dependentes;
        this.supervisor = supervisor;
        this.admissao = admissao;
        this.agencia = agencia;
    }

    public int getFuncional(){
        return funcional;
    }

    public String getNome(){
        return nome;
    }

    public String getTel(){
        return telefone;
    }

    public Dependentes getDependentes(){
        return dependentes;
    }

    public Supervisor getSupervisor(){
        return supervisor;
    }

    public int getTempoDeServico(){
        return admissao.TempoDeServico; 
    }

    public Agencia getAgencia(){
        return agencia;
    }

    public void setFunc(int funcional){
        this.funcional = funcional;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTel(String telefone){
        this.telefone = telefone;
    }

    public void setDependentes(Dependes dependentes){
        this.dependentes = dependentes;
    }

    public void setSupervisor(Supervisor supervisor){
        this.supervisor = supervisor;
    }

    public void setAdmissao(Admissao admissao){
        this.admissao = admissao;
    }

    public void setAgencia(Agencia agencia){
        this.agencia = agencia;
    }
}
