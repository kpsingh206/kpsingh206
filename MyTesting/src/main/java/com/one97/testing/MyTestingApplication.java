package com.one97.testing;

 import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.one97.testing.config.MyProp;
import com.one97.testing.repo.ChannelRepository;
import com.one97.testing.repo.EmployeeRepository;
import com.one97.testing.repo.EngagementRepo;
import com.one97.testing.repo.PersonRepo;
import com.one97.testing.repo.PhoneRepository;
import com.one97.testing.vo.Employee;
import com.one97.testing.vo.Person;
import com.one97.testing.vo.Phone;
import com.one97.testing.vo.User;

@SpringBootApplication
public class MyTestingApplication implements CommandLineRunner{
	
	@Autowired
	ChannelRepository repository;
	
	@Autowired
	EngagementRepo engageRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	PhoneRepository phoneRepo;
	
	@Value("${name}")
	private String name;
	
	@Autowired
	private PersonRepo personRepo;
	@Autowired
	MyProp myProp;
	
	@PersistenceContext
	private EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MyTestingApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.setLogStartupInfo(false);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(name);
		
		//phoneRepo.deleteById(1);
		Phone ph = new Phone();
		ph.setPhoneNumber("45345435");
		ph.setPhoneProvider("airtel");
		
		Phone ph1 = new Phone();
		ph1.setPhoneNumber("45345435");
		ph1.setPhoneProvider("airtel");
		
		
		Employee emp = new Employee();
		emp.setFirstName("Naveen");
		emp.setLastName("Kumar");
		ph.setEmployee(emp);
		//emp.getPhone().add(ph);
		//emp.getPhone().add(ph1);
		emp.getPhone().put(ph.getPhoneNumber(), ph);
		emp.getPhone().put(ph.getPhoneNumber(), ph1);
		
		ph1.setEmployee(emp);
		empRepo.save(emp);
	//	phoneRepo.save(ph);
		
		
		Optional<Employee> empList = empRepo.findById(1);
		Employee empl1 = empList.get();
		System.out.println(empl1);
		//List<Phone> ph12 = empl1.getPhone();
		
		Optional<Phone> phon = phoneRepo.findById(1);
		Phone phn = phon.get();
		System.out.println(phn.getPhoneNumber());


		Person p1 = new Person();
		p1.setEmail("kpsingh@gmail.com");
		p1.setFirstName("Krishnapal");
		p1.setLastName("Singh");
		personRepo.save(p1);
		
		

		/*Iterable<Channel> l1 = repository.findAll();
		System.out.println(repository.findById(1));
		for (Channel channel : l1) {
			System.out.println(channel);
		}
		
		Channel c1 = new Channel();
		c1.setChannelName("IVR");
		repository.save(c1);
		
		
		System.out.println("--------------------"+engageRepo.countByCircle("del"));

		EngagementMaster m1  = engageRepo.findFirst1ByCircle("del");
		
		engageRepo.updateEngagement("Hello","del","my");
		EngagementMaster m2 = new EngagementMaster(m1);
		System.out.println(m2.getChannel());
		m1.setCriteriaId(4);
		m2.setMessageType("REPEAT");
		engageRepo.save(m1);

		
	
		System.out.println(m1.toString());
		System.out.println(m1.getChannel().getChannelName());
		System.out.println("--------------------");
		System.out.println("Engagement Repos");
		System.out.println();
		System.out.println();
		
		List<EngagemetBasic> l11 = engageRepo.findByCircleAndContestId("del", 1);

		for(EngagemetBasic b : l11) {
			System.out.println(b.getEngagementName());
		}
*/	}
}
