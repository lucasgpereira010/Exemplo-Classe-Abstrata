package model;

public class Direcao extends Funcionarios{
	
	private String cargos;

	public String getCargos() {
		return cargos;
	}

	public void setCargos(String cargos) {
		this.cargos = cargos;
	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("Demiss�o de Pessoal da Dire��o");
	}

	@Override
	public void admissao() {
		// TODO Auto-generated method stub
		System.out.println("Demiss�o de Pessoal da Dire��o");
	}
	
}
