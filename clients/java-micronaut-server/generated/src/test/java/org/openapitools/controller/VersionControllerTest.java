package org.openapitools.controller;

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
 * API tests for VersionController
 */
@MicronautTest
public class VersionControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client("${context-path}")
    HttpClient client;

    @Inject
    VersionController controller;

    /**
     * This test is used to validate the implementation of versionList() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void versionListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        String result = controller.versionList(limit, offset).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/version/' to the features of versionList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void versionListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/version/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("text/plain");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of versionRead() method
     *
     * The method should: 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void versionReadMethodTest() {
        // given
        Integer id = 56;

        // when
        String result = controller.versionRead(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/version/{id}/' to the features of versionRead() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void versionReadClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/version/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", 56);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("text/plain");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
