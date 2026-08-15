
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
	std::list<EncounterConditionValueSummary> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <EncounterConditionValueSummary> values);
	/*! \brief Get 
	 */
	std::list<EncounterConditionName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <EncounterConditionName> names);


    private:
    int id{};
    std::string name{};
    std::list<EncounterConditionValueSummary> values;
    std::list<EncounterConditionName> names;
};
}

#endif /* TINY_CPP_CLIENT_EncounterConditionDetail_H_ */
