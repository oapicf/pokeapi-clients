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
 * API tests for LanguageApi
 */
@MicronautTest
public class LanguageApiTest {

    @Inject
    LanguageApi api;

    
    /**
     * 
     */
    @Test
    public void languageListTest() {
        Integer limit = null;
        Integer offset = null;
        // String response = api.languageList(limit, offset).block();
        // Mono<String> asyncResponse = api.languageList(limit, offset);
        // TODO: test validations
    }

    
    /**
     * 
     */
    @Test
    public void languageReadTest() {
        Integer id = null;
        // String response = api.languageRead(id).block();
        // Mono<String> asyncResponse = api.languageRead(id);
        // TODO: test validations
    }

    
}
