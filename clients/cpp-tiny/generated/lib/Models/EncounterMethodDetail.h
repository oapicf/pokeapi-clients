
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
	int getOrder();

	/*! \brief Set 
	 */
	void setOrder(int order);
	/*! \brief Get 
	 */
	std::list<EncounterMethodName> getNames();

	/*! \brief Set 
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
