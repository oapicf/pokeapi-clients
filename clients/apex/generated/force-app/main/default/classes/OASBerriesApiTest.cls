@isTest
private class OASBerriesApiTest {
    /**
     * List berry firmness
     *
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     */
    @isTest
    private static void berryFirmnessListTest() {
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
        OASBerriesApi api;
        OASPaginatedBerryFirmnessSummaryList response;
        OASPaginatedBerryFirmnessSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBerriesApi(client);

        js = JSON.serialize(OASPaginatedBerryFirmnessSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedBerryFirmnessSummaryList.getExample();
        response = (OASPaginatedBerryFirmnessSummaryList) api.berryFirmnessList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBerriesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedBerryFirmnessSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedBerryFirmnessSummaryList.getExample();
        response = (OASPaginatedBerryFirmnessSummaryList) api.berryFirmnessList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get berry by firmness
     *
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     */
    @isTest
    private static void berryFirmnessRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASBerriesApi api;
        OASBerryFirmnessDetail response;
        OASBerryFirmnessDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBerriesApi(client);

        js = JSON.serialize(OASBerryFirmnessDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBerryFirmnessDetail.getExample();
        response = (OASBerryFirmnessDetail) api.berryFirmnessRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBerriesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASBerryFirmnessDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBerryFirmnessDetail.getExample();
        response = (OASBerryFirmnessDetail) api.berryFirmnessRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List berry flavors
     *
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     */
    @isTest
    private static void berryFlavorListTest() {
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
        OASBerriesApi api;
        OASPaginatedBerryFlavorSummaryList response;
        OASPaginatedBerryFlavorSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBerriesApi(client);

        js = JSON.serialize(OASPaginatedBerryFlavorSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedBerryFlavorSummaryList.getExample();
        response = (OASPaginatedBerryFlavorSummaryList) api.berryFlavorList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBerriesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedBerryFlavorSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedBerryFlavorSummaryList.getExample();
        response = (OASPaginatedBerryFlavorSummaryList) api.berryFlavorList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get berries by flavor
     *
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     */
    @isTest
    private static void berryFlavorRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASBerriesApi api;
        OASBerryFlavorDetail response;
        OASBerryFlavorDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBerriesApi(client);

        js = JSON.serialize(OASBerryFlavorDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBerryFlavorDetail.getExample();
        response = (OASBerryFlavorDetail) api.berryFlavorRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBerriesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASBerryFlavorDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBerryFlavorDetail.getExample();
        response = (OASBerryFlavorDetail) api.berryFlavorRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List berries
     *
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     */
    @isTest
    private static void berryListTest() {
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
        OASBerriesApi api;
        OASPaginatedBerrySummaryList response;
        OASPaginatedBerrySummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBerriesApi(client);

        js = JSON.serialize(OASPaginatedBerrySummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedBerrySummaryList.getExample();
        response = (OASPaginatedBerrySummaryList) api.berryList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBerriesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedBerrySummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedBerrySummaryList.getExample();
        response = (OASPaginatedBerrySummaryList) api.berryList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get a berry
     *
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     */
    @isTest
    private static void berryRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASBerriesApi api;
        OASBerryDetail response;
        OASBerryDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASBerriesApi(client);

        js = JSON.serialize(OASBerryDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBerryDetail.getExample();
        response = (OASBerryDetail) api.berryRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASBerriesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASBerryDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASBerryDetail.getExample();
        response = (OASBerryDetail) api.berryRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}