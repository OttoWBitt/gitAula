/**
 * Algoritmo e Estrutura de Dados II
 * @author Ygor Matheus Lacerda de Melo
 * 481699
 * 28/09/2018
 */

import java.util.*;

class Instituicao{

	private int codigo;
	private String nome;
	private String sigla;
	private int codigoMantenedora;
	private String mantenedora;
	private int categoria;
	private int organizacao;
	private int codigoMunicipio;
	private String municipio;
	private String uf;
	private String regiao;
	private int tecnico;
	private int periodico;
	private int livro;
	private double receita;
	private double transferencia;
	private double outraReceita;
	private double despesaDocente;
	private double despesaTecnico;
	private double despesaEncargo;
	private double despesaCusteio;
	private double despesaInvestimento;
	private double despesaPesquisa;
	private double despesaOutras;

	/**
	 * Construtor vazio
	 */
	public Instituicao(){
		this.codigo = 0;
		this.nome = "";
		this.sigla = "";
		this.codigoMantenedora = 0;
		this.mantenedora = "";
		this.categoria = 0;
		this.organizacao = 0;
		this.codigoMunicipio = 0;
		this.municipio = "";
		this.uf = "";
		this.regiao = "";
		this.tecnico = 0;
		this.periodico = 0;
		this.livro = 0;
		this.receita = 0.0;
		this.transferencia = 0.0;
		this.outraReceita = 0.0;
		this.despesaDocente = 0.0;
		this.despesaTecnico = 0.0;
		this.despesaEncargo = 0.0;
		this.despesaCusteio = 0.0;
		this.despesaInvestimento = 0.0;
		this.despesaPesquisa = 0.0;
		this.despesaOutras = 0.0;
	}
	
	/**
	 * [Instituicao Construtor que recebe os parametros]
	 * @param  codigo              [int]
	 * @param  nome                [String]
	 * @param  sigla               [String]
	 * @param  codigoMantenedora   [int]
	 * @param  mantenedora         [String]
	 * @param  categoria           [int]
	 * @param  organizacao         [int]
	 * @param  codigoMunicipio     [int]
	 * @param  municipio           [String]
	 * @param  uf                  [String]
	 * @param  regiao              [String]
	 * @param  tecnico             [int]
	 * @param  periodico           [int]
	 * @param  livro               [int]
	 * @param  receita             [double]
	 * @param  transferencia       [double]
	 * @param  outraReceita        [double]
	 * @param  despesaDocente      [double]
	 * @param  despesaTecnico      [double]
	 * @param  despesaEncargo      [double]
	 * @param  despesaCusteio      [double]
	 * @param  despesaInvestimento [double]
	 * @param  despesaPesquisa     [double]
	 * @param  despesaOutras       [double]
	 * @return                     [double]
	 */
	public Instituicao(int codigo, String nome, String sigla, int codigoMantenedora, String mantenedora, int categoria, int organizacao,
		int codigoMunicipio, String municipio, String uf, String regiao, int tecnico, int periodico, int livro, double receita,
		double transferencia, double outraReceita, double despesaDocente, double despesaTecnico, double despesaEncargo, 
		double despesaCusteio, double despesaInvestimento, double despesaPesquisa, double despesaOutras){
			this.codigo = codigo;
			this.nome = nome;
			this.sigla = sigla;
			this.codigoMantenedora = codigoMantenedora;
			this.mantenedora = mantenedora;
			this.categoria = categoria;
			this.organizacao = organizacao;
			this.codigoMunicipio = codigoMunicipio;
			this.municipio = municipio;
			this.uf = uf;
			this.regiao = regiao;
			this.tecnico = tecnico;
			this.periodico = periodico;
			this.livro = livro;
			this.receita = receita;
			this.transferencia = transferencia;
			this.outraReceita = outraReceita;
			this.despesaDocente = despesaDocente;
			this.despesaTecnico = despesaTecnico;
			this.despesaEncargo = despesaEncargo;
			this.despesaCusteio = despesaCusteio;
			this.despesaInvestimento = despesaInvestimento;
			this.despesaPesquisa = despesaPesquisa;
			this.despesaOutras = despesaOutras;
	}

	/**
	 * Metodos Set's e Get's
	 */

	public int getCodigo(){
		return this.codigo;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}//Codigo

	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}//Nome

	public String getSigla(){
		return this.sigla;
	}
	public void setSigla(String sigla){
		this.sigla = sigla;
	}//Sigla

	public int getCodigoMantenedora(){
		return this.codigoMantenedora;
	}
	public void setCodigoMantenedora(int codigoMantenedora){
		this.codigoMantenedora = codigoMantenedora;
	}//CodigoMantenedora

	public String getMantenedora(){
		return this.mantenedora;
	}
	public void setMantenedora(String mantenedora){
		this.mantenedora = mantenedora;
	}//Mantenedora

	public int getCategoria(){
		return this.categoria;
	}
	public void setCategoria(int categoria){
		this.categoria = categoria;
	}//Categoria

	public int getOrganizacao(){
		return this.organizacao;
	}
	public void setOrganizacao(int organizacao){
		this.organizacao = organizacao;
	}//Organizacao

	public int getCodigoMunicipio(){
		return this.codigoMunicipio;
	}
	public void setCodigoMunicipio(int codigoMunicipio){
		this.codigoMunicipio = codigoMunicipio;
	}//CodigoMunicipio

	public String getMunicipio(){
		return this.municipio;
	}
	public void setMunicipio(String municipio){
		this.municipio = municipio;
	}//Municipio

	public String getUf(){
		return this.uf;
	}
	public void setUf(String uf){
		this.uf = uf;
	}//Uf

	public String getRegiao(){
		return this.regiao;
	}
	public void setRegiao(String regiao){
		this.regiao = regiao;
	}//Regiao

	public int getTecnico(){
		return this.tecnico;
	}
	public void setTecnico(int tecnico){
		this.tecnico = tecnico;
	}//Tecnico

	public int getPeriodico(){
		return this.periodico;
	}
	public void setPeriodico(int periodico){
		this.periodico = periodico;
	}//Periodico

	public int getLivro(){
		return this.livro;
	}
	public void setLivro(int livro){
		this.livro = livro;
	}//Livro

	public double getReceita(){
		return this.receita;
	}
	public void setReceita(double receita){
		this.receita = receita;
	}//Receita

	public double getTrasferencia(){
		return this.transferencia;
	}
	public void setTransferencia(double transferencia){
		this.transferencia = transferencia;
	}//Transferencia

	public double getOutraReceita(){
		return this.outraReceita;
	}
	public void setOutraReceita(double outraReceita){
		this.outraReceita = outraReceita;
	}//OutraReceita

	public double getDespesaDocente(){
		return this.despesaDocente;
	}
	public void setDespesaDocente(double despesaDocente){
		this.despesaDocente = despesaDocente;
	}//DespesaDocente

	public double getDespesaTecnico(){
		return this.despesaTecnico;
	}
	public void setDespesaTecnico(double despesaTecnico){
		this.despesaTecnico = despesaTecnico;
	}//DespesaTecnico

	public double getDespesaEncargo(){
		return this.despesaEncargo;
	}
	public void setDespesaEncargo(double despesaEncargo){
		this.despesaEncargo = despesaEncargo;
	}//DespesaEncargo

	public double getDespesaCusteio(){
		return this.despesaCusteio;
	}
	public void setDespesaCusteio(double despesaCusteio){
		this.despesaCusteio = despesaCusteio;
	}//getDespesaCusteio

	public double getDespesaInvestimento(){
		return this.despesaInvestimento;
	}
	public void setDespesaInvestimento(double despesaInvestimento){
		this.despesaInvestimento = despesaInvestimento;
	}//getDespesaInvestimento

	public double getDespesaPesquisa(){
		return this.despesaPesquisa;
	}
	public void setDespesaPesquisa(double despesaPesquisa){
		this.despesaPesquisa = despesaPesquisa;
	}//getDespesaPesquisa

	public double getDespesaOutras(){
		return this.despesaOutras;
	}
	public void setDespesaOutras(double despesaOutras){
		this.despesaOutras = despesaOutras;
	}//despesaOutras

	/**
	 * [clone Cria uma copia dos objetos da Instituicao]
	 * @return [Retorna a copia dos objetos]
	 */
	public Instituicao clone(){
		return new Instituicao(getCodigo(), getNome(), getSigla(), getCodigoMantenedora(), getMantenedora(), getCategoria(), getOrganizacao(), getCodigoMunicipio(), getMunicipio(),
		getUf(), getRegiao(), getTecnico(), getPeriodico(), getLivro(), getReceita(), getTrasferencia(), getOutraReceita(), getDespesaDocente(), getDespesaTecnico(), 
		getDespesaEncargo(), getDespesaCusteio(), getDespesaInvestimento(), getDespesaPesquisa(), getDespesaOutras());
	}//fim clone

	/**
	 * [ler Cria um vetor de valores e armazena em cada posicao do vetor de entrada
	 * um objeto do tipo Instituicao]
	 * @param entrada [array do tipo Instituicao em que cada posicao tem informacoes
	 * de uma instituicao]
	 */
	public static void ler(Instituicao[] entrada){
		String linha;
		String [] valores;

		//Abrir o arquivo para leitura
		Arq.openRead("/tmp/censo.dat", "ISO-8859-15");
		//BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream("/tmp/censo.dat", "ISO-8859-15"))); 
		
		int posicao = 0;
		linha = Arq.readLine();

		while(Arq.hasNext()){
			linha = Arq.readLine();
			valores = linha.split("\t");

			entrada[posicao].setCodigo(Integer.parseInt(valores[0]));
			entrada[posicao].setNome(valores[1]);
			entrada[posicao].setSigla(valores[2]);
			entrada[posicao].setCodigoMantenedora(Integer.parseInt(valores[3]));
			entrada[posicao].setMantenedora(valores[4]);
			entrada[posicao].setCategoria(Integer.parseInt(valores[5]));
			entrada[posicao].setOrganizacao(Integer.parseInt(valores[6]));
			entrada[posicao].setCodigoMunicipio(Integer.parseInt(valores[7]));
			entrada[posicao].setMunicipio(valores[8]);
			entrada[posicao].setUf(valores[9]);
			entrada[posicao].setRegiao(valores[10]);
			entrada[posicao].setTecnico(Integer.parseInt(valores[11]));
			entrada[posicao].setPeriodico(Integer.parseInt(valores[12]));
			entrada[posicao].setLivro(Integer.parseInt(valores[13]));
			entrada[posicao].setReceita(Double.parseDouble(valores[14]));
			entrada[posicao].setTransferencia(Double.parseDouble(valores[15]));
			entrada[posicao].setOutraReceita(Double.parseDouble(valores[16]));
			entrada[posicao].setDespesaDocente(Double.parseDouble(valores[17]));
			entrada[posicao].setDespesaTecnico(Double.parseDouble(valores[18]));
			entrada[posicao].setDespesaEncargo(Double.parseDouble(valores[19]));
			entrada[posicao].setDespesaCusteio(Double.parseDouble(valores[20]));
			entrada[posicao].setDespesaInvestimento(Double.parseDouble(valores[21]));
			entrada[posicao].setDespesaPesquisa(Double.parseDouble(valores[22]));
			entrada[posicao].setDespesaOutras(Double.parseDouble(valores[23]));
			
			posicao++;
		}
		Arq.close();
	}

	public void imprimir(){
		MyIO.print(getCodigo() + " " + getNome() + " " + getSigla() + " " + getCodigoMantenedora() + " " +
			getMantenedora() + " " + getCategoria() + " " + getOrganizacao() + " " + getCodigoMunicipio() + " " +
			getMunicipio() + " " + getUf() + " " + getRegiao() + " " + getTecnico() + " " + getPeriodico() + " " +
			getLivro() + " " + getReceita() + " " + getTrasferencia() + " " + getOutraReceita() + " " + 
			getDespesaDocente() + " " + getDespesaTecnico() + " " + getDespesaEncargo() + " " +	getDespesaCusteio() + " " +
			getDespesaInvestimento() + " " + getDespesaPesquisa() + " " + getDespesaOutras() + "\n");
	}
}

class Lista{
	private Instituicao[] array;
	private int n;

	public int quantidadeComparacoes;
	public int quantidadeMovimentacoes;

	public Lista(){
		this(1000);
	}

	public Lista(int tamanho){
		array = new Instituicao[tamanho];
		n = 0;
	}

	public void inserirInicio(Instituicao x) throws Exception{
		//Validar insercao
		if(n >= array.length){
			quantidadeComparacoes += 1;
			throw new Exception("Erro ao inserirI!");
		}

		//Levar elementos para o fim do array
		for(int i = n; i > 0; i--){
			quantidadeComparacoes += 1;
			array[i] = array[i-1].clone();
			quantidadeMovimentacoes += 1;
		}

		array[0] = x.clone();
		quantidadeMovimentacoes += 1;
		n++;
	}//Fim inserirInicio

	public void inserir(Instituicao x, int pos) throws Exception{
		//Validar insercao
		if(n >= array.length || pos < 0 || pos > n){
			quantidadeComparacoes += 1;
			throw new Exception("Erro ao inserir!");
		}

		//Levar elementos para o fim do array
		for(int i = n; i > pos; i--){
			quantidadeComparacoes += 1;
			array[i] = array[i-1].clone();
			quantidadeMovimentacoes += 1;
		}
		array[pos] = x.clone();
		quantidadeMovimentacoes += 1;
		n++;
	}//Fim inserir

	public void inserirFim(Instituicao x) throws Exception{
		//Validar insercao
		if(n >= array.length){
			quantidadeComparacoes += 1;
			throw new Exception("Erro ao inserirF!");
		}
		array[n] = x.clone();
		quantidadeMovimentacoes += 1;
		n++;
	}//Fim inserirFim

	public Instituicao removerInicio() throws Exception{
		//Validar remocao
		if(n == 0){
			quantidadeComparacoes += 1;
			throw new Exception("Erro ao removerI!");
		}

		Instituicao resposta = array[0].clone();
		n--;
		for(int i = 0; i < n; i++){
			quantidadeComparacoes += 1;
			array[i] = array[i+1].clone();
			quantidadeMovimentacoes += 1;
		}
		return resposta;
	}//Fim removerInicio

	public Instituicao remover(int pos) throws Exception{
		//Validar remocao
		if(n == 0 || pos < 0 || pos >= n){
			quantidadeComparacoes += 1;
			throw new Exception("Erro ao remover!");
		}

		Instituicao resposta = array[pos].clone();
		n--;

		for(int i = pos; i < n; i++){
			quantidadeComparacoes += 1;
			array[i] = array[i+1].clone();
			quantidadeMovimentacoes += 1;
		}
		return resposta;
	}//Fim remover

	public Instituicao removerFim() throws Exception{
		//Validar remocao
		if(n == 0){
			quantidadeComparacoes += 1;
			throw new Exception("Erro ao removerF!");
		}
		quantidadeMovimentacoes += 1;
		return array[--n];
	}//Fim removerFim

	public void mostrar(){
		for(int i = 0; i < n; i++){
			quantidadeComparacoes += 1;
			array[i].imprimir();
		}
	}//Fim mostrar

	public boolean pesquisar(Instituicao x){
		boolean retorno = false;

		for(int i = 0; i < n && retorno == false; i++){
			retorno = (array[i] == x);
		}

		return retorno;
	}//Fim pesquisa

	public Instituicao getInstituicao(int posicao) throws Exception{
		Instituicao resposta = new Instituicao();
		resposta = array[posicao].clone();

		return resposta;
	}

	/**
	 * [shellsort Metodo de ordenacao shellsort]
	 * @throws Exception [Tratamento de excessao]
	 */
	public void shellsort() throws Exception{
		int h = 1;

		do{
			h = (h*3) + 1;
		}while(h < n);

		do{
			h /= 3;
			for(int cor = 0; cor < h; cor++){
				insercaoPorCor(cor, h);
			}
		}while(h != 1);
	}

	/**
	 * [insercaoPorCor Insercao nos pseudos arrays do shellsort]
	 * @param cor [bit de cor identificando um pseudo array]
	 * @param h   [quantidade de sub arrays]
	 */
	public void insercaoPorCor(int cor, int h){
		for(int i = (h + cor); i < n; i += h){
			Instituicao temporaria = array[i].clone();
			int j = i - h;

			while((j >= 0) && (array[j].getUf().compareTo(temporaria.getUf()) > 0)){
				array[j+h] = array[j].clone();
				j -= h;
			}
			array[j+h] = temporaria;
		}
	}

	/**
	 * [shellsortAuxiliar Metodo shellsort chamando outro insercaoPorCor]
	 * @throws Exception [Tratamento de excessao ]
	 */
	public void shellsortAuxiliar() throws Exception{
		int h = 1;

		do{
			h = (h*3) + 1;
		}while(h < n);

		do{
			h /= 3;
			for(int cor = 0; cor < h; cor++){
				insercaoPorCorSigla(cor, h);
			}
		}while(h != 1);
	}

	/**
	 * [insercaoPorCorSigla Mesmo metodo do insercaoPorCor mas aqui tratando caso a UF seja a mesma, desempatamos pela sigla]
	 * @param cor [bit de cor identificando um pseudo array]
	 * @param h   [quantidade de sub arrays]
	 */
	public void insercaoPorCorSigla(int cor, int h){
		for(int i = (h + cor); i < n; i += h){
			Instituicao temporaria =  array[i].clone();
			int j = i - h;

			if((j >= 0) && (array[j].getUf().compareTo(temporaria.getUf()) == 0)){
				while((j >= 0) && (array[j].getSigla().compareTo(temporaria.getSigla()) > 0) && (array[j].getUf().compareTo(temporaria.getUf()) == 0)){
					array[j+h] = array[j].clone();
					j -= h;
				}
			}
			array[j+h] = temporaria;
		}
	}

}//Fim class Lista

class TP01P02Q11_Shellsort{

	public static long now(){
		return new Date().getTime();
	}

	public static void main(String[]args) throws Exception{
		Instituicao instituicao = new Instituicao();
		Instituicao [] entrada = new Instituicao[10000];
		Lista lista = new Lista();
		
		int codigo = -1;
		int quantidadeComparacoes = 0;
		int quantidadeMovimentacoes = 0;

		long inicio = now();

		for(int i = 0; i < 10000; i++){
			entrada[i] = new Instituicao();
		}

		Instituicao.ler(entrada);

		while(codigo != 0){
			codigo = MyIO.readInt();

			if(codigo != 0){
				lista.inserirFim(entrada[codigo-1]);
			}			
		}
		lista.shellsort();
		lista.shellsortAuxiliar();
		lista.mostrar();

		long fim = now();
		Arq.openWrite("481699_shellsort.txt");
		Arq.print("481699\t" + (fim - inicio)/1000.0+"\t" + lista.quantidadeComparacoes);
		Arq.close();
	}
}