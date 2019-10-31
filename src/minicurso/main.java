package minicurso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		LocalDateTime agora  = LocalDateTime.now();
		LocalDateTime hojeCedo = hoje.atTime(15, 25, 30);
		LocalDate aniversario = LocalDate.of(1992,9,29);
		LocalDate aniversarioComParse = LocalDate.parse("1992-09-29");
		LocalDateTime aniversarioComHora = aniversario.atTime(15, 25, 30);
		LocalDateTime futuro = LocalDateTime.parse("2058-01-01T23:48:00.123");
		Long diasQueVivi = aniversario.until(hoje, ChronoUnit.DAYS);
		Long HorasQueVivi = aniversarioComHora.until(agora, ChronoUnit.HOURS);
		Long HorasQueViviNoFuturo = aniversarioComHora.until(futuro, ChronoUnit.HOURS);
		LocalDate dataFuturo = hoje.plusDays(1834);
		LocalDate aniversarioDe10000Dias = hoje.plusDays(108);
		LocalDate mesesAtras = hoje.minusMonths(45);
		LocalDateTime horasFuturas = agora.plusHours(720);


		System.out.println(horasFuturas);
		System.out.println(mesesAtras);
		System.out.println(aniversarioDe10000Dias);



		System.out.println(dataFuturo);
		System.out.println(10000-diasQueVivi);
		System.out.println(diasQueVivi);
		System.out.println(HorasQueVivi);
		System.out.println(HorasQueViviNoFuturo);
		System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));
		System.out.println(agora.format(DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss")));
		System.out.println(agora);
		System.out.println(hojeCedo.format(DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss")));
		System.out.println(aniversario);
		System.out.println(aniversarioComHora);
		System.out.println(aniversarioComParse);
		System.out.println(futuro);


		// MOCs
		//List<Produto> estoque = mocarProduto();
		//List<Produto> estoque = new ArrayList<>();
		//List<String> palavras = Arrays.asList("AAAAAA", "BBBBBBBBBBB", "CCCCCCCCCCCCCCCCCCCCCCC", "");

		//exercicio1(palavras);
		//join(palavras);
		//exercicio2(estoque);
	}
	
	private static List<Produto> mocarProduto () {
		String doces = "Doces";
		String limpeza = "Limpeza";
		String alimentos = "Alimentos";
		String carro = "Carro";
		List<Produto> retorno = new ArrayList<>();
		Produto p1 = new Produto();
		p1.setNome("Fini");
		p1.setQtdEstoque(8);
		p1.setPreco(3.0);
		p1.setCategoria(doces);
		retorno.add(p1);
		
		Produto p2 = new Produto();
		p2.setNome("Snickers");
		p2.setQtdEstoque(0);
		p2.setPreco(3.8);
		p2.setCategoria(doces);
		retorno.add(p2);
		
		Produto p3 = new Produto();
		p3.setNome("Amaciante");
		p3.setQtdEstoque(10);
		p3.setPreco(25.5);
		p3.setCategoria(limpeza);
		retorno.add(p3);
		
		Produto p4 = new Produto();
		p4.setNome("OMO");
		p4.setQtdEstoque(3);
		p4.setPreco(15.2);
		p4.setCategoria(limpeza);
		retorno.add(p4);
		
		Produto p5 = new Produto();
		p5.setNome("Carne");
		p5.setQtdEstoque(10);
		p5.setPreco(35.0);
		p5.setCategoria(alimentos);
		retorno.add(p5);
		
		Produto p6 = new Produto();
		p6.setNome("Arroz");
		p6.setQtdEstoque(0);
		p6.setPreco(12.2);
		p6.setCategoria(alimentos);
		retorno.add(p6);
		
		Produto p7 = new Produto();
		p7.setNome("Limpador");
		p7.setQtdEstoque(10);
		p7.setPreco(30.0);
		p7.setCategoria(carro);
		retorno.add(p7);
		
		Produto p8 = new Produto();
		p8.setNome("Pneu");
		p8.setQtdEstoque(2);
		p8.setPreco(350.0);
		p8.setCategoria(carro);
		retorno.add(p8);
		
		Produto p9 = new Produto();
		p9.setNome("Retrovisor");
		p9.setQtdEstoque(0);
		p9.setPreco(200.8);
		p9.setCategoria(carro);
		retorno.add(p9);
		
		Produto p10 = new Produto();
		p10.setNome("So pra ferrar tudo");
		p10.setQtdEstoque(0);
		retorno.add(p10);
		
		return retorno;
		
	}
	
	private static void exercicio1 (List<String> palavras) {
		for (String palavra : palavras) {
			System.out.println(palavra.length());
		}

        palavras.forEach(x -> System.out.println(x.length()));

		palavras.stream().mapToInt(String::length).forEach(System.out::println);



    }

	public static void exercicio2 (List<Produto> estoque){
		//estoque.stream().forEach(System.out::println);
		//estoque.stream().forEach(x -> System.out.println(x.getNome() + ": " + x.getNome()));

		//Integer sum = estoque.stream().filter(x -> x.getFlgPossuiEstoque() && "Carro".equals(x.getCategoria())).mapToInt(x -> x.getQtdEstoque()).sum();
		//System.out.println("Stock sum: " + sum);

		//Long count = estoque.stream().filter(x -> x.getFlgPossuiEstoque() && "Carro".equals(x.getCategoria())).count();
		//System.out.println("Count products: " + count);

		//estoque.stream().filter(x -> x.getFlgPossuiEstoque() && "Carro".equals(x.getCategoria())).forEach(x -> System.out.println(x.getQtdEstoque()));
		//estoque.stream().filter(x -> x.getFlgPossuiEstoque() && "Carro".equals(x.getCategoria())).collect(Collectors.summingInt());

		//System.out.println(estoque.stream().filter(x -> "Carro".equals(x.getCategoria())).filter(Produto::getFlgPossuiEstoque).mapToInt(Produto::getQtdEstoque).sum());
		//System.out.println(estoque.stream().filter(x -> "Carro".equals(x.getCategoria())).filter(Produto::getFlgPossuiEstoque).count());

		System.out.println(
			estoque.stream()
			.filter(x -> !x.getFlgPossuiEstoque())
			.mapToDouble(x -> Optional.ofNullable(x.getPreco()).orElse(0.0))
			.average()
			.orElse(0.0));

		//estoque.stream().filter(x -> !x.getFlgPossuiEstoque()).mapToDouble(Produto::getPreco).forEach(System.out::println);
	}

	public static void join (List<String> palavras){
		String a = palavras.stream()
				//.map(...)
				.collect(Collectors.joining(",")).toString();
		System.out.println(a);
	}
}
