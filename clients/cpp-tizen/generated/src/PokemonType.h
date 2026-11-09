/*
 * PokemonType.h
 *
 * 
 */

#ifndef _PokemonType_H_
#define _PokemonType_H_


#include <string>
#include "TypeSummary.h"
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

class PokemonType : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonType();
	PokemonType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The order the Pokémon's types are listed in.
	 */
	int getSlot();

	/*! \brief Set The order the Pokémon's types are listed in.
	 */
	void setSlot(int  slot);
	/*! \brief Get The type the referenced Pokémon has.
	 */
	TypeSummary getType();

	/*! \brief Set The type the referenced Pokémon has.
	 */
	void setType(TypeSummary  type);

private:
	int slot;
	TypeSummary type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonType_H_ */
