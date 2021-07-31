
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente gustavo = new Gerente();
		gustavo.setNome("Gustavo Pereira");
		gustavo.setCpf("123456789-12");
		gustavo.setSalario(2558.00);
		
		System.out.println(gustavo.getNome());
		System.out.println(gustavo.getBonificacao());
		

	}

}
