/*
 * LanguageDetail.h
 *
 * 
 */

#ifndef _LanguageDetail_H_
#define _LanguageDetail_H_


#include <string>
#include "LanguageName.h"
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

class LanguageDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	LanguageDetail();
	LanguageDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LanguageDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	bool getOfficial();

	/*! \brief Set 
	 */
	void setOfficial(bool  official);
	/*! \brief Get 
	 */
	std::string getIso639();

	/*! \brief Set 
	 */
	void setIso639(std::string  iso639);
	/*! \brief Get 
	 */
	std::string getIso3166();

	/*! \brief Set 
	 */
	void setIso3166(std::string  iso3166);
	/*! \brief Get 
	 */
	std::list<LanguageName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <LanguageName> names);

private:
	int id;
	std::string name;
	bool official;
	std::string iso639;
	std::string iso3166;
	std::list <LanguageName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LanguageDetail_H_ */
