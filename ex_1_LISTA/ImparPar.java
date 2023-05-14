class ImparPar
{
    public static void impar()
    {
        int sum=0;
        long mut=1;
        int  n=1;
        while(n !=31)
        {
            if(n %2==0){
            mut= mut *n;
            
        }
        else{
            sum = sum+n;
            
        }
        
        
        n++;
        }
        System.out.println("soma dos numeros impares de 0 a 30 |" +sum);
        System.out.println("multiplicação dos numeros pares de 0 a 30 |" +mut);
    }
    
}