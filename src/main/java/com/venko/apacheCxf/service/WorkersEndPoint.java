package com.venko.apacheCxf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.venko.service.workerservice.Department;
import com.venko.service.workerservice.Message;
import com.venko.service.workerservice.ObjectFactory;
import com.venko.service.workerservice.Worker;
import com.venko.service.workerservice.WorkerRequest;
import com.venko.service.workerservice.WorkerResponse;
import com.venko.workers.Workers;

@Service
public class WorkersEndPoint implements Workers {

	@Override
	public WorkerResponse getWorkers(WorkerRequest parameters) {
		
		ObjectFactory factory = new ObjectFactory();
		WorkerResponse response = factory.createWorkerResponse();
		
		Message message = factory.createMessage();
		Department department = factory.createDepartment();
		
		
		Worker worker = factory.createWorker();
		List<String> skills = new ArrayList<String>();
		skills.add("Oracle");
		skills.add("IBM");
		skills.add("JAVA");
		skills.add("Javascript");
		skills.add("PHP");
		skills.add("Mongo");
		skills.add("Cassandra");
		worker.setAge(27);
		worker.setName("Kevin");
		worker.getSkills().addAll(skills);
		
		
		department.setName("DEVELOPMENT");
		department.getWorkers().add(worker);
		message.getDepartment().add(department);
		response.setMessage(message);
		
		
		return response;
	}

}
