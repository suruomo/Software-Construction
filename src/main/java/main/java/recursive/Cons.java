package main.java.recursive;

/**
 * @author 苏若墨
 */
public class Cons<E> implements ImList<E> {
    private final E e;
    private final ImList<E> rest;

    public Cons(E e, ImList<E> rest) {
        this.e = e;
        this.rest = rest;
    }

    @Override
    public ImList<E> add(E e) {
        return new Cons<>(e,this);
    }

    @Override
    public E first() {
        return e;
    }

    @Override
    public ImList<E> rest() {
        return rest;
    }

    @Override
    public int size() {
        return 1+rest.size();
    }

    @Override
    public E get(int n) {
        if(n==0){
            return first();
        }
        else{
            return rest.get(n-1);
        }
    }

    @Override
    public boolean isEmpty() {
        return (first()==null)?true:false;
    }

    @Override
    public boolean contains(E e) {
        return (first()==e)||rest.contains(e);
    }

    @Override
    public ImList<E> append(ImList<E> list) {
        return rest.append(list);
    }

}
