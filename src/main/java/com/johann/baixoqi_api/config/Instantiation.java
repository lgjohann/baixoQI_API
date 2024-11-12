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

        Projeto projeto1 = new Projeto(null, "projeto qualquer coisa", "05444312000109", "edificacao", "luis pastorio");
        Projeto projeto2 = new Projeto(null, "projeto mais qualquer coisa ainda", "32133123000105", "edificacao", "luis pastorio");
        Projeto projeto3 = new Projeto(null, "projeto nem se fala", "03232234000102", "edificacao", "luis pastorio");

        repo.saveAll(Arrays.asList(projeto1, projeto2, projeto3));

    }
}
