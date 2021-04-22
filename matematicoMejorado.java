
/**
 * Write a description of class matematicoMejorado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class matematicoMejorado{

    private calculadora calculadora;
    
     //ecuacion de segundo grado
        public double ecuacionSegundoGrado(double a, double b, double c){
        double respuesta;
       respuesta = -b+-Math.sqrt(Math.pow(b,2)-4*a*b)/2*a;
        return respuesta;
        
        }
        
        
        //hallar el cateto faltante de un triangulo
        public double hallarCatetoFaltante(double cateto, double hipotenusa){
        double catetoFaltante;
        catetoFaltante=Math.sqrt(Math.pow(hipotenusa,2)-Math.pow(cateto,2));
        return catetoFaltante;
        }
        
        
        //encontrar la ecuacion de la recta
        
        public double encontrarRecta(double x1, double y1, double x2, double y2){
        double resultado;
        resultado = y2-y1/x2-x1;
        return resultado;
        }
    
    }


