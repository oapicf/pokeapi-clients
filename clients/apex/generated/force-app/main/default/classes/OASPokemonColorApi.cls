/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

public class OASPokemonColorApi {
    OASClient client;

    public OASPokemonColorApi(OASClient client) {
        this.client = client;
    }

    public OASPokemonColorApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * 
     * 
     * @param r_limit  (optional)
     * @param offset  (optional)
     * @return String
     * @throws OAS.ApiException if fails to make API call
     */
    public String pokemonColorList(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('limit', (Integer) params.get('r_limit')));
        query.addAll(client.makeParam('offset', (Integer) params.get('offset')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (String) client.invoke(
            'GET', '/api/v2/pokemon-color/', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'text/plain' },
            new List<String>(),
            new List<String>(),
            String.class
        );
    }
    /**
     * 
     * 
     * @param id  (required)
     * @return String
     * @throws OAS.ApiException if fails to make API call
     */
    public String pokemonColorRead(Map<String, Object> params) {
        client.assertNotNull(params.get('id'), 'id');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (String) client.invoke(
            'GET', '/api/v2/pokemon-color/{id}/', '',
            query, form,
            new Map<String, Object>{
                'id' => (Integer) params.get('id')
            },
            new Map<String, Object>(),
            new List<String>{ 'text/plain' },
            new List<String>(),
            new List<String>(),
            String.class
        );
    }
}
