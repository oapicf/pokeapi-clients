package org.openapitools.server.api;

import org.openapitools.server.model.EvolutionChainDetail;
import org.openapitools.server.model.EvolutionTriggerDetail;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.server.model.PaginatedEvolutionTriggerSummaryList;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class EvolutionServiceImpl implements EvolutionService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void evolutionChainList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void evolutionChainRetrieve(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void evolutionTriggerList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void evolutionTriggerRetrieve(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service EvolutionService is down. Goodbye!");
    }

}
