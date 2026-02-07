package org.openapitools.controller;

import org.openapitools.model.ContestEffectDetail;
import org.openapitools.model.ContestTypeDetail;
import org.openapitools.model.PaginatedContestEffectSummaryList;
import org.openapitools.model.PaginatedContestTypeSummaryList;
import org.openapitools.model.PaginatedSuperContestEffectSummaryList;
import org.openapitools.model.SuperContestEffectDetail;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for ContestsController
 */
@MicronautTest
public class ContestsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ContestsController controller;

    /**
     * This test is used to validate the implementation of contestEffectList() method
     *
     * The method should: List contest effects
     *
     * Contest effects refer to the effects of moves when used in contests.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void contestEffectListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedContestEffectSummaryList result = controller.contestEffectList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/contest-effect/' to the features of contestEffectList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void contestEffectListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/contest-effect/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@60003305");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedContestEffectSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of contestEffectRetrieve() method
     *
     * The method should: Get contest effect
     *
     * Contest effects refer to the effects of moves when used in contests.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void contestEffectRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        ContestEffectDetail result = controller.contestEffectRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/contest-effect/{id}/' to the features of contestEffectRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void contestEffectRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/contest-effect/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3f1dadeb");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ContestEffectDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of contestTypeList() method
     *
     * The method should: List contest types
     *
     * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void contestTypeListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedContestTypeSummaryList result = controller.contestTypeList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/contest-type/' to the features of contestTypeList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void contestTypeListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/contest-type/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@72259917");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedContestTypeSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of contestTypeRetrieve() method
     *
     * The method should: Get contest type
     *
     * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void contestTypeRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        ContestTypeDetail result = controller.contestTypeRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/contest-type/{id}/' to the features of contestTypeRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void contestTypeRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/contest-type/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5e81b406");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ContestTypeDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of superContestEffectList() method
     *
     * The method should: List super contest effects
     *
     * Super contest effects refer to the effects of moves when used in super contests.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void superContestEffectListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedSuperContestEffectSummaryList result = controller.superContestEffectList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/super-contest-effect/' to the features of superContestEffectList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void superContestEffectListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/super-contest-effect/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3ff83cc8");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedSuperContestEffectSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of superContestEffectRetrieve() method
     *
     * The method should: Get super contest effect
     *
     * Super contest effects refer to the effects of moves when used in super contests.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void superContestEffectRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        SuperContestEffectDetail result = controller.superContestEffectRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/super-contest-effect/{id}/' to the features of superContestEffectRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void superContestEffectRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/super-contest-effect/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6dd8ac29");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SuperContestEffectDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
