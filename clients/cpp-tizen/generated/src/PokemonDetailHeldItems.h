/*
 * PokemonDetail_held_items.h
 *
 * 
 */

#ifndef _PokemonDetail_held_items_H_
#define _PokemonDetail_held_items_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "ItemDetail_held_by_pokemon_inner_version_details_inner.h"
#include <list>
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

class PokemonDetail_held_items : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonDetail_held_items();
	PokemonDetail_held_items(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonDetail_held_items();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getItem();

	/*! \brief Set 
	 */
	void setItem(AbilityDetail_pokemon_inner_pokemon  item);
	/*! \brief Get 
	 */
	std::list<ItemDetail_held_by_pokemon_inner_version_details_inner> getVersionDetails();

	/*! \brief Set 
	 */
	void setVersionDetails(std::list <ItemDetail_held_by_pokemon_inner_version_details_inner> version_details);

private:
	AbilityDetail_pokemon_inner_pokemon item;
	std::list <ItemDetail_held_by_pokemon_inner_version_details_inner>version_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonDetail_held_items_H_ */
