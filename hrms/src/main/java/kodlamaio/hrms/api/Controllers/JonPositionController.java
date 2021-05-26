package kodlamaio.hrms.api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.entities.concrate.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JonPositionController {
	
	private JobPositionService jobPositionService;

	@Autowired
	public JonPositionController(JobPositionService jobPositionServvice) {
		super();
		this.jobPositionService = jobPositionServvice;
	}
	
	
	@GetMapping("/getall")
	public DataResult< List<JobPosition>> getAll(){
		return this.jobPositionService.getAll();
		
	}
	
	@PostMapping
	public Result add(@RequestBody JobPosition jobPositon) {
		return this.jobPositionService.add(jobPositon);
	}
	
	 
	
	
	

}
