public class Hideout<T> {
    private T t;

    public Hideout() {
    }
    
    public void putIntoHideout(T toHide){
        this.t = toHide;     
    }
 
    public T takeFromHideout() {
        if(this.t == null) {
            return null;
        }
        
        T a = this.t;
        this.t = null;
        return a;
    }
    
    public boolean isInHideout(){
        if(!(this.t == null)) {
            return true;
        }
        
        return false;
    }
}
