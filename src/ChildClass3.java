class ChildClass3 extends ParentClass implements Printable {
    private String childField3;

    public ChildClass3(String parentField, String childField3) {
        super(parentField);
        this.childField3 = childField3;
    }

    @Override
    public void print() {
        System.out.println("ChildClass3: ParentField = " + getParentField() + ", ChildField3 = " + childField3);
    }
}