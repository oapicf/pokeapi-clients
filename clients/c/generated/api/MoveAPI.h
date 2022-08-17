#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"


char*
MoveAPI_moveList(apiClient_t *apiClient, int limit , int offset );


char*
MoveAPI_moveRead(apiClient_t *apiClient, int id );


