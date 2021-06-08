package api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import business.abstracts.JobPositionService;
import entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job_position")
public class JobPositionController {
	
	private JobPositionService jobPositionService;
	
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		
		this.jobPositionService=jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}

}
