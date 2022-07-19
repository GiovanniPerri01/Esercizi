public class Persona {
    private String name;
    private String surname;
    private Integer eta;

    public Persona(String name, String surname, Integer eta) {
        this.name = name;
        this.surname = surname;
        this.eta = eta;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getEta() {
        return eta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    @Override
    public String toString(){
        return getName() + ", " + getSurname() + ", " + getEta();
    }
}
