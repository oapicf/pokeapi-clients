
/*
 * PokedexDetail_pokemon_entries_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokedexDetail_pokemon_entries_inner_H_
#define TINY_CPP_CLIENT_PokedexDetail_pokemon_entries_inner_H_


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

class PokedexDetail_pokemon_entries_inner{
public:

    /*! \brief Constructor.
	 */
    PokedexDetail_pokemon_entries_inner();
    PokedexDetail_pokemon_entries_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokedexDetail_pokemon_entries_inner();


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
	AbilityDetail_pokemon_inner_pokemon getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(AbilityDetail_pokemon_inner_pokemon pokemon_species);


    private:
    int entry_number{};
    AbilityDetail_pokemon_inner_pokemon pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_PokedexDetail_pokemon_entries_inner_H_ */
