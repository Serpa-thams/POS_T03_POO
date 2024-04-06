package tech.thami.pessoas;
import tech.thami.composicoes.*;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private String matricula;
    private double salario;
    private LocalDate dataAdmissao;
    private Profissao cargo;

    public Funcionario() {
        System.out.println("Criando funcionário");
    }

    public Funcionario(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telsContato) {
        super(nome, dataNascimento, endereco, telsContato);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Profissao getCargo() {
        return cargo;
    }

    public void setCargo(Profissao cargo) {
        this.cargo = cargo;
    }
}
