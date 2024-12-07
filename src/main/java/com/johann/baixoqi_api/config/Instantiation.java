package com.johann.baixoqi_api.config;

import com.johann.baixoqi_api.domain.Projeto;
import com.johann.baixoqi_api.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private ProjetoRepository repo;

    @Override
    public void run(String... args) throws Exception {

        repo.deleteAll();

        Projeto projeto1 = new Projeto(null, "projeto qualquer coisa");
        Projeto projeto2 = new Projeto(null, "projeto mais qualquer coisa ainda");
        Projeto projeto3 = new Projeto(null, "projeto cigarro nas escolas");

        repo.saveAll(Arrays.asList(projeto1, projeto2, projeto3));

    }
}
