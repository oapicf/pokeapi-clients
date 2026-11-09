#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/language_detail.h"
#include "../model/paginated_language_summary_list.h"
#include "../model/pokeapi_meta_response.h"


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


// Get API metadata
//
// Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).
//
pokeapi_meta_response_t*
UtilityAPI_metaRetrieve(apiClient_t *apiClient);


