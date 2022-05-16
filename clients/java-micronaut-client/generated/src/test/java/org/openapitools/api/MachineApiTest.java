package org.openapitools.api;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MachineApi
 */
@MicronautTest
public class MachineApiTest {

    @Inject
    MachineApi api;

    
    /**
     * 
     */
    @Test
    public void machineListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.machineList(limit, offset).block();
        // Mono<String> asyncResponse = api.machineList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void machineReadTest() {
        Integer id = null;
        // String response = api.machineRead(id).block();
        // Mono<String> asyncResponse = api.machineRead(id);
        // TODO: test validations
    }

    
}
