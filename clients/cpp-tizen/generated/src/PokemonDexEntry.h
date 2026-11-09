/*
 * PokemonDexEntry.h
 *
 * 
 */

#ifndef _PokemonDexEntry_H_
#define _PokemonDexEntry_H_


#include <string>
#include "PokedexSummary.h"
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

class PokemonDexEntry : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonDexEntry();
	PokemonDexEntry(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonDexEntry();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The index number within the Pokédex.
	 */
	int getEntryNumber();

	/*! \brief Set The index number within the Pokédex.
	 */
	void setEntryNumber(int  entry_number);
	/*! \brief Get The Pokédex the referenced Pokémon species can be found in.
	 */
	PokedexSummary getPokedex();

	/*! \brief Set The Pokédex the referenced Pokémon species can be found in.
	 */
	void setPokedex(PokedexSummary  pokedex);

private:
	int entry_number;
	PokedexSummary pokedex;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonDexEntry_H_ */
