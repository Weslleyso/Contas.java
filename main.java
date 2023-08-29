public class main {
    public static void main (String[] args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumconta(111);
        p1.setDono("Marcos");
        p1.abrirconta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumconta(222);
        p2.setDono("Larissa");
        p2.abrirconta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.estadoAtual();
        p2.estadoAtual();

    }
    
}
