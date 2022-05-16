@isTest
private class OASEggGroupApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void eggGroupListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASEggGroupApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASEggGroupApi(new OASClient());

        api.eggGroupList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void eggGroupReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASEggGroupApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASEggGroupApi(new OASClient());

        api.eggGroupRead(params);
    }
}