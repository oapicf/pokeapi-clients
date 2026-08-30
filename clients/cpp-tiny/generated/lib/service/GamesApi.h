#ifndef TINY_CPP_CLIENT_GamesApi_H_
#define TINY_CPP_CLIENT_GamesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "GenerationDetail.h"
#include "PaginatedGenerationSummaryList.h"
#include "PaginatedPokedexSummaryList.h"
#include "PaginatedVersionGroupSummaryList.h"
#include "PaginatedVersionSummaryList.h"
#include "PokedexDetail.h"
#include "VersionDetail.h"
#include "VersionGroupDetail.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class GamesApi : public Service {
public:
    GamesApi() = default;

    virtual ~GamesApi();

    /**
    * List genrations.
    *
    * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedGenerationSummaryList
        >
    generationList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get genration.
    *
    * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                GenerationDetail
        >
    generationRetrieve(
            
            std::string id
            
    );
    /**
    * List pokedex.
    *
    * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedPokedexSummaryList
        >
    pokedexList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get pokedex.
    *
    * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                PokedexDetail
        >
    pokedexRetrieve(
            
            std::string id
            
    );
    /**
    * List version groups.
    *
    * Version groups categorize highly similar versions of the games.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedVersionGroupSummaryList
        >
    versionGroupList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get version group.
    *
    * Version groups categorize highly similar versions of the games.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                VersionGroupDetail
        >
    versionGroupRetrieve(
            
            std::string id
            
    );
    /**
    * List versions.
    *
    * Versions of the games, e.g., Red, Blue or Yellow.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedVersionSummaryList
        >
    versionList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get version.
    *
    * Versions of the games, e.g., Red, Blue or Yellow.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                VersionDetail
        >
    versionRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_GamesApi_H_ */