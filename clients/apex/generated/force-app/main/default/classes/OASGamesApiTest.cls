@isTest
private class OASGamesApiTest {
    /**
     * List genrations
     *
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     */
    @isTest
    private static void generationListTest() {
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
        OASGamesApi api;
        OASPaginatedGenerationSummaryList response;
        OASPaginatedGenerationSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGamesApi(client);

        js = JSON.serialize(OASPaginatedGenerationSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedGenerationSummaryList.getExample();
        response = (OASPaginatedGenerationSummaryList) api.generationList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASGamesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedGenerationSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedGenerationSummaryList.getExample();
        response = (OASPaginatedGenerationSummaryList) api.generationList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get genration
     *
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     */
    @isTest
    private static void generationRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASGamesApi api;
        OASGenerationDetail response;
        OASGenerationDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGamesApi(client);

        js = JSON.serialize(OASGenerationDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerationDetail.getExample();
        response = (OASGenerationDetail) api.generationRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASGamesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASGenerationDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerationDetail.getExample();
        response = (OASGenerationDetail) api.generationRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List pokedex
     *
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     */
    @isTest
    private static void pokedexListTest() {
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
        OASGamesApi api;
        OASPaginatedPokedexSummaryList response;
        OASPaginatedPokedexSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGamesApi(client);

        js = JSON.serialize(OASPaginatedPokedexSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokedexSummaryList.getExample();
        response = (OASPaginatedPokedexSummaryList) api.pokedexList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASGamesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedPokedexSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPokedexSummaryList.getExample();
        response = (OASPaginatedPokedexSummaryList) api.pokedexList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get pokedex
     *
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     */
    @isTest
    private static void pokedexRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASGamesApi api;
        OASPokedexDetail response;
        OASPokedexDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGamesApi(client);

        js = JSON.serialize(OASPokedexDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokedexDetail.getExample();
        response = (OASPokedexDetail) api.pokedexRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASGamesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPokedexDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPokedexDetail.getExample();
        response = (OASPokedexDetail) api.pokedexRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List version groups
     *
     * Version groups categorize highly similar versions of the games.
     */
    @isTest
    private static void versionGroupListTest() {
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
        OASGamesApi api;
        OASPaginatedVersionGroupSummaryList response;
        OASPaginatedVersionGroupSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGamesApi(client);

        js = JSON.serialize(OASPaginatedVersionGroupSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedVersionGroupSummaryList.getExample();
        response = (OASPaginatedVersionGroupSummaryList) api.versionGroupList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASGamesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedVersionGroupSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedVersionGroupSummaryList.getExample();
        response = (OASPaginatedVersionGroupSummaryList) api.versionGroupList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get version group
     *
     * Version groups categorize highly similar versions of the games.
     */
    @isTest
    private static void versionGroupRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASGamesApi api;
        OASVersionGroupDetail response;
        OASVersionGroupDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGamesApi(client);

        js = JSON.serialize(OASVersionGroupDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVersionGroupDetail.getExample();
        response = (OASVersionGroupDetail) api.versionGroupRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASGamesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASVersionGroupDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVersionGroupDetail.getExample();
        response = (OASVersionGroupDetail) api.versionGroupRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List versions
     *
     * Versions of the games, e.g., Red, Blue or Yellow.
     */
    @isTest
    private static void versionListTest() {
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
        OASGamesApi api;
        OASPaginatedVersionSummaryList response;
        OASPaginatedVersionSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGamesApi(client);

        js = JSON.serialize(OASPaginatedVersionSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedVersionSummaryList.getExample();
        response = (OASPaginatedVersionSummaryList) api.versionList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASGamesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedVersionSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedVersionSummaryList.getExample();
        response = (OASPaginatedVersionSummaryList) api.versionList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get version
     *
     * Versions of the games, e.g., Red, Blue or Yellow.
     */
    @isTest
    private static void versionRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASGamesApi api;
        OASVersionDetail response;
        OASVersionDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASGamesApi(client);

        js = JSON.serialize(OASVersionDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVersionDetail.getExample();
        response = (OASVersionDetail) api.versionRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASGamesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASVersionDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASVersionDetail.getExample();
        response = (OASVersionDetail) api.versionRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}