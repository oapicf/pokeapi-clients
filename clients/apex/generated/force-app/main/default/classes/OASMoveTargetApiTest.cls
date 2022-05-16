@isTest
private class OASMoveTargetApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveTargetListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASMoveTargetApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveTargetApi(new OASClient());

        api.moveTargetList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveTargetReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASMoveTargetApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveTargetApi(new OASClient());

        api.moveTargetRead(params);
    }
}