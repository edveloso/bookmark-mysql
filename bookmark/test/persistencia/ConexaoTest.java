package persistencia;

import junit.framework.Assert;

import org.junit.Test;

public class ConexaoTest {

	Conexao conexao = new Conexao();
	
	@Test
	public void AbrirConexaotest() {
		Assert.assertNotNull(conexao.abrirConexao());
	}

}
