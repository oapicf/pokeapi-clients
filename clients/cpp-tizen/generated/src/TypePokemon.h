/*
 * TypePokemon.h
 *
 * 
 */

#ifndef _TypePokemon_H_
#define _TypePokemon_H_


#include <string>
#include "PokemonSummary.h"
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

class TypePokemon : public Object {
public:
	/*! \brief Constructor.
	 */
	TypePokemon();
	TypePokemon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypePokemon();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The order the Pokémon's types are listed in.
	 */
	int getSlot();

	/*! \brief Set The order the Pokémon's types are listed in.
	 */
	void setSlot(int  slot);
	/*! \brief Get The Pokémon that has the referenced type.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon that has the referenced type.
	 */
	void setPokemon(PokemonSummary  pokemon);

private:
	int slot;
	PokemonSummary pokemon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypePokemon_H_ */
