package org.openapitools.api;

import org.openapitools.model.MachineDetail;
import org.openapitools.model.PaginatedMachineSummaryList;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for MachinesApi
 */
@MicronautTest
public class MachinesApiTest {

    @Inject
    MachinesApi api;

    
    /**
     * List machines
     *
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     */
    @Test
    @Disabled("Not Implemented")
    public void machineListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedMachineSummaryList body = api.machineList(limit, offset, q).block();

        // then
        // TODO implement the machineListTest()
    }

    
    /**
     * Get machine
     *
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     */
    @Test
    @Disabled("Not Implemented")
    public void machineRetrieveTest() {
        // given
        String id = "example";

        // when
        MachineDetail body = api.machineRetrieve(id).block();

        // then
        // TODO implement the machineRetrieveTest()
    }

    
}
