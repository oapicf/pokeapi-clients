@isTest
private class OASStatApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void statListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASStatApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASStatApi(new OASClient());

        api.statList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void statReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASStatApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASStatApi(new OASClient());

        api.statRead(params);
    }
}