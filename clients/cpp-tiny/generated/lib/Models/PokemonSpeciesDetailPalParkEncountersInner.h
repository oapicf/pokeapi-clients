
/*
 * PokemonSpeciesDetail_pal_park_encounters_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpeciesDetail_pal_park_encounters_inner_H_
#define TINY_CPP_CLIENT_PokemonSpeciesDetail_pal_park_encounters_inner_H_


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

class PokemonSpeciesDetail_pal_park_encounters_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonSpeciesDetail_pal_park_encounters_inner();
    PokemonSpeciesDetail_pal_park_encounters_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpeciesDetail_pal_park_encounters_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getArea();

	/*! \brief Set 
	 */
	void setArea(AbilityDetail_pokemon_inner_pokemon area);
	/*! \brief Get 
	 */
	int getBaseScore();

	/*! \brief Set 
	 */
	void setBaseScore(int base_score);
	/*! \brief Get 
	 */
	int getRate();

	/*! \brief Set 
	 */
	void setRate(int rate);


    private:
    AbilityDetail_pokemon_inner_pokemon area;
    int base_score{};
    int rate{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpeciesDetail_pal_park_encounters_inner_H_ */
