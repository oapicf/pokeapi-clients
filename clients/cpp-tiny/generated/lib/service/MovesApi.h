#ifndef TINY_CPP_CLIENT_MovesApi_H_
#define TINY_CPP_CLIENT_MovesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "MoveBattleStyleDetail.h"
#include "MoveDetail.h"
#include "MoveLearnMethodDetail.h"
#include "MoveMetaAilmentDetail.h"
#include "MoveMetaCategoryDetail.h"
#include "MoveTargetDetail.h"
#include "PaginatedMoveBattleStyleSummaryList.h"
#include "PaginatedMoveLearnMethodSummaryList.h"
#include "PaginatedMoveMetaAilmentSummaryList.h"
#include "PaginatedMoveMetaCategorySummaryList.h"
#include "PaginatedMoveSummaryList.h"
#include "PaginatedMoveTargetSummaryList.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class MovesApi : public Service {
public:
    MovesApi() = default;

    virtual ~MovesApi();

    /**
    * List move meta ailments.
    *
    * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedMoveMetaAilmentSummaryList
        >
    moveAilmentList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get move meta ailment.
    *
    * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                MoveMetaAilmentDetail
        >
    moveAilmentRetrieve(
            
            std::string id
            
    );
    /**
    * List move battle styles.
    *
    * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedMoveBattleStyleSummaryList
        >
    moveBattleStyleList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get move battle style.
    *
    * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                MoveBattleStyleDetail
        >
    moveBattleStyleRetrieve(
            
            std::string id
            
    );
    /**
    * List move meta categories.
    *
    * Very general categories that loosely group move effects.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedMoveMetaCategorySummaryList
        >
    moveCategoryList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get move meta category.
    *
    * Very general categories that loosely group move effects.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                MoveMetaCategoryDetail
        >
    moveCategoryRetrieve(
            
            std::string id
            
    );
    /**
    * List move learn methods.
    *
    * Methods by which Pokémon can learn moves.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedMoveLearnMethodSummaryList
        >
    moveLearnMethodList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get move learn method.
    *
    * Methods by which Pokémon can learn moves.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                MoveLearnMethodDetail
        >
    moveLearnMethodRetrieve(
            
            std::string id
            
    );
    /**
    * List moves.
    *
    * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedMoveSummaryList
        >
    moveList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get move.
    *
    * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                MoveDetail
        >
    moveRetrieve(
            
            std::string id
            
    );
    /**
    * List move targets.
    *
    * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedMoveTargetSummaryList
        >
    moveTargetList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get move target.
    *
    * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                MoveTargetDetail
        >
    moveTargetRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_MovesApi_H_ */