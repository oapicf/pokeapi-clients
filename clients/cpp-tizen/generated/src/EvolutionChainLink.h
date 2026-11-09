/*
 * EvolutionChainLink.h
 *
 * 
 */

#ifndef _EvolutionChainLink_H_
#define _EvolutionChainLink_H_


#include <string>
#include "PokemonEvolution.h"
#include "PokemonSpeciesSummary.h"
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

class EvolutionChainLink : public Object {
public:
	/*! \brief Constructor.
	 */
	EvolutionChainLink();
	EvolutionChainLink(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EvolutionChainLink();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
	 */
	bool getIsBaby();

	/*! \brief Set Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
	 */
	void setIsBaby(bool  is_baby);
	/*! \brief Get The Pokémon species at this point in the evolution chain.
	 */
	PokemonSpeciesSummary getSpecies();

	/*! \brief Set The Pokémon species at this point in the evolution chain.
	 */
	void setSpecies(PokemonSpeciesSummary  species);
	/*! \brief Get All details regarding the specific details of the referenced Pokémon species evolution.
	 */
	std::list<PokemonEvolution> getEvolutionDetails();

	/*! \brief Set All details regarding the specific details of the referenced Pokémon species evolution.
	 */
	void setEvolutionDetails(std::list <PokemonEvolution> evolution_details);
	/*! \brief Get A List of chain objects.
	 */
	std::list<EvolutionChainLink> getEvolvesTo();

	/*! \brief Set A List of chain objects.
	 */
	void setEvolvesTo(std::list <EvolutionChainLink> evolves_to);

private:
	bool is_baby;
	PokemonSpeciesSummary species;
	std::list <PokemonEvolution>evolution_details;
	std::list <EvolutionChainLink>evolves_to;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EvolutionChainLink_H_ */
