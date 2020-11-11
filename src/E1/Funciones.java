package E1;

import java.util.Scanner;

public class Funciones {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int M1[][],filas,columnas;
        int M2[][],filas,columnas;
        int Suma[][],filas,columnas;
        int M3[][],columnas,columnas3;
        int Mult[][],filas,columnas3;
        int aux,cont1,cont2;
        
        System.out.print("Por favor ingrese el número de filas de las matrices (M1 y M2): ");
        filas = entrada.nextInt();
        System.out.println("");
        System.out.print("Por favor ingrese el número de columnas de las matrices (M1 y M2): ");
        columnas = entrada.nextInt();   
        
        M1 = new int [filas][columnas];
        M2 = new int [filas][columnas];
        Suma = new int [filas][columnas];
        
        System.out.println("");
        System.out.println("diga los valores de la Matriz 1");
        
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print("Fila ["+(i+1)+"] Columna ["+(j+1)+"]: ");
                M1[i][j] = entrada.nextInt();
    
            }
        }
        
        System.out.println("");
        System.out.println("Su Matriz 1 es: ");
        System.out.println("");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print(M1[i][j]+" ");
                
            }
            
            System.out.println("");
            
        }

        System.out.println("");
        System.out.println("diga los valores de la Matriz 2");
        
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print("Fila ["+(i+1)+"] Columna ["+(j+1)+"]: ");
                M2[i][j] = entrada.nextInt();
    
            }
        }
        
        System.out.println("");
        System.out.println("Su Matriz 2 es: ");
        System.out.println("");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print(M2[i][j]+" ");
                
            }
            
            System.out.println("");
            
        }
        
        //suma de las 2 matrices
        System.out.println("");
        System.out.println("La suma de Matriz 1 + Matriz 2 es: ");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                Suma[i][j] = M1[i][j] + M2[i][j];
                
            }
        }      
        System.out.println("");
         for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print(Suma[i][j]+" ");
                
            }
            System.out.println("");
        }   
        System.out.println(""); 
        System.out.print("Por favor ingrese el número de columnas de la matriz (M3): ");
        columnas3 = entrada.nextInt();
        M3 = new int [columnas][columnas3];
        Mult = new int [filas][columnas3];
        System.out.println(""); 
        System.out.println("diga los valores de la Matriz 3");
        
        for (int i=0;i<columnas;i++){
            for (int j=0;j<columnas3;j++){
                
                System.out.print("Fila ["+(i+1)+"] Columna ["+(j+1)+"]: ");
                M3[i][j] = entrada.nextInt();
    
            }
        } 
        
        System.out.println("");
        System.out.println("Su Matriz 3 es: ");
        System.out.println("");
        for (int i=0;i<columnas;i++){
            for (int j=0;j<columnas3;j++){
                
                System.out.print(M3[i][j]+" ");
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println(""); 
        System.out.println("La multiplicación de (Suma x Matriz 3) es: ");
        System.out.println("");
        
        cont2 = 0;
        cont1 = 0;
        
        for (int cont2=0;cont2<columnas3;cont2++){
            for (int cont1=0;cont1<filas;cont1++){
                aux = 0;
                  for (int i=0;i<columnas;i++){
                
                    aux = ((Suma[cont1][i]) * (M3[i][cont2])) + aux;
          
                  }
            
                   Mult[cont1][cont2] = aux;
  
            }                
        }      
         for (int i=0;i<filas;i++){
            for (int j=0;j<columnas3;j++){
                
                System.out.print(Mult[i][j]+" ");
                
            }
            System.out.println("");
        }   
         System.out.println("");
         
        //PREGUNTA 2
        System.out.println("");
        Scanner entrada = new Scanner (System.in);
        int Mxy[][],filas,columnas;
        int X,Y;
        
        System.out.print("Por favor ingrese el número de filas de la matriz: ");
        filas = entrada.nextInt();
        System.out.println("");
        System.out.print("Por favor ingrese el número de columnas de la matriz: ");
        columnas = entrada.nextInt();
        
        Mxy = new int [filas][columnas];
       
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                Mxy[i][j] = (2304+10*(i+1))+(2003-3+10*(j+1));
                
            }
        }   
         System.out.println("");
        
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print(Mxy[i][j]+" ");
                
            }
            System.out.println("");
        }   
         System.out.println("");
        
        //Pregunta 3
        
        System.out.println("");
        Scanner entrada = new Scanner (System.in);
        int Mi[][],filas,columnas;
        int aux;
        
        System.out.print("Por favor ingrese el número de filas de la matriz: ");
        filas = entrada.nextInt();
        System.out.println("");
        System.out.print("Por favor ingrese el número de columnas de la matriz: ");
        columnas = entrada.nextInt();
        if (filas==columnas){
            
        Mi = new int [filas][columnas];
        
        aux = 0;
        
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print("Fila ["+(i+1)+"] Columna ["+(j+1)+"]: ");
                Mi[i][j] = entrada.nextInt();
                
            }
        }   
         System.out.println("");
        
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print(Mi[i][j]+" ");
                
            }
            System.out.println("");
        }   
         System.out.println("");
        
          for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                if(i==j){
                    
                    if (Mi[i][j]!=1){
                        
                        aux = 1;
                             
                    }
                    
                }
                else{
                    
                    if (Mi[i][j]!=0){
                           
                        aux = 1;
                        
                    }
                    
                }
            }
        }   
           
        if (aux==0){
            
           System.out.println("Es una matriz indentidad");
            
        }  
        else{
            
           System.out.println("No es una matriz indentidad");
            
        }
          
        }else {
            System.out.println("La matriz no es identidad por no ser cuadrada");
        }
        
        
        
        //Pregunta 4
        System.out.println("");
        System.out.println("");
        Scanner entrada = new Scanner (System.in);
        int Mti[][],filas,columnas;
        int aux;
        aux=0;
        
        System.out.print("Por favor ingrese el número de filas de la matriz: ");
        filas = entrada.nextInt();
        System.out.println("");
        System.out.print("Por favor ingrese el número de columnas de la matriz: ");
        columnas = entrada.nextInt();
        if (filas==columnas){
            
         Mti = new int [filas][columnas];
        
         for (int i=0;i<filas;i++){
             for (int j=0;j<columnas;j++){
                
                System.out.print("Fila ["+(i+1)+"] Columna ["+(j+1)+"]: ");
                Mti[i][j] = entrada.nextInt();
                
             }
         }   
         System.out.println("");
        
         for (int i=0;i<filas;i++){
             for (int j=0;j<columnas;j++){
                
                System.out.print(Mti[i][j]+" ");
                
             }
             System.out.println("");
         }   
         System.out.println("");
        
          for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                if(j>i){
                   
                    if(Mti[i][j]==0){
                     
                        aux=0;    
                        
                    }
                    else{
                        
                        aux=1;
                        
                    }
                }
            }
          }   
           
        if (aux==0){
            
           System.out.println("Es una matriz triangular inferior");
            
        }  
        else{
            
           System.out.println("No es una matriz triangular inferior");
            
        }
          
        }else {
            System.out.println("La matriz no es triangular inferior por no ser cuadrada");
        }
        
        
    }  
}
