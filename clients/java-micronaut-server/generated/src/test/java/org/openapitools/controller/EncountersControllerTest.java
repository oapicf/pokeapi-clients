package org.openapitools.controller;

import org.openapitools.model.EncounterConditionDetail;
import org.openapitools.model.EncounterConditionValueDetail;
import org.openapitools.model.EncounterMethodDetail;
import org.openapitools.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.model.PaginatedEncounterMethodSummaryList;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInner;
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
 * API tests for EncountersController
 */
@MicronautTest
public class EncountersControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    EncountersController controller;

    /**
     * This test is used to validate the implementation of encounterConditionList() method
     *
     * The method should: List encounter conditions
     *
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterConditionListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedEncounterConditionSummaryList result = controller.encounterConditionList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/encounter-condition/' to the features of encounterConditionList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterConditionListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/encounter-condition/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6347ebbc");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedEncounterConditionSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of encounterConditionRetrieve() method
     *
     * The method should: Get encounter condition
     *
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterConditionRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        EncounterConditionDetail result = controller.encounterConditionRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/encounter-condition/{id}/' to the features of encounterConditionRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterConditionRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/encounter-condition/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@b61aa50");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EncounterConditionDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of encounterConditionValueList() method
     *
     * The method should: List encounter condition values
     *
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterConditionValueListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedEncounterConditionValueSummaryList result = controller.encounterConditionValueList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/encounter-condition-value/' to the features of encounterConditionValueList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterConditionValueListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/encounter-condition-value/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@77c4aeb6");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedEncounterConditionValueSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of encounterConditionValueRetrieve() method
     *
     * The method should: Get encounter condition value
     *
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterConditionValueRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        EncounterConditionValueDetail result = controller.encounterConditionValueRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/encounter-condition-value/{id}/' to the features of encounterConditionValueRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterConditionValueRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/encounter-condition-value/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@54455c8d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EncounterConditionValueDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of encounterMethodList() method
     *
     * The method should: List encounter methods
     *
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterMethodListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedEncounterMethodSummaryList result = controller.encounterMethodList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/encounter-method/' to the features of encounterMethodList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterMethodListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/encounter-method/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@80347b2");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedEncounterMethodSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of encounterMethodRetrieve() method
     *
     * The method should: Get encounter method
     *
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterMethodRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        EncounterMethodDetail result = controller.encounterMethodRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/encounter-method/{id}/' to the features of encounterMethodRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void encounterMethodRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/encounter-method/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@eb65fc8");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EncounterMethodDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonEncountersRetrieve() method
     *
     * The method should: Get pokemon encounter
     *
     * Handles Pokemon Encounters as a sub-resource.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonEncountersRetrieveMethodTest() {
        // given
        String pokemonId = "example";

        // when
        List<PokemonEncountersRetrieve200ResponseInner> result = controller.pokemonEncountersRetrieve(pokemonId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon/{pokemon_id}/encounters' to the features of pokemonEncountersRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonEncountersRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon/{pokemon_id}/encounters").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("pokemon_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5cd5e1b6");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, PokemonEncountersRetrieve200ResponseInner.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
