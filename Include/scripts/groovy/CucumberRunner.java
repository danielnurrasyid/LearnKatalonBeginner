
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

//kita akan memberikan lokasi feature file, dan glue code nya lokasi dimana, tapi kalau kosong, akan baik2 saja dah otomatis, plugin akan menghasilkan report format pretty, format html, di taruh dio folder BDDREports dan folder HTML, dan JSON Report, dan nama dari json file nya.
@CucumberOptions(
	features = "Include/features",
	glue = "",
	plugin = {"pretty","html:BDDReports/HTML","json:BDDReports/JSON/reports.json"}
)


public class CucumberRunner {
	
	

}