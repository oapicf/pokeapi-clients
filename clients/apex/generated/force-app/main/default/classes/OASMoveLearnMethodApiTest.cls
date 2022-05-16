@isTest
private class OASMoveLearnMethodApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveLearnMethodListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASMoveLearnMethodApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveLearnMethodApi(new OASClient());

        api.moveLearnMethodList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveLearnMethodReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASMoveLearnMethodApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveLearnMethodApi(new OASClient());

        api.moveLearnMethodRead(params);
    }
}