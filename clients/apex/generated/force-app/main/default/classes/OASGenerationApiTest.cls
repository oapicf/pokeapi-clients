@isTest
private class OASGenerationApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void generationListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASGenerationApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASGenerationApi(new OASClient());

        api.generationList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void generationReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASGenerationApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASGenerationApi(new OASClient());

        api.generationRead(params);
    }
}