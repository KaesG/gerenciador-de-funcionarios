import java.util.List;
public class Funcionarios {

		private int id;
		private String nome;
		private String telefone;
		private String email;
		private List<String> alergias;
		private List<String> problemasMedicos;
		
		
		public Funcionarios(int id, String nome, String telefone, String email, List<String> alergias, List<String> problemasMedicos) {                           
			this.id = id;
			this.nome = nome;
			this.telefone = telefone;
			this.email = email;
			this.alergias = alergias;
			this.problemasMedicos = problemasMedicos;
		} 
		
		
		public int getId() {
		return id;	
		}
		
		public String getNome() {
			return nome;	
			}
		
		public void setNome(String nome) {
			this.nome = nome;
			}
		
		public String getTelefone() {
			return telefone;	
			}
		
		public void setTelefone(String telefone) {
			this.telefone = telefone;
			}
		
		public String getEmail() {
			return email;	
			}
		
		public void setEmail(String email) {
			this.email = email;
			}
		
		public List<String> getAlergias() {
			return alergias;	
			}
		
		public void setAlergias(List<String> alergias) {
			this.alergias = alergias;
			}
		
		public List<String> getProblemasMedicos() {
			return problemasMedicos;	
			}
		
		public void setProblemasMedicos(List<String> problemasMedicos) {
			this.problemasMedicos = problemasMedicos;
			}
		
		
		public void exibirInformacoes() {
			System.out.println("|++++++++++++++++++++++++++++++++++++++++++|");
			System.out.println("ID: " + id);
			System.out.println("NOME: " + nome);
			System.out.println("TELEFONE: " + telefone);
			System.out.println("EMAIL: " + email);
			System.out.println("ALERGIAS: " + String.join(", ",alergias) );
			System.out.println("PROBLEMAS MÉDICOS: " + String.join(", ",problemasMedicos));
			System.out.println("|++++++++++++++++++++++++++++++++++++++++++|");
			
			
		}
		
	}
