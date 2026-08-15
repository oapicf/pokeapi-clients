
/*
 * GenderDetail_pokemon_species_details_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GenderDetail_pokemon_species_details_inner_H_
#define TINY_CPP_CLIENT_GenderDetail_pokemon_species_details_inner_H_


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

class GenderDetail_pokemon_species_details_inner{
public:

    /*! \brief Constructor.
	 */
    GenderDetail_pokemon_species_details_inner();
    GenderDetail_pokemon_species_details_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenderDetail_pokemon_species_details_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getRate();

	/*! \brief Set 
	 */
	void setRate(int  rate);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(AbilityDetail_pokemon_inner_pokemon  pokemon_species);


    private:
    int rate{};
    AbilityDetail_pokemon_inner_pokemon pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_GenderDetail_pokemon_species_details_inner_H_ */
