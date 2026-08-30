package org.openapitools.server.api;

import java.util.HexFormat;
import org.openapitools.server.model.MachineDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedMachineSummaryList;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Machines'",
                             version = "7.24.0")
public interface MachinesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/", this::machineList);
        rules.get("/{id}/", this::machineRetrieve);
    }


    /**
     * GET /api/v2/machine/ : List machines.
     *
     * @param request the server request
     * @param response the server response
     */
    void machineList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/machine/{id}/ : Get machine.
     *
     * @param request the server request
     * @param response the server response
     */
    void machineRetrieve(ServerRequest request, ServerResponse response);
}
