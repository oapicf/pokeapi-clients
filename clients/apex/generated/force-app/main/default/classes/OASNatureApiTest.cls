@isTest
private class OASNatureApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void natureListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASNatureApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASNatureApi(new OASClient());

        api.natureList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void natureReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASNatureApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASNatureApi(new OASClient());

        api.natureRead(params);
    }
}