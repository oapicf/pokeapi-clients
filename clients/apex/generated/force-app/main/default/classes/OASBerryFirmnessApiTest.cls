@isTest
private class OASBerryFirmnessApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void berryFirmnessListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASBerryFirmnessApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASBerryFirmnessApi(new OASClient());

        api.berryFirmnessList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void berryFirmnessReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASBerryFirmnessApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASBerryFirmnessApi(new OASClient());

        api.berryFirmnessRead(params);
    }
}