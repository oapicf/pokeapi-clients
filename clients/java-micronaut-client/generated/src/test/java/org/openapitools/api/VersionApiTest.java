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
    @Disabled("Not Implemented")
    public void versionListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.versionList(limit, offset).block();

        // then
        // TODO implement the versionListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void versionReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.versionRead(id).block();

        // then
        // TODO implement the versionReadTest()
    }

    
}
