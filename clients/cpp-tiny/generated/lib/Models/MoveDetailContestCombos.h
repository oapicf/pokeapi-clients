
/*
 * MoveDetail_contest_combos.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveDetail_contest_combos_H_
#define TINY_CPP_CLIENT_MoveDetail_contest_combos_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveDetail_contest_combos_normal.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveDetail_contest_combos{
public:

    /*! \brief Constructor.
	 */
    MoveDetail_contest_combos();
    MoveDetail_contest_combos(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveDetail_contest_combos();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	MoveDetail_contest_combos_normal getNormal();

	/*! \brief Set 
	 */
	void setNormal(MoveDetail_contest_combos_normal  normal);
	/*! \brief Get 
	 */
	MoveDetail_contest_combos_normal getSuper();

	/*! \brief Set 
	 */
	void setSuper(MoveDetail_contest_combos_normal  super);


    private:
    MoveDetail_contest_combos_normal normal;
    MoveDetail_contest_combos_normal super;
};
}

#endif /* TINY_CPP_CLIENT_MoveDetail_contest_combos_H_ */
