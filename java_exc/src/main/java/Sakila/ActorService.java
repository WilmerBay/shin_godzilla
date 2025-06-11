package Sakila;

import java.util.List;

public class ActorService {
    private ActorDAO dao = new ActorDAO();

    public List<Actor> getActorsByLastName(String lastName) {
        return dao.findByLastName(lastName);
    }

    public List<String> getMoviesByActor(String firstName, String lastName) {
        return dao.findMoviesByActor(firstName, lastName);
    }
}
