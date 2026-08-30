
/*
 * EvolutionChainDetail_chain.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EvolutionChainDetail_chain_H_
#define TINY_CPP_CLIENT_EvolutionChainDetail_chain_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "AnyType.h"
#include "EvolutionChainDetail_chain_evolves_to_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EvolutionChainDetail_chain{
public:

    /*! \brief Constructor.
	 */
    EvolutionChainDetail_chain();
    EvolutionChainDetail_chain(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EvolutionChainDetail_chain();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AnyType> getEvolutionDetails();

	/*! \brief Set 
	 */
	void setEvolutionDetails(std::list<AnyType> evolution_details);
	/*! \brief Get 
	 */
	std::list<EvolutionChainDetail_chain_evolves_to_inner> getEvolvesTo();

	/*! \brief Set 
	 */
	void setEvolvesTo(std::list<EvolutionChainDetail_chain_evolves_to_inner> evolves_to);
	/*! \brief Get 
	 */
	bool isIsBaby();

	/*! \brief Set 
	 */
	void setIsBaby(bool is_baby);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getSpecies();

	/*! \brief Set 
	 */
	void setSpecies(AbilityDetail_pokemon_inner_pokemon species);


    private:
    std::list<AnyType> evolution_details;
    std::list<EvolutionChainDetail_chain_evolves_to_inner> evolves_to;
    bool is_baby{};
    AbilityDetail_pokemon_inner_pokemon species;
};
}

#endif /* TINY_CPP_CLIENT_EvolutionChainDetail_chain_H_ */
