/*
 * PokemonAbilityPast.h
 *
 * 
 */

#ifndef _PokemonAbilityPast_H_
#define _PokemonAbilityPast_H_


#include <string>
#include "AbilitySummary.h"
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

class PokemonAbilityPast : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonAbilityPast();
	PokemonAbilityPast(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonAbilityPast();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether or not this is a hidden ability.
	 */
	bool getIsHidden();

	/*! \brief Set Whether or not this is a hidden ability.
	 */
	void setIsHidden(bool  is_hidden);
	/*! \brief Get The slot this ability occupies in this Pokémon species.
	 */
	int getSlot();

	/*! \brief Set The slot this ability occupies in this Pokémon species.
	 */
	void setSlot(int  slot);
	/*! \brief Get The ability the Pokémon may have.
	 */
	AbilitySummary getAbility();

	/*! \brief Set The ability the Pokémon may have.
	 */
	void setAbility(AbilitySummary  ability);

private:
	bool is_hidden;
	int slot;
	AbilitySummary ability;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonAbilityPast_H_ */
