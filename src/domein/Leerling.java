package domein;


public class Leerling {
    private String naam, voornaam, inschrijvingsNummer;

    public Leerling(String naam, String voornaam, String inschrijvingsNummer) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.inschrijvingsNummer = inschrijvingsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getInschrijvingsNummer() {
        return inschrijvingsNummer;
    }

    public void setInschrijvingsNummer(String inschrijvingsNummer) {
        this.inschrijvingsNummer = inschrijvingsNummer;
    }
    
    
}
