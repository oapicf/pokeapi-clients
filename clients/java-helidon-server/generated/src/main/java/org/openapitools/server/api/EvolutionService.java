package org.openapitools.server.api;

import org.openapitools.server.model.EvolutionChainDetail;
import org.openapitools.server.model.EvolutionTriggerDetail;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.server.model.PaginatedEvolutionTriggerSummaryList;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Evolution'",
                             version = "7.24.0")
public interface EvolutionService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/evolution-chain/", this::evolutionChainList);
        rules.get("/evolution-chain/{id}/", this::evolutionChainRetrieve);
        rules.get("/evolution-trigger/", this::evolutionTriggerList);
        rules.get("/evolution-trigger/{id}/", this::evolutionTriggerRetrieve);
    }


    /**
     * GET /api/v2/evolution-chain/ : List evolution chains.
     *
     * @param request the server request
     * @param response the server response
     */
    void evolutionChainList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/evolution-chain/{id}/ : Get evolution chain.
     *
     * @param request the server request
     * @param response the server response
     */
    void evolutionChainRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/evolution-trigger/ : List evolution triggers.
     *
     * @param request the server request
     * @param response the server response
     */
    void evolutionTriggerList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/evolution-trigger/{id}/ : Get evolution trigger.
     *
     * @param request the server request
     * @param response the server response
     */
    void evolutionTriggerRetrieve(ServerRequest request, ServerResponse response);
}
