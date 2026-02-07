/*
 * PokemonDetail_moves_inner_version_group_details_inner.h
 *
 * 
 */

#ifndef _PokemonDetail_moves_inner_version_group_details_inner_H_
#define _PokemonDetail_moves_inner_version_group_details_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonDetail_moves_inner_version_group_details_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonDetail_moves_inner_version_group_details_inner();
	PokemonDetail_moves_inner_version_group_details_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonDetail_moves_inner_version_group_details_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getLevelLearnedAt();

	/*! \brief Set 
	 */
	void setLevelLearnedAt(int  level_learned_at);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getMoveLearnMethod();

	/*! \brief Set 
	 */
	void setMoveLearnMethod(AbilityDetail_pokemon_inner_pokemon  move_learn_method);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(AbilityDetail_pokemon_inner_pokemon  version_group);

private:
	int level_learned_at;
	AbilityDetail_pokemon_inner_pokemon move_learn_method;
	AbilityDetail_pokemon_inner_pokemon version_group;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonDetail_moves_inner_version_group_details_inner_H_ */
