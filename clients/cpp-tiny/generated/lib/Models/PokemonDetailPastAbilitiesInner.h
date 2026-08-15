
/*
 * PokemonDetail_past_abilities_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDetail_past_abilities_inner_H_
#define TINY_CPP_CLIENT_PokemonDetail_past_abilities_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "PokemonDetail_abilities_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonDetail_past_abilities_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonDetail_past_abilities_inner();
    PokemonDetail_past_abilities_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDetail_past_abilities_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<PokemonDetail_abilities_inner> getAbilities();

	/*! \brief Set 
	 */
	void setAbilities(std::list <PokemonDetail_abilities_inner> abilities);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(AbilityDetail_pokemon_inner_pokemon  generation);


    private:
    std::list<PokemonDetail_abilities_inner> abilities;
    AbilityDetail_pokemon_inner_pokemon generation;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_past_abilities_inner_H_ */
