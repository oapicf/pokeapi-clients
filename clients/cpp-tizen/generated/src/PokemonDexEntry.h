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

	/*! \brief Get 
	 */
	int getEntryNumber();

	/*! \brief Set 
	 */
	void setEntryNumber(int  entry_number);
	/*! \brief Get 
	 */
	PokedexSummary getPokedex();

	/*! \brief Set 
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
