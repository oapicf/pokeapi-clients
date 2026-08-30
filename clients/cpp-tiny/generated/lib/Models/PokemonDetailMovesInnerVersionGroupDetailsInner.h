
/*
 * PokemonDetail_moves_inner_version_group_details_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonDetail_moves_inner_version_group_details_inner_H_
#define TINY_CPP_CLIENT_PokemonDetail_moves_inner_version_group_details_inner_H_


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

class PokemonDetail_moves_inner_version_group_details_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonDetail_moves_inner_version_group_details_inner();
    PokemonDetail_moves_inner_version_group_details_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonDetail_moves_inner_version_group_details_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getLevelLearnedAt();

	/*! \brief Set 
	 */
	void setLevelLearnedAt(int level_learned_at);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getMoveLearnMethod();

	/*! \brief Set 
	 */
	void setMoveLearnMethod(AbilityDetail_pokemon_inner_pokemon move_learn_method);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(AbilityDetail_pokemon_inner_pokemon version_group);


    private:
    int level_learned_at{};
    AbilityDetail_pokemon_inner_pokemon move_learn_method;
    AbilityDetail_pokemon_inner_pokemon version_group;
};
}

#endif /* TINY_CPP_CLIENT_PokemonDetail_moves_inner_version_group_details_inner_H_ */
