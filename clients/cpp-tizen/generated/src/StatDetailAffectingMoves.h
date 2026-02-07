/*
 * StatDetail_affecting_moves.h
 *
 * 
 */

#ifndef _StatDetail_affecting_moves_H_
#define _StatDetail_affecting_moves_H_


#include <string>
#include "StatDetail_affecting_moves_increase_inner.h"
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

class StatDetail_affecting_moves : public Object {
public:
	/*! \brief Constructor.
	 */
	StatDetail_affecting_moves();
	StatDetail_affecting_moves(char* str);

	/*! \brief Destructor.
	 */
	virtual ~StatDetail_affecting_moves();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::list <StatDetail_affecting_moves_increase_inner>increase;
	std::list <StatDetail_affecting_moves_increase_inner>decrease;
	void __init();
	void __cleanup();

};
}
}

#endif /* _StatDetail_affecting_moves_H_ */
