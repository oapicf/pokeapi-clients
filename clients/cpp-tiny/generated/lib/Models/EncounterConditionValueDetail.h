
/*
 * EncounterConditionValueDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EncounterConditionValueDetail_H_
#define TINY_CPP_CLIENT_EncounterConditionValueDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EncounterConditionSummary.h"
#include "EncounterConditionValueName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EncounterConditionValueDetail{
public:

    /*! \brief Constructor.
	 */
    EncounterConditionValueDetail();
    EncounterConditionValueDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EncounterConditionValueDetail();


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
	/*! \brief Get The condition this encounter condition value pertains to.
	 */
	EncounterConditionSummary getCondition();

	/*! \brief Set The condition this encounter condition value pertains to.
	 */
	void setCondition(EncounterConditionSummary condition);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<EncounterConditionValueName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<EncounterConditionValueName> names);


    private:
    int id{};
    std::string name{};
    EncounterConditionSummary condition;
    std::list<EncounterConditionValueName> names;
};
}

#endif /* TINY_CPP_CLIENT_EncounterConditionValueDetail_H_ */
