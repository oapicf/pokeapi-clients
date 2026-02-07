/*
 * PokemonSpeciesDetail_pal_park_encounters_inner.h
 *
 * 
 */

#ifndef _PokemonSpeciesDetail_pal_park_encounters_inner_H_
#define _PokemonSpeciesDetail_pal_park_encounters_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
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

class PokemonSpeciesDetail_pal_park_encounters_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpeciesDetail_pal_park_encounters_inner();
	PokemonSpeciesDetail_pal_park_encounters_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpeciesDetail_pal_park_encounters_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getArea();

	/*! \brief Set 
	 */
	void setArea(AbilityDetail_pokemon_inner_pokemon  area);
	/*! \brief Get 
	 */
	int getBaseScore();

	/*! \brief Set 
	 */
	void setBaseScore(int  base_score);
	/*! \brief Get 
	 */
	int getRate();

	/*! \brief Set 
	 */
	void setRate(int  rate);

private:
	AbilityDetail_pokemon_inner_pokemon area;
	int base_score;
	int rate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpeciesDetail_pal_park_encounters_inner_H_ */
