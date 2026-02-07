/*
 * ContestEffectDetail.h
 *
 * 
 */

#ifndef _ContestEffectDetail_H_
#define _ContestEffectDetail_H_


#include <string>
#include "ContestEffectEffectText.h"
#include "ContestEffectFlavorText.h"
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

class ContestEffectDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	ContestEffectDetail();
	ContestEffectDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ContestEffectDetail();

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
	int getAppeal();

	/*! \brief Set 
	 */
	void setAppeal(int  appeal);
	/*! \brief Get 
	 */
	int getJam();

	/*! \brief Set 
	 */
	void setJam(int  jam);
	/*! \brief Get 
	 */
	std::list<ContestEffectEffectText> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list <ContestEffectEffectText> effect_entries);
	/*! \brief Get 
	 */
	std::list<ContestEffectFlavorText> getFlavorTextEntries();

	/*! \brief Set 
	 */
	void setFlavorTextEntries(std::list <ContestEffectFlavorText> flavor_text_entries);

private:
	int id;
	int appeal;
	int jam;
	std::list <ContestEffectEffectText>effect_entries;
	std::list <ContestEffectFlavorText>flavor_text_entries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ContestEffectDetail_H_ */
