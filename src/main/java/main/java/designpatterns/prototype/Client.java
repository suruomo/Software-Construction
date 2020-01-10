package main.java.designpatterns.prototype;

/**
 * @author 苏若墨
 */
public class Client {
    public static void main(String[] args) {
        ProtoType protoType=new ProtoType();
        protoType.cloneName="Amy";
        protoType.age=15;
        protoType.cloneableTarget=new CloneableTarget("Mike",14);

        ProtoType protoType1=(ProtoType) protoType.clone();
        System.out.println("prototype.name="+protoType.cloneName+"prototype.CloneableTarget="+protoType.cloneableTarget.hashCode());
        System.out.println("prototype1.name="+protoType1.cloneName+"prototype1.CloneableTarget="+protoType1.cloneableTarget.hashCode());
    }
}
