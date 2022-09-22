package tarea_5_ordenamiento_por_selección;


public class Pruebas_Tarea_5 {
    
    public static void main(String[] args){
        
        Tarea_5_Ordenamiento_por_selección ordena = new Tarea_5_Ordenamiento_por_selección();
        int [] arreglo = {4,2,7,8,99,200,21,1,3};
        ordena.ordenamientoPorSeleccion(arreglo);
        ordena.imprime(arreglo);
        
    
    }
    
}
