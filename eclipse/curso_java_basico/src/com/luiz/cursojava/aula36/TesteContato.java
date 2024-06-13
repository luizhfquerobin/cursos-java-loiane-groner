package com.luiz.cursojava.aula36;

public class TesteContato {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Luiz");
		// contato.setEndereco("Cascavel");
		
		Endereco end = new Endereco();
		end.setNomeDaRua("Rua Europa");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Cascavel");
		end.setEstado("Paraná");
		end.setCep("18181-720");
		
		contato.setEndereco(end);
		
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("45");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("45");
		telefone2.setNumero("88888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefones());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t: contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
		
	}

}
