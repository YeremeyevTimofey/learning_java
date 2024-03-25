package comparison;

import java.util.Comparator;

public class ComparisonClass
{
    int id;
    String name;
    String surname;
    String enemy;

    public ComparisonClass(int id, String name, String surname, String enemy) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.enemy = enemy;
    }

    @Override
    public String toString() {
        return "comparation.Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", enemy='" + enemy + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(comparation.Client client) {
//        int res = this.name.compareTo(client.name);
//        if (res==0) {
//            res = this.surname.compareTo(client.surname);
//        }
//        return res;
//    }

    static class IdComparator implements Comparator<ComparisonClass> {
        @Override
        public int compare(ComparisonClass comparisonClass1, ComparisonClass comparisonClass2) {
            return Integer.compare(comparisonClass1.id, comparisonClass2.id);
        }
    }

    static class NameComparator implements Comparator<ComparisonClass> {
        @Override
        public int compare(ComparisonClass comparisonClass1, ComparisonClass comparisonClass2) {
            return comparisonClass1.name.compareTo(comparisonClass2.name);
        }
    }
}
