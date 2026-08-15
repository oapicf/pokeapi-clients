
/*
 * TypeDetail_pokemon_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TypeDetail_pokemon_inner_H_
#define TINY_CPP_CLIENT_TypeDetail_pokemon_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TypeDetail_pokemon_inner_pokemon.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TypeDetail_pokemon_inner{
public:

    /*! \brief Constructor.
	 */
    TypeDetail_pokemon_inner();
    TypeDetail_pokemon_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TypeDetail_pokemon_inner();


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
	TypeDetail_pokemon_inner_pokemon getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(TypeDetail_pokemon_inner_pokemon  pokemon);


    private:
    int slot{};
    TypeDetail_pokemon_inner_pokemon pokemon;
};
}

#endif /* TINY_CPP_CLIENT_TypeDetail_pokemon_inner_H_ */
