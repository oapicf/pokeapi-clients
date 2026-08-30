package org.openapitools.server.api;

import java.util.HexFormat;
import org.openapitools.server.model.LocationAreaDetail;
import org.openapitools.server.model.LocationDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedLocationAreaSummaryList;
import org.openapitools.server.model.PaginatedLocationSummaryList;
import org.openapitools.server.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.server.model.PaginatedRegionSummaryList;
import org.openapitools.server.model.PalParkAreaDetail;
import org.openapitools.server.model.RegionDetail;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Location'",
                             version = "7.24.0")
public interface LocationService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/location-area/", this::locationAreaList);
        rules.get("/location-area/{id}/", this::locationAreaRetrieve);
        rules.get("/location/", this::locationList);
        rules.get("/location/{id}/", this::locationRetrieve);
        rules.get("/pal-park-area/", this::palParkAreaList);
        rules.get("/pal-park-area/{id}/", this::palParkAreaRetrieve);
        rules.get("/region/", this::regionList);
        rules.get("/region/{id}/", this::regionRetrieve);
    }


    /**
     * GET /api/v2/location-area/ : List location areas.
     *
     * @param request the server request
     * @param response the server response
     */
    void locationAreaList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/location-area/{id}/ : Get location area.
     *
     * @param request the server request
     * @param response the server response
     */
    void locationAreaRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/location/ : List locations.
     *
     * @param request the server request
     * @param response the server response
     */
    void locationList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/location/{id}/ : Get location.
     *
     * @param request the server request
     * @param response the server response
     */
    void locationRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pal-park-area/ : List pal park areas.
     *
     * @param request the server request
     * @param response the server response
     */
    void palParkAreaList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/pal-park-area/{id}/ : Get pal park area.
     *
     * @param request the server request
     * @param response the server response
     */
    void palParkAreaRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/region/ : List regions.
     *
     * @param request the server request
     * @param response the server response
     */
    void regionList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/region/{id}/ : Get region.
     *
     * @param request the server request
     * @param response the server response
     */
    void regionRetrieve(ServerRequest request, ServerResponse response);
}
