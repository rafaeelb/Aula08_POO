public class Aluno {
    private long ra;
    private String nome;
    private String cpf;

    // public Aluno(){

    // }
    public Aluno(long ra, String nome, String cpf){
        this.ra = ra;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setRa(long ra){
        this.ra = ra;
    }

    public long getRa(){
        return this.ra;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }
}
