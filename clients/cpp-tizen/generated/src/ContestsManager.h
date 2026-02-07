#ifndef _ContestsManager_H_
#define _ContestsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "ContestEffectDetail.h"
#include "ContestTypeDetail.h"
#include "PaginatedContestEffectSummaryList.h"
#include "PaginatedContestTypeSummaryList.h"
#include "PaginatedSuperContestEffectSummaryList.h"
#include "SuperContestEffectDetail.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Contests Contests
 * \ingroup Operations
 *  @{
 */
class ContestsManager {
public:
	ContestsManager();
	virtual ~ContestsManager();

/*! \brief List contest effects. *Synchronous*
 *
 * Contest effects refer to the effects of moves when used in contests.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contestEffectListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedContestEffectSummaryList, Error, void* )
	, void* userData);

/*! \brief List contest effects. *Asynchronous*
 *
 * Contest effects refer to the effects of moves when used in contests.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contestEffectListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedContestEffectSummaryList, Error, void* )
	, void* userData);


/*! \brief Get contest effect. *Synchronous*
 *
 * Contest effects refer to the effects of moves when used in contests.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contestEffectRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(ContestEffectDetail, Error, void* )
	, void* userData);

/*! \brief Get contest effect. *Asynchronous*
 *
 * Contest effects refer to the effects of moves when used in contests.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contestEffectRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(ContestEffectDetail, Error, void* )
	, void* userData);


/*! \brief List contest types. *Synchronous*
 *
 * Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contestTypeListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedContestTypeSummaryList, Error, void* )
	, void* userData);

/*! \brief List contest types. *Asynchronous*
 *
 * Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contestTypeListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedContestTypeSummaryList, Error, void* )
	, void* userData);


/*! \brief Get contest type. *Synchronous*
 *
 * Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contestTypeRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(ContestTypeDetail, Error, void* )
	, void* userData);

/*! \brief Get contest type. *Asynchronous*
 *
 * Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool contestTypeRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(ContestTypeDetail, Error, void* )
	, void* userData);


/*! \brief List super contest effects. *Synchronous*
 *
 * Super contest effects refer to the effects of moves when used in super contests.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool superContestEffectListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedSuperContestEffectSummaryList, Error, void* )
	, void* userData);

/*! \brief List super contest effects. *Asynchronous*
 *
 * Super contest effects refer to the effects of moves when used in super contests.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool superContestEffectListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedSuperContestEffectSummaryList, Error, void* )
	, void* userData);


/*! \brief Get super contest effect. *Synchronous*
 *
 * Super contest effects refer to the effects of moves when used in super contests.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool superContestEffectRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(SuperContestEffectDetail, Error, void* )
	, void* userData);

/*! \brief Get super contest effect. *Asynchronous*
 *
 * Super contest effects refer to the effects of moves when used in super contests.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool superContestEffectRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(SuperContestEffectDetail, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* ContestsManager_H_ */
