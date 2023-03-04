package hu.progmatic.dummybackendapp.service;

import hu.progmatic.dummybackendapp.modell.Learner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LearnerService {

    public List<Learner>  getLearner(){
        Learner jancsi = new Learner();
        jancsi.setName("Jancsi");
        jancsi.setAddress("Kerekerdő dűlő 21");
        Learner juliska = new Learner();
        juliska.setName("Juliska");
        juliska.setAddress("Kerekerdő dűlő 21");
        List<Learner> learners = new ArrayList<>();
        learners.add(jancsi);
        learners.add(juliska);
        return learners;
    }
}
