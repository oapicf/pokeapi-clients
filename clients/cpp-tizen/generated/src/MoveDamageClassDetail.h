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

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get The description of this resource listed in different languages.
	 */
	std::list<MoveDamageClassDescription> getDescriptions();

	/*! \brief Set The description of this resource listed in different languages.
	 */
	void setDescriptions(std::list <MoveDamageClassDescription> descriptions);
	/*! \brief Get A list of moves that fall into this damage class.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that fall into this damage class.
	 */
	void setMoves(std::list <MoveSummary> moves);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<MoveDamageClassName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
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
