/*
 * PalParkAreaDetail_pokemon_encounters_inner.h
 *
 * 
 */

#ifndef _PalParkAreaDetail_pokemon_encounters_inner_H_
#define _PalParkAreaDetail_pokemon_encounters_inner_H_


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

class PalParkAreaDetail_pokemon_encounters_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PalParkAreaDetail_pokemon_encounters_inner();
	PalParkAreaDetail_pokemon_encounters_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PalParkAreaDetail_pokemon_encounters_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getBaseScore();

	/*! \brief Set 
	 */
	void setBaseScore(int  base_score);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemonspecies();

	/*! \brief Set 
	 */
	void setPokemonspecies(AbilityDetail_pokemon_inner_pokemon  pokemonspecies);
	/*! \brief Get 
	 */
	int getRate();

	/*! \brief Set 
	 */
	void setRate(int  rate);

private:
	int base_score;
	AbilityDetail_pokemon_inner_pokemon pokemonspecies;
	int rate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PalParkAreaDetail_pokemon_encounters_inner_H_ */
