
/*
 * AbilityPokemonDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AbilityPokemonDetail_H_
#define TINY_CPP_CLIENT_AbilityPokemonDetail_H_


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

class AbilityPokemonDetail{
public:

    /*! \brief Constructor.
	 */
    AbilityPokemonDetail();
    AbilityPokemonDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AbilityPokemonDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Whether or not this a hidden ability for the referenced Pokémon.
	 */
	bool isIsHidden();

	/*! \brief Set Whether or not this a hidden ability for the referenced Pokémon.
	 */
	void setIsHidden(bool is_hidden);
	/*! \brief Get Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
	 */
	int getSlot();

	/*! \brief Set Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
	 */
	void setSlot(int slot);
	/*! \brief Get The Pokémon this ability could belong to.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon this ability could belong to.
	 */
	void setPokemon(PokemonSummary pokemon);


    private:
    bool is_hidden{};
    int slot{};
    PokemonSummary pokemon;
};
}

#endif /* TINY_CPP_CLIENT_AbilityPokemonDetail_H_ */
