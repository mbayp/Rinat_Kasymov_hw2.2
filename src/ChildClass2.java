class ChildClass2 extends ParentClass implements Printable {
    private String childField2;

    public ChildClass2(String parentField, String childField2) {
        super(parentField);
        this.childField2 = childField2;
    }

    @Override
    public void print() {
        System.out.println("ChildClass2: ParentField = " + getParentField() + ", ChildField2 = " + childField2);
    }
}