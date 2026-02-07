/*
 * VersionDetail.h
 *
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
 */

#ifndef _VersionDetail_H_
#define _VersionDetail_H_


#include <string>
#include "VersionGroupSummary.h"
#include "VersionName.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
 *
 *  \ingroup Models
 *
 */

class VersionDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	VersionDetail();
	VersionDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VersionDetail();

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
	std::list<VersionName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <VersionName> names);
	/*! \brief Get 
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(VersionGroupSummary  version_group);

private:
	int id;
	std::string name;
	std::list <VersionName>names;
	VersionGroupSummary version_group;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VersionDetail_H_ */
