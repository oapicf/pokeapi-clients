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
 * API tests for MoveDamageClassApi
 */
@MicronautTest
public class MoveDamageClassApiTest {

    @Inject
    MoveDamageClassApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void moveDamageClassListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.moveDamageClassList(limit, offset).block();

        // then
        // TODO implement the moveDamageClassListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void moveDamageClassReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.moveDamageClassRead(id).block();

        // then
        // TODO implement the moveDamageClassReadTest()
    }

    
}
