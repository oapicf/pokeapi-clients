package org.openapitools.server.api;

import java.util.HexFormat;
import org.openapitools.server.model.LanguageDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedLanguageSummaryList;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Utility'",
                             version = "7.24.0")
public interface UtilityService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/", this::languageList);
        rules.get("/{id}/", this::languageRetrieve);
    }


    /**
     * GET /api/v2/language/ : List languages.
     *
     * @param request the server request
     * @param response the server response
     */
    void languageList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/language/{id}/ : Get language.
     *
     * @param request the server request
     * @param response the server response
     */
    void languageRetrieve(ServerRequest request, ServerResponse response);
}
