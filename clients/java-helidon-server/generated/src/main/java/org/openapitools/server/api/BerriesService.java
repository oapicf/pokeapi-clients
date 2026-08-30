package org.openapitools.server.api;

import org.openapitools.server.model.BerryDetail;
import org.openapitools.server.model.BerryFirmnessDetail;
import org.openapitools.server.model.BerryFlavorDetail;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedBerryFirmnessSummaryList;
import org.openapitools.server.model.PaginatedBerryFlavorSummaryList;
import org.openapitools.server.model.PaginatedBerrySummaryList;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Berries'",
                             version = "7.24.0")
public interface BerriesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/berry-firmness/", this::berryFirmnessList);
        rules.get("/berry-firmness/{id}/", this::berryFirmnessRetrieve);
        rules.get("/berry-flavor/", this::berryFlavorList);
        rules.get("/berry-flavor/{id}/", this::berryFlavorRetrieve);
        rules.get("/berry/", this::berryList);
        rules.get("/berry/{id}/", this::berryRetrieve);
    }


    /**
     * GET /api/v2/berry-firmness/ : List berry firmness.
     *
     * @param request the server request
     * @param response the server response
     */
    void berryFirmnessList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/berry-firmness/{id}/ : Get berry by firmness.
     *
     * @param request the server request
     * @param response the server response
     */
    void berryFirmnessRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/berry-flavor/ : List berry flavors.
     *
     * @param request the server request
     * @param response the server response
     */
    void berryFlavorList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/berry-flavor/{id}/ : Get berries by flavor.
     *
     * @param request the server request
     * @param response the server response
     */
    void berryFlavorRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/berry/ : List berries.
     *
     * @param request the server request
     * @param response the server response
     */
    void berryList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/berry/{id}/ : Get a berry.
     *
     * @param request the server request
     * @param response the server response
     */
    void berryRetrieve(ServerRequest request, ServerResponse response);
}
