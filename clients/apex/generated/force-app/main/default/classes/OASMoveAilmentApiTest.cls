@isTest
private class OASMoveAilmentApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveAilmentListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASMoveAilmentApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveAilmentApi(new OASClient());

        api.moveAilmentList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveAilmentReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASMoveAilmentApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveAilmentApi(new OASClient());

        api.moveAilmentRead(params);
    }
}