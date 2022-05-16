@isTest
private class OASLocationApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void locationListTest() {
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
        String response;
        String expectedResponse;
        String js = '';

        api = new OASLocationApi(new OASClient());

        api.locationList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void locationReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASLocationApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASLocationApi(new OASClient());

        api.locationRead(params);
    }
}