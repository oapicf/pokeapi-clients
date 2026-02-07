@isTest
private class OASPokemonApiTest {
    /**
     * 
     *
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     */
    @isTest
    private static void abilityListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedAbilitySummaryList response;
        OASPaginatedAbilitySummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedAbilitySummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedAbilitySummaryList.getExample();
        response = (OASPaginatedAbilitySummaryList) api.abilityList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedAbilitySummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedAbilitySummaryList.getExample();
        response = (OASPaginatedAbilitySummaryList) api.abilityList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * 
     *
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     */
    @isTest
    private static void abilityRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASAbilityDetail response;
        OASAbilityDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASAbilityDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAbilityDetail.getExample();
        response = (OASAbilityDetail) api.abilityRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASAbilityDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAbilityDetail.getExample();
        response = (OASAbilityDetail) api.abilityRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List charecterictics
     *
     * Characteristics indicate which stat contains a Pokémon\&#39;s highest IV. A Pokémon\&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     */
    @isTest
    private static void characteristicListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedCharacteristicSummaryLis response;
        OASPaginatedCharacteristicSummaryLis expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedCharacteristicSummaryLis.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedCharacteristicSummaryLis.getExample();
        response = (OASPaginatedCharacteristicSummaryLis) api.characteristicList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedCharacteristicSummaryLis.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedCharacteristicSummaryLis.getExample();
        response = (OASPaginatedCharacteristicSummaryLis) api.characteristicList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get characteristic
     *
     * Characteristics indicate which stat contains a Pokémon\&#39;s highest IV. A Pokémon\&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     */
    @isTest
    private static void characteristicRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASCharacteristicDetail response;
        OASCharacteristicDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASCharacteristicDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCharacteristicDetail.getExample();
        response = (OASCharacteristicDetail) api.characteristicRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASCharacteristicDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCharacteristicDetail.getExample();
        response = (OASCharacteristicDetail) api.characteristicRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List egg groups
     *
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     */
    @isTest
    private static void eggGroupListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedEggGroupSummaryList response;
        OASPaginatedEggGroupSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedEggGroupSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEggGroupSummaryList.getExample();
        response = (OASPaginatedEggGroupSummaryList) api.eggGroupList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedEggGroupSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEggGroupSummaryList.getExample();
        response = (OASPaginatedEggGroupSummaryList) api.eggGroupList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get egg group
     *
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     */
    @isTest
    private static void eggGroupRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASEggGroupDetail response;
        OASEggGroupDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASEggGroupDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEggGroupDetail.getExample();
        response = (OASEggGroupDetail) api.eggGroupRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASEggGroupDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEggGroupDetail.getExample();
        response = (OASEggGroupDetail) api.eggGroupRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List genders
     *
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     */
    @isTest
    private static void genderListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedGenderSummaryList response;
        OASPaginatedGenderSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedGenderSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedGenderSummaryList.getExample();
        response = (OASPaginatedGenderSummaryList) api.genderList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedGenderSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedGenderSummaryList.getExample();
        response = (OASPaginatedGenderSummaryList) api.genderList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get gender
     *
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     */
    @isTest
    private static void genderRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASGenderDetail response;
        OASGenderDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASGenderDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenderDetail.getExample();
        response = (OASGenderDetail) api.genderRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASGenderDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenderDetail.getExample();
        response = (OASGenderDetail) api.genderRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List growth rates
     *
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     */
    @isTest
    private static void growthRateListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedGrowthRateSummaryList response;
        OASPaginatedGrowthRateSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedGrowthRateSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedGrowthRateSummaryList.getExample();
        response = (OASPaginatedGrowthRateSummaryList) api.growthRateList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedGrowthRateSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedGrowthRateSummaryList.getExample();
        response = (OASPaginatedGrowthRateSummaryList) api.growthRateList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get growth rate
     *
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     */
    @isTest
    private static void growthRateRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASGrowthRateDetail response;
        OASGrowthRateDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASGrowthRateDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGrowthRateDetail.getExample();
        response = (OASGrowthRateDetail) api.growthRateRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASGrowthRateDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGrowthRateDetail.getExample();
        response = (OASGrowthRateDetail) api.growthRateRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List move damage classes
     *
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     */
    @isTest
    private static void moveDamageClassListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedMoveDamageClassSummaryLi response;
        OASPaginatedMoveDamageClassSummaryLi expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedMoveDamageClassSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveDamageClassSummaryLi.getExample();
        response = (OASPaginatedMoveDamageClassSummaryLi) api.moveDamageClassList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedMoveDamageClassSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveDamageClassSummaryLi.getExample();
        response = (OASPaginatedMoveDamageClassSummaryLi) api.moveDamageClassList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get move damage class
     *
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     */
    @isTest
    private static void moveDamageClassRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASMoveDamageClassDetail response;
        OASMoveDamageClassDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASMoveDamageClassDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveDamageClassDetail.getExample();
        response = (OASMoveDamageClassDetail) api.moveDamageClassRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASMoveDamageClassDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveDamageClassDetail.getExample();
        response = (OASMoveDamageClassDetail) api.moveDamageClassRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List natures
     *
     * Natures influence how a Pokémon\&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     */
    @isTest
    private static void natureListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedNatureSummaryList response;
        OASPaginatedNatureSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedNatureSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedNatureSummaryList.getExample();
        response = (OASPaginatedNatureSummaryList) api.natureList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedNatureSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedNatureSummaryList.getExample();
        response = (OASPaginatedNatureSummaryList) api.natureList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get nature
     *
     * Natures influence how a Pokémon\&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     */
    @isTest
    private static void natureRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASNatureDetail response;
        OASNatureDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASNatureDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASNatureDetail.getExample();
        response = (OASNatureDetail) api.natureRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASNatureDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASNatureDetail.getExample();
        response = (OASNatureDetail) api.natureRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List pokeathlon stats
     *
     * Pokeathlon Stats are different attributes of a Pokémon\&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     */
    @isTest
    private static void pokeathlonStatListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedPokeathlonStatSummaryLis response;
        OASPaginatedPokeathlonStatSummaryLis expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedPokeathlonStatSummaryLis.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokeathlonStatSummaryLis.getExample();
        response = (OASPaginatedPokeathlonStatSummaryLis) api.pokeathlonStatList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedPokeathlonStatSummaryLis.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokeathlonStatSummaryLis.getExample();
        response = (OASPaginatedPokeathlonStatSummaryLis) api.pokeathlonStatList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get pokeathlon stat
     *
     * Pokeathlon Stats are different attributes of a Pokémon\&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     */
    @isTest
    private static void pokeathlonStatRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPokeathlonStatDetail response;
        OASPokeathlonStatDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPokeathlonStatDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokeathlonStatDetail.getExample();
        response = (OASPokeathlonStatDetail) api.pokeathlonStatRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPokeathlonStatDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokeathlonStatDetail.getExample();
        response = (OASPokeathlonStatDetail) api.pokeathlonStatRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List pokemon colors
     *
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     */
    @isTest
    private static void pokemonColorListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedPokemonColorSummaryList response;
        OASPaginatedPokemonColorSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedPokemonColorSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonColorSummaryList.getExample();
        response = (OASPaginatedPokemonColorSummaryList) api.pokemonColorList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedPokemonColorSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonColorSummaryList.getExample();
        response = (OASPaginatedPokemonColorSummaryList) api.pokemonColorList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get pokemon color
     *
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     */
    @isTest
    private static void pokemonColorRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPokemonColorDetail response;
        OASPokemonColorDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPokemonColorDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonColorDetail.getExample();
        response = (OASPokemonColorDetail) api.pokemonColorRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPokemonColorDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonColorDetail.getExample();
        response = (OASPokemonColorDetail) api.pokemonColorRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List pokemon forms
     *
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \&#39;Pokémon\&#39; entity is used to represent such a variety.
     */
    @isTest
    private static void pokemonFormListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedPokemonFormSummaryList response;
        OASPaginatedPokemonFormSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedPokemonFormSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonFormSummaryList.getExample();
        response = (OASPaginatedPokemonFormSummaryList) api.pokemonFormList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedPokemonFormSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonFormSummaryList.getExample();
        response = (OASPaginatedPokemonFormSummaryList) api.pokemonFormList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get pokemon form
     *
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \&#39;Pokémon\&#39; entity is used to represent such a variety.
     */
    @isTest
    private static void pokemonFormRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPokemonFormDetail response;
        OASPokemonFormDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPokemonFormDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonFormDetail.getExample();
        response = (OASPokemonFormDetail) api.pokemonFormRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPokemonFormDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonFormDetail.getExample();
        response = (OASPokemonFormDetail) api.pokemonFormRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List pokemom habitas
     *
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     */
    @isTest
    private static void pokemonHabitatListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedPokemonHabitatSummaryLis response;
        OASPaginatedPokemonHabitatSummaryLis expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedPokemonHabitatSummaryLis.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonHabitatSummaryLis.getExample();
        response = (OASPaginatedPokemonHabitatSummaryLis) api.pokemonHabitatList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedPokemonHabitatSummaryLis.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonHabitatSummaryLis.getExample();
        response = (OASPaginatedPokemonHabitatSummaryLis) api.pokemonHabitatList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get pokemom habita
     *
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     */
    @isTest
    private static void pokemonHabitatRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPokemonHabitatDetail response;
        OASPokemonHabitatDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPokemonHabitatDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonHabitatDetail.getExample();
        response = (OASPokemonHabitatDetail) api.pokemonHabitatRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPokemonHabitatDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonHabitatDetail.getExample();
        response = (OASPokemonHabitatDetail) api.pokemonHabitatRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List pokemon
     *
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     */
    @isTest
    private static void pokemonListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedPokemonSummaryList response;
        OASPaginatedPokemonSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedPokemonSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonSummaryList.getExample();
        response = (OASPaginatedPokemonSummaryList) api.pokemonList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedPokemonSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonSummaryList.getExample();
        response = (OASPaginatedPokemonSummaryList) api.pokemonList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get pokemon
     *
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     */
    @isTest
    private static void pokemonRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPokemonDetail response;
        OASPokemonDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPokemonDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonDetail.getExample();
        response = (OASPokemonDetail) api.pokemonRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPokemonDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonDetail.getExample();
        response = (OASPokemonDetail) api.pokemonRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List pokemon shapes
     *
     * Shapes used for sorting Pokémon in a Pokédex.
     */
    @isTest
    private static void pokemonShapeListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedPokemonShapeSummaryList response;
        OASPaginatedPokemonShapeSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedPokemonShapeSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonShapeSummaryList.getExample();
        response = (OASPaginatedPokemonShapeSummaryList) api.pokemonShapeList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedPokemonShapeSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonShapeSummaryList.getExample();
        response = (OASPaginatedPokemonShapeSummaryList) api.pokemonShapeList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get pokemon shape
     *
     * Shapes used for sorting Pokémon in a Pokédex.
     */
    @isTest
    private static void pokemonShapeRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPokemonShapeDetail response;
        OASPokemonShapeDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPokemonShapeDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonShapeDetail.getExample();
        response = (OASPokemonShapeDetail) api.pokemonShapeRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPokemonShapeDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonShapeDetail.getExample();
        response = (OASPokemonShapeDetail) api.pokemonShapeRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List pokemon species
     *
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     */
    @isTest
    private static void pokemonSpeciesListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedPokemonSpeciesSummaryLis response;
        OASPaginatedPokemonSpeciesSummaryLis expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedPokemonSpeciesSummaryLis.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonSpeciesSummaryLis.getExample();
        response = (OASPaginatedPokemonSpeciesSummaryLis) api.pokemonSpeciesList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedPokemonSpeciesSummaryLis.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokemonSpeciesSummaryLis.getExample();
        response = (OASPaginatedPokemonSpeciesSummaryLis) api.pokemonSpeciesList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get pokemon species
     *
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     */
    @isTest
    private static void pokemonSpeciesRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPokemonSpeciesDetail response;
        OASPokemonSpeciesDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPokemonSpeciesDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonSpeciesDetail.getExample();
        response = (OASPokemonSpeciesDetail) api.pokemonSpeciesRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPokemonSpeciesDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokemonSpeciesDetail.getExample();
        response = (OASPokemonSpeciesDetail) api.pokemonSpeciesRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List stats
     *
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     */
    @isTest
    private static void statListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedStatSummaryList response;
        OASPaginatedStatSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedStatSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedStatSummaryList.getExample();
        response = (OASPaginatedStatSummaryList) api.statList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedStatSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedStatSummaryList.getExample();
        response = (OASPaginatedStatSummaryList) api.statList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get stat
     *
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     */
    @isTest
    private static void statRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASStatDetail response;
        OASStatDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASStatDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASStatDetail.getExample();
        response = (OASStatDetail) api.statRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASStatDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASStatDetail.getExample();
        response = (OASStatDetail) api.statRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List types
     *
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     */
    @isTest
    private static void typeListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASPaginatedTypeSummaryList response;
        OASPaginatedTypeSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASPaginatedTypeSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedTypeSummaryList.getExample();
        response = (OASPaginatedTypeSummaryList) api.typeList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedTypeSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedTypeSummaryList.getExample();
        response = (OASPaginatedTypeSummaryList) api.typeList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get types
     *
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     */
    @isTest
    private static void typeRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASPokemonApi api;
        OASTypeDetail response;
        OASTypeDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPokemonApi(client);

        js = JSON.serialize(OASTypeDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTypeDetail.getExample();
        response = (OASTypeDetail) api.typeRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASPokemonApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASTypeDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASTypeDetail.getExample();
        response = (OASTypeDetail) api.typeRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}