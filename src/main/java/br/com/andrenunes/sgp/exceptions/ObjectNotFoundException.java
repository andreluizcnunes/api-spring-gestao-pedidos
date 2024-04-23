package br.com.andrenunes.sgp.exceptions;

public class ObjectNotFoundException extends  RuntimeException{
    private static final long serialVersionUIDLONG = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }

    public  ObjectNotFoundException( String msg, Throwable cause){

        super(msg, cause);
    }
}
