package org.openapitools.server.api;

import org.openapitools.server.model.ContestEffectDetail;
import org.openapitools.server.model.ContestTypeDetail;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedContestEffectSummaryList;
import org.openapitools.server.model.PaginatedContestTypeSummaryList;
import org.openapitools.server.model.PaginatedSuperContestEffectSummaryList;
import io.helidon.http.Status;
import org.openapitools.server.model.SuperContestEffectDetail;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Contests'",
                             version = "7.24.0")
public interface ContestsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/contest-effect/", this::contestEffectList);
        rules.get("/contest-effect/{id}/", this::contestEffectRetrieve);
        rules.get("/contest-type/", this::contestTypeList);
        rules.get("/contest-type/{id}/", this::contestTypeRetrieve);
        rules.get("/super-contest-effect/", this::superContestEffectList);
        rules.get("/super-contest-effect/{id}/", this::superContestEffectRetrieve);
    }


    /**
     * GET /api/v2/contest-effect/ : List contest effects.
     *
     * @param request the server request
     * @param response the server response
     */
    void contestEffectList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/contest-effect/{id}/ : Get contest effect.
     *
     * @param request the server request
     * @param response the server response
     */
    void contestEffectRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/contest-type/ : List contest types.
     *
     * @param request the server request
     * @param response the server response
     */
    void contestTypeList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/contest-type/{id}/ : Get contest type.
     *
     * @param request the server request
     * @param response the server response
     */
    void contestTypeRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/super-contest-effect/ : List super contest effects.
     *
     * @param request the server request
     * @param response the server response
     */
    void superContestEffectList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/super-contest-effect/{id}/ : Get super contest effect.
     *
     * @param request the server request
     * @param response the server response
     */
    void superContestEffectRetrieve(ServerRequest request, ServerResponse response);
}
