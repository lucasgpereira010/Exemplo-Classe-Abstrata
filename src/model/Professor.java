package model;

public class Professor extends Funcionarios {
	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("Demissão de Professor");
	}

	@Override
	public void admissao() {
		// TODO Auto-generated method stub
		System.out.println("Admissão de Professor");
	}
	
}
