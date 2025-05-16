package Practise_Java_Fundamentals4_Live_Coding.Autori;

public class Poem {
    private Author creator;
    private int stropheNumbers;

    //Constructor
    public Poem(){}

    //Constructor
    public Poem (Author creator,int stropheNumbers){
        this.creator=creator;
        this.stropheNumbers=stropheNumbers;
    }

    //GETTERS

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    //SETTERS

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }
}
