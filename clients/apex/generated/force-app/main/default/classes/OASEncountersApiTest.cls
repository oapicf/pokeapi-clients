@isTest
private class OASEncountersApiTest {
    /**
     * List encounter conditions
     *
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     */
    @isTest
    private static void encounterConditionListTest() {
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
        OASEncountersApi api;
        OASPaginatedEncounterConditionSummar response;
        OASPaginatedEncounterConditionSummar expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEncountersApi(client);

        js = JSON.serialize(OASPaginatedEncounterConditionSummar.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEncounterConditionSummar.getExample();
        response = (OASPaginatedEncounterConditionSummar) api.encounterConditionList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASEncountersApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedEncounterConditionSummar.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEncounterConditionSummar.getExample();
        response = (OASPaginatedEncounterConditionSummar) api.encounterConditionList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get encounter condition
     *
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     */
    @isTest
    private static void encounterConditionRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASEncountersApi api;
        OASEncounterConditionDetail response;
        OASEncounterConditionDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEncountersApi(client);

        js = JSON.serialize(OASEncounterConditionDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEncounterConditionDetail.getExample();
        response = (OASEncounterConditionDetail) api.encounterConditionRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASEncountersApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASEncounterConditionDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEncounterConditionDetail.getExample();
        response = (OASEncounterConditionDetail) api.encounterConditionRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List encounter condition values
     *
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     */
    @isTest
    private static void encounterConditionValueListTest() {
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
        OASEncountersApi api;
        OASPaginatedEncounterConditionValueS response;
        OASPaginatedEncounterConditionValueS expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEncountersApi(client);

        js = JSON.serialize(OASPaginatedEncounterConditionValueS.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEncounterConditionValueS.getExample();
        response = (OASPaginatedEncounterConditionValueS) api.encounterConditionValueList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASEncountersApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedEncounterConditionValueS.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEncounterConditionValueS.getExample();
        response = (OASPaginatedEncounterConditionValueS) api.encounterConditionValueList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get encounter condition value
     *
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     */
    @isTest
    private static void encounterConditionValueRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASEncountersApi api;
        OASEncounterConditionValueDetail response;
        OASEncounterConditionValueDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEncountersApi(client);

        js = JSON.serialize(OASEncounterConditionValueDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEncounterConditionValueDetail.getExample();
        response = (OASEncounterConditionValueDetail) api.encounterConditionValueRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASEncountersApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASEncounterConditionValueDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEncounterConditionValueDetail.getExample();
        response = (OASEncounterConditionValueDetail) api.encounterConditionValueRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List encounter methods
     *
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     */
    @isTest
    private static void encounterMethodListTest() {
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
        OASEncountersApi api;
        OASPaginatedEncounterMethodSummaryLi response;
        OASPaginatedEncounterMethodSummaryLi expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEncountersApi(client);

        js = JSON.serialize(OASPaginatedEncounterMethodSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEncounterMethodSummaryLi.getExample();
        response = (OASPaginatedEncounterMethodSummaryLi) api.encounterMethodList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASEncountersApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedEncounterMethodSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedEncounterMethodSummaryLi.getExample();
        response = (OASPaginatedEncounterMethodSummaryLi) api.encounterMethodList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get encounter method
     *
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     */
    @isTest
    private static void encounterMethodRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASEncountersApi api;
        OASEncounterMethodDetail response;
        OASEncounterMethodDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASEncountersApi(client);

        js = JSON.serialize(OASEncounterMethodDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEncounterMethodDetail.getExample();
        response = (OASEncounterMethodDetail) api.encounterMethodRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASEncountersApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASEncounterMethodDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEncounterMethodDetail.getExample();
        response = (OASEncounterMethodDetail) api.encounterMethodRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}