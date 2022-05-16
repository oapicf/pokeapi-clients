@isTest
private class OASEvolutionChainApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void evolutionChainListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASEvolutionChainApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASEvolutionChainApi(new OASClient());

        api.evolutionChainList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void evolutionChainReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASEvolutionChainApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASEvolutionChainApi(new OASClient());

        api.evolutionChainRead(params);
    }
}