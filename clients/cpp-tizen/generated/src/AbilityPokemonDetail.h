/*
 * AbilityPokemonDetail.h
 *
 * 
 */

#ifndef _AbilityPokemonDetail_H_
#define _AbilityPokemonDetail_H_


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

class AbilityPokemonDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	AbilityPokemonDetail();
	AbilityPokemonDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AbilityPokemonDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether or not this a hidden ability for the referenced Pokémon.
	 */
	bool getIsHidden();

	/*! \brief Set Whether or not this a hidden ability for the referenced Pokémon.
	 */
	void setIsHidden(bool  is_hidden);
	/*! \brief Get Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
	 */
	int getSlot();

	/*! \brief Set Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
	 */
	void setSlot(int  slot);
	/*! \brief Get The Pokémon this ability could belong to.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon this ability could belong to.
	 */
	void setPokemon(PokemonSummary  pokemon);

private:
	bool is_hidden;
	int slot;
	PokemonSummary pokemon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AbilityPokemonDetail_H_ */
