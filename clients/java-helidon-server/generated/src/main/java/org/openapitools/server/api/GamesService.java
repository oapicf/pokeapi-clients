package org.openapitools.server.api;

import org.openapitools.server.model.GenerationDetail;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedGenerationSummaryList;
import org.openapitools.server.model.PaginatedPokedexSummaryList;
import org.openapitools.server.model.PaginatedVersionGroupSummaryList;
import org.openapitools.server.model.PaginatedVersionSummaryList;
import org.openapitools.server.model.PokedexDetail;
import io.helidon.http.Status;
import org.openapitools.server.model.VersionDetail;
import org.openapitools.server.model.VersionGroupDetail;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Games'",
                             version = "7.24.0")
public interface GamesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/generation/", this::generationList);
        rules.get("/generation/{id}/", this::generationRetrieve);
        rules.get("/pokedex/", this::pokedexList);
        rules.get("/pokedex/{id}/", this::pokedexRetrieve);
        rules.get("/version-group/", this::versionGroupList);
        rules.get("/version-group/{id}/", this::versionGroupRetrieve);
        rules.get("/version/", this::versionList);
        rules.get("/version/{id}/", this::versionRetrieve);
    }


    /**
     * GET /api/v2/generation/ : List genrations.
     *
     * @param request the server request
     * @param response the server response
     */
    void generationList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/generation/{id}/ : Get genration.
     *
     * @param request the server request
     * @param response the server response
     */
    void generationRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokedex/ : List pokedex.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokedexList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pokedex/{id}/ : Get pokedex.
     *
     * @param request the server request
     * @param response the server response
     */
    void pokedexRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/version-group/ : List version groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void versionGroupList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/version-group/{id}/ : Get version group.
     *
     * @param request the server request
     * @param response the server response
     */
    void versionGroupRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/version/ : List versions.
     *
     * @param request the server request
     * @param response the server response
     */
    void versionList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/version/{id}/ : Get version.
     *
     * @param request the server request
     * @param response the server response
     */
    void versionRetrieve(ServerRequest request, ServerResponse response);
}
