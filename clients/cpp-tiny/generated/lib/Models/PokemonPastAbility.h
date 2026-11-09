
/*
 * PokemonPastAbility.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonPastAbility_H_
#define TINY_CPP_CLIENT_PokemonPastAbility_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GenerationSummary.h"
#include "PokemonAbilityPast.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonPastAbility{
public:

    /*! \brief Constructor.
	 */
    PokemonPastAbility();
    PokemonPastAbility(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonPastAbility();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
	 */
	std::list<PokemonAbilityPast> getAbilities();

	/*! \brief Set The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
	 */
	void setAbilities(std::list<PokemonAbilityPast> abilities);
	/*! \brief Get The last generation in which the referenced pokémon had the listed abilities.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The last generation in which the referenced pokémon had the listed abilities.
	 */
	void setGeneration(GenerationSummary generation);


    private:
    std::list<PokemonAbilityPast> abilities;
    GenerationSummary generation;
};
}

#endif /* TINY_CPP_CLIENT_PokemonPastAbility_H_ */
