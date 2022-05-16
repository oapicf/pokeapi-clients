@isTest
private class OASPokeathlonStatApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokeathlonStatListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASPokeathlonStatApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokeathlonStatApi(new OASClient());

        api.pokeathlonStatList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokeathlonStatReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASPokeathlonStatApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokeathlonStatApi(new OASClient());

        api.pokeathlonStatRead(params);
    }
}