package ListaExer;

public class Funcionario {
	private String nome, departamento,banco,rg;
    private double salario;
    private boolean StatusFuncionario=true;

    public Funcionario(String nome, String departamento, String banco, String rg, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.banco = banco;
        this.rg = rg;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean StatusFuncionario() {
        return StatusFuncionario;
    }

    public void setStatusFuncionario(boolean StatusFuncionario) {
        this.StatusFuncionario = StatusFuncionario;
    }

    public void bonificar(double valBonificacao){
        salario+=valBonificacao;
    }
    public void demitir(){
    	StatusFuncionario=false;
    }
    public String mostrarDados(){
        String statusFun;
        if (StatusFuncionario() == true){
            statusFun = "Ativo";
        }else {
            statusFun = "Desligado";
        }
        return " Nome: "+getNome()+"\n Banco: "+getBanco()+"\n Departamento: "+getDepartamento()+
                "\n RG: "+getRg()+"\n Salario: "+getSalario()+"\n Situação do Funcionario: "
                +statusFun+"\n ===========================";
    }
}




//private String nome;
//private String cnpj;
//private int qtde_funcionario;
//static int cont=0;

//private Funcionario [] funcionario; 

//public Empresa (String nome, String cnpj, int qtde_funcionario);{// não é paramento de objetos
//this.nome=nome;
//this.cnpj=cnpj;
//this.qtde_funcionario=qtde_funcionario;
//funcionarios=new Funcionario[qtde_funcionario]; //vetor de funcionario 

//}

//public Empresa (String nome, String cnpj);
//this.qtde_funcionario=100;
//funcionarios = new Funcionario [100];
//this.nome=nome;
//this.cnpj=cnpj;
//}
