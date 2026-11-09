
/*
 * VersionDetail.h
 *
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
 */

#ifndef TINY_CPP_CLIENT_VersionDetail_H_
#define TINY_CPP_CLIENT_VersionDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "VersionGroupSummary.h"
#include "VersionName.h"
#include <list>

namespace Tiny {


/*! \brief Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
 *
 *  \ingroup Models
 *
 */

class VersionDetail{
public:

    /*! \brief Constructor.
	 */
    VersionDetail();
    VersionDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VersionDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<VersionName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<VersionName> names);
	/*! \brief Get The version group this version belongs to.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group this version belongs to.
	 */
	void setVersionGroup(VersionGroupSummary version_group);


    private:
    int id{};
    std::string name{};
    std::list<VersionName> names;
    VersionGroupSummary version_group;
};
}

#endif /* TINY_CPP_CLIENT_VersionDetail_H_ */
