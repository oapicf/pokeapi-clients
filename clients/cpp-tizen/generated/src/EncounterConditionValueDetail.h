/*
 * EncounterConditionValueDetail.h
 *
 * 
 */

#ifndef _EncounterConditionValueDetail_H_
#define _EncounterConditionValueDetail_H_


#include <string>
#include "EncounterConditionSummary.h"
#include "EncounterConditionValueName.h"
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

class EncounterConditionValueDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	EncounterConditionValueDetail();
	EncounterConditionValueDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EncounterConditionValueDetail();

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
	/*! \brief Get The condition this encounter condition value pertains to.
	 */
	EncounterConditionSummary getCondition();

	/*! \brief Set The condition this encounter condition value pertains to.
	 */
	void setCondition(EncounterConditionSummary  condition);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<EncounterConditionValueName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <EncounterConditionValueName> names);

private:
	int id;
	std::string name;
	EncounterConditionSummary condition;
	std::list <EncounterConditionValueName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EncounterConditionValueDetail_H_ */
