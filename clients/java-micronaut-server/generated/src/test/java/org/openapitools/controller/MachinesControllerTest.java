package org.openapitools.controller;

import org.openapitools.model.MachineDetail;
import org.openapitools.model.PaginatedMachineSummaryList;
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
 * API tests for MachinesController
 */
@MicronautTest
public class MachinesControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    MachinesController controller;

    /**
     * This test is used to validate the implementation of machineList() method
     *
     * The method should: List machines
     *
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void machineListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedMachineSummaryList result = controller.machineList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/machine/' to the features of machineList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void machineListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/machine/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2d05d022");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedMachineSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of machineRetrieve() method
     *
     * The method should: Get machine
     *
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void machineRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        MachineDetail result = controller.machineRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/machine/{id}/' to the features of machineRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void machineRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/machine/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@28806954");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MachineDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
