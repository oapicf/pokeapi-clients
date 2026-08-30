package org.openapitools.server.api;

import java.util.HexFormat;
import org.openapitools.server.model.MachineDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedMachineSummaryList;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class MachinesServiceImpl implements MachinesService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void machineList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void machineRetrieve(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service MachinesService is down. Goodbye!");
    }

}
