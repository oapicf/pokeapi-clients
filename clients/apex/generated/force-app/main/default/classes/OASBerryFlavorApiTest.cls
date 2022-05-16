@isTest
private class OASBerryFlavorApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void berryFlavorListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASBerryFlavorApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASBerryFlavorApi(new OASClient());

        api.berryFlavorList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void berryFlavorReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASBerryFlavorApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASBerryFlavorApi(new OASClient());

        api.berryFlavorRead(params);
    }
}