package Runner;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import  io.cucumber.junit.Cucumber;



    @RunWith(Cucumber.class)
    @CucumberOptions(features="src/main/resources/features",
            glue={"acceptanceTest"},
            plugin={"pretty","html:target/reports.html"})
    public class SWAPIRunner {

    }


