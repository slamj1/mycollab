/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.user.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.user.domain.BillingPlan;
import com.mycollab.module.user.domain.BillingPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface BillingPlanMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    int countByExample(BillingPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    int deleteByExample(BillingPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    int insert(BillingPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    int insertSelective(BillingPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    List<BillingPlan> selectByExample(BillingPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    BillingPlan selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    int updateByExampleSelective(@Param("record") BillingPlan record, @Param("example") BillingPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    int updateByExample(@Param("record") BillingPlan record, @Param("example") BillingPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    int updateByPrimaryKeySelective(BillingPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    int updateByPrimaryKey(BillingPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    Integer insertAndReturnKey(BillingPlan value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_billing_plan
     *
     * @mbggenerated Thu Sep 01 22:20:32 ICT 2016
     */
    void massUpdateWithSession(@Param("record") BillingPlan record, @Param("primaryKeys") List primaryKeys);
}