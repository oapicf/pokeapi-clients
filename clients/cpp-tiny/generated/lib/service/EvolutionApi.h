#ifndef TINY_CPP_CLIENT_EvolutionApi_H_
#define TINY_CPP_CLIENT_EvolutionApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "EvolutionChainDetail.h"
#include "EvolutionTriggerDetail.h"
#include "PaginatedEvolutionChainSummaryList.h"
#include "PaginatedEvolutionTriggerSummaryList.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class EvolutionApi : public Service {
public:
    EvolutionApi() = default;

    virtual ~EvolutionApi();

    /**
    * List evolution chains.
    *
    * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedEvolutionChainSummaryList
        >
    evolutionChainList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get evolution chain.
    *
    * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                EvolutionChainDetail
        >
    evolutionChainRetrieve(
            
            std::string id
            
    );
    /**
    * List evolution triggers.
    *
    * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedEvolutionTriggerSummaryList
        >
    evolutionTriggerList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get evolution trigger.
    *
    * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                EvolutionTriggerDetail
        >
    evolutionTriggerRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_EvolutionApi_H_ */