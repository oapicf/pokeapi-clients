/*
 * GenderDetail_pokemon_species_details_inner.h
 *
 * 
 */

#ifndef _GenderDetail_pokemon_species_details_inner_H_
#define _GenderDetail_pokemon_species_details_inner_H_


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

class GenderDetail_pokemon_species_details_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	GenderDetail_pokemon_species_details_inner();
	GenderDetail_pokemon_species_details_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenderDetail_pokemon_species_details_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getRate();

	/*! \brief Set 
	 */
	void setRate(int  rate);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(AbilityDetail_pokemon_inner_pokemon  pokemon_species);

private:
	int rate;
	AbilityDetail_pokemon_inner_pokemon pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenderDetail_pokemon_species_details_inner_H_ */
