@isTest
private class OASEncounterMethodApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void encounterMethodListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASEncounterMethodApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASEncounterMethodApi(new OASClient());

        api.encounterMethodList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void encounterMethodReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASEncounterMethodApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASEncounterMethodApi(new OASClient());

        api.encounterMethodRead(params);
    }
}