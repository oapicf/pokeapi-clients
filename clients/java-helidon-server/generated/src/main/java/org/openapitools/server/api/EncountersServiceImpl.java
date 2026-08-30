package org.openapitools.server.api;

import org.openapitools.server.model.EncounterConditionDetail;
import org.openapitools.server.model.EncounterConditionValueDetail;
import org.openapitools.server.model.EncounterMethodDetail;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.server.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.server.model.PaginatedEncounterMethodSummaryList;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class EncountersServiceImpl implements EncountersService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void encounterConditionList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void encounterConditionRetrieve(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void encounterConditionValueList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void encounterConditionValueRetrieve(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void encounterMethodList(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void encounterMethodRetrieve(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service EncountersService is down. Goodbye!");
    }

}
