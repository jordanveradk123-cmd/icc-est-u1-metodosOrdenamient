public class App {
    public static void main(String[] args) throws Exception {
       // metodoBurbuja();
       runMetodoBUrbujaAvanzado();

    }
    public static void runMetodoBUrbujaAvanzado(){
        int[]arreglo = new int[]{50,5,20,30,0,-10,15};
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(true);
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.printArreglo();

    }
        
    

   /**  public static  void metodoBurbuja(){
        System.out.println("Metodo Burbuja");
        int[] arreglo = new int[] {10,-5,0,2,7};
        MetodoBurbuja metododBurbuja = new MetodoBurbuja(arreglo);
        metododBurbuja.imprimirArreglo();
        metododBurbuja.ordenarAscendente();
        metododBurbuja.imprimirArreglo();
        metododBurbuja.ordenarDecendente();
        metododBurbuja.imprimirArreglo();
    }*/
}    
   


