package com.raven.gallery.data.sql.po.pictorial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PictorialInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictorialInfoExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPictorialNameIsNull() {
            addCriterion("pictorial_name is null");
            return (Criteria) this;
        }

        public Criteria andPictorialNameIsNotNull() {
            addCriterion("pictorial_name is not null");
            return (Criteria) this;
        }

        public Criteria andPictorialNameEqualTo(String value) {
            addCriterion("pictorial_name =", value, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameNotEqualTo(String value) {
            addCriterion("pictorial_name <>", value, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameGreaterThan(String value) {
            addCriterion("pictorial_name >", value, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameGreaterThanOrEqualTo(String value) {
            addCriterion("pictorial_name >=", value, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameLessThan(String value) {
            addCriterion("pictorial_name <", value, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameLessThanOrEqualTo(String value) {
            addCriterion("pictorial_name <=", value, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameLike(String value) {
            addCriterion("pictorial_name like", value, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameNotLike(String value) {
            addCriterion("pictorial_name not like", value, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameIn(List<String> values) {
            addCriterion("pictorial_name in", values, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameNotIn(List<String> values) {
            addCriterion("pictorial_name not in", values, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameBetween(String value1, String value2) {
            addCriterion("pictorial_name between", value1, value2, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialNameNotBetween(String value1, String value2) {
            addCriterion("pictorial_name not between", value1, value2, "pictorialName");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorIsNull() {
            addCriterion("pictorial_author is null");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorIsNotNull() {
            addCriterion("pictorial_author is not null");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorEqualTo(String value) {
            addCriterion("pictorial_author =", value, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorNotEqualTo(String value) {
            addCriterion("pictorial_author <>", value, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorGreaterThan(String value) {
            addCriterion("pictorial_author >", value, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("pictorial_author >=", value, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorLessThan(String value) {
            addCriterion("pictorial_author <", value, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorLessThanOrEqualTo(String value) {
            addCriterion("pictorial_author <=", value, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorLike(String value) {
            addCriterion("pictorial_author like", value, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorNotLike(String value) {
            addCriterion("pictorial_author not like", value, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorIn(List<String> values) {
            addCriterion("pictorial_author in", values, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorNotIn(List<String> values) {
            addCriterion("pictorial_author not in", values, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorBetween(String value1, String value2) {
            addCriterion("pictorial_author between", value1, value2, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andPictorialAuthorNotBetween(String value1, String value2) {
            addCriterion("pictorial_author not between", value1, value2, "pictorialAuthor");
            return (Criteria) this;
        }

        public Criteria andSensitiveIsNull() {
            addCriterion("sensitive is null");
            return (Criteria) this;
        }

        public Criteria andSensitiveIsNotNull() {
            addCriterion("sensitive is not null");
            return (Criteria) this;
        }

        public Criteria andSensitiveEqualTo(Boolean value) {
            addCriterion("sensitive =", value, "sensitive");
            return (Criteria) this;
        }

        public Criteria andSensitiveNotEqualTo(Boolean value) {
            addCriterion("sensitive <>", value, "sensitive");
            return (Criteria) this;
        }

        public Criteria andSensitiveGreaterThan(Boolean value) {
            addCriterion("sensitive >", value, "sensitive");
            return (Criteria) this;
        }

        public Criteria andSensitiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sensitive >=", value, "sensitive");
            return (Criteria) this;
        }

        public Criteria andSensitiveLessThan(Boolean value) {
            addCriterion("sensitive <", value, "sensitive");
            return (Criteria) this;
        }

        public Criteria andSensitiveLessThanOrEqualTo(Boolean value) {
            addCriterion("sensitive <=", value, "sensitive");
            return (Criteria) this;
        }

        public Criteria andSensitiveIn(List<Boolean> values) {
            addCriterion("sensitive in", values, "sensitive");
            return (Criteria) this;
        }

        public Criteria andSensitiveNotIn(List<Boolean> values) {
            addCriterion("sensitive not in", values, "sensitive");
            return (Criteria) this;
        }

        public Criteria andSensitiveBetween(Boolean value1, Boolean value2) {
            addCriterion("sensitive between", value1, value2, "sensitive");
            return (Criteria) this;
        }

        public Criteria andSensitiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sensitive not between", value1, value2, "sensitive");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleIsNull() {
            addCriterion("pictorial_title is null");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleIsNotNull() {
            addCriterion("pictorial_title is not null");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleEqualTo(String value) {
            addCriterion("pictorial_title =", value, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleNotEqualTo(String value) {
            addCriterion("pictorial_title <>", value, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleGreaterThan(String value) {
            addCriterion("pictorial_title >", value, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleGreaterThanOrEqualTo(String value) {
            addCriterion("pictorial_title >=", value, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleLessThan(String value) {
            addCriterion("pictorial_title <", value, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleLessThanOrEqualTo(String value) {
            addCriterion("pictorial_title <=", value, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleLike(String value) {
            addCriterion("pictorial_title like", value, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleNotLike(String value) {
            addCriterion("pictorial_title not like", value, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleIn(List<String> values) {
            addCriterion("pictorial_title in", values, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleNotIn(List<String> values) {
            addCriterion("pictorial_title not in", values, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleBetween(String value1, String value2) {
            addCriterion("pictorial_title between", value1, value2, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialTitleNotBetween(String value1, String value2) {
            addCriterion("pictorial_title not between", value1, value2, "pictorialTitle");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverIsNull() {
            addCriterion("pictorial_front_cover is null");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverIsNotNull() {
            addCriterion("pictorial_front_cover is not null");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverEqualTo(String value) {
            addCriterion("pictorial_front_cover =", value, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverNotEqualTo(String value) {
            addCriterion("pictorial_front_cover <>", value, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverGreaterThan(String value) {
            addCriterion("pictorial_front_cover >", value, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverGreaterThanOrEqualTo(String value) {
            addCriterion("pictorial_front_cover >=", value, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverLessThan(String value) {
            addCriterion("pictorial_front_cover <", value, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverLessThanOrEqualTo(String value) {
            addCriterion("pictorial_front_cover <=", value, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverLike(String value) {
            addCriterion("pictorial_front_cover like", value, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverNotLike(String value) {
            addCriterion("pictorial_front_cover not like", value, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverIn(List<String> values) {
            addCriterion("pictorial_front_cover in", values, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverNotIn(List<String> values) {
            addCriterion("pictorial_front_cover not in", values, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverBetween(String value1, String value2) {
            addCriterion("pictorial_front_cover between", value1, value2, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andPictorialFrontCoverNotBetween(String value1, String value2) {
            addCriterion("pictorial_front_cover not between", value1, value2, "pictorialFrontCover");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLike(Date value) {
            addCriterion("update_date like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotLike(Date value) {
            addCriterion("update_date not like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(Date value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(Date value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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