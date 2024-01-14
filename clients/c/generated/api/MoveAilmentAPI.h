#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"


char*
MoveAilmentAPI_moveAilmentList(apiClient_t *apiClient, int *limit, int *offset);


char*
MoveAilmentAPI_moveAilmentRead(apiClient_t *apiClient, int *id);


