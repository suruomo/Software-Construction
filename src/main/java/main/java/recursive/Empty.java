package main.java.recursive;

/**
 * @author 苏若墨
 */
public class Empty<E> implements ImList<E> {

    public Empty() {
    }

    @Override
    public ImList<E> add(E e) {
        return new Cons<>(e,this);
    }

    @Override
    public E first() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImList<E> rest() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E get( int n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
         return true;
    }

    @Override
    public boolean contains( E e) {
        return false;
    }

    @Override
    public ImList<E> append(ImList<E> list) {
        return list;
    }

}
