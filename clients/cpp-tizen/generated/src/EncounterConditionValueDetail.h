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
	EncounterConditionSummary getCondition();

	/*! \brief Set 
	 */
	void setCondition(EncounterConditionSummary  condition);
	/*! \brief Get 
	 */
	std::list<EncounterConditionValueName> getNames();

	/*! \brief Set 
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
