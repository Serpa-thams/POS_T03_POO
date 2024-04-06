package tech.thami.pessoas;

import tech.thami.composicoes.*;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;
    private LocalDate dataAdmissao;
    private Cargo cargo;


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

    public void reajustarSalario(double percentual){
        this.salario = this.salario * (1 + (percentual/100)); // this.salario += (this.salario + (percentual/100));
    }
    public void promover(Cargo novoCargo){
        this.cargo = novoCargo;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
