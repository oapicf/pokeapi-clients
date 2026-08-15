
/*
 * EvolutionChainDetail_chain_evolves_to_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EvolutionChainDetail_chain_evolves_to_inner_H_
#define TINY_CPP_CLIENT_EvolutionChainDetail_chain_evolves_to_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EvolutionChainDetail_chain_evolves_to_inner{
public:

    /*! \brief Constructor.
	 */
    EvolutionChainDetail_chain_evolves_to_inner();
    EvolutionChainDetail_chain_evolves_to_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EvolutionChainDetail_chain_evolves_to_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner> getEvolutionDetails();

	/*! \brief Set 
	 */
	void setEvolutionDetails(std::list <EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner> evolution_details);
	/*! \brief Get 
	 */
	bool isIsBaby();

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
    std::list<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner> evolution_details;
    bool is_baby{};
    AbilityDetail_pokemon_inner_pokemon species;
};
}

#endif /* TINY_CPP_CLIENT_EvolutionChainDetail_chain_evolves_to_inner_H_ */
