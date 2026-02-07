/*
 * TypeDetail_pokemon_inner_pokemon.h
 *
 * 
 */

#ifndef _TypeDetail_pokemon_inner_pokemon_H_
#define _TypeDetail_pokemon_inner_pokemon_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TypeDetail_pokemon_inner_pokemon : public Object {
public:
	/*! \brief Constructor.
	 */
	TypeDetail_pokemon_inner_pokemon();
	TypeDetail_pokemon_inner_pokemon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypeDetail_pokemon_inner_pokemon();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the pokemon
	 */
	std::string getName();

	/*! \brief Set The name of the pokemon
	 */
	void setName(std::string  name);
	/*! \brief Get The URL to get more information about the pokemon
	 */
	std::string getUrl();

	/*! \brief Set The URL to get more information about the pokemon
	 */
	void setUrl(std::string  url);

private:
	std::string name;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypeDetail_pokemon_inner_pokemon_H_ */
