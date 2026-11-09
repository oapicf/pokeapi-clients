/*
 * PokemonHeldItemVersion.h
 *
 * 
 */

#ifndef _PokemonHeldItemVersion_H_
#define _PokemonHeldItemVersion_H_


#include <string>
#include "VersionSummary.h"
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

class PokemonHeldItemVersion : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonHeldItemVersion();
	PokemonHeldItemVersion(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonHeldItemVersion();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get How often the item is held.
	 */
	int getRarity();

	/*! \brief Set How often the item is held.
	 */
	void setRarity(int  rarity);
	/*! \brief Get The version in which the item is held.
	 */
	VersionSummary getVersion();

	/*! \brief Set The version in which the item is held.
	 */
	void setVersion(VersionSummary  version);

private:
	int rarity;
	VersionSummary version;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonHeldItemVersion_H_ */
