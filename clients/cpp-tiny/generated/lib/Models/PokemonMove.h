
/*
 * PokemonMove.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonMove_H_
#define TINY_CPP_CLIENT_PokemonMove_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveSummary.h"
#include "PokemonMoveVersionGroup.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonMove{
public:

    /*! \brief Constructor.
	 */
    PokemonMove();
    PokemonMove(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonMove();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The move the Pokémon can learn.
	 */
	MoveSummary getMove();

	/*! \brief Set The move the Pokémon can learn.
	 */
	void setMove(MoveSummary move);
	/*! \brief Get The details of the version in which the Pokémon can learn the move.
	 */
	std::list<PokemonMoveVersionGroup> getVersionGroupDetails();

	/*! \brief Set The details of the version in which the Pokémon can learn the move.
	 */
	void setVersionGroupDetails(std::list<PokemonMoveVersionGroup> version_group_details);


    private:
    MoveSummary move;
    std::list<PokemonMoveVersionGroup> version_group_details;
};
}

#endif /* TINY_CPP_CLIENT_PokemonMove_H_ */
