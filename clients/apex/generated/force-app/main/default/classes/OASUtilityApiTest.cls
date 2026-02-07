@isTest
private class OASUtilityApiTest {
    /**
     * List languages
     *
     * Languages for translations of API resource information.
     */
    @isTest
    private static void languageListTest() {
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
        OASUtilityApi api;
        OASPaginatedLanguageSummaryList response;
        OASPaginatedLanguageSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUtilityApi(client);

        js = JSON.serialize(OASPaginatedLanguageSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedLanguageSummaryList.getExample();
        response = (OASPaginatedLanguageSummaryList) api.languageList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUtilityApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedLanguageSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedLanguageSummaryList.getExample();
        response = (OASPaginatedLanguageSummaryList) api.languageList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get language
     *
     * Languages for translations of API resource information.
     */
    @isTest
    private static void languageRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASUtilityApi api;
        OASLanguageDetail response;
        OASLanguageDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASUtilityApi(client);

        js = JSON.serialize(OASLanguageDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLanguageDetail.getExample();
        response = (OASLanguageDetail) api.languageRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASUtilityApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASLanguageDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASLanguageDetail.getExample();
        response = (OASLanguageDetail) api.languageRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}