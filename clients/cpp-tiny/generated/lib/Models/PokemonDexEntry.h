
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

	/*! \brief Get 
	 */
	int getEntryNumber();

	/*! \brief Set 
	 */
	void setEntryNumber(int entry_number);
	/*! \brief Get 
	 */
	PokedexSummary getPokedex();

	/*! \brief Set 
	 */
	void setPokedex(PokedexSummary pokedex);


    private:
    int entry_number{};
    PokedexSummary pokedex;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDexEntry_H_ */
