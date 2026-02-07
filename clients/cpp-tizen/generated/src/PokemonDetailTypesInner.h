/*
 * PokemonDetail_types_inner.h
 *
 * 
 */

#ifndef _PokemonDetail_types_inner_H_
#define _PokemonDetail_types_inner_H_


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

class PokemonDetail_types_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonDetail_types_inner();
	PokemonDetail_types_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonDetail_types_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getSlot();

	/*! \brief Set 
	 */
	void setSlot(int  slot);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getType();

	/*! \brief Set 
	 */
	void setType(AbilityDetail_pokemon_inner_pokemon  type);

private:
	int slot;
	AbilityDetail_pokemon_inner_pokemon type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonDetail_types_inner_H_ */
