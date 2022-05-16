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
 * API tests for VersionGroupApi
 */
@MicronautTest
public class VersionGroupApiTest {

    @Inject
    VersionGroupApi api;

    
    /**
     * 
     */
    @Test
    public void versionGroupListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.versionGroupList(limit, offset).block();
        // Mono<String> asyncResponse = api.versionGroupList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void versionGroupReadTest() {
        Integer id = null;
        // String response = api.versionGroupRead(id).block();
        // Mono<String> asyncResponse = api.versionGroupRead(id);
        // TODO: test validations
    }

    
}
