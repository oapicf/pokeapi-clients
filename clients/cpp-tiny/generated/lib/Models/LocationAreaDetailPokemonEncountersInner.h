
/*
 * LocationAreaDetail_pokemon_encounters_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationAreaDetail_pokemon_encounters_inner_H_
#define TINY_CPP_CLIENT_LocationAreaDetail_pokemon_encounters_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "LocationAreaDetail_pokemon_encounters_inner_version_details_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaDetail_pokemon_encounters_inner{
public:

    /*! \brief Constructor.
	 */
    LocationAreaDetail_pokemon_encounters_inner();
    LocationAreaDetail_pokemon_encounters_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationAreaDetail_pokemon_encounters_inner();


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
	std::list<LocationAreaDetail_pokemon_encounters_inner_version_details_inner> getVersionDetails();

	/*! \brief Set 
	 */
	void setVersionDetails(std::list<LocationAreaDetail_pokemon_encounters_inner_version_details_inner> version_details);


    private:
    AbilityDetail_pokemon_inner_pokemon pokemon;
    std::list<LocationAreaDetail_pokemon_encounters_inner_version_details_inner> version_details;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaDetail_pokemon_encounters_inner_H_ */
