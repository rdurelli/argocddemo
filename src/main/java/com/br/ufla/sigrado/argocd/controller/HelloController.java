package com.br.ufla.sigrado.argocd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {


    @RequestMapping("/")
    public String hello() {
        return "Hello, World! Testing Reconciliation in ArgoCD!";
    }
}
