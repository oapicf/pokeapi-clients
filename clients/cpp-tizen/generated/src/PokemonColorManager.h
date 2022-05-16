#ifndef _PokemonColorManager_H_
#define _PokemonColorManager_H_

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
/** \addtogroup PokemonColor PokemonColor
 * \ingroup Operations
 *  @{
 */
class PokemonColorManager {
public:
	PokemonColorManager();
	virtual ~PokemonColorManager();

/*! \brief . *Synchronous*
 *
 * 
 * \param limit 
 * \param offset 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool pokemonColorListSync(char * accessToken,
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
bool pokemonColorListAsync(char * accessToken,
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
bool pokemonColorReadSync(char * accessToken,
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
bool pokemonColorReadAsync(char * accessToken,
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
#endif /* PokemonColorManager_H_ */
