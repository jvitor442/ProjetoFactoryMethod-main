package TecnicasDeProgramacaoII.ProjetoFactoryMethod;

public abstract class Pessoa{
    private String nome;
    private String cargo;
    private String cod;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCod() {
        return cod;
    }

    public abstract String relacao();
}