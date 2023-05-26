package movieDemo.accioJob.naveenK;

public class MovieService {
    MovieClient client = new MovieClient();
    public Movie getMovie(Integer id) {
        return client.getMovie(id);
    }
}
