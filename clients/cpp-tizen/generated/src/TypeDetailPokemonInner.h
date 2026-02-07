/*
 * TypeDetail_pokemon_inner.h
 *
 * 
 */

#ifndef _TypeDetail_pokemon_inner_H_
#define _TypeDetail_pokemon_inner_H_


#include <string>
#include "TypeDetail_pokemon_inner_pokemon.h"
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

class TypeDetail_pokemon_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	TypeDetail_pokemon_inner();
	TypeDetail_pokemon_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypeDetail_pokemon_inner();

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
	TypeDetail_pokemon_inner_pokemon getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(TypeDetail_pokemon_inner_pokemon  pokemon);

private:
	int slot;
	TypeDetail_pokemon_inner_pokemon pokemon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypeDetail_pokemon_inner_H_ */
