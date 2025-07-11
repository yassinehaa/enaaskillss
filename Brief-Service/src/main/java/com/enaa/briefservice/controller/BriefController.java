package com.enaa.briefservice.controller;
import com.enaa.briefservice.DTO.BriefDto;
import com.enaa.briefservice.model.Brief;
import com.enaa.briefservice.service.BriefService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/briefs")

public class BriefController {


    private final BriefService briefService;

    public BriefController(BriefService briefService) {
        this.briefService = briefService;
    }

    @PostMapping
    public ResponseEntity<BriefDto> create(@RequestBody BriefDto briefDto) {
        return ResponseEntity.ok(briefService.saveBrief(briefDto));
    }

    @GetMapping
    public ResponseEntity<List<BriefDto>> getAll() {
        return ResponseEntity.ok(briefService.getAllBriefs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BriefDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(briefService.getBriefById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BriefDto> update(@PathVariable Long id, @RequestBody Brief brief) {
        return ResponseEntity.ok(briefService.updateBrief(id, brief));
    }


}
