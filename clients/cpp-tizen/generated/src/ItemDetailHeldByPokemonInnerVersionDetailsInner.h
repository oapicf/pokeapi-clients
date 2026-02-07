/*
 * ItemDetail_held_by_pokemon_inner_version_details_inner.h
 *
 * 
 */

#ifndef _ItemDetail_held_by_pokemon_inner_version_details_inner_H_
#define _ItemDetail_held_by_pokemon_inner_version_details_inner_H_


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

class ItemDetail_held_by_pokemon_inner_version_details_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemDetail_held_by_pokemon_inner_version_details_inner();
	ItemDetail_held_by_pokemon_inner_version_details_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemDetail_held_by_pokemon_inner_version_details_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getRarity();

	/*! \brief Set 
	 */
	void setRarity(int  rarity);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getVersion();

	/*! \brief Set 
	 */
	void setVersion(AbilityDetail_pokemon_inner_pokemon  version);

private:
	int rarity;
	AbilityDetail_pokemon_inner_pokemon version;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemDetail_held_by_pokemon_inner_version_details_inner_H_ */
