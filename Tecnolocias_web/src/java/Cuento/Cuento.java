/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuento;

import java.util.ArrayList;

/**
 *
 * @author ertim
 */
public class Cuento {
    private ArrayList<Pagina> Libro = new ArrayList<Pagina>();
    public Cuento(){
        
    }
    
    public void AgregarPagina(String numero,String Contenido){
        this.Libro.add(new Pagina(numero, Contenido));
    }
    
    public int NumeroPaginas(){
        return this.Libro.size();
    }
    
}
