#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"


char*
BerryAPI_berryList(apiClient_t *apiClient, int limit , int offset );


char*
BerryAPI_berryRead(apiClient_t *apiClient, int id );


