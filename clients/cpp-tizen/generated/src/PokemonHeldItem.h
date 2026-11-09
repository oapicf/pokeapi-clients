/*
 * PokemonHeldItem.h
 *
 * 
 */

#ifndef _PokemonHeldItem_H_
#define _PokemonHeldItem_H_


#include <string>
#include "PokemonHeldItemVersion.h"
#include "PokemonSummary.h"
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

class PokemonHeldItem : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonHeldItem();
	PokemonHeldItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonHeldItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The Pokémon that holds this item.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon that holds this item.
	 */
	void setPokemon(PokemonSummary  pokemon);
	/*! \brief Get The details for the version that this item is held in by the Pokémon.
	 */
	std::list<PokemonHeldItemVersion> getVersionDetails();

	/*! \brief Set The details for the version that this item is held in by the Pokémon.
	 */
	void setVersionDetails(std::list <PokemonHeldItemVersion> version_details);

private:
	PokemonSummary pokemon;
	std::list <PokemonHeldItemVersion>version_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonHeldItem_H_ */
