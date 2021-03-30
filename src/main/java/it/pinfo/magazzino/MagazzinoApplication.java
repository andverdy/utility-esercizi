package it.pinfo.magazzino;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@EnableBatchProcessing
public class MagazzinoApplication  {

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job job;

	public static void main(String[] args) {
		SpringApplication.run(MagazzinoApplication.class, args);
	}

	//@Scheduled(cron = "*00 51 09 * * ?")
	public String handle() throws Exception {
		System.out.println("ENTERED HANDLE METHOD");
		Logger logger = LoggerFactory.getLogger(this.getClass());
		try {
			JobParameters jobParameters = 
			          new JobParametersBuilder()
			          .addLong("time",System.currentTimeMillis()).toJobParameters();
			jobLauncher.run(job, jobParameters);

		} catch (Exception e) {
			logger.info(e.getMessage());
		}

		return "ciao";
	}
	
	
	
	
	

}
