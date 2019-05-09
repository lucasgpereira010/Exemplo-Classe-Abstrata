package view;

import model.Direcao;
import model.Professor;
import model.Secretaria;

public class Execucao {
	public static void main(String[] args) {
		Professor pro = new Professor();
		Secretaria s = new Secretaria();
		Direcao d = new Direcao();
		System.out.println("Dados Professor");
		pro.setNome("João");
		System.out.println("Nome: " + pro.getNome());
		pro.setMateria("Matemática");
		System.out.println("Matéria: " + pro.getMateria());
		pro.setEndereco("Rua dos Professores");
		System.out.println("Endereço: " + pro.getEndereco());
		pro.setBairro("Bairro dos Professores");
		System.out.println("Bairro: " + pro.getBairro());
		pro.setCep(2354145);
		System.out.println("Cep: " + pro.getCep());
		pro.setCidade("São Paulo");
		System.out.println("Cidade: " + pro.getCidade());
		pro.setEstado("São Paulo");
		System.out.println("Estado: " + pro.getEstado());
		pro.setTelefone(21542635);
		System.out.println("Telefone: " + pro.getTelefone());
		pro.setCelular(956322356);
		System.out.println("Celular: " + pro.getCelular());
		pro.admissao();
		pro.demissao();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Dados da Secretaria");
		s.setNome("Maria");
		System.out.println("Nome: " + s.getNome());
		s.setMatricula(16254);
		System.out.println("Matricula: " + s.getMatricula());
		s.setEndereco("Rua da Secretaria");
		System.out.println("Endereço: " + s.getEndereco());
		s.setBairro("Bairro da Secretaria");
		System.out.println("Bairro: " + s.getBairro());
		s.setCep(2354145);
		System.out.println("Cep: " + s.getCep());
		s.setCidade("São Paulo");
		System.out.println("Cidade: " + s.getCidade());
		s.setEstado("São Paulo");
		System.out.println("Estado: " + s.getEstado());
		s.setTelefone(35624265);
		System.out.println("Telefone: " + s.getTelefone());
		s.setCelular(945636541);
		System.out.println("Celular: " + s.getCelular());
		s.admissao();
		s.demissao();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Dados da Direção");
		d.setNome("Joana");
		System.out.println("Nome: " + d.getNome());
		d.setCargos("Coordenadora");
		System.out.println("Cargo: " + d.getCargos());
		d.setEndereco("Rua da Direção");
		System.out.println("Endereço: " + d.getEndereco());
		d.setBairro("Bairro da Direção");
		System.out.println("Bairro: " + d.getBairro());
		d.setCep(2354145);
		System.out.println("Cep: " + d.getCep());
		d.setCidade("São Paulo");
		System.out.println("Cidade: " + d.getCidade());
		d.setEstado("São Paulo");
		System.out.println("Estado: " + d.getEstado());
		d.setTelefone(45624265);
		System.out.println("Telefone: " + d.getTelefone());
		d.setCelular(945636541);
		System.out.println("Celular: " + d.getCelular());
		d.admissao();
		d.demissao();
		
		
	}
}
