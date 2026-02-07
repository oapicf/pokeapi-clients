/*
 * PokemonDetail_abilities_inner.h
 *
 * 
 */

#ifndef _PokemonDetail_abilities_inner_H_
#define _PokemonDetail_abilities_inner_H_


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

class PokemonDetail_abilities_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonDetail_abilities_inner();
	PokemonDetail_abilities_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonDetail_abilities_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getAbility();

	/*! \brief Set 
	 */
	void setAbility(AbilityDetail_pokemon_inner_pokemon  ability);
	/*! \brief Get 
	 */
	bool getIsHidden();

	/*! \brief Set 
	 */
	void setIsHidden(bool  is_hidden);
	/*! \brief Get 
	 */
	int getSlot();

	/*! \brief Set 
	 */
	void setSlot(int  slot);

private:
	AbilityDetail_pokemon_inner_pokemon ability;
	bool is_hidden;
	int slot;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonDetail_abilities_inner_H_ */
