@isTest
private class OASRegionApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void regionListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASRegionApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASRegionApi(new OASClient());

        api.regionList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void regionReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASRegionApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASRegionApi(new OASClient());

        api.regionRead(params);
    }
}