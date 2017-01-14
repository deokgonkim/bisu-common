package com.idatabank.bisu;

public class InternalException extends Exception {
    public InternalException() {
        super();
    }
    
    public InternalException(String e) {
        super(e);
    }
    
    public InternalException(Throwable e) {
        super(e);
    }
}
