class TrocaNumero{
    private int vet[];
    public void conversao(int numA, int numB)
    { 
        int aux, aux2;
        this.vet=new int[2];        
           aux=numB;
           vet[0]=aux;
           
           
            aux2=numA;
            vet[1]=aux2;
              
        }
          
    
    
    
    public void exibe()
    {
    int tam = this.vet.length;
    for(int i =0 ; i < tam; i++){ 
        System.out.println("Num " + i + ":" + this.vet[i] );
    }
     
    }
}

