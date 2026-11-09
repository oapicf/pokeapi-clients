
/*
 * PokemonDexNumber.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDexNumber_H_
#define TINY_CPP_CLIENT_PokemonDexNumber_H_


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

class PokemonDexNumber{
public:

    /*! \brief Constructor.
	 */
    PokemonDexNumber();
    PokemonDexNumber(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDexNumber();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of this Pokémon species entry within the Pokédex.
	 */
	int getEntryNumber();

	/*! \brief Set The index of this Pokémon species entry within the Pokédex.
	 */
	void setEntryNumber(int entry_number);
	/*! \brief Get The Pokémon species being encountered.
	 */
	PokemonSpeciesSummary getPokemonSpecies();

	/*! \brief Set The Pokémon species being encountered.
	 */
	void setPokemonSpecies(PokemonSpeciesSummary pokemon_species);


    private:
    int entry_number{};
    PokemonSpeciesSummary pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDexNumber_H_ */
