package Leksioni6.Setters_Getters.Actors_Getters_Setters;

import java.time.LocalDate;
import java.util.Date;

import static java.time.Year.now;

public class Actors {
    private String titulli;
    private int vitProdhimi;
    private String genre;
    private int nrActors;
    private int review;

    //Krijo konstruktor bosh
    public Actors() {
    }


    //krijo konstruktoret me parametra
    //ketu e kontrollojme ne kosntruktor, kur i japim vlerat qe ne fillim
    public Actors(String titulli, int vitProdhimi, String genre, int nrActors, int review) {
        this.titulli = titulli;
        if(review>=1 && review<=5){
            this.review=review;
        }
        else{
            review=0;
        }
        if(vitProdhimi>2025){
            this.vitProdhimi=0;
        }
        else{
            this.vitProdhimi=vitProdhimi;
        }
    }


    //SETTERS
    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }
    //kontrollin do ta bejme tek set sepse pasi vendos vlerat duhet kontrolluar
    public void setVitProdhimi(int vitProdhimi) {
        if(vitProdhimi>2025){
            this.vitProdhimi=0;
        }
        else{
            this.vitProdhimi=vitProdhimi;
        }
        this.vitProdhimi = vitProdhimi;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setNrActors(int nrActors) {
        this.nrActors = nrActors;
    }

    public void setReview(int review) {
        if(review>=1 && review<=5){
            this.review=review;
        }
        else{
            review=0;
        }
        this.review = review;
    }


    //GETTERS


    public String getTitulli() {
        return titulli;
    }

    public int getVitProdhimi() {
        return vitProdhimi;
    }

    public String getGenre() {
        return genre;
    }

    public int getNrActors() {
        return nrActors;
    }

    public int getReview() {
        return review;
    }


//Krijo metoden qe te kthen se sa vite kane kaluar nga viti i tanishem

    public int sasiaViteve(int vitProdhimi) {
        int sasia_viteve = LocalDate.now().getYear() - vitProdhimi;
        return 0;
    }

    //dy menyrat qe marrim vlere jane seti dhe konstruktori



}