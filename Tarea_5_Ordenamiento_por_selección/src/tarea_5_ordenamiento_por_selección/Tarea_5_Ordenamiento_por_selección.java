package tarea_5_ordenamiento_por_selección;

public class Tarea_5_Ordenamiento_por_selección {
    
    public void ordenamientoPorSeleccion(int a[]){
        
        for (int i = 0; i < a.length - 1; i++) {
            int minimo = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j] < a[minimo]){
                    minimo = j;
                
                }
                
            }
            int aux = a[i];
            a[i] = a[minimo];
            a[minimo] = aux;
        }
    }
    public void imprime(int a []){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
            
        }
    
    }
    
    
    
}
