public class Pacote{
    private String nome;
    private String descricao;
    private String endereco;

    public Pacote(String nome, String descricao, String endereco){
        this.nome = nome;
        this.descricao = descricao;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    
}
