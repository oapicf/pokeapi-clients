#ifndef TINY_CPP_CLIENT_EncountersApi_H_
#define TINY_CPP_CLIENT_EncountersApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "EncounterConditionDetail.h"
#include "EncounterConditionValueDetail.h"
#include "EncounterMethodDetail.h"
#include "PaginatedEncounterConditionSummaryList.h"
#include "PaginatedEncounterConditionValueSummaryList.h"
#include "PaginatedEncounterMethodSummaryList.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class EncountersApi : public Service {
public:
    EncountersApi() = default;

    virtual ~EncountersApi() = default;

    /**
    * List encounter conditions.
    *
    * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedEncounterConditionSummaryList
        >
    encounterConditionList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get encounter condition.
    *
    * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                EncounterConditionDetail
        >
    encounterConditionRetrieve(
            
            std::string id
            
    );
    /**
    * List encounter condition values.
    *
    * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedEncounterConditionValueSummaryList
        >
    encounterConditionValueList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get encounter condition value.
    *
    * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                EncounterConditionValueDetail
        >
    encounterConditionValueRetrieve(
            
            std::string id
            
    );
    /**
    * List encounter methods.
    *
    * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedEncounterMethodSummaryList
        >
    encounterMethodList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get encounter method.
    *
    * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                EncounterMethodDetail
        >
    encounterMethodRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_EncountersApi_H_ */