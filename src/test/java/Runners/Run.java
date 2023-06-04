package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "D:\\Project\\ToolsQA\\src\\test\\resources\\firstTest.feature",
    glue = {"StepDefinitions"}
)
public class Run extends AbstractTestNGCucumberTests{
}
