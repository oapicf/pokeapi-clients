/*
 * MoveLearnMethodDetail.h
 *
 * 
 */

#ifndef _MoveLearnMethodDetail_H_
#define _MoveLearnMethodDetail_H_


#include <string>
#include "MoveLearnMethodDescription.h"
#include "MoveLearnMethodName.h"
#include "VersionGroupSummary.h"
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

class MoveLearnMethodDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveLearnMethodDetail();
	MoveLearnMethodDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveLearnMethodDetail();

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
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<MoveLearnMethodName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <MoveLearnMethodName> names);
	/*! \brief Get The description of this resource listed in different languages.
	 */
	std::list<MoveLearnMethodDescription> getDescriptions();

	/*! \brief Set The description of this resource listed in different languages.
	 */
	void setDescriptions(std::list <MoveLearnMethodDescription> descriptions);
	/*! \brief Get A list of version groups where moves can be learned through this method.
	 */
	std::list<VersionGroupSummary> getVersionGroups();

	/*! \brief Set A list of version groups where moves can be learned through this method.
	 */
	void setVersionGroups(std::list <VersionGroupSummary> version_groups);

private:
	int id;
	std::string name;
	std::list <MoveLearnMethodName>names;
	std::list <MoveLearnMethodDescription>descriptions;
	std::list <VersionGroupSummary>version_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveLearnMethodDetail_H_ */
