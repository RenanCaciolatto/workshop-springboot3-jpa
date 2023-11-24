package com.renancaciolatto.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.renancaciolatto.curso.entities.Categoria;
import com.renancaciolatto.curso.entities.ItemPedido;
import com.renancaciolatto.curso.entities.Pedido;
import com.renancaciolatto.curso.entities.Produto;
import com.renancaciolatto.curso.entities.Usuario;
import com.renancaciolatto.curso.entities.enums.PedidoStatus;
import com.renancaciolatto.curso.repositories.CategoriaRepository;
import com.renancaciolatto.curso.repositories.ItemPedidoRepository;
import com.renancaciolatto.curso.repositories.PedidoRepository;
import com.renancaciolatto.curso.repositories.ProdutoRepository;
import com.renancaciolatto.curso.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired 
	private ProdutoRepository produtoRepository;
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Pedido o1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), PedidoStatus.PAGO, u1);
		Pedido o2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), PedidoStatus.ESPERANDO_PAGAMENTO, u2);
		Pedido o3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), PedidoStatus.ESPERANDO_PAGAMENTO, u1); 
		
		Categoria cat1 = new Categoria(null, "Eletronicos");
		Categoria cat2 = new Categoria(null, "Livros");
		Categoria cat3 = new Categoria(null, "Computadores"); 

		Produto p1 = new Produto(null, "O Senhor Dos Anéis", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Produto p2 = new Produto(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Produto p3 = new Produto(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Produto p4 = new Produto(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Produto p5 = new Produto(null, "Diário de um banana", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 

		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

		p1.getCategorias().add(cat2);
		p2.getCategorias().add(cat1);
		p2.getCategorias().add(cat3);
		p3.getCategorias().add(cat3);
		p4.getCategorias().add(cat3);
		p5.getCategorias().add(cat2);
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
		pedidoRepository.saveAll(Arrays.asList(o1,o2,o3));
		
		ItemPedido ip1 = new ItemPedido(o1, p1, 2, p1.getPreco());
		ItemPedido ip2 = new ItemPedido(o1, p3, 1, p3.getPreco());
		ItemPedido ip3 = new ItemPedido(o2, p3, 2, p3.getPreco());
		ItemPedido ip4 = new ItemPedido(o3, p5, 2, p5.getPreco()); 

		itemPedidoRepository.saveAll(Arrays.asList(ip1,ip2,ip3,ip4));
	}
}