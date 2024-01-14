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
 * API tests for SuperContestEffectApi
 */
@MicronautTest
public class SuperContestEffectApiTest {

    @Inject
    SuperContestEffectApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void superContestEffectListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.superContestEffectList(limit, offset).block();

        // then
        // TODO implement the superContestEffectListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void superContestEffectReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.superContestEffectRead(id).block();

        // then
        // TODO implement the superContestEffectReadTest()
    }

    
}
