#ifndef _EncounterMethodManager_H_
#define _EncounterMethodManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup EncounterMethod EncounterMethod
 * \ingroup Operations
 *  @{
 */
class EncounterMethodManager {
public:
	EncounterMethodManager();
	virtual ~EncounterMethodManager();

/*! \brief . *Synchronous*
 *
 * 
 * \param limit 
 * \param offset 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterMethodListSync(char * accessToken,
	int limit, int offset, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param limit 
 * \param offset 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterMethodListAsync(char * accessToken,
	int limit, int offset, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param id  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterMethodReadSync(char * accessToken,
	int id, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param id  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool encounterMethodReadAsync(char * accessToken,
	int id, 
	void(* handler)(std::string, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co/api/v2";
	}
};
/** @}*/

}
}
#endif /* EncounterMethodManager_H_ */
