package atec.poo.loja.core.clients;

import java.time.LocalDate;
import java.time.Period;

public class Client {
    private int id;
    private String name;
    private String nif;
    private LocalDate birthDate;
    private ClientStatus status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ClientStatus getStatus() {
        return status;
    }

    public void setStatus(ClientStatus status) {
        this.status = status;
    }

    public Client(int id, String name, String nif, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.nif = nif;
        this.birthDate = birthDate;
        this.status=ClientStatus.REGULAR;
    }

    public int getAge(LocalDate today){
        return Period.between(this.birthDate, today).getYears();
    }
}
