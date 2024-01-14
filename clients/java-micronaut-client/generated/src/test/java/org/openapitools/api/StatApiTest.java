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
 * API tests for StatApi
 */
@MicronautTest
public class StatApiTest {

    @Inject
    StatApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void statListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.statList(limit, offset).block();

        // then
        // TODO implement the statListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void statReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.statRead(id).block();

        // then
        // TODO implement the statReadTest()
    }

    
}
