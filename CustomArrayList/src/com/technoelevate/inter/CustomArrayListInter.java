package com.technoelevate.inter;

public interface CustomArrayListInter {
	
	void addObject(Object obj);
	Object getObject(int index);
    void removeObject(int index);
    void growSize();
    int getCapacity();
    int getSize();
    
}
