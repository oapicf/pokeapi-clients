public class OASClient extends OAS.ApiClient {
    public OASClient() {
        basePath = 'https://pokeapi.co';
        calloutName = 'PokAPI';
        authentications.put('cookieAuth', new OAS.ApiKeyHeaderAuth('sessionid'));
    }
}
