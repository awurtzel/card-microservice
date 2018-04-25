package microservice.beans;

public class Card {
    private long id;
    private String name;
    private String type;
    private String faction;

    public Card(int id, String name, String type, String faction) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.faction = faction;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }
}
