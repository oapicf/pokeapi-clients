
/*
 * EvolutionTriggerDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EvolutionTriggerDetail_H_
#define TINY_CPP_CLIENT_EvolutionTriggerDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "EvolutionTriggerName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EvolutionTriggerDetail{
public:

    /*! \brief Constructor.
	 */
    EvolutionTriggerDetail();
    EvolutionTriggerDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EvolutionTriggerDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::list<EvolutionTriggerName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<EvolutionTriggerName> names);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(std::list<AbilityDetail_pokemon_inner_pokemon> pokemon_species);


    private:
    int id{};
    std::string name{};
    std::list<EvolutionTriggerName> names;
    std::list<AbilityDetail_pokemon_inner_pokemon> pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_EvolutionTriggerDetail_H_ */
