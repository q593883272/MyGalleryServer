package com.raven.gallery.data.sql.po.pictorial;

import java.util.ArrayList;
import java.util.List;

public class PictorialVariableInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictorialVariableInfoExample() {
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

        public Criteria andPictorialInfoIdIsNull() {
            addCriterion("pictorial_info_id is null");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdIsNotNull() {
            addCriterion("pictorial_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdEqualTo(Integer value) {
            addCriterion("pictorial_info_id =", value, "pictorialInfoId");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdNotEqualTo(Integer value) {
            addCriterion("pictorial_info_id <>", value, "pictorialInfoId");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdGreaterThan(Integer value) {
            addCriterion("pictorial_info_id >", value, "pictorialInfoId");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictorial_info_id >=", value, "pictorialInfoId");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdLessThan(Integer value) {
            addCriterion("pictorial_info_id <", value, "pictorialInfoId");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("pictorial_info_id <=", value, "pictorialInfoId");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdIn(List<Integer> values) {
            addCriterion("pictorial_info_id in", values, "pictorialInfoId");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdNotIn(List<Integer> values) {
            addCriterion("pictorial_info_id not in", values, "pictorialInfoId");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("pictorial_info_id between", value1, value2, "pictorialInfoId");
            return (Criteria) this;
        }

        public Criteria andPictorialInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pictorial_info_id not between", value1, value2, "pictorialInfoId");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreIsNull() {
            addCriterion("pictorial_score is null");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreIsNotNull() {
            addCriterion("pictorial_score is not null");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreEqualTo(String value) {
            addCriterion("pictorial_score =", value, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreNotEqualTo(String value) {
            addCriterion("pictorial_score <>", value, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreGreaterThan(String value) {
            addCriterion("pictorial_score >", value, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreGreaterThanOrEqualTo(String value) {
            addCriterion("pictorial_score >=", value, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreLessThan(String value) {
            addCriterion("pictorial_score <", value, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreLessThanOrEqualTo(String value) {
            addCriterion("pictorial_score <=", value, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreLike(String value) {
            addCriterion("pictorial_score like", value, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreNotLike(String value) {
            addCriterion("pictorial_score not like", value, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreIn(List<String> values) {
            addCriterion("pictorial_score in", values, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreNotIn(List<String> values) {
            addCriterion("pictorial_score not in", values, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreBetween(String value1, String value2) {
            addCriterion("pictorial_score between", value1, value2, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialScoreNotBetween(String value1, String value2) {
            addCriterion("pictorial_score not between", value1, value2, "pictorialScore");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumIsNull() {
            addCriterion("pictorial_comment_num is null");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumIsNotNull() {
            addCriterion("pictorial_comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumEqualTo(Integer value) {
            addCriterion("pictorial_comment_num =", value, "pictorialCommentNum");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumNotEqualTo(Integer value) {
            addCriterion("pictorial_comment_num <>", value, "pictorialCommentNum");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumGreaterThan(Integer value) {
            addCriterion("pictorial_comment_num >", value, "pictorialCommentNum");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictorial_comment_num >=", value, "pictorialCommentNum");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumLessThan(Integer value) {
            addCriterion("pictorial_comment_num <", value, "pictorialCommentNum");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("pictorial_comment_num <=", value, "pictorialCommentNum");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumIn(List<Integer> values) {
            addCriterion("pictorial_comment_num in", values, "pictorialCommentNum");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumNotIn(List<Integer> values) {
            addCriterion("pictorial_comment_num not in", values, "pictorialCommentNum");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("pictorial_comment_num between", value1, value2, "pictorialCommentNum");
            return (Criteria) this;
        }

        public Criteria andPictorialCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pictorial_comment_num not between", value1, value2, "pictorialCommentNum");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumIsNull() {
            addCriterion("pictorial_like_num is null");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumIsNotNull() {
            addCriterion("pictorial_like_num is not null");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumEqualTo(Integer value) {
            addCriterion("pictorial_like_num =", value, "pictorialLikeNum");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumNotEqualTo(Integer value) {
            addCriterion("pictorial_like_num <>", value, "pictorialLikeNum");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumGreaterThan(Integer value) {
            addCriterion("pictorial_like_num >", value, "pictorialLikeNum");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictorial_like_num >=", value, "pictorialLikeNum");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumLessThan(Integer value) {
            addCriterion("pictorial_like_num <", value, "pictorialLikeNum");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumLessThanOrEqualTo(Integer value) {
            addCriterion("pictorial_like_num <=", value, "pictorialLikeNum");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumIn(List<Integer> values) {
            addCriterion("pictorial_like_num in", values, "pictorialLikeNum");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumNotIn(List<Integer> values) {
            addCriterion("pictorial_like_num not in", values, "pictorialLikeNum");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumBetween(Integer value1, Integer value2) {
            addCriterion("pictorial_like_num between", value1, value2, "pictorialLikeNum");
            return (Criteria) this;
        }

        public Criteria andPictorialLikeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pictorial_like_num not between", value1, value2, "pictorialLikeNum");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumIsNull() {
            addCriterion("pictorial_favorite_num is null");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumIsNotNull() {
            addCriterion("pictorial_favorite_num is not null");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumEqualTo(Integer value) {
            addCriterion("pictorial_favorite_num =", value, "pictorialFavoriteNum");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumNotEqualTo(Integer value) {
            addCriterion("pictorial_favorite_num <>", value, "pictorialFavoriteNum");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumGreaterThan(Integer value) {
            addCriterion("pictorial_favorite_num >", value, "pictorialFavoriteNum");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictorial_favorite_num >=", value, "pictorialFavoriteNum");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumLessThan(Integer value) {
            addCriterion("pictorial_favorite_num <", value, "pictorialFavoriteNum");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumLessThanOrEqualTo(Integer value) {
            addCriterion("pictorial_favorite_num <=", value, "pictorialFavoriteNum");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumIn(List<Integer> values) {
            addCriterion("pictorial_favorite_num in", values, "pictorialFavoriteNum");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumNotIn(List<Integer> values) {
            addCriterion("pictorial_favorite_num not in", values, "pictorialFavoriteNum");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumBetween(Integer value1, Integer value2) {
            addCriterion("pictorial_favorite_num between", value1, value2, "pictorialFavoriteNum");
            return (Criteria) this;
        }

        public Criteria andPictorialFavoriteNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pictorial_favorite_num not between", value1, value2, "pictorialFavoriteNum");
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