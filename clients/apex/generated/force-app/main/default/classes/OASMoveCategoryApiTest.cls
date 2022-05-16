@isTest
private class OASMoveCategoryApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveCategoryListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASMoveCategoryApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveCategoryApi(new OASClient());

        api.moveCategoryList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void moveCategoryReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASMoveCategoryApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMoveCategoryApi(new OASClient());

        api.moveCategoryRead(params);
    }
}