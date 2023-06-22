package Library;

import java.util.ArrayList;


public class Cadastro {

	private ArrayList<Pessoa> pessoa = new ArrayList<>();
    
    public void pagarMulta(Pessoa empresta) {
        double multa = empresta.getMulta();
        if (multa >= 0) {
            empresta.setMulta(0);
            System.out.println("Multa paga por: " + empresta.getNome() + ". Valor pago: R$ " + multa);
        } else {
            System.out.println("Não há multa a ser paga para: " + empresta.getNome());
        }
    }
    
    public void AdicionarPessoa(Pessoa newpessoa) {
    	pessoa.add(newpessoa);
    	System.out.println(newpessoa.getNome() + " adicionado com sucesso");
    }
    

    
    public void alterarPessoa(String nome, String nomeAtualizado,String telefone, String email) {
    	for(int i = 0; i < pessoa.size(); i++ ) {
    		if(pessoa.get(i).getNome().equals(nome)) {
    			pessoa.get(i).setNome(nomeAtualizado);
    			pessoa.get(i).setTelefone(telefone);
    			pessoa.get(i).setEmail(email);
    		}else {
    			System.out.println("emprestante não encontrado");
    		}
    	}
    	
    }
    
    public void removePessoa(String nome) {
    	for(int i = 0; i< pessoa.size(); i++) {
    		if(pessoa.get(i).getNome().equals(nome)) {
    			pessoa.remove(i);
    			System.out.println("Pessoa excluida com sucesso");
    		}else {
    			System.out.println("emprestante não encontrado");

    		}
    	}
    }

	public void imprime() {
		for(int i = 0; i< pessoa.size(); i ++) {
			System.out.println(pessoa.get(i).ToString());
		}
		
	}

   
}
