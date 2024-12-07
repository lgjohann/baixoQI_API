package com.johann.baixoqi_api.config;

import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.domain.Responsavel;
import com.johann.baixoqi_api.repository.ProjetoRepository;
import com.johann.baixoqi_api.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private ProjetoRepository ProjetoRepo;

    @Autowired
    private ResponsavelRepository ResponsavelRepo;

    @Override
    public void run(String... args) throws Exception {

        ProjetoRepo.deleteAll();
        ResponsavelRepo.deleteAll();

        Responsavel responsavel = new Responsavel(null, "goody da silva junior", "certamente não o meu", "23123213", "emaildogoody@gmail.com");
        ResponsavelRepo.save(responsavel);

        Projeto projeto1 = new Projeto(null, "projeto qualquer coisa", responsavel);
        Projeto projeto2 = new Projeto(null, "projeto mais qualquer coisa ainda", responsavel);
        Projeto projeto3 = new Projeto(null, "projeto cigarro nas escolas", responsavel);

        ProjetoRepo.saveAll(Arrays.asList(projeto1, projeto2, projeto3));

    }
}
