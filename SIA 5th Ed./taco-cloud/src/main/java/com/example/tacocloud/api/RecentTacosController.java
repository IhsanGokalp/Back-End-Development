package com.example.tacocloud.api;

import com.example.tacocloud.Taco;
import com.example.tacocloud.data.TacoRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RepositoryRestController
public class RecentTacosController {

    private TacoRepository tacoRepository;

    @GetMapping(path = "/tacos/recent", produces = "application/hal+json")
    public ResponseEntity<Resources<TacoResource>> recentTacos() {
        PageRequest page = PageRequest.of(0,12,
                Sort.by("createdAt").descending());
        List<Taco> tacos = tacoRepository.findAll(page).getContent();
        List<TacoResource> tacoResources = new TacoResourceAssembler().toResources(tacos);
        Resources<TacoResource> recentResources = new Resources<TacoResource>(tacoResources);
        recentResources.add(
                linkTo(methodOn(RecentTacosController.class).recentTacos)
                        .withRel("recents"));
        return new ResponseEntity<>(recentResources, HttpStatus.OK);
    }
}
