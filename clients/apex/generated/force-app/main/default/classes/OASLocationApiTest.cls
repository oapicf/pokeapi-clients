@isTest
private class OASLocationApiTest {
    /**
     * List location areas
     *
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     */
    @isTest
    private static void locationAreaListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASLocationApi api;
        OASPaginatedLocationAreaSummaryList response;
        OASPaginatedLocationAreaSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLocationApi(client);

        js = JSON.serialize(OASPaginatedLocationAreaSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedLocationAreaSummaryList.getExample();
        response = (OASPaginatedLocationAreaSummaryList) api.locationAreaList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASLocationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedLocationAreaSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedLocationAreaSummaryList.getExample();
        response = (OASPaginatedLocationAreaSummaryList) api.locationAreaList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get location area
     *
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     */
    @isTest
    private static void locationAreaRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASLocationApi api;
        OASLocationAreaDetail response;
        OASLocationAreaDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLocationApi(client);

        js = JSON.serialize(OASLocationAreaDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocationAreaDetail.getExample();
        response = (OASLocationAreaDetail) api.locationAreaRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASLocationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASLocationAreaDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocationAreaDetail.getExample();
        response = (OASLocationAreaDetail) api.locationAreaRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List locations
     *
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     */
    @isTest
    private static void locationListTest() {
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
        OASLocationApi api;
        OASPaginatedLocationSummaryList response;
        OASPaginatedLocationSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLocationApi(client);

        js = JSON.serialize(OASPaginatedLocationSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedLocationSummaryList.getExample();
        response = (OASPaginatedLocationSummaryList) api.locationList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASLocationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedLocationSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedLocationSummaryList.getExample();
        response = (OASPaginatedLocationSummaryList) api.locationList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get location
     *
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     */
    @isTest
    private static void locationRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASLocationApi api;
        OASLocationDetail response;
        OASLocationDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLocationApi(client);

        js = JSON.serialize(OASLocationDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocationDetail.getExample();
        response = (OASLocationDetail) api.locationRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASLocationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASLocationDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLocationDetail.getExample();
        response = (OASLocationDetail) api.locationRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List pal park areas
     *
     * Areas used for grouping Pokémon encounters in Pal Park. They\&#39;re like habitats that are specific to Pal Park.
     */
    @isTest
    private static void palParkAreaListTest() {
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
        OASLocationApi api;
        OASPaginatedPalParkAreaSummaryList response;
        OASPaginatedPalParkAreaSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLocationApi(client);

        js = JSON.serialize(OASPaginatedPalParkAreaSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPalParkAreaSummaryList.getExample();
        response = (OASPaginatedPalParkAreaSummaryList) api.palParkAreaList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASLocationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedPalParkAreaSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedPalParkAreaSummaryList.getExample();
        response = (OASPaginatedPalParkAreaSummaryList) api.palParkAreaList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get pal park area
     *
     * Areas used for grouping Pokémon encounters in Pal Park. They\&#39;re like habitats that are specific to Pal Park.
     */
    @isTest
    private static void palParkAreaRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASLocationApi api;
        OASPalParkAreaDetail response;
        OASPalParkAreaDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLocationApi(client);

        js = JSON.serialize(OASPalParkAreaDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPalParkAreaDetail.getExample();
        response = (OASPalParkAreaDetail) api.palParkAreaRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASLocationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPalParkAreaDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPalParkAreaDetail.getExample();
        response = (OASPalParkAreaDetail) api.palParkAreaRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List regions
     *
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     */
    @isTest
    private static void regionListTest() {
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
        OASLocationApi api;
        OASPaginatedRegionSummaryList response;
        OASPaginatedRegionSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLocationApi(client);

        js = JSON.serialize(OASPaginatedRegionSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedRegionSummaryList.getExample();
        response = (OASPaginatedRegionSummaryList) api.regionList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASLocationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedRegionSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedRegionSummaryList.getExample();
        response = (OASPaginatedRegionSummaryList) api.regionList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get region
     *
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     */
    @isTest
    private static void regionRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASLocationApi api;
        OASRegionDetail response;
        OASRegionDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASLocationApi(client);

        js = JSON.serialize(OASRegionDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRegionDetail.getExample();
        response = (OASRegionDetail) api.regionRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASLocationApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASRegionDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASRegionDetail.getExample();
        response = (OASRegionDetail) api.regionRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}