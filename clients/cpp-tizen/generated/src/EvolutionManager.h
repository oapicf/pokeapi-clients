#ifndef _EvolutionManager_H_
#define _EvolutionManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "EvolutionChainDetail.h"
#include "EvolutionTriggerDetail.h"
#include "PaginatedEvolutionChainSummaryList.h"
#include "PaginatedEvolutionTriggerSummaryList.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Evolution Evolution
 * \ingroup Operations
 *  @{
 */
class EvolutionManager {
public:
	EvolutionManager();
	virtual ~EvolutionManager();

/*! \brief List evolution chains. *Synchronous*
 *
 * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool evolutionChainListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEvolutionChainSummaryList, Error, void* )
	, void* userData);

/*! \brief List evolution chains. *Asynchronous*
 *
 * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool evolutionChainListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEvolutionChainSummaryList, Error, void* )
	, void* userData);


/*! \brief Get evolution chain. *Synchronous*
 *
 * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool evolutionChainRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(EvolutionChainDetail, Error, void* )
	, void* userData);

/*! \brief Get evolution chain. *Asynchronous*
 *
 * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool evolutionChainRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(EvolutionChainDetail, Error, void* )
	, void* userData);


/*! \brief List evolution triggers. *Synchronous*
 *
 * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool evolutionTriggerListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEvolutionTriggerSummaryList, Error, void* )
	, void* userData);

/*! \brief List evolution triggers. *Asynchronous*
 *
 * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool evolutionTriggerListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEvolutionTriggerSummaryList, Error, void* )
	, void* userData);


/*! \brief Get evolution trigger. *Synchronous*
 *
 * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool evolutionTriggerRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(EvolutionTriggerDetail, Error, void* )
	, void* userData);

/*! \brief Get evolution trigger. *Asynchronous*
 *
 * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool evolutionTriggerRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(EvolutionTriggerDetail, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* EvolutionManager_H_ */
