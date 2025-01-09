import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class GerenciarFuncionarios {
	private List<Funcionarios> funcionario;
	
	public GerenciarFuncionarios() {
		funcionario = new ArrayList<>();
	}
	public void inserirFuncionarios(Funcionarios funcionarios) {
		funcionario.add(funcionarios);
	}
	public void verFuncionarioPorId(int id) {
		for (Funcionarios funcionarios : funcionario) {
			if (funcionarios.getId() == id) {
				funcionarios.exibirInformacoes();
				return;
			}
		
			
		} 
		System.out.println("Funcionário com ID" + id +"Não encontrado.");
	}
	public void buscarDados() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o ID:");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite o nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o telefone:");
		String telefone = scanner.nextLine();
		
		System.out.println("Digite o email:");
		String email = scanner.nextLine();
		

		System.out.println("Digite as alergias:");
		String alergiasInput = scanner.nextLine();
		List<String>alergias = Arrays.asList(alergiasInput.split(",\\s*"));
		
		System.out.println("Digite os problemas médicos:");
		String problemasMedicosInput = scanner.nextLine();
		List<String>problemasMedicos = Arrays.asList(problemasMedicosInput.split(",\\s*"));
		
		
		Funcionarios funcionarios = new Funcionarios(id,nome,telefone,email,alergias,problemasMedicos);
		inserirFuncionarios(funcionarios);
		System.out.println("Funcionário adicionado");
		

	}
	public static void main(String[]args) {
		GerenciarFuncionarios gerenciador = new GerenciarFuncionarios();
		Scanner scanner = new Scanner(System.in); 
		while(true){
			
			System.out.println("\nInforme a opção desejada:");
			System.out.println("1-Inserir funcionário:");
			System.out.println("2-Exibir informações por ID");
			System.out.println("3-Sair");
			System.out.println("Opção: ");
			int opcao = scanner.nextInt();
			
			switch(opcao){
				case 1:
					gerenciador.buscarDados();
					break;
				case 2:
					System.out.print("Digite o ID: ");
					int id = scanner.nextInt();
					gerenciador.verFuncionarioPorId(id);
					break;
				case 3:
					System.out.println("Encerrando");
					return;
				    default:
				    	System.out.println("Opção inválida");
			}
		
		
		}
	}
	
	

}
