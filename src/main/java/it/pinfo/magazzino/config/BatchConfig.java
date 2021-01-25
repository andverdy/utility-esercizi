package it.pinfo.magazzino.config;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.pinfo.magazzino.entity.InterventoTecnico;
import it.pinfo.magazzino.entity.PartiRicambio;
import it.pinfo.magazzino.service.VariabiliDbService;
import it.pinfo.magazzino.service.PartiRicambioService;
import it.pinfo.magazzino.step.Writer;
import it.pinfo.magazzino.step.Processor;
import it.pinfo.magazzino.step.Reader;

@Configuration
public class BatchConfig {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	public PartiRicambioService partiService;
	
	@Autowired
	private VariabiliDbService variabiliDbServ;

	@Bean
	public Job job() {
		return jobBuilderFactory.get("job").incrementer(new RunIdIncrementer()).flow(step1()).end().build();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<List<Object>, List<PartiRicambio>>chunk(0).reader(new Reader(variabiliDbServ))
				.processor(new Processor(partiService)).writer(new Writer(partiService, variabiliDbServ)).build();
	}

}
