
/*
 * PokemonDexEntry.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDexEntry_H_
#define TINY_CPP_CLIENT_PokemonDexEntry_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokedexSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonDexEntry{
public:

    /*! \brief Constructor.
	 */
    PokemonDexEntry();
    PokemonDexEntry(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDexEntry();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index number within the Pokédex.
	 */
	int getEntryNumber();

	/*! \brief Set The index number within the Pokédex.
	 */
	void setEntryNumber(int entry_number);
	/*! \brief Get The Pokédex the referenced Pokémon species can be found in.
	 */
	PokedexSummary getPokedex();

	/*! \brief Set The Pokédex the referenced Pokémon species can be found in.
	 */
	void setPokedex(PokedexSummary pokedex);


    private:
    int entry_number{};
    PokedexSummary pokedex;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDexEntry_H_ */
