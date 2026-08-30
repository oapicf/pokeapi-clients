
/*
 * PokemonDetail_past_types_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDetail_past_types_inner_H_
#define TINY_CPP_CLIENT_PokemonDetail_past_types_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "PokemonDetail_types_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonDetail_past_types_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonDetail_past_types_inner();
    PokemonDetail_past_types_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDetail_past_types_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(AbilityDetail_pokemon_inner_pokemon generation);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_types_inner> getTypes();

	/*! \brief Set 
	 */
	void setTypes(std::list<PokemonDetail_types_inner> types);


    private:
    AbilityDetail_pokemon_inner_pokemon generation;
    std::list<PokemonDetail_types_inner> types;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_past_types_inner_H_ */
