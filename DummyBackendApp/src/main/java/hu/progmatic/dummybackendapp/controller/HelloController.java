package hu.progmatic.dummybackendapp.controller;

import hu.progmatic.dummybackendapp.modell.Learner;
import hu.progmatic.dummybackendapp.service.LearnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    LearnerService learnerService;

    @GetMapping("/api/hello")
    public String helloProgmatic(){
        return "HelloProgmatic";
    }

    @GetMapping("/api/learners")
    public List<Learner> index() {
        learnerService.getLearner();
        return learnerService.getLearner();
    }
}
