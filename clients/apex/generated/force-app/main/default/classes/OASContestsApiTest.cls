@isTest
private class OASContestsApiTest {
    /**
     * List contest effects
     *
     * Contest effects refer to the effects of moves when used in contests.
     */
    @isTest
    private static void contestEffectListTest() {
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
        OASContestsApi api;
        OASPaginatedContestEffectSummaryList response;
        OASPaginatedContestEffectSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASContestsApi(client);

        js = JSON.serialize(OASPaginatedContestEffectSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedContestEffectSummaryList.getExample();
        response = (OASPaginatedContestEffectSummaryList) api.contestEffectList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASContestsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedContestEffectSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedContestEffectSummaryList.getExample();
        response = (OASPaginatedContestEffectSummaryList) api.contestEffectList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get contest effect
     *
     * Contest effects refer to the effects of moves when used in contests.
     */
    @isTest
    private static void contestEffectRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASContestsApi api;
        OASContestEffectDetail response;
        OASContestEffectDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASContestsApi(client);

        js = JSON.serialize(OASContestEffectDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASContestEffectDetail.getExample();
        response = (OASContestEffectDetail) api.contestEffectRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASContestsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASContestEffectDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASContestEffectDetail.getExample();
        response = (OASContestEffectDetail) api.contestEffectRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List contest types
     *
     * Contest types are categories judges used to weigh a Pokémon\&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     */
    @isTest
    private static void contestTypeListTest() {
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
        OASContestsApi api;
        OASPaginatedContestTypeSummaryList response;
        OASPaginatedContestTypeSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASContestsApi(client);

        js = JSON.serialize(OASPaginatedContestTypeSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedContestTypeSummaryList.getExample();
        response = (OASPaginatedContestTypeSummaryList) api.contestTypeList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASContestsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedContestTypeSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedContestTypeSummaryList.getExample();
        response = (OASPaginatedContestTypeSummaryList) api.contestTypeList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get contest type
     *
     * Contest types are categories judges used to weigh a Pokémon\&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     */
    @isTest
    private static void contestTypeRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASContestsApi api;
        OASContestTypeDetail response;
        OASContestTypeDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASContestsApi(client);

        js = JSON.serialize(OASContestTypeDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASContestTypeDetail.getExample();
        response = (OASContestTypeDetail) api.contestTypeRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASContestsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASContestTypeDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASContestTypeDetail.getExample();
        response = (OASContestTypeDetail) api.contestTypeRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List super contest effects
     *
     * Super contest effects refer to the effects of moves when used in super contests.
     */
    @isTest
    private static void superContestEffectListTest() {
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
        OASContestsApi api;
        OASPaginatedSuperContestEffectSummar response;
        OASPaginatedSuperContestEffectSummar expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASContestsApi(client);

        js = JSON.serialize(OASPaginatedSuperContestEffectSummar.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedSuperContestEffectSummar.getExample();
        response = (OASPaginatedSuperContestEffectSummar) api.superContestEffectList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASContestsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedSuperContestEffectSummar.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedSuperContestEffectSummar.getExample();
        response = (OASPaginatedSuperContestEffectSummar) api.superContestEffectList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get super contest effect
     *
     * Super contest effects refer to the effects of moves when used in super contests.
     */
    @isTest
    private static void superContestEffectRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASContestsApi api;
        OASSuperContestEffectDetail response;
        OASSuperContestEffectDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASContestsApi(client);

        js = JSON.serialize(OASSuperContestEffectDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuperContestEffectDetail.getExample();
        response = (OASSuperContestEffectDetail) api.superContestEffectRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASContestsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASSuperContestEffectDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuperContestEffectDetail.getExample();
        response = (OASSuperContestEffectDetail) api.superContestEffectRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}