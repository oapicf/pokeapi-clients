@isTest
private class OASPokemonFormApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokemonFormListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASPokemonFormApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokemonFormApi(new OASClient());

        api.pokemonFormList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokemonFormReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASPokemonFormApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokemonFormApi(new OASClient());

        api.pokemonFormRead(params);
    }
}