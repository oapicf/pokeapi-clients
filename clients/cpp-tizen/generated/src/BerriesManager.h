#ifndef _BerriesManager_H_
#define _BerriesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "BerryDetail.h"
#include "BerryFirmnessDetail.h"
#include "BerryFlavorDetail.h"
#include "PaginatedBerryFirmnessSummaryList.h"
#include "PaginatedBerryFlavorSummaryList.h"
#include "PaginatedBerrySummaryList.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Berries Berries
 * \ingroup Operations
 *  @{
 */
class BerriesManager {
public:
	BerriesManager();
	virtual ~BerriesManager();

/*! \brief List berry firmness. *Synchronous*
 *
 * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryFirmnessListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerryFirmnessSummaryList, Error, void* )
	, void* userData);

/*! \brief List berry firmness. *Asynchronous*
 *
 * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryFirmnessListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerryFirmnessSummaryList, Error, void* )
	, void* userData);


/*! \brief Get berry by firmness. *Synchronous*
 *
 * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryFirmnessRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(BerryFirmnessDetail, Error, void* )
	, void* userData);

/*! \brief Get berry by firmness. *Asynchronous*
 *
 * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryFirmnessRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(BerryFirmnessDetail, Error, void* )
	, void* userData);


/*! \brief List berry flavors. *Synchronous*
 *
 * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryFlavorListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerryFlavorSummaryList, Error, void* )
	, void* userData);

/*! \brief List berry flavors. *Asynchronous*
 *
 * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryFlavorListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerryFlavorSummaryList, Error, void* )
	, void* userData);


/*! \brief Get berries by flavor. *Synchronous*
 *
 * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryFlavorRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(BerryFlavorDetail, Error, void* )
	, void* userData);

/*! \brief Get berries by flavor. *Asynchronous*
 *
 * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryFlavorRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(BerryFlavorDetail, Error, void* )
	, void* userData);


/*! \brief List berries. *Synchronous*
 *
 * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerrySummaryList, Error, void* )
	, void* userData);

/*! \brief List berries. *Asynchronous*
 *
 * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerrySummaryList, Error, void* )
	, void* userData);


/*! \brief Get a berry. *Synchronous*
 *
 * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(BerryDetail, Error, void* )
	, void* userData);

/*! \brief Get a berry. *Asynchronous*
 *
 * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool berryRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(BerryDetail, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* BerriesManager_H_ */
