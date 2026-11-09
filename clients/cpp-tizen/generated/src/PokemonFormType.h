/*
 * PokemonFormType.h
 *
 * 
 */

#ifndef _PokemonFormType_H_
#define _PokemonFormType_H_


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

class PokemonFormType : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonFormType();
	PokemonFormType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonFormType();

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
	/*! \brief Get The type the referenced Form has.
	 */
	TypeSummary getType();

	/*! \brief Set The type the referenced Form has.
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

#endif /* _PokemonFormType_H_ */
