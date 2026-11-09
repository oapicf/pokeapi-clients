/*
 * StatAffectingNatures.h
 *
 * 
 */

#ifndef _StatAffectingNatures_H_
#define _StatAffectingNatures_H_


#include <string>
#include "NatureSummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class StatAffectingNatures : public Object {
public:
	/*! \brief Constructor.
	 */
	StatAffectingNatures();
	StatAffectingNatures(char* str);

	/*! \brief Destructor.
	 */
	virtual ~StatAffectingNatures();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of natures and how they change the referenced stat.
	 */
	std::list<NatureSummary> getIncrease();

	/*! \brief Set A list of natures and how they change the referenced stat.
	 */
	void setIncrease(std::list <NatureSummary> increase);
	/*! \brief Get A list of nature sand how they change the referenced stat.
	 */
	std::list<NatureSummary> getDecrease();

	/*! \brief Set A list of nature sand how they change the referenced stat.
	 */
	void setDecrease(std::list <NatureSummary> decrease);

private:
	std::list <NatureSummary>increase;
	std::list <NatureSummary>decrease;
	void __init();
	void __cleanup();

};
}
}

#endif /* _StatAffectingNatures_H_ */
