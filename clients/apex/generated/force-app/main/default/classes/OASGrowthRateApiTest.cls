@isTest
private class OASGrowthRateApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void growthRateListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASGrowthRateApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASGrowthRateApi(new OASClient());

        api.growthRateList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void growthRateReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASGrowthRateApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASGrowthRateApi(new OASClient());

        api.growthRateRead(params);
    }
}