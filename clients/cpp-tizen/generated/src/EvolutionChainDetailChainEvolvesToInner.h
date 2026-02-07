/*
 * EvolutionChainDetail_chain_evolves_to_inner.h
 *
 * 
 */

#ifndef _EvolutionChainDetail_chain_evolves_to_inner_H_
#define _EvolutionChainDetail_chain_evolves_to_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner.h"
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

class EvolutionChainDetail_chain_evolves_to_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	EvolutionChainDetail_chain_evolves_to_inner();
	EvolutionChainDetail_chain_evolves_to_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EvolutionChainDetail_chain_evolves_to_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner> getEvolutionDetails();

	/*! \brief Set 
	 */
	void setEvolutionDetails(std::list <EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner> evolution_details);
	/*! \brief Get 
	 */
	bool getIsBaby();

	/*! \brief Set 
	 */
	void setIsBaby(bool  is_baby);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getSpecies();

	/*! \brief Set 
	 */
	void setSpecies(AbilityDetail_pokemon_inner_pokemon  species);

private:
	std::list <EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner>evolution_details;
	bool is_baby;
	AbilityDetail_pokemon_inner_pokemon species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EvolutionChainDetail_chain_evolves_to_inner_H_ */
