package org.openapitools.server.api;

import org.openapitools.server.model.EncounterConditionDetail;
import org.openapitools.server.model.EncounterConditionValueDetail;
import org.openapitools.server.model.EncounterMethodDetail;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.server.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.server.model.PaginatedEncounterMethodSummaryList;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Encounters'",
                             version = "7.24.0")
public interface EncountersService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/encounter-condition/", this::encounterConditionList);
        rules.get("/encounter-condition/{id}/", this::encounterConditionRetrieve);
        rules.get("/encounter-condition-value/", this::encounterConditionValueList);
        rules.get("/encounter-condition-value/{id}/", this::encounterConditionValueRetrieve);
        rules.get("/encounter-method/", this::encounterMethodList);
        rules.get("/encounter-method/{id}/", this::encounterMethodRetrieve);
    }


    /**
     * GET /api/v2/encounter-condition/ : List encounter conditions.
     *
     * @param request the server request
     * @param response the server response
     */
    void encounterConditionList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/encounter-condition/{id}/ : Get encounter condition.
     *
     * @param request the server request
     * @param response the server response
     */
    void encounterConditionRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/encounter-condition-value/ : List encounter condition values.
     *
     * @param request the server request
     * @param response the server response
     */
    void encounterConditionValueList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/encounter-condition-value/{id}/ : Get encounter condition value.
     *
     * @param request the server request
     * @param response the server response
     */
    void encounterConditionValueRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/encounter-method/ : List encounter methods.
     *
     * @param request the server request
     * @param response the server response
     */
    void encounterMethodList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/encounter-method/{id}/ : Get encounter method.
     *
     * @param request the server request
     * @param response the server response
     */
    void encounterMethodRetrieve(ServerRequest request, ServerResponse response);
}
