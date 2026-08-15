
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
    int id{};
    std::string name{};
    EncounterConditionSummary condition;
    std::list<EncounterConditionValueName> names;
};
}

#endif /* TINY_CPP_CLIENT_EncounterConditionValueDetail_H_ */
