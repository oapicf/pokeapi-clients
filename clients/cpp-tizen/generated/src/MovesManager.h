#ifndef _MovesManager_H_
#define _MovesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Moves Moves
 * \ingroup Operations
 *  @{
 */
class MovesManager {
public:
	MovesManager();
	virtual ~MovesManager();

/*! \brief List move meta ailments. *Synchronous*
 *
 * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveAilmentListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveMetaAilmentSummaryList, Error, void* )
	, void* userData);

/*! \brief List move meta ailments. *Asynchronous*
 *
 * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveAilmentListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveMetaAilmentSummaryList, Error, void* )
	, void* userData);


/*! \brief Get move meta ailment. *Synchronous*
 *
 * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveAilmentRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(MoveMetaAilmentDetail, Error, void* )
	, void* userData);

/*! \brief Get move meta ailment. *Asynchronous*
 *
 * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveAilmentRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(MoveMetaAilmentDetail, Error, void* )
	, void* userData);


/*! \brief List move battle styles. *Synchronous*
 *
 * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveBattleStyleListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveBattleStyleSummaryList, Error, void* )
	, void* userData);

/*! \brief List move battle styles. *Asynchronous*
 *
 * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveBattleStyleListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveBattleStyleSummaryList, Error, void* )
	, void* userData);


/*! \brief Get move battle style. *Synchronous*
 *
 * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveBattleStyleRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(MoveBattleStyleDetail, Error, void* )
	, void* userData);

/*! \brief Get move battle style. *Asynchronous*
 *
 * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveBattleStyleRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(MoveBattleStyleDetail, Error, void* )
	, void* userData);


/*! \brief List move meta categories. *Synchronous*
 *
 * Very general categories that loosely group move effects.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveCategoryListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveMetaCategorySummaryList, Error, void* )
	, void* userData);

/*! \brief List move meta categories. *Asynchronous*
 *
 * Very general categories that loosely group move effects.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveCategoryListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveMetaCategorySummaryList, Error, void* )
	, void* userData);


/*! \brief Get move meta category. *Synchronous*
 *
 * Very general categories that loosely group move effects.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveCategoryRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(MoveMetaCategoryDetail, Error, void* )
	, void* userData);

/*! \brief Get move meta category. *Asynchronous*
 *
 * Very general categories that loosely group move effects.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveCategoryRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(MoveMetaCategoryDetail, Error, void* )
	, void* userData);


/*! \brief List move learn methods. *Synchronous*
 *
 * Methods by which Pokémon can learn moves.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveLearnMethodListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveLearnMethodSummaryList, Error, void* )
	, void* userData);

/*! \brief List move learn methods. *Asynchronous*
 *
 * Methods by which Pokémon can learn moves.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveLearnMethodListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveLearnMethodSummaryList, Error, void* )
	, void* userData);


/*! \brief Get move learn method. *Synchronous*
 *
 * Methods by which Pokémon can learn moves.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveLearnMethodRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(MoveLearnMethodDetail, Error, void* )
	, void* userData);

/*! \brief Get move learn method. *Asynchronous*
 *
 * Methods by which Pokémon can learn moves.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveLearnMethodRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(MoveLearnMethodDetail, Error, void* )
	, void* userData);


/*! \brief List moves. *Synchronous*
 *
 * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveSummaryList, Error, void* )
	, void* userData);

/*! \brief List moves. *Asynchronous*
 *
 * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveSummaryList, Error, void* )
	, void* userData);


/*! \brief Get move. *Synchronous*
 *
 * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(MoveDetail, Error, void* )
	, void* userData);

/*! \brief Get move. *Asynchronous*
 *
 * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(MoveDetail, Error, void* )
	, void* userData);


/*! \brief List move targets. *Synchronous*
 *
 * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveTargetListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveTargetSummaryList, Error, void* )
	, void* userData);

/*! \brief List move targets. *Asynchronous*
 *
 * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveTargetListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveTargetSummaryList, Error, void* )
	, void* userData);


/*! \brief Get move target. *Synchronous*
 *
 * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveTargetRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(MoveTargetDetail, Error, void* )
	, void* userData);

/*! \brief Get move target. *Asynchronous*
 *
 * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool moveTargetRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(MoveTargetDetail, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* MovesManager_H_ */
