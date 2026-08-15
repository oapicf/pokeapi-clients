#ifndef TINY_CPP_CLIENT_LocationApi_H_
#define TINY_CPP_CLIENT_LocationApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "LocationAreaDetail.h"
#include "LocationDetail.h"
#include "PaginatedLocationAreaSummaryList.h"
#include "PaginatedLocationSummaryList.h"
#include "PaginatedPalParkAreaSummaryList.h"
#include "PaginatedRegionSummaryList.h"
#include "PalParkAreaDetail.h"
#include "RegionDetail.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class LocationApi : public Service {
public:
    LocationApi() = default;

    virtual ~LocationApi() = default;

    /**
    * List location areas.
    *
    * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    */
    Response<
                PaginatedLocationAreaSummaryList
        >
    locationAreaList(
            
            int limit
            , 
            
            int offset
            
    );
    /**
    * Get location area.
    *
    * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
    * \param id A unique integer value identifying this location area. *Required*
    */
    Response<
                LocationAreaDetail
        >
    locationAreaRetrieve(
            
            int id
            
    );
    /**
    * List locations.
    *
    * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedLocationSummaryList
        >
    locationList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get location.
    *
    * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                LocationDetail
        >
    locationRetrieve(
            
            std::string id
            
    );
    /**
    * List pal park areas.
    *
    * Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedPalParkAreaSummaryList
        >
    palParkAreaList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get pal park area.
    *
    * Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                PalParkAreaDetail
        >
    palParkAreaRetrieve(
            
            std::string id
            
    );
    /**
    * List regions.
    *
    * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedRegionSummaryList
        >
    regionList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get region.
    *
    * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                RegionDetail
        >
    regionRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_LocationApi_H_ */