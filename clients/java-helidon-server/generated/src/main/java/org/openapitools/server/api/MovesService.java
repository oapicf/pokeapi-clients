package org.openapitools.server.api;

import java.util.HexFormat;
import org.openapitools.server.model.MoveBattleStyleDetail;
import org.openapitools.server.model.MoveDetail;
import org.openapitools.server.model.MoveLearnMethodDetail;
import org.openapitools.server.model.MoveMetaAilmentDetail;
import org.openapitools.server.model.MoveMetaCategoryDetail;
import org.openapitools.server.model.MoveTargetDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedMoveBattleStyleSummaryList;
import org.openapitools.server.model.PaginatedMoveLearnMethodSummaryList;
import org.openapitools.server.model.PaginatedMoveMetaAilmentSummaryList;
import org.openapitools.server.model.PaginatedMoveMetaCategorySummaryList;
import org.openapitools.server.model.PaginatedMoveSummaryList;
import org.openapitools.server.model.PaginatedMoveTargetSummaryList;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Moves'",
                             version = "7.24.0")
public interface MovesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/move-ailment/", this::moveAilmentList);
        rules.get("/move-ailment/{id}/", this::moveAilmentRetrieve);
        rules.get("/move-battle-style/", this::moveBattleStyleList);
        rules.get("/move-battle-style/{id}/", this::moveBattleStyleRetrieve);
        rules.get("/move-category/", this::moveCategoryList);
        rules.get("/move-category/{id}/", this::moveCategoryRetrieve);
        rules.get("/move-learn-method/", this::moveLearnMethodList);
        rules.get("/move-learn-method/{id}/", this::moveLearnMethodRetrieve);
        rules.get("/move/", this::moveList);
        rules.get("/move/{id}/", this::moveRetrieve);
        rules.get("/move-target/", this::moveTargetList);
        rules.get("/move-target/{id}/", this::moveTargetRetrieve);
    }


    /**
     * GET /api/v2/move-ailment/ : List move meta ailments.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveAilmentList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-ailment/{id}/ : Get move meta ailment.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveAilmentRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-battle-style/ : List move battle styles.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveBattleStyleList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-battle-style/{id}/ : Get move battle style.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveBattleStyleRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-category/ : List move meta categories.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveCategoryList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-category/{id}/ : Get move meta category.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveCategoryRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-learn-method/ : List move learn methods.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveLearnMethodList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-learn-method/{id}/ : Get move learn method.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveLearnMethodRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move/ : List moves.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move/{id}/ : Get move.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-target/ : List move targets.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveTargetList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/move-target/{id}/ : Get move target.
     *
     * @param request the server request
     * @param response the server response
     */
    void moveTargetRetrieve(ServerRequest request, ServerResponse response);
}
