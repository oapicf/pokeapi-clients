#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/machine_detail.h"
#include "../model/paginated_machine_summary_list.h"


// List machines
//
// Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
//
paginated_machine_summary_list_t*
MachinesAPI_machineList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get machine
//
// Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
//
machine_detail_t*
MachinesAPI_machineRetrieve(apiClient_t *apiClient, char *id);


