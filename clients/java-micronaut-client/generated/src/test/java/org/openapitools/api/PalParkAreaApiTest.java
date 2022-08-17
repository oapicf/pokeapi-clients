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
 * API tests for PalParkAreaApi
 */
@MicronautTest
public class PalParkAreaApiTest {

    @Inject
    PalParkAreaApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void palParkAreaListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.palParkAreaList(limit, offset).block();

        // then
        // TODO implement the palParkAreaListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void palParkAreaReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.palParkAreaRead(id).block();

        // then
        // TODO implement the palParkAreaReadTest()
    }

    
}
