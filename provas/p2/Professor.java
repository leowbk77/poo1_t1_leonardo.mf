import java.util.Date;

public class Professor extends Pessoa implements Senioridade{
    String NumeroFuncional;
    String Nome;
    String CPF;
    Date DataContrato;

    public Professor(String numeroFuncional, String nome, String CPF, Date dataContrato) {
        NumeroFuncional = numeroFuncional;
        Nome = nome;
        this.CPF = CPF;
        DataContrato = dataContrato;
    }

    public Professor(String numeroFuncional, String nome, String CPF) {
        NumeroFuncional = numeroFuncional;
        Nome = nome;
        this.CPF = CPF;
    }

    public void gerarCertificado(){
        System.out.println("Certifico que o " + Nome + " é orientador de estudantes");
    }

    public boolean ehSenior(Senioridade prof){
        if(DataContrato.compareTo(prof.DataContrato > 0){
            return true;
        }else{
            return false;
        }
    }
}
