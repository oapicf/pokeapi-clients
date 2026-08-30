
/*
 * PokemonDetail_abilities_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDetail_abilities_inner_H_
#define TINY_CPP_CLIENT_PokemonDetail_abilities_inner_H_


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

class PokemonDetail_abilities_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonDetail_abilities_inner();
    PokemonDetail_abilities_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDetail_abilities_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getAbility();

	/*! \brief Set 
	 */
	void setAbility(AbilityDetail_pokemon_inner_pokemon ability);
	/*! \brief Get 
	 */
	bool isIsHidden();

	/*! \brief Set 
	 */
	void setIsHidden(bool is_hidden);
	/*! \brief Get 
	 */
	int getSlot();

	/*! \brief Set 
	 */
	void setSlot(int slot);


    private:
    AbilityDetail_pokemon_inner_pokemon ability;
    bool is_hidden{};
    int slot{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_abilities_inner_H_ */
