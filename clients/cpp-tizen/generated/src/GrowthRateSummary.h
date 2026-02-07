/*
 * GrowthRateSummary.h
 *
 * 
 */

#ifndef _GrowthRateSummary_H_
#define _GrowthRateSummary_H_


#include <string>
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

class GrowthRateSummary : public Object {
public:
	/*! \brief Constructor.
	 */
	GrowthRateSummary();
	GrowthRateSummary(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GrowthRateSummary();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string name;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GrowthRateSummary_H_ */
