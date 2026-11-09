/*
 * PokemonDexNumber.h
 *
 * 
 */

#ifndef _PokemonDexNumber_H_
#define _PokemonDexNumber_H_


#include <string>
#include "PokemonSpeciesSummary.h"
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

class PokemonDexNumber : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonDexNumber();
	PokemonDexNumber(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonDexNumber();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The index of this Pokémon species entry within the Pokédex.
	 */
	int getEntryNumber();

	/*! \brief Set The index of this Pokémon species entry within the Pokédex.
	 */
	void setEntryNumber(int  entry_number);
	/*! \brief Get The Pokémon species being encountered.
	 */
	PokemonSpeciesSummary getPokemonSpecies();

	/*! \brief Set The Pokémon species being encountered.
	 */
	void setPokemonSpecies(PokemonSpeciesSummary  pokemon_species);

private:
	int entry_number;
	PokemonSpeciesSummary pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonDexNumber_H_ */
