public class Main {
    public static void main(String[] args) {
        ParentClass object2 = createObject("2й", "ParentValue2", "ChildValue2");
        ParentClass object3 = createObject("3й", "ParentValue3", "ChildValue3");
        ParentClass object4 = createObject("4й", "ParentValue4", "ChildValue4");


        ParentClass[] objects = {object2, object3, object4};


        for (ParentClass obj : objects) {
            if (obj instanceof Printable) {
                Printable printableObj = (Printable) obj;
                printableObj.print();
            }
        }
    }


    public static ParentClass createObject(String className, String parentValue, String childValue) {
        switch (className) {
            case "2й":
                return new ChildClass2(parentValue, childValue);
            case "3й":
                return new ChildClass3(parentValue, childValue);
            case "4й":
                return new ChildClass4(parentValue, childValue);
            default:
                throw new IllegalArgumentException("Неподдерживаемый класс: " + className);
        }
    }
}