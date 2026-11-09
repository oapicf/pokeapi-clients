
/*
 * MoveCombos.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveCombos_H_
#define TINY_CPP_CLIENT_MoveCombos_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveComboUsage.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveCombos{
public:

    /*! \brief Constructor.
	 */
    MoveCombos();
    MoveCombos(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveCombos();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A detail of moves this move can be used before or after, granting additional appeal points in contests.
	 */
	MoveComboUsage getNormal();

	/*! \brief Set A detail of moves this move can be used before or after, granting additional appeal points in contests.
	 */
	void setNormal(MoveComboUsage normal);
	/*! \brief Get A detail of moves this move can be used before or after, granting additional appeal points in super contests.
	 */
	MoveComboUsage getSuper();

	/*! \brief Set A detail of moves this move can be used before or after, granting additional appeal points in super contests.
	 */
	void setSuper(MoveComboUsage super);


    private:
    MoveComboUsage normal;
    MoveComboUsage super;
};
}

#endif /* TINY_CPP_CLIENT_MoveCombos_H_ */
