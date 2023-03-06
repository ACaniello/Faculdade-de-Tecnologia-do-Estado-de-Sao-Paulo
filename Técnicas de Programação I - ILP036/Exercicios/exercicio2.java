public class exercicio2 {
    public static void main (String[] args){
    
        Pessoa p = new Pessoa("Aldo", 54, 18000);
            System.out.println("Nome:"+p.nome);
            System.out.println("Idade:"+p.idade);
            System.out.println("Renda:"+p.renda);
            
        Pessoa p1 = new Pessoa();
            System.out.println("Nome: "+p1.nome);
            System.out.println("Idade: "+p1.idade);
            System.out.println("Renda: "+p1.renda);
            
    
    }
    
}