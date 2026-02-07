package org.openapitools.api;

import org.openapitools.model.ContestEffectDetail;
import org.openapitools.model.ContestTypeDetail;
import org.openapitools.model.PaginatedContestEffectSummaryList;
import org.openapitools.model.PaginatedContestTypeSummaryList;
import org.openapitools.model.PaginatedSuperContestEffectSummaryList;
import org.openapitools.model.SuperContestEffectDetail;
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
 * API tests for ContestsApi
 */
@MicronautTest
public class ContestsApiTest {

    @Inject
    ContestsApi api;

    
    /**
     * List contest effects
     *
     * Contest effects refer to the effects of moves when used in contests.
     */
    @Test
    @Disabled("Not Implemented")
    public void contestEffectListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedContestEffectSummaryList body = api.contestEffectList(limit, offset, q).block();

        // then
        // TODO implement the contestEffectListTest()
    }

    
    /**
     * Get contest effect
     *
     * Contest effects refer to the effects of moves when used in contests.
     */
    @Test
    @Disabled("Not Implemented")
    public void contestEffectRetrieveTest() {
        // given
        String id = "example";

        // when
        ContestEffectDetail body = api.contestEffectRetrieve(id).block();

        // then
        // TODO implement the contestEffectRetrieveTest()
    }

    
    /**
     * List contest types
     *
     * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void contestTypeListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedContestTypeSummaryList body = api.contestTypeList(limit, offset, q).block();

        // then
        // TODO implement the contestTypeListTest()
    }

    
    /**
     * Get contest type
     *
     * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void contestTypeRetrieveTest() {
        // given
        String id = "example";

        // when
        ContestTypeDetail body = api.contestTypeRetrieve(id).block();

        // then
        // TODO implement the contestTypeRetrieveTest()
    }

    
    /**
     * List super contest effects
     *
     * Super contest effects refer to the effects of moves when used in super contests.
     */
    @Test
    @Disabled("Not Implemented")
    public void superContestEffectListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedSuperContestEffectSummaryList body = api.superContestEffectList(limit, offset, q).block();

        // then
        // TODO implement the superContestEffectListTest()
    }

    
    /**
     * Get super contest effect
     *
     * Super contest effects refer to the effects of moves when used in super contests.
     */
    @Test
    @Disabled("Not Implemented")
    public void superContestEffectRetrieveTest() {
        // given
        String id = "example";

        // when
        SuperContestEffectDetail body = api.superContestEffectRetrieve(id).block();

        // then
        // TODO implement the superContestEffectRetrieveTest()
    }

    
}
