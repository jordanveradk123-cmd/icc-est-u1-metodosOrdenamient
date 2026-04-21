public class MetodoBurbuja {
    int[] arreglo;


    //Constructor
    public MetodoBurbuja(int[] arreglo){
        /**System.out.println("se creo la clase metodo Burbuja");
        1ra FORMA
        //INSTANCIAR CON VALOR CREADO EN CONSTRUCTOR
        this.arreglo = new int[]{10,5,5,0,7}; 
        */

        //2DA FORMA
        // INSTANCIAR CON VALOR DESDE PARAMETRO
        this.arreglo = arreglo;





    }
    public void ordenarAscendente(){
        for (int i=0; i<arreglo.length;i++){
            for(int j= i+1; j<arreglo.length;j++){
                if(arreglo[i]>arreglo[j]){
                    int aux =  arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }

            }
        }
    }
    public void imprimirArreglo(){
        for(int num : arreglo){
            System.out.print(num+", ");
        }
    }
     public void ordenarDecendente(){
        for (int i=0; i>arreglo.length;i++){
            for(int j= i+1; j<arreglo.length;j++){
                if(arreglo[i]<arreglo[j]){
                    int aux =  arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }

            }
        }
    }
    
    
}
