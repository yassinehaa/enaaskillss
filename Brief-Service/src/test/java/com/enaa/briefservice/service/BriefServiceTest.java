package com.enaa.briefservice.service;

import com.enaa.briefservice.model.Brief;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BriefServiceTest {

    @Autowired
    private BriefService briefService;



    @Test
    void testGetAllBriefs() {
        List<Brief> briefs = briefService.getAllBriefs();
        assertNotNull(briefs);         // Not null
        assertTrue(briefs.size() >= 0); // Can be empty or more
    }
}