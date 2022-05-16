@isTest
private class OASPalParkAreaApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void palParkAreaListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASPalParkAreaApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPalParkAreaApi(new OASClient());

        api.palParkAreaList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void palParkAreaReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASPalParkAreaApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPalParkAreaApi(new OASClient());

        api.palParkAreaRead(params);
    }
}