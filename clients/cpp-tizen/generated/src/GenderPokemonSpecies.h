/*
 * GenderPokemonSpecies.h
 *
 * 
 */

#ifndef _GenderPokemonSpecies_H_
#define _GenderPokemonSpecies_H_


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

class GenderPokemonSpecies : public Object {
public:
	/*! \brief Constructor.
	 */
	GenderPokemonSpecies();
	GenderPokemonSpecies(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenderPokemonSpecies();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The chance of this Pokémon being female, in eighths; or -1 for genderless.
	 */
	int getRate();

	/*! \brief Set The chance of this Pokémon being female, in eighths; or -1 for genderless.
	 */
	void setRate(int  rate);
	/*! \brief Get A Pokémon species that can be the referenced gender.
	 */
	PokemonSpeciesSummary getPokemonSpecies();

	/*! \brief Set A Pokémon species that can be the referenced gender.
	 */
	void setPokemonSpecies(PokemonSpeciesSummary  pokemon_species);

private:
	int rate;
	PokemonSpeciesSummary pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenderPokemonSpecies_H_ */
