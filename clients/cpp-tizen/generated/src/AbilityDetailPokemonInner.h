/*
 * AbilityDetail_pokemon_inner.h
 *
 * 
 */

#ifndef _AbilityDetail_pokemon_inner_H_
#define _AbilityDetail_pokemon_inner_H_


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

class AbilityDetail_pokemon_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	AbilityDetail_pokemon_inner();
	AbilityDetail_pokemon_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AbilityDetail_pokemon_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(AbilityDetail_pokemon_inner_pokemon  pokemon);

private:
	bool is_hidden;
	int slot;
	AbilityDetail_pokemon_inner_pokemon pokemon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AbilityDetail_pokemon_inner_H_ */
