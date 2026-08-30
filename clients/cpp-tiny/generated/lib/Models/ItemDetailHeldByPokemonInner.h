
/*
 * ItemDetail_held_by_pokemon_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemDetail_held_by_pokemon_inner_H_
#define TINY_CPP_CLIENT_ItemDetail_held_by_pokemon_inner_H_


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

class ItemDetail_held_by_pokemon_inner{
public:

    /*! \brief Constructor.
	 */
    ItemDetail_held_by_pokemon_inner();
    ItemDetail_held_by_pokemon_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemDetail_held_by_pokemon_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemon();

	/*! \brief Set 
	 */
	void setPokemon(AbilityDetail_pokemon_inner_pokemon pokemon);
	/*! \brief Get 
	 */
	std::list<ItemDetail_held_by_pokemon_inner_version_details_inner> getVersiondetails();

	/*! \brief Set 
	 */
	void setVersiondetails(std::list<ItemDetail_held_by_pokemon_inner_version_details_inner> versiondetails);


    private:
    AbilityDetail_pokemon_inner_pokemon pokemon;
    std::list<ItemDetail_held_by_pokemon_inner_version_details_inner> versiondetails;
};
}

#endif /* TINY_CPP_CLIENT_ItemDetail_held_by_pokemon_inner_H_ */
