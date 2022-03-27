package pocoPackage;

public class Country implements POCO{
    public long id;
    public String name;

    public Country(long id,String name) {
        this.id=id;
        this.name = name;
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
