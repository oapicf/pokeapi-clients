#ifndef _LocationManager_H_
#define _LocationManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "LocationAreaDetail.h"
#include "LocationDetail.h"
#include "PaginatedLocationAreaSummaryList.h"
#include "PaginatedLocationSummaryList.h"
#include "PaginatedPalParkAreaSummaryList.h"
#include "PaginatedRegionSummaryList.h"
#include "PalParkAreaDetail.h"
#include "RegionDetail.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Location Location
 * \ingroup Operations
 *  @{
 */
class LocationManager {
public:
	LocationManager();
	virtual ~LocationManager();

/*! \brief List location areas. *Synchronous*
 *
 * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool locationAreaListSync(char * accessToken,
	int limit, int offset, 
	void(* handler)(PaginatedLocationAreaSummaryList, Error, void* )
	, void* userData);

/*! \brief List location areas. *Asynchronous*
 *
 * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool locationAreaListAsync(char * accessToken,
	int limit, int offset, 
	void(* handler)(PaginatedLocationAreaSummaryList, Error, void* )
	, void* userData);


/*! \brief Get location area. *Synchronous*
 *
 * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
 * \param id A unique integer value identifying this location area. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool locationAreaRetrieveSync(char * accessToken,
	int id, 
	void(* handler)(LocationAreaDetail, Error, void* )
	, void* userData);

/*! \brief Get location area. *Asynchronous*
 *
 * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
 * \param id A unique integer value identifying this location area. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool locationAreaRetrieveAsync(char * accessToken,
	int id, 
	void(* handler)(LocationAreaDetail, Error, void* )
	, void* userData);


/*! \brief List locations. *Synchronous*
 *
 * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool locationListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedLocationSummaryList, Error, void* )
	, void* userData);

/*! \brief List locations. *Asynchronous*
 *
 * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool locationListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedLocationSummaryList, Error, void* )
	, void* userData);


/*! \brief Get location. *Synchronous*
 *
 * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool locationRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(LocationDetail, Error, void* )
	, void* userData);

/*! \brief Get location. *Asynchronous*
 *
 * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool locationRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(LocationDetail, Error, void* )
	, void* userData);


/*! \brief List pal park areas. *Synchronous*
 *
 * Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool palParkAreaListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPalParkAreaSummaryList, Error, void* )
	, void* userData);

/*! \brief List pal park areas. *Asynchronous*
 *
 * Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool palParkAreaListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPalParkAreaSummaryList, Error, void* )
	, void* userData);


/*! \brief Get pal park area. *Synchronous*
 *
 * Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool palParkAreaRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PalParkAreaDetail, Error, void* )
	, void* userData);

/*! \brief Get pal park area. *Asynchronous*
 *
 * Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool palParkAreaRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PalParkAreaDetail, Error, void* )
	, void* userData);


/*! \brief List regions. *Synchronous*
 *
 * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool regionListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedRegionSummaryList, Error, void* )
	, void* userData);

/*! \brief List regions. *Asynchronous*
 *
 * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool regionListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedRegionSummaryList, Error, void* )
	, void* userData);


/*! \brief Get region. *Synchronous*
 *
 * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool regionRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(RegionDetail, Error, void* )
	, void* userData);

/*! \brief Get region. *Asynchronous*
 *
 * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool regionRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(RegionDetail, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* LocationManager_H_ */
