#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/contest_effect_detail.h"
#include "../model/contest_type_detail.h"
#include "../model/paginated_contest_effect_summary_list.h"
#include "../model/paginated_contest_type_summary_list.h"
#include "../model/paginated_super_contest_effect_summary_list.h"
#include "../model/super_contest_effect_detail.h"


// List contest effects
//
// Contest effects refer to the effects of moves when used in contests.
//
paginated_contest_effect_summary_list_t*
ContestsAPI_contestEffectList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get contest effect
//
// Contest effects refer to the effects of moves when used in contests.
//
contest_effect_detail_t*
ContestsAPI_contestEffectRetrieve(apiClient_t *apiClient, char *id);


// List contest types
//
// Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
//
paginated_contest_type_summary_list_t*
ContestsAPI_contestTypeList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get contest type
//
// Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
//
contest_type_detail_t*
ContestsAPI_contestTypeRetrieve(apiClient_t *apiClient, char *id);


// List super contest effects
//
// Super contest effects refer to the effects of moves when used in super contests.
//
paginated_super_contest_effect_summary_list_t*
ContestsAPI_superContestEffectList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get super contest effect
//
// Super contest effects refer to the effects of moves when used in super contests.
//
super_contest_effect_detail_t*
ContestsAPI_superContestEffectRetrieve(apiClient_t *apiClient, char *id);


