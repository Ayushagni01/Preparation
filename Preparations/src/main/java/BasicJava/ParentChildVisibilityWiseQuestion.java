package BasicJava;

class Parent{
    protected void getParent(){
        System.out.println("Parent is here");
    }
}

class Children extends Parent{
     public  void getParent(){
        System.out.println("This is a child class");
    }
}

public class ParentChildVisibilityWiseQuestion {
    public static void main(String[] args) {
        Children children = new Children();
        children.getParent();
    }
}
