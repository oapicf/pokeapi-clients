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
 * API tests for AbilityApi
 */
@MicronautTest
public class AbilityApiTest {

    @Inject
    AbilityApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void abilityListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.abilityList(limit, offset).block();

        // then
        // TODO implement the abilityListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void abilityReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.abilityRead(id).block();

        // then
        // TODO implement the abilityReadTest()
    }

    
}
