package business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import business.abstracts.JobPositionService;
import dataAccess.abstracts.JobPositionDao;
import entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	private JobPositionDao jobPositionDao;
	
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao=jobPositionDao;
		
	}
	
	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return jobPositionDao.findAll();
	}

}
