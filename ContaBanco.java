public class ContaBanco{
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-------------------------");
        System.out.println("Conta: "+this.getNumconta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());


    }

    //metodos

    public void abrirconta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);
        }
        else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharconta(){
        if (this.getSaldo()>0){
            System.out.println("conta não pode ser fechada ainda tem dinheiro.");
        }
        else if (this.getSaldo()<0){
            System.out.println("Conta não pode ser fechada ainda existe débito.");
        }
        else{
           this.setStatus(false);
           System.out.println("conta fechada com sucesso"); 
        }

    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado na conta de "+this.getDono());

        } else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(float v){
        if(this.getStatus()){
            if (this.getSaldo()>= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de: "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
        }
        
    

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }   else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com suecco por "+ this.getDono());
        } else{
            System.out.println("Impossivel pagar uma conta fechada");
        }

    }


    //metodos especiais
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);

    }
    public void setNumconta(int n){
        this.numConta = n;
    }

    public int getNumconta(){
        return this.numConta;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }


}
