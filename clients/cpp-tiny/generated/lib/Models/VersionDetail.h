
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::list<VersionName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<VersionName> names);
	/*! \brief Get 
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set 
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
