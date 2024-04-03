public class Turma {
    private String curso;
    private String período;
    private String modalidade;

    public Turma(){

    }

    public Turma(String curso, String período, String modalidade){
        this.curso = curso;
        this.período = período;
        this.modalidade = modalidade;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setPeriodo(String período){
        this.período = período;
    }

    public String getPeriodo(){
        return this.período;
    }

    public void setModalidade(String modalidade){
        this.modalidade = modalidade;
    }

    public String getModalidade(){
        return this.modalidade;
    }
}
