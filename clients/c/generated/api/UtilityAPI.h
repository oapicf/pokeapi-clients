#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/language_detail.h"
#include "../model/paginated_language_summary_list.h"


// List languages
//
// Languages for translations of API resource information.
//
paginated_language_summary_list_t*
UtilityAPI_languageList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get language
//
// Languages for translations of API resource information.
//
language_detail_t*
UtilityAPI_languageRetrieve(apiClient_t *apiClient, char *id);


