/*
 * EncounterMethodDetail.h
 *
 * 
 */

#ifndef _EncounterMethodDetail_H_
#define _EncounterMethodDetail_H_


#include <string>
#include "EncounterMethodName.h"
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

class EncounterMethodDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	EncounterMethodDetail();
	EncounterMethodDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EncounterMethodDetail();

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
	/*! \brief Get A good value for sorting.
	 */
	int getOrder();

	/*! \brief Set A good value for sorting.
	 */
	void setOrder(int  order);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<EncounterMethodName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <EncounterMethodName> names);

private:
	int id;
	std::string name;
	int order;
	std::list <EncounterMethodName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EncounterMethodDetail_H_ */
