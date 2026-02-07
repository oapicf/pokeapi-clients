/*
 * PokemonShapeDetail_awesome_names_inner.h
 *
 * 
 */

#ifndef _PokemonShapeDetail_awesome_names_inner_H_
#define _PokemonShapeDetail_awesome_names_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
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

class PokemonShapeDetail_awesome_names_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonShapeDetail_awesome_names_inner();
	PokemonShapeDetail_awesome_names_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonShapeDetail_awesome_names_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getAwesomeName();

	/*! \brief Set 
	 */
	void setAwesomeName(std::string  awesome_name);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(AbilityDetail_pokemon_inner_pokemon  language);

private:
	std::string awesome_name;
	AbilityDetail_pokemon_inner_pokemon language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonShapeDetail_awesome_names_inner_H_ */
