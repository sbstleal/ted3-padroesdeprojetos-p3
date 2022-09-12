import material.heranca.*;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {


        System.out.print("##--Teste Estrutura de Menu--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Classe Funcionário|\n");
        System.out.print("| Opção 2 - Classe Clientes   |\n");
        System.out.print("| Opção 3 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        Scanner menu = new Scanner (System.in);
        int opcao = menu.nextInt();

        switch(opcao) {
            case 1:
        //Instanciando telefone
        Telefone telefone = new Telefone();
        //Cadastrar telefone
        telefone.cadastrarTelefone(telefone);
        //Instanciando endereço
        Endereco endereco = new Endereco();
        //Cadastrando endereço
        endereco.cadastrarEndereco(endereco);
        //Instanciando cargo
        Cargo cargo = new Cargo();
        //Cadastrando cargo
        cargo.cadastrarCargo(cargo);
        //Instanciando Funcionário
        Funcionario funcionario = new Funcionario();
        //Cadastrando funcionario
        funcionario.cadastrarFuncionario(funcionario, endereco, telefone, cargo);
        //Reajustar Salario
        funcionario.reajustarSalario(funcionario);
        //Promover Cargo
        funcionario.promoverCargo(funcionario);
        //Obter idade
        funcionario.obterIdade(funcionario);
        break;
        case 2:
        //Instanciando telefone
        Telefone telefone2 = new Telefone();
        //Cadastrar telefone
        telefone2.cadastrarTelefone(telefone2);
        //Instanciando endereço
        Endereco endereco2 = new Endereco();
        //Cadastrando endereço
        endereco2.cadastrarEndereco(endereco2);
        //Instanciando cargo
        Cargo cargo2 = new Cargo();
        //Cadastrando cargo
        cargo2.cadastrarCargo(cargo2);
        //Instanciando Profissao
        Profissao profissao = new Profissao();
        //Cadastrando profissao
        profissao.cadastrarProfissao(profissao);
        //Instanciando Cliente
        Cliente cliente = new Cliente();
        //Cadastrando cliente
        cliente.cadastrarCliente(cliente, endereco2, telefone2, cargo2, profissao);
        //Promover
        cliente.promoverCargo(cliente);
        //Obter idade
        cliente.obterIdade(cliente);
        break;
            case 3:
                break;
        }



    }
}