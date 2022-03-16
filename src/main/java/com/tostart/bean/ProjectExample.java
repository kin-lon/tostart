package com.tostart.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdIsNull() {
            addCriterion("project_user_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdIsNotNull() {
            addCriterion("project_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdEqualTo(Integer value) {
            addCriterion("project_user_id =", value, "projectUserId");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdNotEqualTo(Integer value) {
            addCriterion("project_user_id <>", value, "projectUserId");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdGreaterThan(Integer value) {
            addCriterion("project_user_id >", value, "projectUserId");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_user_id >=", value, "projectUserId");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdLessThan(Integer value) {
            addCriterion("project_user_id <", value, "projectUserId");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_user_id <=", value, "projectUserId");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdIn(List<Integer> values) {
            addCriterion("project_user_id in", values, "projectUserId");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdNotIn(List<Integer> values) {
            addCriterion("project_user_id not in", values, "projectUserId");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdBetween(Integer value1, Integer value2) {
            addCriterion("project_user_id between", value1, value2, "projectUserId");
            return (Criteria) this;
        }

        public Criteria andProjectUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_user_id not between", value1, value2, "projectUserId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectTagIsNull() {
            addCriterion("project_tag is null");
            return (Criteria) this;
        }

        public Criteria andProjectTagIsNotNull() {
            addCriterion("project_tag is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTagEqualTo(String value) {
            addCriterion("project_tag =", value, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagNotEqualTo(String value) {
            addCriterion("project_tag <>", value, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagGreaterThan(String value) {
            addCriterion("project_tag >", value, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagGreaterThanOrEqualTo(String value) {
            addCriterion("project_tag >=", value, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagLessThan(String value) {
            addCriterion("project_tag <", value, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagLessThanOrEqualTo(String value) {
            addCriterion("project_tag <=", value, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagLike(String value) {
            addCriterion("project_tag like", value, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagNotLike(String value) {
            addCriterion("project_tag not like", value, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagIn(List<String> values) {
            addCriterion("project_tag in", values, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagNotIn(List<String> values) {
            addCriterion("project_tag not in", values, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagBetween(String value1, String value2) {
            addCriterion("project_tag between", value1, value2, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectTagNotBetween(String value1, String value2) {
            addCriterion("project_tag not between", value1, value2, "projectTag");
            return (Criteria) this;
        }

        public Criteria andProjectContentIsNull() {
            addCriterion("project_content is null");
            return (Criteria) this;
        }

        public Criteria andProjectContentIsNotNull() {
            addCriterion("project_content is not null");
            return (Criteria) this;
        }

        public Criteria andProjectContentEqualTo(String value) {
            addCriterion("project_content =", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotEqualTo(String value) {
            addCriterion("project_content <>", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentGreaterThan(String value) {
            addCriterion("project_content >", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentGreaterThanOrEqualTo(String value) {
            addCriterion("project_content >=", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentLessThan(String value) {
            addCriterion("project_content <", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentLessThanOrEqualTo(String value) {
            addCriterion("project_content <=", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentLike(String value) {
            addCriterion("project_content like", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotLike(String value) {
            addCriterion("project_content not like", value, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentIn(List<String> values) {
            addCriterion("project_content in", values, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotIn(List<String> values) {
            addCriterion("project_content not in", values, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentBetween(String value1, String value2) {
            addCriterion("project_content between", value1, value2, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectContentNotBetween(String value1, String value2) {
            addCriterion("project_content not between", value1, value2, "projectContent");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNull() {
            addCriterion("project_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNotNull() {
            addCriterion("project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualTo(String value) {
            addCriterion("project_status =", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(String value) {
            addCriterion("project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(String value) {
            addCriterion("project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(String value) {
            addCriterion("project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(String value) {
            addCriterion("project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(String value) {
            addCriterion("project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLike(String value) {
            addCriterion("project_status like", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotLike(String value) {
            addCriterion("project_status not like", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIn(List<String> values) {
            addCriterion("project_status in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotIn(List<String> values) {
            addCriterion("project_status not in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusBetween(String value1, String value2) {
            addCriterion("project_status between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotBetween(String value1, String value2) {
            addCriterion("project_status not between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeIsNull() {
            addCriterion("project_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeIsNotNull() {
            addCriterion("project_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeEqualTo(Date value) {
            addCriterion("project_creat_time =", value, "projectCreatTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeNotEqualTo(Date value) {
            addCriterion("project_creat_time <>", value, "projectCreatTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeGreaterThan(Date value) {
            addCriterion("project_creat_time >", value, "projectCreatTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_creat_time >=", value, "projectCreatTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeLessThan(Date value) {
            addCriterion("project_creat_time <", value, "projectCreatTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("project_creat_time <=", value, "projectCreatTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeIn(List<Date> values) {
            addCriterion("project_creat_time in", values, "projectCreatTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeNotIn(List<Date> values) {
            addCriterion("project_creat_time not in", values, "projectCreatTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeBetween(Date value1, Date value2) {
            addCriterion("project_creat_time between", value1, value2, "projectCreatTime");
            return (Criteria) this;
        }

        public Criteria andProjectCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("project_creat_time not between", value1, value2, "projectCreatTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNull() {
            addCriterion("project_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNotNull() {
            addCriterion("project_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeEqualTo(Date value) {
            addCriterion("project_start_time =", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotEqualTo(Date value) {
            addCriterion("project_start_time <>", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThan(Date value) {
            addCriterion("project_start_time >", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_start_time >=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThan(Date value) {
            addCriterion("project_start_time <", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("project_start_time <=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIn(List<Date> values) {
            addCriterion("project_start_time in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotIn(List<Date> values) {
            addCriterion("project_start_time not in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeBetween(Date value1, Date value2) {
            addCriterion("project_start_time between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("project_start_time not between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNull() {
            addCriterion("project_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNotNull() {
            addCriterion("project_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeEqualTo(Date value) {
            addCriterion("project_end_time =", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotEqualTo(Date value) {
            addCriterion("project_end_time <>", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThan(Date value) {
            addCriterion("project_end_time >", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_end_time >=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThan(Date value) {
            addCriterion("project_end_time <", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("project_end_time <=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIn(List<Date> values) {
            addCriterion("project_end_time in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotIn(List<Date> values) {
            addCriterion("project_end_time not in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeBetween(Date value1, Date value2) {
            addCriterion("project_end_time between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("project_end_time not between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectImgIsNull() {
            addCriterion("project_img is null");
            return (Criteria) this;
        }

        public Criteria andProjectImgIsNotNull() {
            addCriterion("project_img is not null");
            return (Criteria) this;
        }

        public Criteria andProjectImgEqualTo(String value) {
            addCriterion("project_img =", value, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgNotEqualTo(String value) {
            addCriterion("project_img <>", value, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgGreaterThan(String value) {
            addCriterion("project_img >", value, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgGreaterThanOrEqualTo(String value) {
            addCriterion("project_img >=", value, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgLessThan(String value) {
            addCriterion("project_img <", value, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgLessThanOrEqualTo(String value) {
            addCriterion("project_img <=", value, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgLike(String value) {
            addCriterion("project_img like", value, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgNotLike(String value) {
            addCriterion("project_img not like", value, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgIn(List<String> values) {
            addCriterion("project_img in", values, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgNotIn(List<String> values) {
            addCriterion("project_img not in", values, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgBetween(String value1, String value2) {
            addCriterion("project_img between", value1, value2, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectImgNotBetween(String value1, String value2) {
            addCriterion("project_img not between", value1, value2, "projectImg");
            return (Criteria) this;
        }

        public Criteria andProjectGoalIsNull() {
            addCriterion("project_goal is null");
            return (Criteria) this;
        }

        public Criteria andProjectGoalIsNotNull() {
            addCriterion("project_goal is not null");
            return (Criteria) this;
        }

        public Criteria andProjectGoalEqualTo(Integer value) {
            addCriterion("project_goal =", value, "projectGoal");
            return (Criteria) this;
        }

        public Criteria andProjectGoalNotEqualTo(Integer value) {
            addCriterion("project_goal <>", value, "projectGoal");
            return (Criteria) this;
        }

        public Criteria andProjectGoalGreaterThan(Integer value) {
            addCriterion("project_goal >", value, "projectGoal");
            return (Criteria) this;
        }

        public Criteria andProjectGoalGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_goal >=", value, "projectGoal");
            return (Criteria) this;
        }

        public Criteria andProjectGoalLessThan(Integer value) {
            addCriterion("project_goal <", value, "projectGoal");
            return (Criteria) this;
        }

        public Criteria andProjectGoalLessThanOrEqualTo(Integer value) {
            addCriterion("project_goal <=", value, "projectGoal");
            return (Criteria) this;
        }

        public Criteria andProjectGoalIn(List<Integer> values) {
            addCriterion("project_goal in", values, "projectGoal");
            return (Criteria) this;
        }

        public Criteria andProjectGoalNotIn(List<Integer> values) {
            addCriterion("project_goal not in", values, "projectGoal");
            return (Criteria) this;
        }

        public Criteria andProjectGoalBetween(Integer value1, Integer value2) {
            addCriterion("project_goal between", value1, value2, "projectGoal");
            return (Criteria) this;
        }

        public Criteria andProjectGoalNotBetween(Integer value1, Integer value2) {
            addCriterion("project_goal not between", value1, value2, "projectGoal");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIsNull() {
            addCriterion("project_progress is null");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIsNotNull() {
            addCriterion("project_progress is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProgressEqualTo(Integer value) {
            addCriterion("project_progress =", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressNotEqualTo(Integer value) {
            addCriterion("project_progress <>", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGreaterThan(Integer value) {
            addCriterion("project_progress >", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_progress >=", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressLessThan(Integer value) {
            addCriterion("project_progress <", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressLessThanOrEqualTo(Integer value) {
            addCriterion("project_progress <=", value, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressIn(List<Integer> values) {
            addCriterion("project_progress in", values, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressNotIn(List<Integer> values) {
            addCriterion("project_progress not in", values, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressBetween(Integer value1, Integer value2) {
            addCriterion("project_progress between", value1, value2, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("project_progress not between", value1, value2, "projectProgress");
            return (Criteria) this;
        }

        public Criteria andProjectSupportIsNull() {
            addCriterion("project_support is null");
            return (Criteria) this;
        }

        public Criteria andProjectSupportIsNotNull() {
            addCriterion("project_support is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSupportEqualTo(Integer value) {
            addCriterion("project_support =", value, "projectSupport");
            return (Criteria) this;
        }

        public Criteria andProjectSupportNotEqualTo(Integer value) {
            addCriterion("project_support <>", value, "projectSupport");
            return (Criteria) this;
        }

        public Criteria andProjectSupportGreaterThan(Integer value) {
            addCriterion("project_support >", value, "projectSupport");
            return (Criteria) this;
        }

        public Criteria andProjectSupportGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_support >=", value, "projectSupport");
            return (Criteria) this;
        }

        public Criteria andProjectSupportLessThan(Integer value) {
            addCriterion("project_support <", value, "projectSupport");
            return (Criteria) this;
        }

        public Criteria andProjectSupportLessThanOrEqualTo(Integer value) {
            addCriterion("project_support <=", value, "projectSupport");
            return (Criteria) this;
        }

        public Criteria andProjectSupportIn(List<Integer> values) {
            addCriterion("project_support in", values, "projectSupport");
            return (Criteria) this;
        }

        public Criteria andProjectSupportNotIn(List<Integer> values) {
            addCriterion("project_support not in", values, "projectSupport");
            return (Criteria) this;
        }

        public Criteria andProjectSupportBetween(Integer value1, Integer value2) {
            addCriterion("project_support between", value1, value2, "projectSupport");
            return (Criteria) this;
        }

        public Criteria andProjectSupportNotBetween(Integer value1, Integer value2) {
            addCriterion("project_support not between", value1, value2, "projectSupport");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}