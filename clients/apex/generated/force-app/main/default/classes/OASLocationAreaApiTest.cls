@isTest
private class OASLocationAreaApiTest {
    /**
     * 
     *
     * 
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
        OASLocationAreaApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASLocationAreaApi(new OASClient());

        api.locationAreaList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void locationAreaReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASLocationAreaApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASLocationAreaApi(new OASClient());

        api.locationAreaRead(params);
    }
}