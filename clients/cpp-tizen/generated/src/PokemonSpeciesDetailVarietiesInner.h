/*
 * PokemonSpeciesDetail_varieties_inner.h
 *
 * 
 */

#ifndef _PokemonSpeciesDetail_varieties_inner_H_
#define _PokemonSpeciesDetail_varieties_inner_H_


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

class PokemonSpeciesDetail_varieties_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpeciesDetail_varieties_inner();
	PokemonSpeciesDetail_varieties_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpeciesDetail_varieties_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	bool getIsDefault();

	/*! \brief Set 
	 */
	void setIsDefault(bool  is_default);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(AbilityDetail_pokemon_inner_pokemon  pokemon);

private:
	bool is_default;
	AbilityDetail_pokemon_inner_pokemon pokemon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpeciesDetail_varieties_inner_H_ */
