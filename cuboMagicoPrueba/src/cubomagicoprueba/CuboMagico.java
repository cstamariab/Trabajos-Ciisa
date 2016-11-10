/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubomagicoprueba;

/**
 *
 * @author Christian
 */
public class CuboMagico {
    
    public CuboMagico() {        
        this.resuelve_cuadrado();
    }

    public int[][] resuelve_cuadrado(int casillas) {
        
        int[][] cubo = new int[casillas][casillas];
        int x = cubo.length / 2; // comenzamos desde la mitad 
        int y = 0;
        int total_casillas = casillas * casillas;
        int limite_x = casillas - 1;
        int limite_y = casillas - 1;
       
        for (int valor_casilla = 1; valor_casilla <= total_casillas; valor_casilla++) {            
            cubo[x][y] = valor_casilla;
            // guardo posiciones actuales
            int a_x = x;
            int a_y = y;            
            //avanzo a la derecha 
            x++;
            // si supero el limite derecho vuelvo al comienzo 
            if (x > limite_x) {
                x = 0;
            }
            //avanzo hacia arriba
            y--;
            // si excedo el limite superior de y
            if (y < 0) {
                // me posiciono en el limite inferior de  y
                y = casillas - 1;

            }
            //si la posicion esta ocupada , aumento la "y" en 1 y mantengo el "x"
            if (cubo[x][y] > 0) {
                x = a_x;
                y = a_y + 1;
            }
        }
        return cubo;
        //IMPRIMIR CUADRADO
        //System.out.println(cubo[0][0]+" / "+cubo[1][0]+" / "+cubo[2][0]+" / "+cubo[3][0]+" / "+cubo[4][0]+" / \n");
        //System.out.println(cubo[0][1]+" / "+cubo[1][1]+" / "+cubo[2][1]+" / "+cubo[3][1]+" / "+cubo[4][1]+" / \n");
        //System.out.println(cubo[0][2]+" / "+cubo[1][2]+" / "+cubo[2][2]+" / "+cubo[3][2]+" / "+cubo[4][2]+" / \n");
        //System.out.println(cubo[0][3]+" / "+cubo[1][3]+" / "+cubo[2][3]+" / "+cubo[3][3]+" / "+cubo[4][3]+" / \n");
        //System.out.println(cubo[0][4]+" / "+cubo[1][4]+" / "+cubo[2][4]+" / "+cubo[3][4]+" / "+cubo[4][4]+" / \n");

    }
}
