@isTest
private class OASLanguageApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void languageListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASLanguageApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASLanguageApi(new OASClient());

        api.languageList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void languageReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASLanguageApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASLanguageApi(new OASClient());

        api.languageRead(params);
    }
}