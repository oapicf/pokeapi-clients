
/*
 * TypePokemon.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TypePokemon_H_
#define TINY_CPP_CLIENT_TypePokemon_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TypePokemon{
public:

    /*! \brief Constructor.
	 */
    TypePokemon();
    TypePokemon(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TypePokemon();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The order the Pokémon's types are listed in.
	 */
	int getSlot();

	/*! \brief Set The order the Pokémon's types are listed in.
	 */
	void setSlot(int slot);
	/*! \brief Get The Pokémon that has the referenced type.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon that has the referenced type.
	 */
	void setPokemon(PokemonSummary pokemon);


    private:
    int slot{};
    PokemonSummary pokemon;
};
}

#endif /* TINY_CPP_CLIENT_TypePokemon_H_ */
