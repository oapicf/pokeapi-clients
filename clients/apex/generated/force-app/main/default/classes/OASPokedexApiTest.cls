@isTest
private class OASPokedexApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokedexListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASPokedexApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokedexApi(new OASClient());

        api.pokedexList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokedexReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASPokedexApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokedexApi(new OASClient());

        api.pokedexRead(params);
    }
}