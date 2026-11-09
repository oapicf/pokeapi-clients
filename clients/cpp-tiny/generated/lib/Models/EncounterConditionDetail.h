
/*
 * EncounterConditionDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EncounterConditionDetail_H_
#define TINY_CPP_CLIENT_EncounterConditionDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EncounterConditionName.h"
#include "EncounterConditionValueSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EncounterConditionDetail{
public:

    /*! \brief Constructor.
	 */
    EncounterConditionDetail();
    EncounterConditionDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EncounterConditionDetail();


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
	/*! \brief Get A list of possible values for this encounter condition.
	 */
	std::list<EncounterConditionValueSummary> getValues();

	/*! \brief Set A list of possible values for this encounter condition.
	 */
	void setValues(std::list<EncounterConditionValueSummary> values);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<EncounterConditionName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<EncounterConditionName> names);


    private:
    int id{};
    std::string name{};
    std::list<EncounterConditionValueSummary> values;
    std::list<EncounterConditionName> names;
};
}

#endif /* TINY_CPP_CLIENT_EncounterConditionDetail_H_ */
