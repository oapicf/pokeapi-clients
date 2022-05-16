@isTest
private class OASItemAttributeApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void itemAttributeListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASItemAttributeApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASItemAttributeApi(new OASClient());

        api.itemAttributeList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void itemAttributeReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASItemAttributeApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASItemAttributeApi(new OASClient());

        api.itemAttributeRead(params);
    }
}