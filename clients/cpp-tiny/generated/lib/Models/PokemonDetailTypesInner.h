
/*
 * PokemonDetail_types_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDetail_types_inner_H_
#define TINY_CPP_CLIENT_PokemonDetail_types_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonDetail_types_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonDetail_types_inner();
    PokemonDetail_types_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDetail_types_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getSlot();

	/*! \brief Set 
	 */
	void setSlot(int  slot);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getType();

	/*! \brief Set 
	 */
	void setType(AbilityDetail_pokemon_inner_pokemon  type);


    private:
    int slot{};
    AbilityDetail_pokemon_inner_pokemon type;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_types_inner_H_ */
