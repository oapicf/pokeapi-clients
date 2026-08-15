
/*
 * PokemonSpeciesDetail_varieties_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpeciesDetail_varieties_inner_H_
#define TINY_CPP_CLIENT_PokemonSpeciesDetail_varieties_inner_H_


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

class PokemonSpeciesDetail_varieties_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonSpeciesDetail_varieties_inner();
    PokemonSpeciesDetail_varieties_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpeciesDetail_varieties_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isIsDefault();

	/*! \brief Set 
	 */
	void setIsDefault(bool  is_default);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(AbilityDetail_pokemon_inner_pokemon  pokemon);


    private:
    bool is_default{};
    AbilityDetail_pokemon_inner_pokemon pokemon;
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpeciesDetail_varieties_inner_H_ */
