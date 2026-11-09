
/*
 * MoveComboUsage.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveComboUsage_H_
#define TINY_CPP_CLIENT_MoveComboUsage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveComboUsage{
public:

    /*! \brief Constructor.
	 */
    MoveComboUsage();
    MoveComboUsage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveComboUsage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of moves to use before this move.
	 */
	std::list<MoveSummary> getUseBefore();

	/*! \brief Set A list of moves to use before this move.
	 */
	void setUseBefore(std::list<MoveSummary> use_before);
	/*! \brief Get A list of moves to use after this move.
	 */
	std::list<MoveSummary> getUseAfter();

	/*! \brief Set A list of moves to use after this move.
	 */
	void setUseAfter(std::list<MoveSummary> use_after);


    private:
    std::list<MoveSummary> use_before;
    std::list<MoveSummary> use_after;
};
}

#endif /* TINY_CPP_CLIENT_MoveComboUsage_H_ */
