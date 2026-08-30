
/*
 * PokemonDetail_moves_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDetail_moves_inner_H_
#define TINY_CPP_CLIENT_PokemonDetail_moves_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "PokemonDetail_moves_inner_version_group_details_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonDetail_moves_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonDetail_moves_inner();
    PokemonDetail_moves_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDetail_moves_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getMove();

	/*! \brief Set 
	 */
	void setMove(AbilityDetail_pokemon_inner_pokemon move);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_moves_inner_version_group_details_inner> getVersionGroupDetails();

	/*! \brief Set 
	 */
	void setVersionGroupDetails(std::list<PokemonDetail_moves_inner_version_group_details_inner> version_group_details);


    private:
    AbilityDetail_pokemon_inner_pokemon move;
    std::list<PokemonDetail_moves_inner_version_group_details_inner> version_group_details;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_moves_inner_H_ */
