@isTest
private class OASEncounterConditionValueApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void encounterConditionValueListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASEncounterConditionValueApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASEncounterConditionValueApi(new OASClient());

        api.encounterConditionValueList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void encounterConditionValueReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASEncounterConditionValueApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASEncounterConditionValueApi(new OASClient());

        api.encounterConditionValueRead(params);
    }
}