package model;

public class Secretaria extends Funcionarios{
	
	private long Matricula;

	public long getMatricula() {
		return Matricula;
	}

	public void setMatricula(long matricula) {
		Matricula = matricula;
	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("Demissão de Pessoal da Secretaria");
	}

	@Override
	public void admissao() {
		// TODO Auto-generated method stub
		System.out.println("Demissão de Pessoal da Secretaria");
	}
	
}
