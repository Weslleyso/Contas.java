public class ContaBanco{
    public int numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private Boolean status;
    

   

    public void estadoAtual(){
        System.out.println("-----------------");
        System.out.println("Número conta: "+ this.getNumConta());
        System.out.println("Tipo da conta: "+this.getTipo());
        System.out.println("Dono da conta: "+this.getDono());
        System.out.println("Saldo da conta: "+this.getSaldo());
        System.out.println("Status da conta: "+this.getStatus());
    }

     public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void abrirconta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if(t == "CC"){
            this.setSaldo(50);
        }

        else if( t == "CP"){
            this.setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso");
    }

    public void fecharconta(){
        if(this.getSaldo()>0){
            System.out.println("Não foi possivel fechar conta pois existe saldo");

        }

        else if(this.getSaldo()<0){
            System.out.println("Não foi possivel fechar aconta ainda existe débito nela");
        }

        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
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
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque feito na conta de "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }

    }
         public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }
            else if (this.getTipo() == "Cp"){
                v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Conta paga com sucesso");
        }
        else{
            System.out.println("Conta fechada impossivel pagar");
        }


    

   

  

    }

        






}
