package main.java.designpatterns.prototype;

import java.io.*;

/**
 * @author 苏若墨
 */
public class ProtoType implements Serializable,Cloneable {
    public String cloneName;
    public int age;
    public CloneableTarget cloneableTarget;
    public ProtoType(){
        super();
    }

    /**
     * 克隆方法
     * @return
     */
    @Override
    public Object clone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前对象以流输出
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            ProtoType copyObj = (ProtoType)ois.readObject();

            return copyObj;

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                // TODO: handle exception
                System.out.println(e2.getMessage());
            }
        }
    }

}
