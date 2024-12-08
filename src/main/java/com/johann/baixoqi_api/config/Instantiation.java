package com.johann.baixoqi_api.config;

import com.johann.baixoqi_api.domain.*;
import com.johann.baixoqi_api.dto.ProjetoDTO;
import com.johann.baixoqi_api.repository.CNAERepository;
import com.johann.baixoqi_api.repository.EdificacaoRepository;
import com.johann.baixoqi_api.repository.ProjetoRepository;
import com.johann.baixoqi_api.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private ProjetoRepository projetoRepo;

    @Autowired
    private ResponsavelRepository responsavelRepo;

    @Autowired
    private CNAERepository cnaeRepo;

    @Autowired
    private EdificacaoRepository edificacaoRepo;

    @Override
    public void run(String... args) throws Exception {

        projetoRepo.deleteAll();
        responsavelRepo.deleteAll();
        cnaeRepo.deleteAll();
        edificacaoRepo.deleteAll();


        Responsavel responsavel = new Responsavel(null, "goody da silva junior", "certamente não o meu", "23123213", "emaildogoody@gmail.com");
        responsavelRepo.save(responsavel);

        CNAE cnaeTeste = new CNAE("11111", "C2", 650);
        cnaeRepo.save(cnaeTeste);

        List<CNAE> listaTesteCnae = new ArrayList<>();
        listaTesteCnae.add(cnaeTeste);

        Empresa emp = new Empresa("12123321000100", "empresaTeste", listaTesteCnae, "C2", 650, "rua 21 de abril", "23", "centro", null, "98400-000", "frederico-westphalen", "rs");

        Edificacao ed1 = new Edificacao();
        edificacaoRepo.save(ed1);

        Projeto projeto1 = new Projeto(null, "projeto qualquer coisa", responsavel, emp, ed1);
        Projeto projeto2 = new Projeto(null, "projeto mais qualquer coisa ainda", responsavel, emp, ed1);
        Projeto projeto3 = new Projeto(null, "projeto cigarro nas escolas", responsavel, emp, ed1);

        projetoRepo.saveAll(Arrays.asList(projeto1, projeto2, projeto3));
        responsavel.getProjetos().addAll(Arrays.asList(projeto1, projeto2, projeto3));
        responsavelRepo.save(responsavel);
        projetoRepo.saveAll(Arrays.asList(projeto1, projeto2, projeto3));

    }
}
