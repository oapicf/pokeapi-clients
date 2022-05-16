@isTest
private class OASMoveApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASMoveApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveApi(new OASClient());

        api.moveList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASMoveApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveApi(new OASClient());

        api.moveRead(params);
    }
}