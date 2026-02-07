@isTest
private class OASEvolutionApiTest {
    /**
     * List evolution chains
     *
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     */
    @isTest
    private static void evolutionChainListTest() {
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
        OASEvolutionApi api;
        OASPaginatedEvolutionChainSummaryLis response;
        OASPaginatedEvolutionChainSummaryLis expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEvolutionApi(client);

        js = JSON.serialize(OASPaginatedEvolutionChainSummaryLis.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEvolutionChainSummaryLis.getExample();
        response = (OASPaginatedEvolutionChainSummaryLis) api.evolutionChainList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASEvolutionApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedEvolutionChainSummaryLis.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEvolutionChainSummaryLis.getExample();
        response = (OASPaginatedEvolutionChainSummaryLis) api.evolutionChainList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get evolution chain
     *
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     */
    @isTest
    private static void evolutionChainRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASEvolutionApi api;
        OASEvolutionChainDetail response;
        OASEvolutionChainDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEvolutionApi(client);

        js = JSON.serialize(OASEvolutionChainDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEvolutionChainDetail.getExample();
        response = (OASEvolutionChainDetail) api.evolutionChainRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASEvolutionApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASEvolutionChainDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEvolutionChainDetail.getExample();
        response = (OASEvolutionChainDetail) api.evolutionChainRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List evolution triggers
     *
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     */
    @isTest
    private static void evolutionTriggerListTest() {
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
        OASEvolutionApi api;
        OASPaginatedEvolutionTriggerSummaryL response;
        OASPaginatedEvolutionTriggerSummaryL expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEvolutionApi(client);

        js = JSON.serialize(OASPaginatedEvolutionTriggerSummaryL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEvolutionTriggerSummaryL.getExample();
        response = (OASPaginatedEvolutionTriggerSummaryL) api.evolutionTriggerList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASEvolutionApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedEvolutionTriggerSummaryL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEvolutionTriggerSummaryL.getExample();
        response = (OASPaginatedEvolutionTriggerSummaryL) api.evolutionTriggerList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get evolution trigger
     *
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     */
    @isTest
    private static void evolutionTriggerRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASEvolutionApi api;
        OASEvolutionTriggerDetail response;
        OASEvolutionTriggerDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEvolutionApi(client);

        js = JSON.serialize(OASEvolutionTriggerDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEvolutionTriggerDetail.getExample();
        response = (OASEvolutionTriggerDetail) api.evolutionTriggerRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASEvolutionApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASEvolutionTriggerDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEvolutionTriggerDetail.getExample();
        response = (OASEvolutionTriggerDetail) api.evolutionTriggerRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}