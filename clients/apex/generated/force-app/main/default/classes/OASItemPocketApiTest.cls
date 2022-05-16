@isTest
private class OASItemPocketApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void itemPocketListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASItemPocketApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASItemPocketApi(new OASClient());

        api.itemPocketList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void itemPocketReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASItemPocketApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASItemPocketApi(new OASClient());

        api.itemPocketRead(params);
    }
}