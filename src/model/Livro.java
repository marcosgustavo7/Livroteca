
package model;
/** Classe feita para manipular os dados/atributos do autor Livro.
 * 
 * @author Marcos.Gustavo
 * @version 1.0
 * @since 27/05/2024
 */
public class Livro {
/**
  Estes são os atributos utilizados por Livro dentro do código. 
    */
    private int id;
    private String nome;
    private String categoria;
    private String autor;
    private String editora;
    private String sinopse;
    private String dataPublicacao; 

    /**
     *  método para retornar varíavel que está no id.
     * @return valor que está na varíavel id.
     */
    public int getId() {
        return id;
    }

    /**
     * método usado para gravar o valor do parâmetro id no atributo id da classe;
     * @param id parâmetro aonde será armazenado o valor de id que será gravado. 
     */
    public void setId(int id) {
        this.id = id;
    }

        /**
     *  método para retornar varíavel que está no nome.
     * @return valor que está na varíavel nome.
     */
    public String getNome() {
        return nome;
    }
    /**
     * método usado para gravar o valor do parâmetro nome no atributo nome da classe;
     * @param nome parâmetro aonde será armazenado o valor de nome que será gravado. 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
            /**
     *  método para retornar varíavel que está no categoria.
     * @return valor que está na varíavel categoria.
     */
        public String getCategoria() {
        return categoria;
    }
                /**
     * método usado para gravar o valor do parâmetro categoria no atributo categoria da classe;
     * @param categoria parâmetro aonde será armazenado o valor de categoria que será gravado. 
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
        /**
     *  método para retornar varíavel que está no autor.
     * @return valor que está na varíavel autor.
     */
    public String getAutor() {
        return autor;
    }
    /**
     * método usado para gravar o valor do parâmetro autor no atributo autor da classe;
     * @param autor parâmetro aonde será armazenado o valor de autor que será gravado. 
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     *  método para retornar varíavel que está na Editora.
     * @return valor que está na varíavel editora.
     */
    public String getEditora() {
        return editora;
    }
    /**
     * método usado para gravar o valor do parâmetro editora no atributo editora da classe;
     * @param editora parâmetro aonde será armazenado o valor de editora que será gravado. 
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }
    /**
     *  método para retornar varíavel que está no sinopse.
     * @return valor que está na varíavel Sinopse.
     */
    public String getSinopse() {
        return sinopse;
    }
    /**
     * método usado para gravar o valor do parâmetro sinopse no atributo sinopse da classe;
     * @param sinopse parâmetro aonde será armazenado o valor de sinopse que será gravado. 
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    /**
     *  método para retornar varíavel que está na DataPublicacao.
     * @return valor que está na varíavel DataPublicacao.
     */
    public String getDataPublicacao() { 
        return dataPublicacao;
    }
    /**
     * método usado para gravar o valor do parâmetro dataPublicacao no atributo dataPublicacao da classe;
     * @param dataPublicacao parâmetro aonde será armazenado o valor de dataPublicacao que será gravado. 
     */
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}