/*
 * MoveBattleStyleDetail.h
 *
 * 
 */

#ifndef _MoveBattleStyleDetail_H_
#define _MoveBattleStyleDetail_H_


#include <string>
#include "MoveBattleStyleName.h"
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

class MoveBattleStyleDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveBattleStyleDetail();
	MoveBattleStyleDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveBattleStyleDetail();

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
	std::list<MoveBattleStyleName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <MoveBattleStyleName> names);

private:
	int id;
	std::string name;
	std::list <MoveBattleStyleName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveBattleStyleDetail_H_ */
