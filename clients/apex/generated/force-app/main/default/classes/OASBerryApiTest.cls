@isTest
private class OASBerryApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void berryListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASBerryApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASBerryApi(new OASClient());

        api.berryList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void berryReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASBerryApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASBerryApi(new OASClient());

        api.berryRead(params);
    }
}