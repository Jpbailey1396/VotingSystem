/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.util.Collection;

/**
 *
 * @author josia
 */
public interface Searchable<E, V>{
    
    public Collection<E> search(V value);
    
}
