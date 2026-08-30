
/*
 * SuperContestEffectDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SuperContestEffectDetail_H_
#define TINY_CPP_CLIENT_SuperContestEffectDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveSummary.h"
#include "SuperContestEffectFlavorText.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SuperContestEffectDetail{
public:

    /*! \brief Constructor.
	 */
    SuperContestEffectDetail();
    SuperContestEffectDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SuperContestEffectDetail();


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
	int getAppeal();

	/*! \brief Set 
	 */
	void setAppeal(int appeal);
	/*! \brief Get 
	 */
	std::list<SuperContestEffectFlavorText> getFlavorTextEntries();

	/*! \brief Set 
	 */
	void setFlavorTextEntries(std::list<SuperContestEffectFlavorText> flavor_text_entries);
	/*! \brief Get 
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list<MoveSummary> moves);


    private:
    int id{};
    int appeal{};
    std::list<SuperContestEffectFlavorText> flavor_text_entries;
    std::list<MoveSummary> moves;
};
}

#endif /* TINY_CPP_CLIENT_SuperContestEffectDetail_H_ */
