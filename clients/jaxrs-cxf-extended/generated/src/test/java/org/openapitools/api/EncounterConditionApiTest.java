/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API tests for EncounterConditionApi.
 */
public class EncounterConditionApiTest {

    private EncounterConditionApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://pokeapi.co/api/v2", EncounterConditionApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * @throws ApiException if the API call fails
     */
    @Test
    public void encounterConditionListTest() throws Exception {
        // TODO: assign appropriate parameter values
        Integer limit = null;
        Integer offset = null;

        // TODO: delete this line and uncomment the next
        // String response = api.encounterConditionList(limit, offset);
        // TODO: complete test assertions
    }
    
    /**
     * @throws ApiException if the API call fails
     */
    @Test
    public void encounterConditionReadTest() throws Exception {
        // TODO: assign appropriate parameter values
        Integer id = null;

        // TODO: delete this line and uncomment the next
        // String response = api.encounterConditionRead(id);
        // TODO: complete test assertions
    }
    
}
