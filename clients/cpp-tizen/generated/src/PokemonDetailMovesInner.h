/*
 * PokemonDetail_moves_inner.h
 *
 * 
 */

#ifndef _PokemonDetail_moves_inner_H_
#define _PokemonDetail_moves_inner_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "PokemonDetail_moves_inner_version_group_details_inner.h"
#include <list>
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

class PokemonDetail_moves_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonDetail_moves_inner();
	PokemonDetail_moves_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonDetail_moves_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getMove();

	/*! \brief Set 
	 */
	void setMove(AbilityDetail_pokemon_inner_pokemon  move);
	/*! \brief Get 
	 */
	std::list<PokemonDetail_moves_inner_version_group_details_inner> getVersionGroupDetails();

	/*! \brief Set 
	 */
	void setVersionGroupDetails(std::list <PokemonDetail_moves_inner_version_group_details_inner> version_group_details);

private:
	AbilityDetail_pokemon_inner_pokemon move;
	std::list <PokemonDetail_moves_inner_version_group_details_inner>version_group_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonDetail_moves_inner_H_ */
