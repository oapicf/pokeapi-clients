/*
 * PokemonSpeciesDetail_genera_inner.h
 *
 * 
 */

#ifndef _PokemonSpeciesDetail_genera_inner_H_
#define _PokemonSpeciesDetail_genera_inner_H_


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

class PokemonSpeciesDetail_genera_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpeciesDetail_genera_inner();
	PokemonSpeciesDetail_genera_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpeciesDetail_genera_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getGenus();

	/*! \brief Set 
	 */
	void setGenus(std::string  genus);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(AbilityDetail_pokemon_inner_pokemon  language);

private:
	std::string genus;
	AbilityDetail_pokemon_inner_pokemon language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpeciesDetail_genera_inner_H_ */
