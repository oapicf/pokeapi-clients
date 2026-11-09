
/*
 * StatAffectingNatures.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_StatAffectingNatures_H_
#define TINY_CPP_CLIENT_StatAffectingNatures_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "NatureSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class StatAffectingNatures{
public:

    /*! \brief Constructor.
	 */
    StatAffectingNatures();
    StatAffectingNatures(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~StatAffectingNatures();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of natures and how they change the referenced stat.
	 */
	std::list<NatureSummary> getIncrease();

	/*! \brief Set A list of natures and how they change the referenced stat.
	 */
	void setIncrease(std::list<NatureSummary> increase);
	/*! \brief Get A list of nature sand how they change the referenced stat.
	 */
	std::list<NatureSummary> getDecrease();

	/*! \brief Set A list of nature sand how they change the referenced stat.
	 */
	void setDecrease(std::list<NatureSummary> decrease);


    private:
    std::list<NatureSummary> increase;
    std::list<NatureSummary> decrease;
};
}

#endif /* TINY_CPP_CLIENT_StatAffectingNatures_H_ */
