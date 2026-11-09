/*
 * EncounterConditionDetail.h
 *
 * 
 */

#ifndef _EncounterConditionDetail_H_
#define _EncounterConditionDetail_H_


#include <string>
#include "EncounterConditionName.h"
#include "EncounterConditionValueSummary.h"
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

class EncounterConditionDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	EncounterConditionDetail();
	EncounterConditionDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EncounterConditionDetail();

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
	/*! \brief Get A list of possible values for this encounter condition.
	 */
	std::list<EncounterConditionValueSummary> getValues();

	/*! \brief Set A list of possible values for this encounter condition.
	 */
	void setValues(std::list <EncounterConditionValueSummary> values);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<EncounterConditionName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <EncounterConditionName> names);

private:
	int id;
	std::string name;
	std::list <EncounterConditionValueSummary>values;
	std::list <EncounterConditionName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EncounterConditionDetail_H_ */
