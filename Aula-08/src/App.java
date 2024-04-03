public class App {
    public static void main(String[] args) throws Exception {
        Aluno rafael = new Aluno(11,"rafa","123123");
        rafael.setRa(292048232);
        rafael.setNome("Rafael Benício Santos");
        rafael.setCpf("50719571839");
        System.out.println(rafael.getRa() +"\n"+ rafael.getNome() + "\n"+rafael.getCpf());

        
    }
}
