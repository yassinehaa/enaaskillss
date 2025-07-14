package org.example.apprenantservice.feign;

import org.example.apprenantservice.DTOs.BriefDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "briefservice", url = "http://localhost:8081")
public interface BriefClient {

    @GetMapping("api/briefs/{id}")
    BriefDto getBriefById(@PathVariable("id") Long id);
}
