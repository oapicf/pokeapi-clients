
/*
 * AbilityDetail_pokemon_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AbilityDetail_pokemon_inner_H_
#define TINY_CPP_CLIENT_AbilityDetail_pokemon_inner_H_


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

class AbilityDetail_pokemon_inner{
public:

    /*! \brief Constructor.
	 */
    AbilityDetail_pokemon_inner();
    AbilityDetail_pokemon_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AbilityDetail_pokemon_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isIsHidden();

	/*! \brief Set 
	 */
	void setIsHidden(bool  is_hidden);
	/*! \brief Get 
	 */
	int getSlot();

	/*! \brief Set 
	 */
	void setSlot(int  slot);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(AbilityDetail_pokemon_inner_pokemon  pokemon);


    private:
    bool is_hidden{};
    int slot{};
    AbilityDetail_pokemon_inner_pokemon pokemon;
};
}

#endif /* TINY_CPP_CLIENT_AbilityDetail_pokemon_inner_H_ */
