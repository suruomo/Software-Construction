package main.java.recursive;


/**
 * Immutable List不可变列表接口
 * @author 苏若墨
 */
public interface ImList<E> {
    /**
     * 使列表为空
     * @param <E>
     * @return
     */
    static <E> ImList<E> empty() {
        return new Empty<>();
    }
    /**
     * 列表增加元素e
     * @param e
     * @return
     */
   ImList<E> add(E e);

    /**
     * 获取列表首元素
     * @return
     */
   E first();

    /**
     * 返回除首元素以外的其余元素列表
     * @return
     */
   ImList<E> rest();

    /**
     * 返回列表大小
     * @return
     */
   int size();

    /**
     * 在列表中获取第n个元素
     * @param n
     * @return
     */
   E get(int n);

    /**
     * 判断列表是否为空
     * @return
     */
   boolean isEmpty();

    /**
     * 判断列表是否包含元素e
     * @param e
     * @return
     */
   boolean contains(E e);

    /**
     * 在当前列表后增加列表list后返回当前列表
     * @param list
     * @return
     */
   ImList<E> append(ImList<E> list);
}
