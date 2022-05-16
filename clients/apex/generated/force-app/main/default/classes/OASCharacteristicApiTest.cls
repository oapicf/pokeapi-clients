@isTest
private class OASCharacteristicApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void characteristicListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASCharacteristicApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASCharacteristicApi(new OASClient());

        api.characteristicList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void characteristicReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASCharacteristicApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASCharacteristicApi(new OASClient());

        api.characteristicRead(params);
    }
}