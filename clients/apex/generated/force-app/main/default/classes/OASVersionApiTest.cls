@isTest
private class OASVersionApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void versionListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASVersionApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASVersionApi(new OASClient());

        api.versionList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void versionReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASVersionApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASVersionApi(new OASClient());

        api.versionRead(params);
    }
}