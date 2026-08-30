
/*
 * PalParkAreaDetail_pokemon_encounters_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PalParkAreaDetail_pokemon_encounters_inner_H_
#define TINY_CPP_CLIENT_PalParkAreaDetail_pokemon_encounters_inner_H_


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

class PalParkAreaDetail_pokemon_encounters_inner{
public:

    /*! \brief Constructor.
	 */
    PalParkAreaDetail_pokemon_encounters_inner();
    PalParkAreaDetail_pokemon_encounters_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PalParkAreaDetail_pokemon_encounters_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getBaseScore();

	/*! \brief Set 
	 */
	void setBaseScore(int base_score);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getPokemonspecies();

	/*! \brief Set 
	 */
	void setPokemonspecies(AbilityDetail_pokemon_inner_pokemon pokemonspecies);
	/*! \brief Get 
	 */
	int getRate();

	/*! \brief Set 
	 */
	void setRate(int rate);


    private:
    int base_score{};
    AbilityDetail_pokemon_inner_pokemon pokemonspecies;
    int rate{};
};
}

#endif /* TINY_CPP_CLIENT_PalParkAreaDetail_pokemon_encounters_inner_H_ */
