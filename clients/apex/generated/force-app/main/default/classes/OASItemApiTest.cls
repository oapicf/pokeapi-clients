@isTest
private class OASItemApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void itemListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASItemApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASItemApi(new OASClient());

        api.itemList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void itemReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASItemApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASItemApi(new OASClient());

        api.itemRead(params);
    }
}