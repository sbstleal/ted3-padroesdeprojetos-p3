package material.heranca;

import java.util.Scanner;

public class Cargo {
    private int cargo_id;
    private String funcao;
    private String descricao;

    Scanner ler = new Scanner(System.in);

    public Cargo() {

    }
    public Cargo(int cargo_id, String funcao, String descricao) {
        this.cargo_id = cargo_id;
        this.funcao = funcao;
        this.descricao = descricao;
    }
    public int getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(int cargo_id) {
        this.cargo_id = cargo_id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String cadastrarCargo(Cargo c) {
        System.out.println("Digite o id do cargo (Ex.: 1): ");
        c.setCargo_id(Integer.parseInt(ler.nextLine()));
        System.out.println("Digite a função do cargo (Ex.: Operador de caixa): ");
        c.setFuncao(ler.nextLine());
        System.out.println("Digite a descricao do cargo (Ex.: Realizar o atendimento de caixa): ");
        c.setDescricao(ler.nextLine());
        listarDadosCargo(c);

        return "\n\nCargo cadastrado com Sucesso!\n";
    }

    public String listarDadosCargo(Cargo c)
    {
        System.out.println("Id do cargo: " + c.getCargo_id());
        System.out.println("Função do cargo: " + c.getFuncao());
        System.out.println("Descrição do cargo: " + c.getDescricao());

        return "";
    }
}
