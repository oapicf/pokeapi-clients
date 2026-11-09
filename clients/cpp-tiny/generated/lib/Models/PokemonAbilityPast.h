
/*
 * PokemonAbilityPast.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonAbilityPast_H_
#define TINY_CPP_CLIENT_PokemonAbilityPast_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilitySummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonAbilityPast{
public:

    /*! \brief Constructor.
	 */
    PokemonAbilityPast();
    PokemonAbilityPast(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonAbilityPast();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Whether or not this is a hidden ability.
	 */
	bool isIsHidden();

	/*! \brief Set Whether or not this is a hidden ability.
	 */
	void setIsHidden(bool is_hidden);
	/*! \brief Get The slot this ability occupies in this Pokémon species.
	 */
	int getSlot();

	/*! \brief Set The slot this ability occupies in this Pokémon species.
	 */
	void setSlot(int slot);
	/*! \brief Get The ability the Pokémon may have.
	 */
	AbilitySummary getAbility();

	/*! \brief Set The ability the Pokémon may have.
	 */
	void setAbility(AbilitySummary ability);


    private:
    bool is_hidden{};
    int slot{};
    AbilitySummary ability;
};
}

#endif /* TINY_CPP_CLIENT_PokemonAbilityPast_H_ */
