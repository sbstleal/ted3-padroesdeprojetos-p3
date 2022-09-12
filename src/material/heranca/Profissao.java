package material.heranca;

import java.util.Scanner;

public class Profissao {

    private int profissao_id;
    private String profissao;
    private String descricao;

    Scanner ler = new Scanner(System.in);

    public Profissao() {

    }

    public Profissao(int profissao_id, String profissao, String descricao) {
        this.profissao_id = profissao_id;
        this.profissao = profissao;
        this.descricao = descricao;
    }

    public int getProfissao_id() {
        return profissao_id;
    }

    public void setProfissao_id(int profissao_id) {
        this.profissao_id = profissao_id;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String cadastrarProfissao(Profissao p) {
        System.out.println("Digite o id da profissão (Ex.: 1): ");
        p.setProfissao_id(Integer.parseInt(ler.nextLine()));
        System.out.println("Digite a Profissão (Ex.: Desenvolvedor): ");
        p.setProfissao(ler.nextLine());
        System.out.println("Digite a descricao do cargo (Ex.: Realizar o atendimento de caixa): ");
        p.setDescricao(ler.nextLine());
        listarDadosProfissao(p);

        return "\n\nProfissão cadastrada com Sucesso!\n";
    }

    public String listarDadosProfissao(Profissao p)
    {
        System.out.println("Id da profissão: " + p.getProfissao_id());
        System.out.println("Profissão: " + p.getProfissao());
        System.out.println("Descrição da profissão: " + p.getDescricao());

        return "";
    }
}
