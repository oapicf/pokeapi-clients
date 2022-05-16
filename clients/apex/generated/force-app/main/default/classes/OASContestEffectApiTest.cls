@isTest
private class OASContestEffectApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void contestEffectListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASContestEffectApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASContestEffectApi(new OASClient());

        api.contestEffectList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void contestEffectReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASContestEffectApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASContestEffectApi(new OASClient());

        api.contestEffectRead(params);
    }
}