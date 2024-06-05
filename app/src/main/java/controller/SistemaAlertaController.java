package controller;

import entity.SistemaAlerta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.SistemaAlertaRepository;
import service.SistemaAlertaService;

import java.util.List;

@RestController
@RequestMapping("/alerta")
public class SistemaAlertaController {
    @Autowired
    private SistemaAlertaRepository avarepo;

    @Autowired
    private SistemaAlertaService sistemaAlertaService;

    @GetMapping("/Listar")
    public List<SistemaAlerta> listarAvaliacoes(){
        return (List<SistemaAlerta>) avarepo.findAll();
    }
