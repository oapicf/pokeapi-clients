
/*
 * PokemonDetail_held_items.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDetail_held_items_H_
#define TINY_CPP_CLIENT_PokemonDetail_held_items_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "ItemDetail_held_by_pokemon_inner_version_details_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonDetail_held_items{
public:

    /*! \brief Constructor.
	 */
    PokemonDetail_held_items();
    PokemonDetail_held_items(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDetail_held_items();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getItem();

	/*! \brief Set 
	 */
	void setItem(AbilityDetail_pokemon_inner_pokemon  item);
	/*! \brief Get 
	 */
	std::list<ItemDetail_held_by_pokemon_inner_version_details_inner> getVersionDetails();

	/*! \brief Set 
	 */
	void setVersionDetails(std::list <ItemDetail_held_by_pokemon_inner_version_details_inner> version_details);


    private:
    AbilityDetail_pokemon_inner_pokemon item;
    std::list<ItemDetail_held_by_pokemon_inner_version_details_inner> version_details;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_held_items_H_ */
