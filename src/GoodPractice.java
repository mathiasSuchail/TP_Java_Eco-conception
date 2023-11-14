public class GoodPractice {
    private String name;
    private String field;

    public GoodPractice(String name, String field) {
        this.name = name;
        this.field = field;
    }

    public String getName() {
        return name;
    }
    public String getField() {
        return field;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +",\n"+
                "field='" + field + '\''+'.';
    }
}
