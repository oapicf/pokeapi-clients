@isTest
private class OASTypeApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void typeListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASTypeApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASTypeApi(new OASClient());

        api.typeList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void typeReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASTypeApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASTypeApi(new OASClient());

        api.typeRead(params);
    }
}