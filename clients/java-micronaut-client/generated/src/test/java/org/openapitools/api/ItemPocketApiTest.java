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
 * API tests for ItemPocketApi
 */
@MicronautTest
public class ItemPocketApiTest {

    @Inject
    ItemPocketApi api;

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void itemPocketListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String body = api.itemPocketList(limit, offset).block();

        // then
        // TODO implement the itemPocketListTest()
    }

    
    /**
     * 
     */
    @Test
    @Disabled("Not Implemented")
    public void itemPocketReadTest() {
        // given
        Integer id = 56;

        // when
        String body = api.itemPocketRead(id).block();

        // then
        // TODO implement the itemPocketReadTest()
    }

    
}
