package com.project.alertamogi.utils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.project.alertamogi.repository.PostagemRepository;

import jakarta.transaction.Transactional;

@Component
public class ApagaItensUtils {

	@Autowired
	private PostagemRepository postagemRepository;
	
	@Scheduled(cron = "0 0 0 * * ?")
	@Transactional
	public void apagarItem() {
		LocalDateTime tempolimite = LocalDateTime.now().minus(7, ChronoUnit.DAYS);
		postagemRepository.deleteByDataCriacaoBefore(tempolimite);
		
	}
}
