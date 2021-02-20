package mts.ost1;

public class MtsSaler {
    int id;
    String section;
    public MtsSaler(){
        this.id = 99;
        this.section = "Prodaj";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "MtsSaler{" +
                "id=" + id +
                ", section='" + section + '\'' +
                '}';
    }
}
