
/*
 * EvolutionChainLink.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EvolutionChainLink_H_
#define TINY_CPP_CLIENT_EvolutionChainLink_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonEvolution.h"
#include "PokemonSpeciesSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EvolutionChainLink{
public:

    /*! \brief Constructor.
	 */
    EvolutionChainLink();
    EvolutionChainLink(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EvolutionChainLink();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
	 */
	bool isIsBaby();

	/*! \brief Set Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
	 */
	void setIsBaby(bool is_baby);
	/*! \brief Get The Pokémon species at this point in the evolution chain.
	 */
	PokemonSpeciesSummary getSpecies();

	/*! \brief Set The Pokémon species at this point in the evolution chain.
	 */
	void setSpecies(PokemonSpeciesSummary species);
	/*! \brief Get All details regarding the specific details of the referenced Pokémon species evolution.
	 */
	std::list<PokemonEvolution> getEvolutionDetails();

	/*! \brief Set All details regarding the specific details of the referenced Pokémon species evolution.
	 */
	void setEvolutionDetails(std::list<PokemonEvolution> evolution_details);
	/*! \brief Get A List of chain objects.
	 */
	std::list<EvolutionChainLink> getEvolvesTo();

	/*! \brief Set A List of chain objects.
	 */
	void setEvolvesTo(std::list<EvolutionChainLink> evolves_to);


    private:
    bool is_baby{};
    PokemonSpeciesSummary species;
    std::list<PokemonEvolution> evolution_details;
    std::list<EvolutionChainLink> evolves_to;
};
}

#endif /* TINY_CPP_CLIENT_EvolutionChainLink_H_ */
