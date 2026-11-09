/*
 * PokemonSpeciesPalParkEncounter.h
 *
 * 
 */

#ifndef _PokemonSpeciesPalParkEncounter_H_
#define _PokemonSpeciesPalParkEncounter_H_


#include <string>
#include "PalParkAreaSummary.h"
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

class PokemonSpeciesPalParkEncounter : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpeciesPalParkEncounter();
	PokemonSpeciesPalParkEncounter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpeciesPalParkEncounter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The base score given to the player when the referenced Pokémon is caught during a pal park run.
	 */
	int getBaseScore();

	/*! \brief Set The base score given to the player when the referenced Pokémon is caught during a pal park run.
	 */
	void setBaseScore(int  base_score);
	/*! \brief Get The base rate for encountering the referenced Pokémon in this pal park area.
	 */
	int getRate();

	/*! \brief Set The base rate for encountering the referenced Pokémon in this pal park area.
	 */
	void setRate(int  rate);
	/*! \brief Get The pal park area where this encounter happens.
	 */
	PalParkAreaSummary getArea();

	/*! \brief Set The pal park area where this encounter happens.
	 */
	void setArea(PalParkAreaSummary  area);

private:
	int base_score;
	int rate;
	PalParkAreaSummary area;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpeciesPalParkEncounter_H_ */
