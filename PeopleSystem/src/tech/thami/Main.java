package tech.thami;
import tech.thami.pessoas.*;
import tech.thami.composicoes.*;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Endereco end1 = new Endereco("Rua end1", "Num end1", "Cep end1",
                "Cid end1", "estado end1", "pais end1");
        c1.setCodigo("1");
        c1.setNome("Meu nome");
        c1.setDataNascimento(LocalDate.of(1992,4,29));
        c1.setEndereco(end1);
        c1.getEndereco();

        System.out.println("Nome do cliente: " + c1.getNome());
        System.out.println("Rua do cliente: " + c1.getEndereco().getRua());
        System.out.println("Rua do cliente: " + c1.getEndereco().getCep());

        Funcionario f1 = new Funcionario();
        f1.setMatricula(1);
        f1.setNome("Meu nome");
        f1.setDataNascimento(LocalDate.of(1993,4,29));
        f1.getEndereco();
        f1.setEndereco(end1);


    }
}