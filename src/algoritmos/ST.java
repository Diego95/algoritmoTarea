/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author Ariel
 */
public interface ST <Key extends Comparable<Key>,Value>
{
    public void put(Key key,Value value);
    public Value get(Key key);
    public void delete(Key key);
    public boolean contains(Key key);
    public boolean isEmpty();
    public int size();
    public Key min();
    public Key floor(Key key);
    public Key ceiling(Key key);
    public int rank(Key key);
    public Key select(int k );
    public void delteMin();
    public void deleteMax();
    public int size(Key lo, Key hi);
    public Iterable<Key> keys(Key lo,Key hi);
    public Iterable<Key> keys();
    
    
    
        
    
    
}
