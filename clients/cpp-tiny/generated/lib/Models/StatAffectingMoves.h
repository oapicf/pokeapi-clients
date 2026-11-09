
/*
 * StatAffectingMoves.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_StatAffectingMoves_H_
#define TINY_CPP_CLIENT_StatAffectingMoves_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveStatChange.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class StatAffectingMoves{
public:

    /*! \brief Constructor.
	 */
    StatAffectingMoves();
    StatAffectingMoves(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~StatAffectingMoves();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of moves and how they change the referenced stat.
	 */
	std::list<MoveStatChange> getIncrease();

	/*! \brief Set A list of moves and how they change the referenced stat.
	 */
	void setIncrease(std::list<MoveStatChange> increase);
	/*! \brief Get A list of moves and how they change the referenced stat.
	 */
	std::list<MoveStatChange> getDecrease();

	/*! \brief Set A list of moves and how they change the referenced stat.
	 */
	void setDecrease(std::list<MoveStatChange> decrease);


    private:
    std::list<MoveStatChange> increase;
    std::list<MoveStatChange> decrease;
};
}

#endif /* TINY_CPP_CLIENT_StatAffectingMoves_H_ */
