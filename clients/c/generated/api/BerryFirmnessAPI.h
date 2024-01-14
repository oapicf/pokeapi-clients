#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"


char*
BerryFirmnessAPI_berryFirmnessList(apiClient_t *apiClient, int *limit, int *offset);


char*
BerryFirmnessAPI_berryFirmnessRead(apiClient_t *apiClient, int *id);


