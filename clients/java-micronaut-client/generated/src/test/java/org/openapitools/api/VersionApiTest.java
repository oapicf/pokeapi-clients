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
 * API tests for VersionApi
 */
@MicronautTest
public class VersionApiTest {

    @Inject
    VersionApi api;

    
    /**
     * 
     */
    @Test
    public void versionListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.versionList(limit, offset).block();
        // Mono<String> asyncResponse = api.versionList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void versionReadTest() {
        Integer id = null;
        // String response = api.versionRead(id).block();
        // Mono<String> asyncResponse = api.versionRead(id);
        // TODO: test validations
    }

    
}
