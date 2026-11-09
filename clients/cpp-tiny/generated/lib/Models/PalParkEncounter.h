
/*
 * PalParkEncounter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PalParkEncounter_H_
#define TINY_CPP_CLIENT_PalParkEncounter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonSpeciesSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PalParkEncounter{
public:

    /*! \brief Constructor.
	 */
    PalParkEncounter();
    PalParkEncounter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PalParkEncounter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The base score given to the player when this Pokémon is caught during a pal park run.
	 */
	int getBaseScore();

	/*! \brief Set The base score given to the player when this Pokémon is caught during a pal park run.
	 */
	void setBaseScore(int base_score);
	/*! \brief Get The base rate for encountering this Pokémon in this pal park area.
	 */
	int getRate();

	/*! \brief Set The base rate for encountering this Pokémon in this pal park area.
	 */
	void setRate(int rate);
	/*! \brief Get The Pokémon species being encountered.
	 */
	PokemonSpeciesSummary getPokemonSpecies();

	/*! \brief Set The Pokémon species being encountered.
	 */
	void setPokemonSpecies(PokemonSpeciesSummary pokemon_species);


    private:
    int base_score{};
    int rate{};
    PokemonSpeciesSummary pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_PalParkEncounter_H_ */
