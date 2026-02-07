package org.openapitools.api;

import org.openapitools.model.LanguageDetail;
import org.openapitools.model.PaginatedLanguageSummaryList;
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
 * API tests for UtilityApi
 */
@MicronautTest
public class UtilityApiTest {

    @Inject
    UtilityApi api;

    
    /**
     * List languages
     *
     * Languages for translations of API resource information.
     */
    @Test
    @Disabled("Not Implemented")
    public void languageListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedLanguageSummaryList body = api.languageList(limit, offset, q).block();

        // then
        // TODO implement the languageListTest()
    }

    
    /**
     * Get language
     *
     * Languages for translations of API resource information.
     */
    @Test
    @Disabled("Not Implemented")
    public void languageRetrieveTest() {
        // given
        String id = "example";

        // when
        LanguageDetail body = api.languageRetrieve(id).block();

        // then
        // TODO implement the languageRetrieveTest()
    }

    
}
