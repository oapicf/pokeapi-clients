#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/berry_detail.h"
#include "../model/berry_firmness_detail.h"
#include "../model/berry_flavor_detail.h"
#include "../model/paginated_berry_firmness_summary_list.h"
#include "../model/paginated_berry_flavor_summary_list.h"
#include "../model/paginated_berry_summary_list.h"


// List berry firmness
//
// Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
//
paginated_berry_firmness_summary_list_t*
BerriesAPI_berryFirmnessList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get berry by firmness
//
// Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
//
berry_firmness_detail_t*
BerriesAPI_berryFirmnessRetrieve(apiClient_t *apiClient, char *id);


// List berry flavors
//
// Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
//
paginated_berry_flavor_summary_list_t*
BerriesAPI_berryFlavorList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get berries by flavor
//
// Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
//
berry_flavor_detail_t*
BerriesAPI_berryFlavorRetrieve(apiClient_t *apiClient, char *id);


// List berries
//
// Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
//
paginated_berry_summary_list_t*
BerriesAPI_berryList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get a berry
//
// Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
//
berry_detail_t*
BerriesAPI_berryRetrieve(apiClient_t *apiClient, char *id);


