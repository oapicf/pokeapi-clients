@isTest
private class OASItemFlingEffectApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void itemFlingEffectListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASItemFlingEffectApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASItemFlingEffectApi(new OASClient());

        api.itemFlingEffectList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void itemFlingEffectReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASItemFlingEffectApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASItemFlingEffectApi(new OASClient());

        api.itemFlingEffectRead(params);
    }
}