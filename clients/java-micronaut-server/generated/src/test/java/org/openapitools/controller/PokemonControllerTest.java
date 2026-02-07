package org.openapitools.controller;

import org.openapitools.model.AbilityDetail;
import org.openapitools.model.CharacteristicDetail;
import org.openapitools.model.EggGroupDetail;
import org.openapitools.model.GenderDetail;
import org.openapitools.model.GrowthRateDetail;
import org.openapitools.model.MoveDamageClassDetail;
import org.openapitools.model.NatureDetail;
import org.openapitools.model.PaginatedAbilitySummaryList;
import org.openapitools.model.PaginatedCharacteristicSummaryList;
import org.openapitools.model.PaginatedEggGroupSummaryList;
import org.openapitools.model.PaginatedGenderSummaryList;
import org.openapitools.model.PaginatedGrowthRateSummaryList;
import org.openapitools.model.PaginatedMoveDamageClassSummaryList;
import org.openapitools.model.PaginatedNatureSummaryList;
import org.openapitools.model.PaginatedPokeathlonStatSummaryList;
import org.openapitools.model.PaginatedPokemonColorSummaryList;
import org.openapitools.model.PaginatedPokemonFormSummaryList;
import org.openapitools.model.PaginatedPokemonHabitatSummaryList;
import org.openapitools.model.PaginatedPokemonShapeSummaryList;
import org.openapitools.model.PaginatedPokemonSpeciesSummaryList;
import org.openapitools.model.PaginatedPokemonSummaryList;
import org.openapitools.model.PaginatedStatSummaryList;
import org.openapitools.model.PaginatedTypeSummaryList;
import org.openapitools.model.PokeathlonStatDetail;
import org.openapitools.model.PokemonColorDetail;
import org.openapitools.model.PokemonDetail;
import org.openapitools.model.PokemonFormDetail;
import org.openapitools.model.PokemonHabitatDetail;
import org.openapitools.model.PokemonShapeDetail;
import org.openapitools.model.PokemonSpeciesDetail;
import org.openapitools.model.StatDetail;
import org.openapitools.model.TypeDetail;
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
 * API tests for PokemonController
 */
@MicronautTest
public class PokemonControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    PokemonController controller;

    /**
     * This test is used to validate the implementation of abilityList() method
     *
     * The method should: 
     *
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void abilityListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedAbilitySummaryList result = controller.abilityList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/ability/' to the features of abilityList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void abilityListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/ability/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@61f62b80");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedAbilitySummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of abilityRetrieve() method
     *
     * The method should: 
     *
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void abilityRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        AbilityDetail result = controller.abilityRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/ability/{id}/' to the features of abilityRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void abilityRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/ability/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@387bbd7a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AbilityDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of characteristicList() method
     *
     * The method should: List charecterictics
     *
     * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void characteristicListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedCharacteristicSummaryList result = controller.characteristicList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/characteristic/' to the features of characteristicList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void characteristicListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/characteristic/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@22cf6c9c");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedCharacteristicSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of characteristicRetrieve() method
     *
     * The method should: Get characteristic
     *
     * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void characteristicRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        CharacteristicDetail result = controller.characteristicRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/characteristic/{id}/' to the features of characteristicRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void characteristicRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/characteristic/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4569b6a9");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CharacteristicDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of eggGroupList() method
     *
     * The method should: List egg groups
     *
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void eggGroupListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedEggGroupSummaryList result = controller.eggGroupList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/egg-group/' to the features of eggGroupList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void eggGroupListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/egg-group/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@15932faf");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedEggGroupSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of eggGroupRetrieve() method
     *
     * The method should: Get egg group
     *
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void eggGroupRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        EggGroupDetail result = controller.eggGroupRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/egg-group/{id}/' to the features of eggGroupRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void eggGroupRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/egg-group/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7066c00a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, EggGroupDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of genderList() method
     *
     * The method should: List genders
     *
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void genderListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedGenderSummaryList result = controller.genderList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/gender/' to the features of genderList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void genderListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/gender/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2914f916");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedGenderSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of genderRetrieve() method
     *
     * The method should: Get gender
     *
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void genderRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        GenderDetail result = controller.genderRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/gender/{id}/' to the features of genderRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void genderRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/gender/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2140de63");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenderDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of growthRateList() method
     *
     * The method should: List growth rates
     *
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void growthRateListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedGrowthRateSummaryList result = controller.growthRateList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/growth-rate/' to the features of growthRateList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void growthRateListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/growth-rate/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2da273b3");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedGrowthRateSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of growthRateRetrieve() method
     *
     * The method should: Get growth rate
     *
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void growthRateRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        GrowthRateDetail result = controller.growthRateRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/growth-rate/{id}/' to the features of growthRateRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void growthRateRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/growth-rate/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6b02909d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GrowthRateDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of moveDamageClassList() method
     *
     * The method should: List move damage classes
     *
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void moveDamageClassListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedMoveDamageClassSummaryList result = controller.moveDamageClassList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/move-damage-class/' to the features of moveDamageClassList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void moveDamageClassListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/move-damage-class/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@655008a2");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedMoveDamageClassSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of moveDamageClassRetrieve() method
     *
     * The method should: Get move damage class
     *
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void moveDamageClassRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        MoveDamageClassDetail result = controller.moveDamageClassRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/move-damage-class/{id}/' to the features of moveDamageClassRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void moveDamageClassRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/move-damage-class/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@424461ad");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MoveDamageClassDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of natureList() method
     *
     * The method should: List natures
     *
     * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void natureListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedNatureSummaryList result = controller.natureList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/nature/' to the features of natureList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void natureListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/nature/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7cc5bdbd");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedNatureSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of natureRetrieve() method
     *
     * The method should: Get nature
     *
     * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void natureRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        NatureDetail result = controller.natureRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/nature/{id}/' to the features of natureRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void natureRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/nature/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@33c5cc0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, NatureDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokeathlonStatList() method
     *
     * The method should: List pokeathlon stats
     *
     * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokeathlonStatListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokeathlonStatSummaryList result = controller.pokeathlonStatList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokeathlon-stat/' to the features of pokeathlonStatList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokeathlonStatListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokeathlon-stat/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@664c411d");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedPokeathlonStatSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokeathlonStatRetrieve() method
     *
     * The method should: Get pokeathlon stat
     *
     * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokeathlonStatRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        PokeathlonStatDetail result = controller.pokeathlonStatRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokeathlon-stat/{id}/' to the features of pokeathlonStatRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokeathlonStatRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokeathlon-stat/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7641d70");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PokeathlonStatDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonColorList() method
     *
     * The method should: List pokemon colors
     *
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonColorListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonColorSummaryList result = controller.pokemonColorList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon-color/' to the features of pokemonColorList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonColorListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon-color/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@569d7074");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedPokemonColorSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonColorRetrieve() method
     *
     * The method should: Get pokemon color
     *
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonColorRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        PokemonColorDetail result = controller.pokemonColorRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon-color/{id}/' to the features of pokemonColorRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonColorRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon-color/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3726fc3b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PokemonColorDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonFormList() method
     *
     * The method should: List pokemon forms
     *
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonFormListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonFormSummaryList result = controller.pokemonFormList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon-form/' to the features of pokemonFormList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonFormListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon-form/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@33e6176b");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedPokemonFormSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonFormRetrieve() method
     *
     * The method should: Get pokemon form
     *
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonFormRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        PokemonFormDetail result = controller.pokemonFormRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon-form/{id}/' to the features of pokemonFormRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonFormRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon-form/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@14ce13fa");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PokemonFormDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonHabitatList() method
     *
     * The method should: List pokemom habitas
     *
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonHabitatListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonHabitatSummaryList result = controller.pokemonHabitatList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon-habitat/' to the features of pokemonHabitatList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonHabitatListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon-habitat/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@296ddfc7");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedPokemonHabitatSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonHabitatRetrieve() method
     *
     * The method should: Get pokemom habita
     *
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonHabitatRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        PokemonHabitatDetail result = controller.pokemonHabitatRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon-habitat/{id}/' to the features of pokemonHabitatRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonHabitatRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon-habitat/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@29aa29f5");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PokemonHabitatDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonList() method
     *
     * The method should: List pokemon
     *
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonSummaryList result = controller.pokemonList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon/' to the features of pokemonList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2a742ee4");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedPokemonSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonRetrieve() method
     *
     * The method should: Get pokemon
     *
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        PokemonDetail result = controller.pokemonRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon/{id}/' to the features of pokemonRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4e41b993");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PokemonDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonShapeList() method
     *
     * The method should: List pokemon shapes
     *
     * Shapes used for sorting Pokémon in a Pokédex.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonShapeListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonShapeSummaryList result = controller.pokemonShapeList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon-shape/' to the features of pokemonShapeList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonShapeListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon-shape/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@915c47b");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedPokemonShapeSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonShapeRetrieve() method
     *
     * The method should: Get pokemon shape
     *
     * Shapes used for sorting Pokémon in a Pokédex.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonShapeRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        PokemonShapeDetail result = controller.pokemonShapeRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon-shape/{id}/' to the features of pokemonShapeRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonShapeRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon-shape/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7108b12d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PokemonShapeDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonSpeciesList() method
     *
     * The method should: List pokemon species
     *
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonSpeciesListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonSpeciesSummaryList result = controller.pokemonSpeciesList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon-species/' to the features of pokemonSpeciesList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonSpeciesListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon-species/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7a80b2e6");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedPokemonSpeciesSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pokemonSpeciesRetrieve() method
     *
     * The method should: Get pokemon species
     *
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonSpeciesRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        PokemonSpeciesDetail result = controller.pokemonSpeciesRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/pokemon-species/{id}/' to the features of pokemonSpeciesRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pokemonSpeciesRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/pokemon-species/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@394e0104");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PokemonSpeciesDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of statList() method
     *
     * The method should: List stats
     *
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void statListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedStatSummaryList result = controller.statList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/stat/' to the features of statList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void statListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/stat/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1e5f3c4a");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedStatSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of statRetrieve() method
     *
     * The method should: Get stat
     *
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void statRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        StatDetail result = controller.statRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/stat/{id}/' to the features of statRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void statRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/stat/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2aea7775");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, StatDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of typeList() method
     *
     * The method should: List types
     *
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void typeListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedTypeSummaryList result = controller.typeList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/type/' to the features of typeList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void typeListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/type/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5502f74c");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedTypeSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of typeRetrieve() method
     *
     * The method should: Get types
     *
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void typeRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        TypeDetail result = controller.typeRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/type/{id}/' to the features of typeRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void typeRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/type/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1c8d9ac9");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, TypeDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
