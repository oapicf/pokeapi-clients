@isTest
private class OASPokemonApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokemonListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASPokemonApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokemonApi(new OASClient());

        api.pokemonList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokemonReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASPokemonApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokemonApi(new OASClient());

        api.pokemonRead(params);
    }
}