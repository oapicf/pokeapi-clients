#ifndef _MachinesManager_H_
#define _MachinesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "MachineDetail.h"
#include "PaginatedMachineSummaryList.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Machines Machines
 * \ingroup Operations
 *  @{
 */
class MachinesManager {
public:
	MachinesManager();
	virtual ~MachinesManager();

/*! \brief List machines. *Synchronous*
 *
 * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool machineListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMachineSummaryList, Error, void* )
	, void* userData);

/*! \brief List machines. *Asynchronous*
 *
 * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool machineListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMachineSummaryList, Error, void* )
	, void* userData);


/*! \brief Get machine. *Synchronous*
 *
 * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool machineRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(MachineDetail, Error, void* )
	, void* userData);

/*! \brief Get machine. *Asynchronous*
 *
 * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool machineRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(MachineDetail, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* MachinesManager_H_ */
