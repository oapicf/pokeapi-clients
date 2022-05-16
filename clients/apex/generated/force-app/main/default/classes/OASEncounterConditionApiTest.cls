@isTest
private class OASEncounterConditionApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void encounterConditionListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASEncounterConditionApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASEncounterConditionApi(new OASClient());

        api.encounterConditionList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void encounterConditionReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASEncounterConditionApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASEncounterConditionApi(new OASClient());

        api.encounterConditionRead(params);
    }
}