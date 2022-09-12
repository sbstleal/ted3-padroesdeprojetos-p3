package material.heranca;

import java.util.Scanner;

public class Telefone {
    private int telefone_id;
    private String numero;
    private String tipo;

    Scanner ler = new Scanner(System.in);

    public Telefone(int telefone_id, String numero, String tipo) {
        this.telefone_id = telefone_id;
        this.numero = numero;
        this.tipo = tipo;
    }

    public Telefone() {

    }

    public int getTelefone_id() {
        return telefone_id;
    }
    public void setTelefone_id(int telefone_id) {
        this.telefone_id = telefone_id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String cadastrarTelefone(Telefone t) {
        System.out.println("Digite o id do telefone (Ex.: 1): ");
        t.setTelefone_id(Integer.parseInt(ler.nextLine()));
        System.out.println("Digite o número de telefone (Ex.: 83988350839): ");
        t.setNumero(ler.nextLine());
        System.out.println("Digite o tipo de telefone (Ex.: Residencial, Celular): ");
        t.setTipo(ler.nextLine());
        listarDadosCelular(t);

        return "\n\nCelular cadastrado com Sucesso!\n";
    }
    public String listarDadosCelular(Telefone t)
    {
        System.out.println("Id do telefone: " + t.getTelefone_id());
        System.out.println("Número : " + t.getNumero());
        System.out.println("Tipo de telefone: " + t.getTipo());

        return "";
    }
}
