/*
 * PokemonHeldItemSummary.h
 *
 * 
 */

#ifndef _PokemonHeldItemSummary_H_
#define _PokemonHeldItemSummary_H_


#include <string>
#include "ItemSummary.h"
#include "PokemonHeldItemVersion.h"
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

class PokemonHeldItemSummary : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonHeldItemSummary();
	PokemonHeldItemSummary(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonHeldItemSummary();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The item the referenced Pokémon holds.
	 */
	ItemSummary getItem();

	/*! \brief Set The item the referenced Pokémon holds.
	 */
	void setItem(ItemSummary  item);
	/*! \brief Get The details of the different versions in which the item is held.
	 */
	std::list<PokemonHeldItemVersion> getVersionDetails();

	/*! \brief Set The details of the different versions in which the item is held.
	 */
	void setVersionDetails(std::list <PokemonHeldItemVersion> version_details);

private:
	ItemSummary item;
	std::list <PokemonHeldItemVersion>version_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonHeldItemSummary_H_ */
