package business.abstracts;

import java.util.List;

import entities.concretes.JobPosition;

public interface JobPositionService  {
	
	List<JobPosition> getAll();

}
