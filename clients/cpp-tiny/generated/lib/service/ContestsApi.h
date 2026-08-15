#ifndef TINY_CPP_CLIENT_ContestsApi_H_
#define TINY_CPP_CLIENT_ContestsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ContestEffectDetail.h"
#include "ContestTypeDetail.h"
#include "PaginatedContestEffectSummaryList.h"
#include "PaginatedContestTypeSummaryList.h"
#include "PaginatedSuperContestEffectSummaryList.h"
#include "SuperContestEffectDetail.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ContestsApi : public Service {
public:
    ContestsApi() = default;

    virtual ~ContestsApi() = default;

    /**
    * List contest effects.
    *
    * Contest effects refer to the effects of moves when used in contests.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedContestEffectSummaryList
        >
    contestEffectList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get contest effect.
    *
    * Contest effects refer to the effects of moves when used in contests.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                ContestEffectDetail
        >
    contestEffectRetrieve(
            
            std::string id
            
    );
    /**
    * List contest types.
    *
    * Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedContestTypeSummaryList
        >
    contestTypeList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get contest type.
    *
    * Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                ContestTypeDetail
        >
    contestTypeRetrieve(
            
            std::string id
            
    );
    /**
    * List super contest effects.
    *
    * Super contest effects refer to the effects of moves when used in super contests.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedSuperContestEffectSummaryList
        >
    superContestEffectList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get super contest effect.
    *
    * Super contest effects refer to the effects of moves when used in super contests.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                SuperContestEffectDetail
        >
    superContestEffectRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ContestsApi_H_ */