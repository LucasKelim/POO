public class NameConcatenator {

    private String name = "";
    private String surname = "";

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        if (!surname.isEmpty()) {
            this.surname = surname;
        }
    }

    public String getSurname() {
        return surname;
    }

    public String concatenate() {
        return name + " " + surname;
    }
}
