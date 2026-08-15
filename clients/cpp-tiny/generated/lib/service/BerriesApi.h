#ifndef TINY_CPP_CLIENT_BerriesApi_H_
#define TINY_CPP_CLIENT_BerriesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "BerryDetail.h"
#include "BerryFirmnessDetail.h"
#include "BerryFlavorDetail.h"
#include "PaginatedBerryFirmnessSummaryList.h"
#include "PaginatedBerryFlavorSummaryList.h"
#include "PaginatedBerrySummaryList.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BerriesApi : public Service {
public:
    BerriesApi() = default;

    virtual ~BerriesApi() = default;

    /**
    * List berry firmness.
    *
    * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedBerryFirmnessSummaryList
        >
    berryFirmnessList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get berry by firmness.
    *
    * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                BerryFirmnessDetail
        >
    berryFirmnessRetrieve(
            
            std::string id
            
    );
    /**
    * List berry flavors.
    *
    * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedBerryFlavorSummaryList
        >
    berryFlavorList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get berries by flavor.
    *
    * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                BerryFlavorDetail
        >
    berryFlavorRetrieve(
            
            std::string id
            
    );
    /**
    * List berries.
    *
    * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedBerrySummaryList
        >
    berryList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get a berry.
    *
    * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                BerryDetail
        >
    berryRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BerriesApi_H_ */