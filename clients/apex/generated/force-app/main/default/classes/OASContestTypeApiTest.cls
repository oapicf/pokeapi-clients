@isTest
private class OASContestTypeApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void contestTypeListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASContestTypeApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASContestTypeApi(new OASClient());

        api.contestTypeList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void contestTypeReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASContestTypeApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASContestTypeApi(new OASClient());

        api.contestTypeRead(params);
    }
}