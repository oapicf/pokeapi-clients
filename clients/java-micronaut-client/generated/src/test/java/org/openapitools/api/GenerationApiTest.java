package org.openapitools.api;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for GenerationApi
 */
@MicronautTest
public class GenerationApiTest {

    @Inject
    GenerationApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void generationListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.generationList(limit, offset).block();

        // then
        // TODO implement the generationListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void generationReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.generationRead(id).block();

        // then
        // TODO implement the generationReadTest()
    }

    
}
