package movieDemo.accioJob.naveenK;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MovieController {
    @Autowired
    private MovieService service;
    @GetMapping("/get-movie")
    public Movie getMovie(@RequestParam Integer id){
        return service.getMovie(id);
    }
}
