#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/location_area_detail.h"
#include "../model/location_detail.h"
#include "../model/paginated_location_area_summary_list.h"
#include "../model/paginated_location_summary_list.h"
#include "../model/paginated_pal_park_area_summary_list.h"
#include "../model/paginated_region_summary_list.h"
#include "../model/pal_park_area_detail.h"
#include "../model/region_detail.h"


// List location areas
//
// Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
//
paginated_location_area_summary_list_t*
LocationAPI_locationAreaList(apiClient_t *apiClient, int *limit, int *offset);


// Get location area
//
// Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
//
location_area_detail_t*
LocationAPI_locationAreaRetrieve(apiClient_t *apiClient, int *id);


// List locations
//
// Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
//
paginated_location_summary_list_t*
LocationAPI_locationList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get location
//
// Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
//
location_detail_t*
LocationAPI_locationRetrieve(apiClient_t *apiClient, char *id);


// List pal park areas
//
// Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
//
paginated_pal_park_area_summary_list_t*
LocationAPI_palParkAreaList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get pal park area
//
// Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
//
pal_park_area_detail_t*
LocationAPI_palParkAreaRetrieve(apiClient_t *apiClient, char *id);


// List regions
//
// A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
//
paginated_region_summary_list_t*
LocationAPI_regionList(apiClient_t *apiClient, int *limit, int *offset, char *q);


// Get region
//
// A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
//
region_detail_t*
LocationAPI_regionRetrieve(apiClient_t *apiClient, char *id);


