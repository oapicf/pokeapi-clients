@isTest
private class OASMoveDamageClassApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveDamageClassListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASMoveDamageClassApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveDamageClassApi(new OASClient());

        api.moveDamageClassList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveDamageClassReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASMoveDamageClassApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveDamageClassApi(new OASClient());

        api.moveDamageClassRead(params);
    }
}