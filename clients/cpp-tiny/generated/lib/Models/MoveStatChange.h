
/*
 * MoveStatChange.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveStatChange_H_
#define TINY_CPP_CLIENT_MoveStatChange_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveStatChange{
public:

    /*! \brief Constructor.
	 */
    MoveStatChange();
    MoveStatChange(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveStatChange();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The maximum amount of change to the referenced stat.
	 */
	int getChange();

	/*! \brief Set The maximum amount of change to the referenced stat.
	 */
	void setChange(int change);
	/*! \brief Get The move causing the change.
	 */
	MoveSummary getMove();

	/*! \brief Set The move causing the change.
	 */
	void setMove(MoveSummary move);


    private:
    int change{};
    MoveSummary move;
};
}

#endif /* TINY_CPP_CLIENT_MoveStatChange_H_ */
