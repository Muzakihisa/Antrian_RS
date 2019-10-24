/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20191021_sdt_02;

public class Queue {
    int tail = -1;
    String[] storage;
    
    public int getSize()
    {
        return storage.length;
    }
    
    public boolean isFull()
    {
        if (tail >= getSize()-1) return true;
        else return false;
    }
    
    public boolean isEmpty()
    {
        if (tail < 0) return true;
        else return false;
    }
    
    public int getDataCount()
    {
        return tail+1;
    }
    
    public String getDataAt(int i)
    {
        return storage[i];
    }
    
    public void setDataAt(int i, String data)
    {
        storage[i] = data;
    }
    
    public void enqueue(String data)
    {
        if(!isFull()) setDataAt(++tail, data);
    }
    
    public String peek()
    {
        if(!isEmpty()) return getDataAt(0);
        else return "";
    }
    
    public String dequeue()
    {
        String data = peek();
        for(int i = 0; i < getSize()-1; i++)
        {
            storage[i] = storage[i+1];
        }
        tail--;
        
        return data;
    }
    
    Queue(int length)
    {
        storage = new String[length];
    }
}
