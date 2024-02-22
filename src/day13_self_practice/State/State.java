package day13_self_practice.State;

public class State {

    private String name , abbreviation, politicalParty, governor, senator;
    private int population;


    public State (String name,String abbreviation, String politicalParty,
                  String governor, String senator, int population){
        setName(getClass().getSimpleName());
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            System.err.println("name can not be null, empty, blank.");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.trim().isEmpty()){
            System.err.println("abbreviation can not be null, empty, blank.");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.trim().isEmpty()){
            System.err.println("political party can not be null, empty, blank.");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.trim().isEmpty()){
            System.err.println("governor can not be null, empty, blank.");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.trim().isEmpty()){
            System.err.println("name can not be null, empty, blank.");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0){
            System.err.println("population must be greater than 0");
            System.exit(1);
        }
        this.population = population;
    }

    @Override
    public String toString() {
        return getName() +
                " name= '" + name + '\'' +
                ", abbreviation= '" + abbreviation + '\'' +
                ", politicalParty= '" + politicalParty + '\'' +
                ", governor= '" + governor + '\'' +
                ", senator= '" + senator + '\'' +
                ", population= " + population +
                "}";
    }
}
