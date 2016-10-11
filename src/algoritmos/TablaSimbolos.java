/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Date;

/**
 *
 * @author Diego
 */
public class TablaSimbolos  implements STInterface<Date,Object>
{
    private Nodo root;
    public TablaSimbolos()
    {
       this.root = null; 
    }
    class Nodo
    {
        private Date date;
        private String contenido;
        private Nodo next; 
        public Nodo(Date date, String contenido)
        {
            this.date = date;
            this.contenido = contenido;
            this.next= null;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getContenido() {
            return contenido;
        }

        public void setContenido(String contenido) {
            this.contenido = contenido;
        }

        public Nodo getNext() {
            return next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }
        
    }

    @Override
    public void put(Date key, Object value) {
        if (this.root==null)
        {
            this.root = new Nodo(key,(String)value);
            this.root.setNext(null);
        }
        else if(key.compareTo(this.root.getDate())<0)
        {
            Nodo aux = this.root;
            this.root = new Nodo(key,(String)value);
            this.root.setNext(aux);
        }
        else
        {
            
            for(Nodo aux=this.root;aux.getNext()!=null;aux=aux.getNext())
            {
                
                if(key.compareTo(aux.getNext().getDate())<0&&aux.getNext()!=null)
                {
                    Nodo aux2 = aux.getNext();
                    aux.setNext(new Nodo(key,(String)value));
                    aux.getNext().setNext(aux2);
                }
            }
        }
    }

    @Override
    public Object get(Date key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Date key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Date key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return this.root==null;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date min() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date floor(Date key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date ceiling(Date key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int rank(Date key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date select(int k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delteMin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteMax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size(Date lo, Date hi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Date> keys(Date lo, Date hi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Date> keys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
