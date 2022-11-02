package cursojava.classes;

import java.util.Arrays;

/*Essa classe Disciplina servir� para todods os objetos e instancias de notas e mat�rias*/
public class Disciplina {

	private double[] nota = new double[4];
	private String disciplina;

	/* setter e getter */
	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	/* M�todo para calculo m�dia do aluno */
	public double getMediaNotas() {
		double somaTotal =0;
		for (int pos = 0; pos < nota.length; pos++) {
			somaTotal += nota[pos];
		}
		return somaTotal / 4;
	}

	/* equals e hashCode */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}


	/* toString */
	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}
