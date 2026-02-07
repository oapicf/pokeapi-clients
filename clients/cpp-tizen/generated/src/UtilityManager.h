#ifndef _UtilityManager_H_
#define _UtilityManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "LanguageDetail.h"
#include "PaginatedLanguageSummaryList.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Utility Utility
 * \ingroup Operations
 *  @{
 */
class UtilityManager {
public:
	UtilityManager();
	virtual ~UtilityManager();

/*! \brief List languages. *Synchronous*
 *
 * Languages for translations of API resource information.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool languageListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedLanguageSummaryList, Error, void* )
	, void* userData);

/*! \brief List languages. *Asynchronous*
 *
 * Languages for translations of API resource information.
 * \param limit Number of results to return per page.
 * \param offset The initial index from which to return the results.
 * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool languageListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedLanguageSummaryList, Error, void* )
	, void* userData);


/*! \brief Get language. *Synchronous*
 *
 * Languages for translations of API resource information.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool languageRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(LanguageDetail, Error, void* )
	, void* userData);

/*! \brief Get language. *Asynchronous*
 *
 * Languages for translations of API resource information.
 * \param id This parameter can be a string or an integer. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool languageRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(LanguageDetail, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://pokeapi.co";
	}
};
/** @}*/

}
}
#endif /* UtilityManager_H_ */
