/*
 * PokemonPastAbility.h
 *
 * 
 */

#ifndef _PokemonPastAbility_H_
#define _PokemonPastAbility_H_


#include <string>
#include "GenerationSummary.h"
#include "PokemonAbilityPast.h"
#include <list>
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

class PokemonPastAbility : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonPastAbility();
	PokemonPastAbility(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonPastAbility();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
	 */
	std::list<PokemonAbilityPast> getAbilities();

	/*! \brief Set The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
	 */
	void setAbilities(std::list <PokemonAbilityPast> abilities);
	/*! \brief Get The last generation in which the referenced pokémon had the listed abilities.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The last generation in which the referenced pokémon had the listed abilities.
	 */
	void setGeneration(GenerationSummary  generation);

private:
	std::list <PokemonAbilityPast>abilities;
	GenerationSummary generation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonPastAbility_H_ */
