
/*
 * StatDetail_affecting_moves.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_StatDetail_affecting_moves_H_
#define TINY_CPP_CLIENT_StatDetail_affecting_moves_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "StatDetail_affecting_moves_increase_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class StatDetail_affecting_moves{
public:

    /*! \brief Constructor.
	 */
    StatDetail_affecting_moves();
    StatDetail_affecting_moves(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~StatDetail_affecting_moves();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<StatDetail_affecting_moves_increase_inner> getIncrease();

	/*! \brief Set 
	 */
	void setIncrease(std::list <StatDetail_affecting_moves_increase_inner> increase);
	/*! \brief Get 
	 */
	std::list<StatDetail_affecting_moves_increase_inner> getDecrease();

	/*! \brief Set 
	 */
	void setDecrease(std::list <StatDetail_affecting_moves_increase_inner> decrease);


    private:
    std::list<StatDetail_affecting_moves_increase_inner> increase;
    std::list<StatDetail_affecting_moves_increase_inner> decrease;
};
}

#endif /* TINY_CPP_CLIENT_StatDetail_affecting_moves_H_ */
