/*
 * PokemonFormDetail_form_names_inner.h
 *
 * 
 */

#ifndef _PokemonFormDetail_form_names_inner_H_
#define _PokemonFormDetail_form_names_inner_H_


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

class PokemonFormDetail_form_names_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonFormDetail_form_names_inner();
	PokemonFormDetail_form_names_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonFormDetail_form_names_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(AbilityDetail_pokemon_inner_pokemon  language);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);

private:
	AbilityDetail_pokemon_inner_pokemon language;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonFormDetail_form_names_inner_H_ */
