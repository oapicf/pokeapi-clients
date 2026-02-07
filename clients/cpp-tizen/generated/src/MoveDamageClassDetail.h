/*
 * MoveDamageClassDetail.h
 *
 * 
 */

#ifndef _MoveDamageClassDetail_H_
#define _MoveDamageClassDetail_H_


#include <string>
#include "MoveDamageClassDescription.h"
#include "MoveDamageClassName.h"
#include "MoveSummary.h"
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

class MoveDamageClassDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveDamageClassDetail();
	MoveDamageClassDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveDamageClassDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<MoveDamageClassDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <MoveDamageClassDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list <MoveSummary> moves);
	/*! \brief Get 
	 */
	std::list<MoveDamageClassName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <MoveDamageClassName> names);

private:
	int id;
	std::string name;
	std::list <MoveDamageClassDescription>descriptions;
	std::list <MoveSummary>moves;
	std::list <MoveDamageClassName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveDamageClassDetail_H_ */
