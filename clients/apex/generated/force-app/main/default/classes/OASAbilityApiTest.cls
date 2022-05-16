@isTest
private class OASAbilityApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void abilityListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASAbilityApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASAbilityApi(new OASClient());

        api.abilityList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void abilityReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASAbilityApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASAbilityApi(new OASClient());

        api.abilityRead(params);
    }
}