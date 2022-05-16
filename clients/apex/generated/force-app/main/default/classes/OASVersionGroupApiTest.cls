@isTest
private class OASVersionGroupApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void versionGroupListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASVersionGroupApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASVersionGroupApi(new OASClient());

        api.versionGroupList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void versionGroupReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASVersionGroupApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASVersionGroupApi(new OASClient());

        api.versionGroupRead(params);
    }
}