package material.heranca;

import java.util.Scanner;

public class Endereco {
    private int endereco_id;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private int numero;
    private String cep;
    private String pais;
    private String complemento;
    Scanner ler = new Scanner(System.in);

    public Endereco(int endereco_id, String logradouro, String bairro, String cidade, String estado, int numero, String cep, String pais, String complemento) {
        this.endereco_id = endereco_id;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
        this.pais = pais;
        this.complemento = complemento;
    }
    public Endereco() {

    }

    public int getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(int endereco_id) {
        this.endereco_id = endereco_id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String cadastrarEndereco(Endereco e) {
        System.out.println("Digite o id do endereço (Ex.: 1): ");
        e.setEndereco_id(Integer.parseInt(ler.nextLine()));
        System.out.println("Digite o logradouro (Ex.: Av. Buenos Aires): ");
        e.setLogradouro(ler.nextLine());
        System.out.println("Digite o bairro (Ex.: Jaguaribe): ");
        e.setBairro(ler.nextLine());
        System.out.println("Digite a cidade (Ex.: João Pessoa): ");
        e.setCidade(ler.nextLine());
        System.out.println("Digite o estado (Ex.: PB): ");
        e.setEstado(ler.nextLine());
        System.out.println("Digite o número (Ex.: 112): ");
        e.setNumero(Integer.parseInt(ler.nextLine()));
        System.out.println("Digite o cep (Ex.: 58085-330): ");
        e.setCep(ler.nextLine());
        System.out.println("Digite o país (Ex.: Brasil): ");
        e.setPais(ler.nextLine());
        System.out.println("Digite o complemento (Ex.: ap 103): ");
        e.setComplemento(ler.nextLine());
        listarDadosEndereco(e);

        return "\n\nCelular cadastrado com Sucesso!\n";
    }

    public String listarDadosEndereco(Endereco e)
    {
        System.out.println("Id do endereço: " + e.getEndereco_id());
        System.out.println("Logradouro: " + e.getLogradouro());
        System.out.println("Bairro: " + e.getBairro());
        System.out.println("Cidade: " + e.getCidade());
        System.out.println("Estado: " + e.getEstado());
        System.out.println("Número: " + e.getNumero());
        System.out.println("CEP: " + e.getCep());
        System.out.println("País: " + e.getPais());
        System.out.println("Complemento: " + e.getComplemento());

        return "";
    }
}