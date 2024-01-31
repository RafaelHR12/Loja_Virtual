import java.util.Scanner;

public class E_Commerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner ( System.in );
		
		System.out.println( " Olá, seja bem-vindo a nossa loja! " +
		"\n1- Login " +
		"\n2- Cadastro " + 
		"\n3- Recuperar Senha " ); 
		int loginCad = sc.nextInt();
		
		String loginSingup;
		
		loginSingup = realizarLoginCad ( loginCad );
		
		System.out.println( loginSingup );
		
		System.out.println( "\n1- Pesquisar por categoria " +
		"\n2- Obsrvar todos os produtos disponíveis: " );
		int escolha = sc.nextInt();
		
		String produtos;
		
		produtos = menuProdutos( escolha );
		
		System.out.println( produtos );
		
		System.out.println( " Selecione o número do produto para adicionar ao carrinho ou digite 0 para voltar ao menu principal: " );
		int carrinhOrLogout = sc.nextInt();
		
		System.out.println( " Selecione a quantidade deste produto que deseja adicionar ao carrinho: " );
		int quantProd = sc.nextInt();
		
		double valorTotal;
		
		valorTotal = somaProdutos( carrinhOrLogout, quantProd );
		
		System.out.println( valorTotal );
	}
	
	public static String realizarLoginCad ( int loginCad ) {
		
		Scanner sc = new Scanner ( System.in );
		
		String adress;
		String senha;
		String senhaCon;
		boolean confirmação = false;
		String welcome = " Bem-Vindo a Loja e, Boas Compras!";
		
		if ( loginCad == 1 ) {
			System.out.println( " Digite seu nome ou E-mail: " );
			adress = sc.next();
			System.out.println( " Digite sua Senha: " );
			senha = sc.next();
		} else if ( loginCad == 2 ) {
			System.out.println( " Digite seu E-mail: " );
			adress = sc.next();
			System.out.println( " Digite seu nome: " );
			String name = sc.next();
			
			while ( confirmação = false ) {
				System.out.println( " Digite uma Senha: " );
				senha = sc.next();
				System.out.println( " Digite sua Senha novamente: " );
				senhaCon = sc.next();
					if ( senha.equals(senhaCon) ) {
						confirmação = true;
					}
			}
		} else if ( loginCad == 3 ) {
			System.out.println( " Digite seu E-mail: " );
			adress = sc.next();
			System.out.println( " Digite o código de 4 dígitos enviado ao seu E-mail: " );
			int codigo = sc.nextInt();
			
			while ( confirmação = false ) {
				System.out.println( " Digite uma nova Senha: " );
				senha = sc.next();
				System.out.println( " Digite sua Senha novamente: " );
				senhaCon = sc.next();
					if ( senha.equals(senhaCon) ) {
						confirmação = true;
					}
			}
		}
		return welcome;
	}

	public static String menuProdutos( int escolha ) {
		
		Scanner sc = new Scanner ( System.in );
		
		String categoria1 = "Eletrodomesticos: " +
				"\n1- " +  " TV - 40 Polegadas - R$2.500,00 " + 
				"\n2- " + " LUMINÁRIA - 18 leds - 12w - R$150,00 " +
				"\n4- " +  " IPHONE 13- 256gb - 8gb - R$6.500,00 " +
				"\n5- " +  " S23 ULTRA- 256gb - 8gb - R$5.500,00 " +
				"\n8- " +  " PS5 SLIN - 1TB - R$3.500,00 " +
				"\n10- " + " LAVA-ROUPAS - Consul - 234L - 2 Portas - R$2.600,00 ",
				categoria2 = "Livros: " +
				"\n3- " + " CHAPÉUZINHO VERMELHO - Livro infantil - 30 páginas - R$50,00 " +
				"\n6- " + " PAI RICO, PAI POPRE - Best-seller em finanças - Autor Robert Kiyosaki - R$55,00 " +
				"\n7- " + " SENHORA - Período Romantico Brasileiro - Autor José de Alencar - R$30,00 " +
				"\n9- " + " A ARTE DA GUERRA - Autor Sun Tzu - R$40,00 " ;
		
		if ( escolha == 1 ) {
			System.out.println( " Categorias: " +
		    "\n1- Eletrodomesticos " +
		    "\n2- Livros " );
		    int categoriaEscolha = sc.nextInt();
		    
			if ( categoriaEscolha == 1 ) {
				return categoria1;
			} else if ( categoriaEscolha == 2 ) {
				return categoria2;
			}
		} else if ( escolha == 2 ) {
			return categoria1 + "\n\n" + categoria2;
		}
		return categoria1;
	}
	
	public static double somaProdutos( int carrinhOrLogout, int quantProd ) {
		
		Scanner sc = new Scanner ( System.in );
		
		double valor = 0, somaTotal = 0 ;
		
			if ( carrinhOrLogout == 1 ) {
				valor = 2500.0 * quantProd;
		} if ( carrinhOrLogout == 2 ) {
			valor = 150.0 * quantProd;
	}
		somaTotal += valor;
		
		return somaTotal;
	}
}
