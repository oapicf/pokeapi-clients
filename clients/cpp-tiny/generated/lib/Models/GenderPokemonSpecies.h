
/*
 * GenderPokemonSpecies.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GenderPokemonSpecies_H_
#define TINY_CPP_CLIENT_GenderPokemonSpecies_H_


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

class GenderPokemonSpecies{
public:

    /*! \brief Constructor.
	 */
    GenderPokemonSpecies();
    GenderPokemonSpecies(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenderPokemonSpecies();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The chance of this Pokémon being female, in eighths; or -1 for genderless.
	 */
	int getRate();

	/*! \brief Set The chance of this Pokémon being female, in eighths; or -1 for genderless.
	 */
	void setRate(int rate);
	/*! \brief Get A Pokémon species that can be the referenced gender.
	 */
	PokemonSpeciesSummary getPokemonSpecies();

	/*! \brief Set A Pokémon species that can be the referenced gender.
	 */
	void setPokemonSpecies(PokemonSpeciesSummary pokemon_species);


    private:
    int rate{};
    PokemonSpeciesSummary pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_GenderPokemonSpecies_H_ */
