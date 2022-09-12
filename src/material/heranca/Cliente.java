package material.heranca;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private int cliente_id;
    private Endereco endereco;
    private Telefone telefone;
    private Cargo cargo;
    private Profissao profissao;

    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    String formato = "dd/MM/yyyy";
    SimpleDateFormat formatter = new SimpleDateFormat(formato);
    Scanner ler = new Scanner(System.in);

    public Cliente() {

    }

    public Cliente(int pessoa_id, String nome, Date dataNascimento, String sexo, int cliente_id, Endereco endereco, Telefone telefone, Cargo cargo, Profissao profissao) {
        super(pessoa_id, nome, dataNascimento, sexo);
        this.cliente_id = cliente_id;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cargo = cargo;
        this.profissao = profissao;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
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

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public String cadastrarCliente(Cliente c, Endereco endereco, Telefone telefone, Cargo cargo, Profissao profissao) throws ParseException {
        System.out.println("Digite o id da pessoa (Ex.: 1): ");
        c.setPessoa_id(Integer.parseInt(ler.nextLine()));
        System.out.println("Digite o nome da pessoa (Ex.: nome): ");
        c.setNome(ler.nextLine());
        System.out.println("Digite a data de nascimento da pessoa (Ex.: 11/03/2001): ");
        String dataNascimento = ler.nextLine();
        c.setDataNascimento(df.parse(dataNascimento));
        System.out.println("Digite a sexo de nascimento da pessoa (Ex.: masculino): ");
        c.setSexo(ler.nextLine());
        System.out.println("Digite o id do cliente (Ex.: 1): ");
        c.setCliente_id(Integer.parseInt(ler.nextLine()));
        c.setProfissao(profissao);
        c.setEndereco(endereco);
        c.setTelefone(telefone);
        c.setCargo(cargo);
        listarDadosCliente(c);

        return "\n\nCliente cadastrado com sucesso!\n";
    }

    public String listarDadosCliente(Cliente c)
    {
        System.out.println("\nId Pessoa: " + c.getPessoa_id());
        System.out.println("Nome: " + c.getNome());
        System.out.println("Data de nascimento: " + formatter.format(c.getDataNascimento()));
        System.out.println("Sexo: " + c.getSexo());
        System.out.println("\nId Cliente: " + c.getCliente_id() + "\n");
        System.out.println("\nDados de endereço: ");
        System.out.println( c.getEndereco().listarDadosEndereco(c.getEndereco()));
        System.out.println("Dados de cargo: ");
        System.out.println(c.getCargo().listarDadosCargo(c.getCargo()));
        System.out.println("Dados de telefone: ");
        System.out.println(c.getTelefone().listarDadosCelular(c.getTelefone()));
        System.out.println("Dados de Profissão: ");
        System.out.println(c.getProfissao().listarDadosProfissao(c.getProfissao()));

        return "";
    }

    public String promoverCargo(Cliente cliente) {
        System.out.println("**********PROMOÇÃO CHEGANDO AI**********");
        System.out.println("\nDigite o novo cargo para realizar promoção: ");
        Cargo novoCargo = new Cargo();
        novoCargo.cadastrarCargo(novoCargo);
        cliente.setCargo(novoCargo);
        System.out.println("Novo Cargo: ");
        String dadosCargoNovo = novoCargo.listarDadosCargo(novoCargo);
        System.out.println(dadosCargoNovo);
        System.out.println("Dados do funcionário com novo cargo: ");

        return cliente.listarDadosCliente(cliente);
    }

    public void obterIdade(Cliente c) {
        System.out.println("DATA DE NASCIMENTO: ");
        Date data = c.getDataNascimento();
        System.out.println(df.format(data));
    }
}
