package org.openapitools.controller;

import org.openapitools.model.LocationAreaDetail;
import org.openapitools.model.LocationDetail;
import org.openapitools.model.PaginatedLocationAreaSummaryList;
import org.openapitools.model.PaginatedLocationSummaryList;
import org.openapitools.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.model.PaginatedRegionSummaryList;
import org.openapitools.model.PalParkAreaDetail;
import org.openapitools.model.RegionDetail;
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
 * API tests for LocationController
 */
@MicronautTest
public class LocationControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    LocationController controller;

    /**
     * This test is used to validate the implementation of locationAreaList() method
     *
     * The method should: List location areas
     *
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void locationAreaListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;

        // when
        PaginatedLocationAreaSummaryList result = controller.locationAreaList(limit, offset).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/location-area/' to the features of locationAreaList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void locationAreaListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/location-area/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4eb313ed");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedLocationAreaSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of locationAreaRetrieve() method
     *
     * The method should: Get location area
     *
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void locationAreaRetrieveMethodTest() {
        // given
        Integer id = 56;

        // when
        LocationAreaDetail result = controller.locationAreaRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/location-area/{id}/' to the features of locationAreaRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void locationAreaRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/location-area/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", 56);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3fc92211");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LocationAreaDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of locationList() method
     *
     * The method should: List locations
     *
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void locationListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedLocationSummaryList result = controller.locationList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/location/' to the features of locationList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void locationListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/location/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@63d8590c");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedLocationSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of locationRetrieve() method
     *
     * The method should: Get location
     *
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void locationRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        LocationDetail result = controller.locationRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/location/{id}/' to the features of locationRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void locationRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/location/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@117bfeb8");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, LocationDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of palParkAreaList() method
     *
     * The method should: List pal park areas
     *
     * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void palParkAreaListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPalParkAreaSummaryList result = controller.palParkAreaList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pal-park-area/' to the features of palParkAreaList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void palParkAreaListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pal-park-area/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4781bb01");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedPalParkAreaSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of palParkAreaRetrieve() method
     *
     * The method should: Get pal park area
     *
     * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void palParkAreaRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        PalParkAreaDetail result = controller.palParkAreaRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pal-park-area/{id}/' to the features of palParkAreaRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void palParkAreaRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pal-park-area/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@31aec04a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PalParkAreaDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of regionList() method
     *
     * The method should: List regions
     *
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void regionListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedRegionSummaryList result = controller.regionList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/region/' to the features of regionList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void regionListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/region/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@109fff4a");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedRegionSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of regionRetrieve() method
     *
     * The method should: Get region
     *
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void regionRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        RegionDetail result = controller.regionRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/region/{id}/' to the features of regionRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void regionRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/region/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5e5f5ddf");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, RegionDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
