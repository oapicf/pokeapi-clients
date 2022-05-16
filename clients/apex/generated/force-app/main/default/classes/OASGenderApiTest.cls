@isTest
private class OASGenderApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void genderListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASGenderApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASGenderApi(new OASClient());

        api.genderList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void genderReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASGenderApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASGenderApi(new OASClient());

        api.genderRead(params);
    }
}