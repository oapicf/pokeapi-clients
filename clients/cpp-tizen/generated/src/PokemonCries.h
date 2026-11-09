/*
 * PokemonCries.h
 *
 * 
 */

#ifndef _PokemonCries_H_
#define _PokemonCries_H_


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

class PokemonCries : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonCries();
	PokemonCries(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonCries();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The latest depiction of this Pokémon's cry.
	 */
	std::string getLatest();

	/*! \brief Set The latest depiction of this Pokémon's cry.
	 */
	void setLatest(std::string  latest);
	/*! \brief Get The legacy depiction of this Pokémon's cry.
	 */
	std::string getLegacy();

	/*! \brief Set The legacy depiction of this Pokémon's cry.
	 */
	void setLegacy(std::string  legacy);

private:
	std::string latest;
	std::string legacy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonCries_H_ */
