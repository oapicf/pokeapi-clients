
/*
 * MoveMetaStatChange.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveMetaStatChange_H_
#define TINY_CPP_CLIENT_MoveMetaStatChange_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "StatSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveMetaStatChange{
public:

    /*! \brief Constructor.
	 */
    MoveMetaStatChange();
    MoveMetaStatChange(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveMetaStatChange();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The amount of change.
	 */
	int getChange();

	/*! \brief Set The amount of change.
	 */
	void setChange(int change);
	/*! \brief Get The stat being affected.
	 */
	StatSummary getStat();

	/*! \brief Set The stat being affected.
	 */
	void setStat(StatSummary stat);


    private:
    int change{};
    StatSummary stat;
};
}

#endif /* TINY_CPP_CLIENT_MoveMetaStatChange_H_ */
