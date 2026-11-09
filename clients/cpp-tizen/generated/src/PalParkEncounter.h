/*
 * PalParkEncounter.h
 *
 * 
 */

#ifndef _PalParkEncounter_H_
#define _PalParkEncounter_H_


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

class PalParkEncounter : public Object {
public:
	/*! \brief Constructor.
	 */
	PalParkEncounter();
	PalParkEncounter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PalParkEncounter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The base score given to the player when this Pokémon is caught during a pal park run.
	 */
	int getBaseScore();

	/*! \brief Set The base score given to the player when this Pokémon is caught during a pal park run.
	 */
	void setBaseScore(int  base_score);
	/*! \brief Get The base rate for encountering this Pokémon in this pal park area.
	 */
	int getRate();

	/*! \brief Set The base rate for encountering this Pokémon in this pal park area.
	 */
	void setRate(int  rate);
	/*! \brief Get The Pokémon species being encountered.
	 */
	PokemonSpeciesSummary getPokemonSpecies();

	/*! \brief Set The Pokémon species being encountered.
	 */
	void setPokemonSpecies(PokemonSpeciesSummary  pokemon_species);

private:
	int base_score;
	int rate;
	PokemonSpeciesSummary pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PalParkEncounter_H_ */
