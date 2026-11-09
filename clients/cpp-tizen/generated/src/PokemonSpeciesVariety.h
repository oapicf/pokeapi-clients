/*
 * PokemonSpeciesVariety.h
 *
 * 
 */

#ifndef _PokemonSpeciesVariety_H_
#define _PokemonSpeciesVariety_H_


#include <string>
#include "PokemonSummary.h"
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

class PokemonSpeciesVariety : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpeciesVariety();
	PokemonSpeciesVariety(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpeciesVariety();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether this variety is the default variety.
	 */
	bool getIsDefault();

	/*! \brief Set Whether this variety is the default variety.
	 */
	void setIsDefault(bool  is_default);
	/*! \brief Get The Pokémon variety.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon variety.
	 */
	void setPokemon(PokemonSummary  pokemon);

private:
	bool is_default;
	PokemonSummary pokemon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpeciesVariety_H_ */
