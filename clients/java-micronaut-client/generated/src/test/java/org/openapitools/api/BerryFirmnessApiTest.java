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
 * API tests for BerryFirmnessApi
 */
@MicronautTest
public class BerryFirmnessApiTest {

    @Inject
    BerryFirmnessApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void berryFirmnessListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.berryFirmnessList(limit, offset).block();

        // then
        // TODO implement the berryFirmnessListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void berryFirmnessReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.berryFirmnessRead(id).block();

        // then
        // TODO implement the berryFirmnessReadTest()
    }

    
}
