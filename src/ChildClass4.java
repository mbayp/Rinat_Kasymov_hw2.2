class ChildClass4 extends ParentClass implements Printable {
    private String childField4;

    public ChildClass4(String parentField, String childField4) {
        super(parentField);
        this.childField4 = childField4;
    }

    @Override
    public void print() {
        System.out.println("ChildClass4: ParentField = " + getParentField() + ", ChildField4 = " + childField4);
    }
}