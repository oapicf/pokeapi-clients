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
 * API tests for MoveAilmentApi
 */
@MicronautTest
public class MoveAilmentApiTest {

    @Inject
    MoveAilmentApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void moveAilmentListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.moveAilmentList(limit, offset).block();

        // then
        // TODO implement the moveAilmentListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void moveAilmentReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.moveAilmentRead(id).block();

        // then
        // TODO implement the moveAilmentReadTest()
    }

    
}
