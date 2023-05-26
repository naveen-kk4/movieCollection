package movieDemo.accioJob.naveenK;

import org.springframework.web.client.RestTemplate;

public class MovieClient {
    String url = "https://api.themoviedb.org/3/movie/%s?api_key=cd46fe13f1442cfa663d94a7d3ed7e5e";
    RestTemplate restTemplate = new RestTemplate();
    public Movie getMovie(Integer id) {
        String url2 = String.format(url,id);
        return restTemplate.getForObject(url2,Movie.class);

    }
}
