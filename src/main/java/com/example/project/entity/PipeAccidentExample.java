package com.example.project.entity;

import java.util.ArrayList;
import java.util.List;

public class PipeAccidentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PipeAccidentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPipeidIsNull() {
            addCriterion("pipeId is null");
            return (Criteria) this;
        }

        public Criteria andPipeidIsNotNull() {
            addCriterion("pipeId is not null");
            return (Criteria) this;
        }

        public Criteria andPipeidEqualTo(String value) {
            addCriterion("pipeId =", value, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidNotEqualTo(String value) {
            addCriterion("pipeId <>", value, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidGreaterThan(String value) {
            addCriterion("pipeId >", value, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidGreaterThanOrEqualTo(String value) {
            addCriterion("pipeId >=", value, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidLessThan(String value) {
            addCriterion("pipeId <", value, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidLessThanOrEqualTo(String value) {
            addCriterion("pipeId <=", value, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidLike(String value) {
            addCriterion("pipeId like", value, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidNotLike(String value) {
            addCriterion("pipeId not like", value, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidIn(List<String> values) {
            addCriterion("pipeId in", values, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidNotIn(List<String> values) {
            addCriterion("pipeId not in", values, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidBetween(String value1, String value2) {
            addCriterion("pipeId between", value1, value2, "pipeid");
            return (Criteria) this;
        }

        public Criteria andPipeidNotBetween(String value1, String value2) {
            addCriterion("pipeId not between", value1, value2, "pipeid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyid is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyid is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(String value) {
            addCriterion("companyid =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(String value) {
            addCriterion("companyid <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(String value) {
            addCriterion("companyid >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("companyid >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(String value) {
            addCriterion("companyid <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(String value) {
            addCriterion("companyid <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLike(String value) {
            addCriterion("companyid like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotLike(String value) {
            addCriterion("companyid not like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<String> values) {
            addCriterion("companyid in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<String> values) {
            addCriterion("companyid not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(String value1, String value2) {
            addCriterion("companyid between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(String value1, String value2) {
            addCriterion("companyid not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeIsNull() {
            addCriterion("accidentType is null");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeIsNotNull() {
            addCriterion("accidentType is not null");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeEqualTo(String value) {
            addCriterion("accidentType =", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotEqualTo(String value) {
            addCriterion("accidentType <>", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeGreaterThan(String value) {
            addCriterion("accidentType >", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("accidentType >=", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeLessThan(String value) {
            addCriterion("accidentType <", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeLessThanOrEqualTo(String value) {
            addCriterion("accidentType <=", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeLike(String value) {
            addCriterion("accidentType like", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotLike(String value) {
            addCriterion("accidentType not like", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeIn(List<String> values) {
            addCriterion("accidentType in", values, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotIn(List<String> values) {
            addCriterion("accidentType not in", values, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeBetween(String value1, String value2) {
            addCriterion("accidentType between", value1, value2, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotBetween(String value1, String value2) {
            addCriterion("accidentType not between", value1, value2, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeIsNull() {
            addCriterion("occurrenceTime is null");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeIsNotNull() {
            addCriterion("occurrenceTime is not null");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeEqualTo(String value) {
            addCriterion("occurrenceTime =", value, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeNotEqualTo(String value) {
            addCriterion("occurrenceTime <>", value, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeGreaterThan(String value) {
            addCriterion("occurrenceTime >", value, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeGreaterThanOrEqualTo(String value) {
            addCriterion("occurrenceTime >=", value, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeLessThan(String value) {
            addCriterion("occurrenceTime <", value, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeLessThanOrEqualTo(String value) {
            addCriterion("occurrenceTime <=", value, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeLike(String value) {
            addCriterion("occurrenceTime like", value, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeNotLike(String value) {
            addCriterion("occurrenceTime not like", value, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeIn(List<String> values) {
            addCriterion("occurrenceTime in", values, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeNotIn(List<String> values) {
            addCriterion("occurrenceTime not in", values, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeBetween(String value1, String value2) {
            addCriterion("occurrenceTime between", value1, value2, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencetimeNotBetween(String value1, String value2) {
            addCriterion("occurrenceTime not between", value1, value2, "occurrencetime");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteIsNull() {
            addCriterion("occurrenceSite is null");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteIsNotNull() {
            addCriterion("occurrenceSite is not null");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteEqualTo(String value) {
            addCriterion("occurrenceSite =", value, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteNotEqualTo(String value) {
            addCriterion("occurrenceSite <>", value, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteGreaterThan(String value) {
            addCriterion("occurrenceSite >", value, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteGreaterThanOrEqualTo(String value) {
            addCriterion("occurrenceSite >=", value, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteLessThan(String value) {
            addCriterion("occurrenceSite <", value, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteLessThanOrEqualTo(String value) {
            addCriterion("occurrenceSite <=", value, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteLike(String value) {
            addCriterion("occurrenceSite like", value, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteNotLike(String value) {
            addCriterion("occurrenceSite not like", value, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteIn(List<String> values) {
            addCriterion("occurrenceSite in", values, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteNotIn(List<String> values) {
            addCriterion("occurrenceSite not in", values, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteBetween(String value1, String value2) {
            addCriterion("occurrenceSite between", value1, value2, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andOccurrencesiteNotBetween(String value1, String value2) {
            addCriterion("occurrenceSite not between", value1, value2, "occurrencesite");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessIsNull() {
            addCriterion("accidentProcess is null");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessIsNotNull() {
            addCriterion("accidentProcess is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessEqualTo(String value) {
            addCriterion("accidentProcess =", value, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessNotEqualTo(String value) {
            addCriterion("accidentProcess <>", value, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessGreaterThan(String value) {
            addCriterion("accidentProcess >", value, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessGreaterThanOrEqualTo(String value) {
            addCriterion("accidentProcess >=", value, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessLessThan(String value) {
            addCriterion("accidentProcess <", value, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessLessThanOrEqualTo(String value) {
            addCriterion("accidentProcess <=", value, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessLike(String value) {
            addCriterion("accidentProcess like", value, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessNotLike(String value) {
            addCriterion("accidentProcess not like", value, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessIn(List<String> values) {
            addCriterion("accidentProcess in", values, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessNotIn(List<String> values) {
            addCriterion("accidentProcess not in", values, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessBetween(String value1, String value2) {
            addCriterion("accidentProcess between", value1, value2, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andAccidentprocessNotBetween(String value1, String value2) {
            addCriterion("accidentProcess not between", value1, value2, "accidentprocess");
            return (Criteria) this;
        }

        public Criteria andLossIsNull() {
            addCriterion("loss is null");
            return (Criteria) this;
        }

        public Criteria andLossIsNotNull() {
            addCriterion("loss is not null");
            return (Criteria) this;
        }

        public Criteria andLossEqualTo(String value) {
            addCriterion("loss =", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotEqualTo(String value) {
            addCriterion("loss <>", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossGreaterThan(String value) {
            addCriterion("loss >", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossGreaterThanOrEqualTo(String value) {
            addCriterion("loss >=", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLessThan(String value) {
            addCriterion("loss <", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLessThanOrEqualTo(String value) {
            addCriterion("loss <=", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLike(String value) {
            addCriterion("loss like", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotLike(String value) {
            addCriterion("loss not like", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossIn(List<String> values) {
            addCriterion("loss in", values, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotIn(List<String> values) {
            addCriterion("loss not in", values, "loss");
            return (Criteria) this;
        }

        public Criteria andLossBetween(String value1, String value2) {
            addCriterion("loss between", value1, value2, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotBetween(String value1, String value2) {
            addCriterion("loss not between", value1, value2, "loss");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryIsNull() {
            addCriterion("personnelInjury is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryIsNotNull() {
            addCriterion("personnelInjury is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryEqualTo(String value) {
            addCriterion("personnelInjury =", value, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryNotEqualTo(String value) {
            addCriterion("personnelInjury <>", value, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryGreaterThan(String value) {
            addCriterion("personnelInjury >", value, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryGreaterThanOrEqualTo(String value) {
            addCriterion("personnelInjury >=", value, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryLessThan(String value) {
            addCriterion("personnelInjury <", value, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryLessThanOrEqualTo(String value) {
            addCriterion("personnelInjury <=", value, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryLike(String value) {
            addCriterion("personnelInjury like", value, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryNotLike(String value) {
            addCriterion("personnelInjury not like", value, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryIn(List<String> values) {
            addCriterion("personnelInjury in", values, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryNotIn(List<String> values) {
            addCriterion("personnelInjury not in", values, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryBetween(String value1, String value2) {
            addCriterion("personnelInjury between", value1, value2, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andPersonnelinjuryNotBetween(String value1, String value2) {
            addCriterion("personnelInjury not between", value1, value2, "personnelinjury");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesIsNull() {
            addCriterion("economicLosses is null");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesIsNotNull() {
            addCriterion("economicLosses is not null");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesEqualTo(String value) {
            addCriterion("economicLosses =", value, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesNotEqualTo(String value) {
            addCriterion("economicLosses <>", value, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesGreaterThan(String value) {
            addCriterion("economicLosses >", value, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesGreaterThanOrEqualTo(String value) {
            addCriterion("economicLosses >=", value, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesLessThan(String value) {
            addCriterion("economicLosses <", value, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesLessThanOrEqualTo(String value) {
            addCriterion("economicLosses <=", value, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesLike(String value) {
            addCriterion("economicLosses like", value, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesNotLike(String value) {
            addCriterion("economicLosses not like", value, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesIn(List<String> values) {
            addCriterion("economicLosses in", values, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesNotIn(List<String> values) {
            addCriterion("economicLosses not in", values, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesBetween(String value1, String value2) {
            addCriterion("economicLosses between", value1, value2, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andEconomiclossesNotBetween(String value1, String value2) {
            addCriterion("economicLosses not between", value1, value2, "economiclosses");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentIsNull() {
            addCriterion("causeAccident is null");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentIsNotNull() {
            addCriterion("causeAccident is not null");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentEqualTo(String value) {
            addCriterion("causeAccident =", value, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentNotEqualTo(String value) {
            addCriterion("causeAccident <>", value, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentGreaterThan(String value) {
            addCriterion("causeAccident >", value, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentGreaterThanOrEqualTo(String value) {
            addCriterion("causeAccident >=", value, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentLessThan(String value) {
            addCriterion("causeAccident <", value, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentLessThanOrEqualTo(String value) {
            addCriterion("causeAccident <=", value, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentLike(String value) {
            addCriterion("causeAccident like", value, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentNotLike(String value) {
            addCriterion("causeAccident not like", value, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentIn(List<String> values) {
            addCriterion("causeAccident in", values, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentNotIn(List<String> values) {
            addCriterion("causeAccident not in", values, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentBetween(String value1, String value2) {
            addCriterion("causeAccident between", value1, value2, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andCauseaccidentNotBetween(String value1, String value2) {
            addCriterion("causeAccident not between", value1, value2, "causeaccident");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyIsNull() {
            addCriterion("accidentLiabilityParty is null");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyIsNotNull() {
            addCriterion("accidentLiabilityParty is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyEqualTo(String value) {
            addCriterion("accidentLiabilityParty =", value, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyNotEqualTo(String value) {
            addCriterion("accidentLiabilityParty <>", value, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyGreaterThan(String value) {
            addCriterion("accidentLiabilityParty >", value, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyGreaterThanOrEqualTo(String value) {
            addCriterion("accidentLiabilityParty >=", value, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyLessThan(String value) {
            addCriterion("accidentLiabilityParty <", value, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyLessThanOrEqualTo(String value) {
            addCriterion("accidentLiabilityParty <=", value, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyLike(String value) {
            addCriterion("accidentLiabilityParty like", value, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyNotLike(String value) {
            addCriterion("accidentLiabilityParty not like", value, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyIn(List<String> values) {
            addCriterion("accidentLiabilityParty in", values, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyNotIn(List<String> values) {
            addCriterion("accidentLiabilityParty not in", values, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyBetween(String value1, String value2) {
            addCriterion("accidentLiabilityParty between", value1, value2, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andAccidentliabilitypartyNotBetween(String value1, String value2) {
            addCriterion("accidentLiabilityParty not between", value1, value2, "accidentliabilityparty");
            return (Criteria) this;
        }

        public Criteria andReportpeoIsNull() {
            addCriterion("reportPeo is null");
            return (Criteria) this;
        }

        public Criteria andReportpeoIsNotNull() {
            addCriterion("reportPeo is not null");
            return (Criteria) this;
        }

        public Criteria andReportpeoEqualTo(String value) {
            addCriterion("reportPeo =", value, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoNotEqualTo(String value) {
            addCriterion("reportPeo <>", value, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoGreaterThan(String value) {
            addCriterion("reportPeo >", value, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoGreaterThanOrEqualTo(String value) {
            addCriterion("reportPeo >=", value, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoLessThan(String value) {
            addCriterion("reportPeo <", value, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoLessThanOrEqualTo(String value) {
            addCriterion("reportPeo <=", value, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoLike(String value) {
            addCriterion("reportPeo like", value, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoNotLike(String value) {
            addCriterion("reportPeo not like", value, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoIn(List<String> values) {
            addCriterion("reportPeo in", values, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoNotIn(List<String> values) {
            addCriterion("reportPeo not in", values, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoBetween(String value1, String value2) {
            addCriterion("reportPeo between", value1, value2, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReportpeoNotBetween(String value1, String value2) {
            addCriterion("reportPeo not between", value1, value2, "reportpeo");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNull() {
            addCriterion("reportTime is null");
            return (Criteria) this;
        }

        public Criteria andReporttimeIsNotNull() {
            addCriterion("reportTime is not null");
            return (Criteria) this;
        }

        public Criteria andReporttimeEqualTo(String value) {
            addCriterion("reportTime =", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotEqualTo(String value) {
            addCriterion("reportTime <>", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThan(String value) {
            addCriterion("reportTime >", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeGreaterThanOrEqualTo(String value) {
            addCriterion("reportTime >=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThan(String value) {
            addCriterion("reportTime <", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLessThanOrEqualTo(String value) {
            addCriterion("reportTime <=", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeLike(String value) {
            addCriterion("reportTime like", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotLike(String value) {
            addCriterion("reportTime not like", value, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeIn(List<String> values) {
            addCriterion("reportTime in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotIn(List<String> values) {
            addCriterion("reportTime not in", values, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeBetween(String value1, String value2) {
            addCriterion("reportTime between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andReporttimeNotBetween(String value1, String value2) {
            addCriterion("reportTime not between", value1, value2, "reporttime");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryIsNull() {
            addCriterion("accidentSummary is null");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryIsNotNull() {
            addCriterion("accidentSummary is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryEqualTo(String value) {
            addCriterion("accidentSummary =", value, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryNotEqualTo(String value) {
            addCriterion("accidentSummary <>", value, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryGreaterThan(String value) {
            addCriterion("accidentSummary >", value, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryGreaterThanOrEqualTo(String value) {
            addCriterion("accidentSummary >=", value, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryLessThan(String value) {
            addCriterion("accidentSummary <", value, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryLessThanOrEqualTo(String value) {
            addCriterion("accidentSummary <=", value, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryLike(String value) {
            addCriterion("accidentSummary like", value, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryNotLike(String value) {
            addCriterion("accidentSummary not like", value, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryIn(List<String> values) {
            addCriterion("accidentSummary in", values, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryNotIn(List<String> values) {
            addCriterion("accidentSummary not in", values, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryBetween(String value1, String value2) {
            addCriterion("accidentSummary between", value1, value2, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andAccidentsummaryNotBetween(String value1, String value2) {
            addCriterion("accidentSummary not between", value1, value2, "accidentsummary");
            return (Criteria) this;
        }

        public Criteria andDealingpeoIsNull() {
            addCriterion("dealingPeo is null");
            return (Criteria) this;
        }

        public Criteria andDealingpeoIsNotNull() {
            addCriterion("dealingPeo is not null");
            return (Criteria) this;
        }

        public Criteria andDealingpeoEqualTo(String value) {
            addCriterion("dealingPeo =", value, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoNotEqualTo(String value) {
            addCriterion("dealingPeo <>", value, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoGreaterThan(String value) {
            addCriterion("dealingPeo >", value, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoGreaterThanOrEqualTo(String value) {
            addCriterion("dealingPeo >=", value, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoLessThan(String value) {
            addCriterion("dealingPeo <", value, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoLessThanOrEqualTo(String value) {
            addCriterion("dealingPeo <=", value, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoLike(String value) {
            addCriterion("dealingPeo like", value, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoNotLike(String value) {
            addCriterion("dealingPeo not like", value, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoIn(List<String> values) {
            addCriterion("dealingPeo in", values, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoNotIn(List<String> values) {
            addCriterion("dealingPeo not in", values, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoBetween(String value1, String value2) {
            addCriterion("dealingPeo between", value1, value2, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingpeoNotBetween(String value1, String value2) {
            addCriterion("dealingPeo not between", value1, value2, "dealingpeo");
            return (Criteria) this;
        }

        public Criteria andDealingtimeIsNull() {
            addCriterion("dealingTime is null");
            return (Criteria) this;
        }

        public Criteria andDealingtimeIsNotNull() {
            addCriterion("dealingTime is not null");
            return (Criteria) this;
        }

        public Criteria andDealingtimeEqualTo(String value) {
            addCriterion("dealingTime =", value, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeNotEqualTo(String value) {
            addCriterion("dealingTime <>", value, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeGreaterThan(String value) {
            addCriterion("dealingTime >", value, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("dealingTime >=", value, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeLessThan(String value) {
            addCriterion("dealingTime <", value, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeLessThanOrEqualTo(String value) {
            addCriterion("dealingTime <=", value, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeLike(String value) {
            addCriterion("dealingTime like", value, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeNotLike(String value) {
            addCriterion("dealingTime not like", value, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeIn(List<String> values) {
            addCriterion("dealingTime in", values, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeNotIn(List<String> values) {
            addCriterion("dealingTime not in", values, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeBetween(String value1, String value2) {
            addCriterion("dealingTime between", value1, value2, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingtimeNotBetween(String value1, String value2) {
            addCriterion("dealingTime not between", value1, value2, "dealingtime");
            return (Criteria) this;
        }

        public Criteria andDealingstateIsNull() {
            addCriterion("dealingState is null");
            return (Criteria) this;
        }

        public Criteria andDealingstateIsNotNull() {
            addCriterion("dealingState is not null");
            return (Criteria) this;
        }

        public Criteria andDealingstateEqualTo(String value) {
            addCriterion("dealingState =", value, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateNotEqualTo(String value) {
            addCriterion("dealingState <>", value, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateGreaterThan(String value) {
            addCriterion("dealingState >", value, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateGreaterThanOrEqualTo(String value) {
            addCriterion("dealingState >=", value, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateLessThan(String value) {
            addCriterion("dealingState <", value, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateLessThanOrEqualTo(String value) {
            addCriterion("dealingState <=", value, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateLike(String value) {
            addCriterion("dealingState like", value, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateNotLike(String value) {
            addCriterion("dealingState not like", value, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateIn(List<String> values) {
            addCriterion("dealingState in", values, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateNotIn(List<String> values) {
            addCriterion("dealingState not in", values, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateBetween(String value1, String value2) {
            addCriterion("dealingState between", value1, value2, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andDealingstateNotBetween(String value1, String value2) {
            addCriterion("dealingState not between", value1, value2, "dealingstate");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(String value) {
            addCriterion("x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(String value) {
            addCriterion("x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(String value) {
            addCriterion("x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(String value) {
            addCriterion("x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(String value) {
            addCriterion("x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(String value) {
            addCriterion("x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLike(String value) {
            addCriterion("x like", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotLike(String value) {
            addCriterion("x not like", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<String> values) {
            addCriterion("x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<String> values) {
            addCriterion("x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(String value1, String value2) {
            addCriterion("x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(String value1, String value2) {
            addCriterion("x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(String value) {
            addCriterion("y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(String value) {
            addCriterion("y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(String value) {
            addCriterion("y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(String value) {
            addCriterion("y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(String value) {
            addCriterion("y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(String value) {
            addCriterion("y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLike(String value) {
            addCriterion("y like", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotLike(String value) {
            addCriterion("y not like", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<String> values) {
            addCriterion("y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<String> values) {
            addCriterion("y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(String value1, String value2) {
            addCriterion("y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(String value1, String value2) {
            addCriterion("y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStatesIsNull() {
            addCriterion("states is null");
            return (Criteria) this;
        }

        public Criteria andStatesIsNotNull() {
            addCriterion("states is not null");
            return (Criteria) this;
        }

        public Criteria andStatesEqualTo(String value) {
            addCriterion("states =", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotEqualTo(String value) {
            addCriterion("states <>", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThan(String value) {
            addCriterion("states >", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThanOrEqualTo(String value) {
            addCriterion("states >=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThan(String value) {
            addCriterion("states <", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThanOrEqualTo(String value) {
            addCriterion("states <=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLike(String value) {
            addCriterion("states like", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotLike(String value) {
            addCriterion("states not like", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesIn(List<String> values) {
            addCriterion("states in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotIn(List<String> values) {
            addCriterion("states not in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesBetween(String value1, String value2) {
            addCriterion("states between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotBetween(String value1, String value2) {
            addCriterion("states not between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andDealIsNull() {
            addCriterion("deal is null");
            return (Criteria) this;
        }

        public Criteria andDealIsNotNull() {
            addCriterion("deal is not null");
            return (Criteria) this;
        }

        public Criteria andDealEqualTo(String value) {
            addCriterion("deal =", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealNotEqualTo(String value) {
            addCriterion("deal <>", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealGreaterThan(String value) {
            addCriterion("deal >", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealGreaterThanOrEqualTo(String value) {
            addCriterion("deal >=", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealLessThan(String value) {
            addCriterion("deal <", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealLessThanOrEqualTo(String value) {
            addCriterion("deal <=", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealLike(String value) {
            addCriterion("deal like", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealNotLike(String value) {
            addCriterion("deal not like", value, "deal");
            return (Criteria) this;
        }

        public Criteria andDealIn(List<String> values) {
            addCriterion("deal in", values, "deal");
            return (Criteria) this;
        }

        public Criteria andDealNotIn(List<String> values) {
            addCriterion("deal not in", values, "deal");
            return (Criteria) this;
        }

        public Criteria andDealBetween(String value1, String value2) {
            addCriterion("deal between", value1, value2, "deal");
            return (Criteria) this;
        }

        public Criteria andDealNotBetween(String value1, String value2) {
            addCriterion("deal not between", value1, value2, "deal");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNull() {
            addCriterion("opinion is null");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNotNull() {
            addCriterion("opinion is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionEqualTo(String value) {
            addCriterion("opinion =", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotEqualTo(String value) {
            addCriterion("opinion <>", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThan(String value) {
            addCriterion("opinion >", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("opinion >=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThan(String value) {
            addCriterion("opinion <", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThanOrEqualTo(String value) {
            addCriterion("opinion <=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLike(String value) {
            addCriterion("opinion like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotLike(String value) {
            addCriterion("opinion not like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionIn(List<String> values) {
            addCriterion("opinion in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotIn(List<String> values) {
            addCriterion("opinion not in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionBetween(String value1, String value2) {
            addCriterion("opinion between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotBetween(String value1, String value2) {
            addCriterion("opinion not between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andDealpeopleIsNull() {
            addCriterion("dealPeople is null");
            return (Criteria) this;
        }

        public Criteria andDealpeopleIsNotNull() {
            addCriterion("dealPeople is not null");
            return (Criteria) this;
        }

        public Criteria andDealpeopleEqualTo(String value) {
            addCriterion("dealPeople =", value, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleNotEqualTo(String value) {
            addCriterion("dealPeople <>", value, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleGreaterThan(String value) {
            addCriterion("dealPeople >", value, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("dealPeople >=", value, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleLessThan(String value) {
            addCriterion("dealPeople <", value, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleLessThanOrEqualTo(String value) {
            addCriterion("dealPeople <=", value, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleLike(String value) {
            addCriterion("dealPeople like", value, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleNotLike(String value) {
            addCriterion("dealPeople not like", value, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleIn(List<String> values) {
            addCriterion("dealPeople in", values, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleNotIn(List<String> values) {
            addCriterion("dealPeople not in", values, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleBetween(String value1, String value2) {
            addCriterion("dealPeople between", value1, value2, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealpeopleNotBetween(String value1, String value2) {
            addCriterion("dealPeople not between", value1, value2, "dealpeople");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNull() {
            addCriterion("dealTime is null");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNotNull() {
            addCriterion("dealTime is not null");
            return (Criteria) this;
        }

        public Criteria andDealtimeEqualTo(String value) {
            addCriterion("dealTime =", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotEqualTo(String value) {
            addCriterion("dealTime <>", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThan(String value) {
            addCriterion("dealTime >", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThanOrEqualTo(String value) {
            addCriterion("dealTime >=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThan(String value) {
            addCriterion("dealTime <", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThanOrEqualTo(String value) {
            addCriterion("dealTime <=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLike(String value) {
            addCriterion("dealTime like", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotLike(String value) {
            addCriterion("dealTime not like", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeIn(List<String> values) {
            addCriterion("dealTime in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotIn(List<String> values) {
            addCriterion("dealTime not in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeBetween(String value1, String value2) {
            addCriterion("dealTime between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotBetween(String value1, String value2) {
            addCriterion("dealTime not between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIsNull() {
            addCriterion("completeTime is null");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIsNotNull() {
            addCriterion("completeTime is not null");
            return (Criteria) this;
        }

        public Criteria andCompletetimeEqualTo(String value) {
            addCriterion("completeTime =", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotEqualTo(String value) {
            addCriterion("completeTime <>", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeGreaterThan(String value) {
            addCriterion("completeTime >", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeGreaterThanOrEqualTo(String value) {
            addCriterion("completeTime >=", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeLessThan(String value) {
            addCriterion("completeTime <", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeLessThanOrEqualTo(String value) {
            addCriterion("completeTime <=", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeLike(String value) {
            addCriterion("completeTime like", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotLike(String value) {
            addCriterion("completeTime not like", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIn(List<String> values) {
            addCriterion("completeTime in", values, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotIn(List<String> values) {
            addCriterion("completeTime not in", values, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeBetween(String value1, String value2) {
            addCriterion("completeTime between", value1, value2, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotBetween(String value1, String value2) {
            addCriterion("completeTime not between", value1, value2, "completetime");
            return (Criteria) this;
        }

        public Criteria andContentsIsNull() {
            addCriterion("contents is null");
            return (Criteria) this;
        }

        public Criteria andContentsIsNotNull() {
            addCriterion("contents is not null");
            return (Criteria) this;
        }

        public Criteria andContentsEqualTo(String value) {
            addCriterion("contents =", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotEqualTo(String value) {
            addCriterion("contents <>", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThan(String value) {
            addCriterion("contents >", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThanOrEqualTo(String value) {
            addCriterion("contents >=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThan(String value) {
            addCriterion("contents <", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThanOrEqualTo(String value) {
            addCriterion("contents <=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLike(String value) {
            addCriterion("contents like", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotLike(String value) {
            addCriterion("contents not like", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsIn(List<String> values) {
            addCriterion("contents in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotIn(List<String> values) {
            addCriterion("contents not in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsBetween(String value1, String value2) {
            addCriterion("contents between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotBetween(String value1, String value2) {
            addCriterion("contents not between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andUsercodeidIsNull() {
            addCriterion("usercodeid is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeidIsNotNull() {
            addCriterion("usercodeid is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeidEqualTo(String value) {
            addCriterion("usercodeid =", value, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidNotEqualTo(String value) {
            addCriterion("usercodeid <>", value, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidGreaterThan(String value) {
            addCriterion("usercodeid >", value, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidGreaterThanOrEqualTo(String value) {
            addCriterion("usercodeid >=", value, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidLessThan(String value) {
            addCriterion("usercodeid <", value, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidLessThanOrEqualTo(String value) {
            addCriterion("usercodeid <=", value, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidLike(String value) {
            addCriterion("usercodeid like", value, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidNotLike(String value) {
            addCriterion("usercodeid not like", value, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidIn(List<String> values) {
            addCriterion("usercodeid in", values, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidNotIn(List<String> values) {
            addCriterion("usercodeid not in", values, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidBetween(String value1, String value2) {
            addCriterion("usercodeid between", value1, value2, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andUsercodeidNotBetween(String value1, String value2) {
            addCriterion("usercodeid not between", value1, value2, "usercodeid");
            return (Criteria) this;
        }

        public Criteria andPipepartidIsNull() {
            addCriterion("pipepartid is null");
            return (Criteria) this;
        }

        public Criteria andPipepartidIsNotNull() {
            addCriterion("pipepartid is not null");
            return (Criteria) this;
        }

        public Criteria andPipepartidEqualTo(String value) {
            addCriterion("pipepartid =", value, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidNotEqualTo(String value) {
            addCriterion("pipepartid <>", value, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidGreaterThan(String value) {
            addCriterion("pipepartid >", value, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidGreaterThanOrEqualTo(String value) {
            addCriterion("pipepartid >=", value, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidLessThan(String value) {
            addCriterion("pipepartid <", value, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidLessThanOrEqualTo(String value) {
            addCriterion("pipepartid <=", value, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidLike(String value) {
            addCriterion("pipepartid like", value, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidNotLike(String value) {
            addCriterion("pipepartid not like", value, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidIn(List<String> values) {
            addCriterion("pipepartid in", values, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidNotIn(List<String> values) {
            addCriterion("pipepartid not in", values, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidBetween(String value1, String value2) {
            addCriterion("pipepartid between", value1, value2, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andPipepartidNotBetween(String value1, String value2) {
            addCriterion("pipepartid not between", value1, value2, "pipepartid");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelIsNull() {
            addCriterion("accidentLevel is null");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelIsNotNull() {
            addCriterion("accidentLevel is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelEqualTo(String value) {
            addCriterion("accidentLevel =", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelNotEqualTo(String value) {
            addCriterion("accidentLevel <>", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelGreaterThan(String value) {
            addCriterion("accidentLevel >", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelGreaterThanOrEqualTo(String value) {
            addCriterion("accidentLevel >=", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelLessThan(String value) {
            addCriterion("accidentLevel <", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelLessThanOrEqualTo(String value) {
            addCriterion("accidentLevel <=", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelLike(String value) {
            addCriterion("accidentLevel like", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelNotLike(String value) {
            addCriterion("accidentLevel not like", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelIn(List<String> values) {
            addCriterion("accidentLevel in", values, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelNotIn(List<String> values) {
            addCriterion("accidentLevel not in", values, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelBetween(String value1, String value2) {
            addCriterion("accidentLevel between", value1, value2, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelNotBetween(String value1, String value2) {
            addCriterion("accidentLevel not between", value1, value2, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleIsNull() {
            addCriterion("uploadPeople is null");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleIsNotNull() {
            addCriterion("uploadPeople is not null");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleEqualTo(String value) {
            addCriterion("uploadPeople =", value, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleNotEqualTo(String value) {
            addCriterion("uploadPeople <>", value, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleGreaterThan(String value) {
            addCriterion("uploadPeople >", value, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("uploadPeople >=", value, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleLessThan(String value) {
            addCriterion("uploadPeople <", value, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleLessThanOrEqualTo(String value) {
            addCriterion("uploadPeople <=", value, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleLike(String value) {
            addCriterion("uploadPeople like", value, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleNotLike(String value) {
            addCriterion("uploadPeople not like", value, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleIn(List<String> values) {
            addCriterion("uploadPeople in", values, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleNotIn(List<String> values) {
            addCriterion("uploadPeople not in", values, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleBetween(String value1, String value2) {
            addCriterion("uploadPeople between", value1, value2, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadpeopleNotBetween(String value1, String value2) {
            addCriterion("uploadPeople not between", value1, value2, "uploadpeople");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(String value) {
            addCriterion("uploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(String value) {
            addCriterion("uploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(String value) {
            addCriterion("uploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(String value) {
            addCriterion("uploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(String value) {
            addCriterion("uploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(String value) {
            addCriterion("uploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLike(String value) {
            addCriterion("uploadTime like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotLike(String value) {
            addCriterion("uploadTime not like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<String> values) {
            addCriterion("uploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<String> values) {
            addCriterion("uploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(String value1, String value2) {
            addCriterion("uploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(String value1, String value2) {
            addCriterion("uploadTime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andFileurlIsNull() {
            addCriterion("fileurl is null");
            return (Criteria) this;
        }

        public Criteria andFileurlIsNotNull() {
            addCriterion("fileurl is not null");
            return (Criteria) this;
        }

        public Criteria andFileurlEqualTo(String value) {
            addCriterion("fileurl =", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotEqualTo(String value) {
            addCriterion("fileurl <>", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlGreaterThan(String value) {
            addCriterion("fileurl >", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlGreaterThanOrEqualTo(String value) {
            addCriterion("fileurl >=", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlLessThan(String value) {
            addCriterion("fileurl <", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlLessThanOrEqualTo(String value) {
            addCriterion("fileurl <=", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlLike(String value) {
            addCriterion("fileurl like", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotLike(String value) {
            addCriterion("fileurl not like", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlIn(List<String> values) {
            addCriterion("fileurl in", values, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotIn(List<String> values) {
            addCriterion("fileurl not in", values, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlBetween(String value1, String value2) {
            addCriterion("fileurl between", value1, value2, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotBetween(String value1, String value2) {
            addCriterion("fileurl not between", value1, value2, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNull() {
            addCriterion("createname is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("createname is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("createname =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("createname <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("createname >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("createname >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("createname <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("createname <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("createname like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("createname not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("createname in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("createname not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("createname between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("createname not between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andPipenameIsNull() {
            addCriterion("pipeName is null");
            return (Criteria) this;
        }

        public Criteria andPipenameIsNotNull() {
            addCriterion("pipeName is not null");
            return (Criteria) this;
        }

        public Criteria andPipenameEqualTo(String value) {
            addCriterion("pipeName =", value, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameNotEqualTo(String value) {
            addCriterion("pipeName <>", value, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameGreaterThan(String value) {
            addCriterion("pipeName >", value, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameGreaterThanOrEqualTo(String value) {
            addCriterion("pipeName >=", value, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameLessThan(String value) {
            addCriterion("pipeName <", value, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameLessThanOrEqualTo(String value) {
            addCriterion("pipeName <=", value, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameLike(String value) {
            addCriterion("pipeName like", value, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameNotLike(String value) {
            addCriterion("pipeName not like", value, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameIn(List<String> values) {
            addCriterion("pipeName in", values, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameNotIn(List<String> values) {
            addCriterion("pipeName not in", values, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameBetween(String value1, String value2) {
            addCriterion("pipeName between", value1, value2, "pipename");
            return (Criteria) this;
        }

        public Criteria andPipenameNotBetween(String value1, String value2) {
            addCriterion("pipeName not between", value1, value2, "pipename");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgid is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("orgid =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("orgid <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("orgid >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("orgid >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("orgid <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("orgid <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("orgid like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("orgid not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("orgid in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("orgid not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("orgid between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("orgid not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andPipepartnameIsNull() {
            addCriterion("pipepartName is null");
            return (Criteria) this;
        }

        public Criteria andPipepartnameIsNotNull() {
            addCriterion("pipepartName is not null");
            return (Criteria) this;
        }

        public Criteria andPipepartnameEqualTo(String value) {
            addCriterion("pipepartName =", value, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameNotEqualTo(String value) {
            addCriterion("pipepartName <>", value, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameGreaterThan(String value) {
            addCriterion("pipepartName >", value, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameGreaterThanOrEqualTo(String value) {
            addCriterion("pipepartName >=", value, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameLessThan(String value) {
            addCriterion("pipepartName <", value, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameLessThanOrEqualTo(String value) {
            addCriterion("pipepartName <=", value, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameLike(String value) {
            addCriterion("pipepartName like", value, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameNotLike(String value) {
            addCriterion("pipepartName not like", value, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameIn(List<String> values) {
            addCriterion("pipepartName in", values, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameNotIn(List<String> values) {
            addCriterion("pipepartName not in", values, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameBetween(String value1, String value2) {
            addCriterion("pipepartName between", value1, value2, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andPipepartnameNotBetween(String value1, String value2) {
            addCriterion("pipepartName not between", value1, value2, "pipepartname");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskid is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("taskid =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("taskid <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("taskid >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("taskid >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("taskid <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("taskid <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("taskid like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("taskid not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("taskid in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("taskid not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("taskid between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("taskid not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNull() {
            addCriterion("taskname is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("taskname is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("taskname =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("taskname <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("taskname >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("taskname >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("taskname <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("taskname <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("taskname like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("taskname not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("taskname in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("taskname not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("taskname between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("taskname not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andReportidIsNull() {
            addCriterion("reportid is null");
            return (Criteria) this;
        }

        public Criteria andReportidIsNotNull() {
            addCriterion("reportid is not null");
            return (Criteria) this;
        }

        public Criteria andReportidEqualTo(String value) {
            addCriterion("reportid =", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotEqualTo(String value) {
            addCriterion("reportid <>", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThan(String value) {
            addCriterion("reportid >", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThanOrEqualTo(String value) {
            addCriterion("reportid >=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThan(String value) {
            addCriterion("reportid <", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThanOrEqualTo(String value) {
            addCriterion("reportid <=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLike(String value) {
            addCriterion("reportid like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotLike(String value) {
            addCriterion("reportid not like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidIn(List<String> values) {
            addCriterion("reportid in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotIn(List<String> values) {
            addCriterion("reportid not in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidBetween(String value1, String value2) {
            addCriterion("reportid between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotBetween(String value1, String value2) {
            addCriterion("reportid not between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportcontentIsNull() {
            addCriterion("reportcontent is null");
            return (Criteria) this;
        }

        public Criteria andReportcontentIsNotNull() {
            addCriterion("reportcontent is not null");
            return (Criteria) this;
        }

        public Criteria andReportcontentEqualTo(String value) {
            addCriterion("reportcontent =", value, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentNotEqualTo(String value) {
            addCriterion("reportcontent <>", value, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentGreaterThan(String value) {
            addCriterion("reportcontent >", value, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentGreaterThanOrEqualTo(String value) {
            addCriterion("reportcontent >=", value, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentLessThan(String value) {
            addCriterion("reportcontent <", value, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentLessThanOrEqualTo(String value) {
            addCriterion("reportcontent <=", value, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentLike(String value) {
            addCriterion("reportcontent like", value, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentNotLike(String value) {
            addCriterion("reportcontent not like", value, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentIn(List<String> values) {
            addCriterion("reportcontent in", values, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentNotIn(List<String> values) {
            addCriterion("reportcontent not in", values, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentBetween(String value1, String value2) {
            addCriterion("reportcontent between", value1, value2, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andReportcontentNotBetween(String value1, String value2) {
            addCriterion("reportcontent not between", value1, value2, "reportcontent");
            return (Criteria) this;
        }

        public Criteria andTaskreportidIsNull() {
            addCriterion("taskreportid is null");
            return (Criteria) this;
        }

        public Criteria andTaskreportidIsNotNull() {
            addCriterion("taskreportid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskreportidEqualTo(String value) {
            addCriterion("taskreportid =", value, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidNotEqualTo(String value) {
            addCriterion("taskreportid <>", value, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidGreaterThan(String value) {
            addCriterion("taskreportid >", value, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidGreaterThanOrEqualTo(String value) {
            addCriterion("taskreportid >=", value, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidLessThan(String value) {
            addCriterion("taskreportid <", value, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidLessThanOrEqualTo(String value) {
            addCriterion("taskreportid <=", value, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidLike(String value) {
            addCriterion("taskreportid like", value, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidNotLike(String value) {
            addCriterion("taskreportid not like", value, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidIn(List<String> values) {
            addCriterion("taskreportid in", values, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidNotIn(List<String> values) {
            addCriterion("taskreportid not in", values, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidBetween(String value1, String value2) {
            addCriterion("taskreportid between", value1, value2, "taskreportid");
            return (Criteria) this;
        }

        public Criteria andTaskreportidNotBetween(String value1, String value2) {
            addCriterion("taskreportid not between", value1, value2, "taskreportid");
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