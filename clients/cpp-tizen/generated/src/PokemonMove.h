/*
 * PokemonMove.h
 *
 * 
 */

#ifndef _PokemonMove_H_
#define _PokemonMove_H_


#include <string>
#include "MoveSummary.h"
#include "PokemonMoveVersionGroup.h"
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

class PokemonMove : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonMove();
	PokemonMove(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonMove();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The move the Pokémon can learn.
	 */
	MoveSummary getMove();

	/*! \brief Set The move the Pokémon can learn.
	 */
	void setMove(MoveSummary  move);
	/*! \brief Get The details of the version in which the Pokémon can learn the move.
	 */
	std::list<PokemonMoveVersionGroup> getVersionGroupDetails();

	/*! \brief Set The details of the version in which the Pokémon can learn the move.
	 */
	void setVersionGroupDetails(std::list <PokemonMoveVersionGroup> version_group_details);

private:
	MoveSummary move;
	std::list <PokemonMoveVersionGroup>version_group_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonMove_H_ */
