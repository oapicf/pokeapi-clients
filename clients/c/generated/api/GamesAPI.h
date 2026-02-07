#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/generation_detail.h"
#include "../model/paginated_generation_summary_list.h"
#include "../model/paginated_pokedex_summary_list.h"
#include "../model/paginated_version_group_summary_list.h"
#include "../model/paginated_version_summary_list.h"
#include "../model/pokedex_detail.h"
#include "../model/version_detail.h"
#include "../model/version_group_detail.h"


// List genrations
//
// A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
//
paginated_generation_summary_list_t*
GamesAPI_generationList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get genration
//
// A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
//
generation_detail_t*
GamesAPI_generationRetrieve(apiClient_t *apiClient, char *id);


// List pokedex
//
// A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
//
paginated_pokedex_summary_list_t*
GamesAPI_pokedexList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get pokedex
//
// A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
//
pokedex_detail_t*
GamesAPI_pokedexRetrieve(apiClient_t *apiClient, char *id);


// List version groups
//
// Version groups categorize highly similar versions of the games.
//
paginated_version_group_summary_list_t*
GamesAPI_versionGroupList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get version group
//
// Version groups categorize highly similar versions of the games.
//
version_group_detail_t*
GamesAPI_versionGroupRetrieve(apiClient_t *apiClient, char *id);


// List versions
//
// Versions of the games, e.g., Red, Blue or Yellow.
//
paginated_version_summary_list_t*
GamesAPI_versionList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get version
//
// Versions of the games, e.g., Red, Blue or Yellow.
//
version_detail_t*
GamesAPI_versionRetrieve(apiClient_t *apiClient, char *id);


