/*
 * PokedexDetail_pokemon_entries_inner.h
 *
 * 
 */

#ifndef _PokedexDetail_pokemon_entries_inner_H_
#define _PokedexDetail_pokemon_entries_inner_H_


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

class PokedexDetail_pokemon_entries_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokedexDetail_pokemon_entries_inner();
	PokedexDetail_pokemon_entries_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokedexDetail_pokemon_entries_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getEntryNumber();

	/*! \brief Set 
	 */
	void setEntryNumber(int  entry_number);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(AbilityDetail_pokemon_inner_pokemon  pokemon_species);

private:
	int entry_number;
	AbilityDetail_pokemon_inner_pokemon pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokedexDetail_pokemon_entries_inner_H_ */
