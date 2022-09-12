package material.heranca;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private int funcionario_id;
    private float salario;
    private Date dtAdmissao;
    private Endereco endereco;
    private Telefone telefone;
    private Cargo cargo;

    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    String formato = "dd/MM/yyyy";
    SimpleDateFormat formatter = new SimpleDateFormat(formato);
    DecimalFormat decimalFormat = new DecimalFormat("#0.0000");

    Scanner ler = new Scanner(System.in);

    public Funcionario() {

    }

    public Funcionario(int pessoa_id, String nome, Date dataNascimento, String sexo, int funcionario_id, float salario, Date dtAdmissao, Endereco endereco, Telefone telefone, Cargo cargo) {
        super(pessoa_id, nome, dataNascimento, sexo);
        this.funcionario_id = funcionario_id;
        this.salario = salario;
        this.dtAdmissao = dtAdmissao;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cargo = cargo;
    }
    public int getFuncionario_id() {
        return funcionario_id;
    }
    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Date getDtAdmissao() {
        return dtAdmissao;
    }
    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Telefone getTelefone() {
        return telefone;
    }
    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public void obterIdade(Funcionario funcionario) {
        System.out.println("DATA DE NASCIMENTO: ");
        Date data = funcionario.getDataNascimento();
        System.out.println(df.format(data));
    }

    public String cadastrarFuncionario(Funcionario f, Endereco endereco, Telefone telefone, Cargo cargo) throws ParseException {
        System.out.println("Digite o id da pessoa (Ex.: 1): ");
        f.setPessoa_id(Integer.parseInt(ler.nextLine()));
        System.out.println("Digite o nome da pessoa (Ex.: nome): ");
        f.setNome(ler.nextLine());
        System.out.println("Digite a data de nascimento da pessoa (Ex.: 11/03/2001): ");
        String dataNascimento = ler.nextLine();
        f.setDataNascimento(df.parse(dataNascimento));
        System.out.println("Digite a sexo de nascimento da pessoa (Ex.: masculino): ");
        f.setSexo(ler.nextLine());
        System.out.println("Digite o id do funcionário (Ex.: 1): ");
        f.setFuncionario_id(Integer.parseInt(ler.nextLine()));
        System.out.println("Digite o salário do funcionário (Ex.: 1.000): ");
        f.setSalario(Float.parseFloat(ler.nextLine()));
        System.out.println("Digite a data de admissão do funcionário (Ex.: 11/03/2001): ");
        String dtAdmissao = ler.nextLine();
        f.setDtAdmissao(df.parse(dtAdmissao));
        f.setEndereco(endereco);
        f.setTelefone(telefone);
        f.setCargo(cargo);
        listarDadosFuncionario(f);

        return "\n\nFuncionário cadastrado com sucesso!\n";
    }

    public String listarDadosFuncionario(Funcionario f)
    {
        System.out.println("\nId Pessoa: " + f.getPessoa_id());
        System.out.println("Nome: " + f.getNome());
        System.out.println("Data de nascimento: " + formatter.format(f.getDataNascimento()));
        System.out.println("Sexo: " + f.getSexo());
        System.out.println("\nId Funcionário: " + f.getFuncionario_id());
        System.out.println("Salário: R$" + decimalFormat.format(f.getSalario()));
        System.out.println("Data de admissão: " + formatter.format(f.getDtAdmissao()));
        System.out.println("Dados de endereço: \n");
        System.out.println( f.getEndereco().listarDadosEndereco(f.getEndereco()));
        System.out.println("Dados de cargo: ");
        System.out.println(f.getCargo().listarDadosCargo(f.getCargo()));
        System.out.println("Dados de telefone: ");
        System.out.println(f.getTelefone().listarDadosCelular(f.getTelefone()));

        return "";
    }

    public String reajustarSalario(Funcionario f) {
        System.out.println("Digite a porcentagem de reajuste: ");
        float percentual = Float.parseFloat(ler.nextLine());
        float salario = f.getSalario();
        float reajuste = salario * (percentual / 100);
        f.setSalario(salario + reajuste);
        String retorno = "Salário antigo: R$" + decimalFormat.format(salario) + ", salário novo: R$" + decimalFormat.format(f.getSalario());
        System.out.println(retorno);

        return retorno;
    }

    public String promoverCargo(Funcionario f) {
        System.out.println("**********PROMOÇÃO CHEGANDO AI**********");
        System.out.println("\nDigite o novo cargo para realizar promoção: ");
        Cargo novoCargo = new Cargo();
        novoCargo.cadastrarCargo(novoCargo);
        f.setCargo(novoCargo);
        System.out.println("Novo Cargo: ");
        String dadosCargoNovo = novoCargo.listarDadosCargo(novoCargo);
        System.out.println(dadosCargoNovo);
        System.out.println("Dados do funcionário com novo cargo: ");

        return f.listarDadosFuncionario(f);
    }
}
