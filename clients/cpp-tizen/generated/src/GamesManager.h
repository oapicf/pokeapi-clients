#ifndef _GamesManager_H_
#define _GamesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "GenerationDetail.h"
#include "PaginatedGenerationSummaryList.h"
#include "PaginatedPokedexSummaryList.h"
#include "PaginatedVersionGroupSummaryList.h"
#include "PaginatedVersionSummaryList.h"
#include "PokedexDetail.h"
#include "VersionDetail.h"
#include "VersionGroupDetail.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Games Games
 * \ingroup Operations
 *  @{
 */
class GamesManager {
public:
	GamesManager();
	virtual ~GamesManager();

/*! \brief List genrations. *Synchronous*
 *
 * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generationListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGenerationSummaryList, Error, void* )
	, void* userData);

/*! \brief List genrations. *Asynchronous*
 *
 * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generationListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGenerationSummaryList, Error, void* )
	, void* userData);


/*! \brief Get genration. *Synchronous*
 *
 * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generationRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(GenerationDetail, Error, void* )
	, void* userData);

/*! \brief Get genration. *Asynchronous*
 *
 * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generationRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(GenerationDetail, Error, void* )
	, void* userData);


/*! \brief List pokedex. *Synchronous*
 *
 * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokedexListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokedexSummaryList, Error, void* )
	, void* userData);

/*! \brief List pokedex. *Asynchronous*
 *
 * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokedexListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokedexSummaryList, Error, void* )
	, void* userData);


/*! \brief Get pokedex. *Synchronous*
 *
 * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokedexRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokedexDetail, Error, void* )
	, void* userData);

/*! \brief Get pokedex. *Asynchronous*
 *
 * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokedexRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokedexDetail, Error, void* )
	, void* userData);


/*! \brief List version groups. *Synchronous*
 *
 * Version groups categorize highly similar versions of the games.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool versionGroupListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedVersionGroupSummaryList, Error, void* )
	, void* userData);

/*! \brief List version groups. *Asynchronous*
 *
 * Version groups categorize highly similar versions of the games.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool versionGroupListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedVersionGroupSummaryList, Error, void* )
	, void* userData);


/*! \brief Get version group. *Synchronous*
 *
 * Version groups categorize highly similar versions of the games.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool versionGroupRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(VersionGroupDetail, Error, void* )
	, void* userData);

/*! \brief Get version group. *Asynchronous*
 *
 * Version groups categorize highly similar versions of the games.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool versionGroupRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(VersionGroupDetail, Error, void* )
	, void* userData);


/*! \brief List versions. *Synchronous*
 *
 * Versions of the games, e.g., Red, Blue or Yellow.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool versionListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedVersionSummaryList, Error, void* )
	, void* userData);

/*! \brief List versions. *Asynchronous*
 *
 * Versions of the games, e.g., Red, Blue or Yellow.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool versionListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedVersionSummaryList, Error, void* )
	, void* userData);


/*! \brief Get version. *Synchronous*
 *
 * Versions of the games, e.g., Red, Blue or Yellow.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool versionRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(VersionDetail, Error, void* )
	, void* userData);

/*! \brief Get version. *Asynchronous*
 *
 * Versions of the games, e.g., Red, Blue or Yellow.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool versionRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(VersionDetail, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* GamesManager_H_ */
