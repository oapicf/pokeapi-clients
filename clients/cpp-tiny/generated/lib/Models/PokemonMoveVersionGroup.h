
/*
 * PokemonMoveVersionGroup.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonMoveVersionGroup_H_
#define TINY_CPP_CLIENT_PokemonMoveVersionGroup_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveLearnMethodSummary.h"
#include "VersionGroupSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonMoveVersionGroup{
public:

    /*! \brief Constructor.
	 */
    PokemonMoveVersionGroup();
    PokemonMoveVersionGroup(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonMoveVersionGroup();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The minimum level to learn the move.
	 */
	int getLevelLearnedAt();

	/*! \brief Set The minimum level to learn the move.
	 */
	void setLevelLearnedAt(int level_learned_at);
	/*! \brief Get The method by which the move is learned.
	 */
	MoveLearnMethodSummary getMoveLearnMethod();

	/*! \brief Set The method by which the move is learned.
	 */
	void setMoveLearnMethod(MoveLearnMethodSummary move_learn_method);
	/*! \brief Get The version group in which the move is learned.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group in which the move is learned.
	 */
	void setVersionGroup(VersionGroupSummary version_group);
	/*! \brief Get Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
	 */
	int getOrder();

	/*! \brief Set Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
	 */
	void setOrder(int order);


    private:
    int level_learned_at{};
    MoveLearnMethodSummary move_learn_method;
    VersionGroupSummary version_group;
    int order{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonMoveVersionGroup_H_ */
