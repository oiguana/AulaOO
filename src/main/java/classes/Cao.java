package classes;

public class Cao {
    private String nome;
    private Integer idade;
    private String comprimentoPelos;
    private String corPelos;
    private String corOlhos;
    private Double peso;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if(idade <= 0){
            this.idade = 1;
        }else if(idade >=12 ){
            this.idade = 12;
        }else{
            this.idade = 12;
        }
    }

    public String getComprimentoPelos() {
        return comprimentoPelos;
    }

    public void setComprimentoPelos(String comprimentoPelos) {
        this.comprimentoPelos = comprimentoPelos;
    }

    public String getCorPelos() {
        return corPelos;
    }

    public void setCorPelos(String corPelos) {
        this.corPelos = corPelos;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
