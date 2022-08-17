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
 * API tests for BerryFlavorApi
 */
@MicronautTest
public class BerryFlavorApiTest {

    @Inject
    BerryFlavorApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void berryFlavorListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.berryFlavorList(limit, offset).block();

        // then
        // TODO implement the berryFlavorListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void berryFlavorReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.berryFlavorRead(id).block();

        // then
        // TODO implement the berryFlavorReadTest()
    }

    
}
