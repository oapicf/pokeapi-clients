#ifndef _EncountersManager_H_
#define _EncountersManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "EncounterConditionDetail.h"
#include "EncounterConditionValueDetail.h"
#include "EncounterMethodDetail.h"
#include "PaginatedEncounterConditionSummaryList.h"
#include "PaginatedEncounterConditionValueSummaryList.h"
#include "PaginatedEncounterMethodSummaryList.h"
#include "Pokemon_encounters_retrieve_200_response_inner.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Encounters Encounters
 * \ingroup Operations
 *  @{
 */
class EncountersManager {
public:
	EncountersManager();
	virtual ~EncountersManager();

/*! \brief List encounter conditions. *Synchronous*
 *
 * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterConditionListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterConditionSummaryList, Error, void* )
	, void* userData);

/*! \brief List encounter conditions. *Asynchronous*
 *
 * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterConditionListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterConditionSummaryList, Error, void* )
	, void* userData);


/*! \brief Get encounter condition. *Synchronous*
 *
 * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterConditionRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterConditionDetail, Error, void* )
	, void* userData);

/*! \brief Get encounter condition. *Asynchronous*
 *
 * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterConditionRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterConditionDetail, Error, void* )
	, void* userData);


/*! \brief List encounter condition values. *Synchronous*
 *
 * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterConditionValueListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterConditionValueSummaryList, Error, void* )
	, void* userData);

/*! \brief List encounter condition values. *Asynchronous*
 *
 * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterConditionValueListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterConditionValueSummaryList, Error, void* )
	, void* userData);


/*! \brief Get encounter condition value. *Synchronous*
 *
 * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterConditionValueRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterConditionValueDetail, Error, void* )
	, void* userData);

/*! \brief Get encounter condition value. *Asynchronous*
 *
 * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterConditionValueRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterConditionValueDetail, Error, void* )
	, void* userData);


/*! \brief List encounter methods. *Synchronous*
 *
 * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterMethodListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterMethodSummaryList, Error, void* )
	, void* userData);

/*! \brief List encounter methods. *Asynchronous*
 *
 * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterMethodListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterMethodSummaryList, Error, void* )
	, void* userData);


/*! \brief Get encounter method. *Synchronous*
 *
 * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterMethodRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterMethodDetail, Error, void* )
	, void* userData);

/*! \brief Get encounter method. *Asynchronous*
 *
 * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterMethodRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterMethodDetail, Error, void* )
	, void* userData);


/*! \brief Get pokemon encounter. *Synchronous*
 *
 * Handles Pokemon Encounters as a sub-resource.
 * \param pokemonId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonEncountersRetrieveSync(char * accessToken,
	std::string pokemonId, 
	void(* handler)(std::list<Pokemon_encounters_retrieve_200_response_inner>, Error, void* )
	, void* userData);

/*! \brief Get pokemon encounter. *Asynchronous*
 *
 * Handles Pokemon Encounters as a sub-resource.
 * \param pokemonId  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonEncountersRetrieveAsync(char * accessToken,
	std::string pokemonId, 
	void(* handler)(std::list<Pokemon_encounters_retrieve_200_response_inner>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* EncountersManager_H_ */
