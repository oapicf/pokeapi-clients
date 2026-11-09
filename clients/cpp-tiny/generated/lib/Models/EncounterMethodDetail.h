
/*
 * EncounterMethodDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EncounterMethodDetail_H_
#define TINY_CPP_CLIENT_EncounterMethodDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EncounterMethodName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EncounterMethodDetail{
public:

    /*! \brief Constructor.
	 */
    EncounterMethodDetail();
    EncounterMethodDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EncounterMethodDetail();


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
	/*! \brief Get A good value for sorting.
	 */
	int getOrder();

	/*! \brief Set A good value for sorting.
	 */
	void setOrder(int order);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<EncounterMethodName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<EncounterMethodName> names);


    private:
    int id{};
    std::string name{};
    int order{};
    std::list<EncounterMethodName> names;
};
}

#endif /* TINY_CPP_CLIENT_EncounterMethodDetail_H_ */
